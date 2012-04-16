package locations;

import java.util.Enumeration;
import java.util.Hashtable;
import persons.NonPlayer;

import items.Fire;
import items.Item;

public abstract class Location {
	private String name;
	private Hashtable<String, NonPlayer> npcs;
	private Hashtable<String, Item> items;
	private String desc;
	private int state;
	
	public Location(String n, String description) {
		name = n;
		npcs = new Hashtable<String, NonPlayer>();
		items = new Hashtable<String, Item>();
		desc = description;
	}

	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return desc;
	}
	
	public void addNonPlayers(NonPlayer... nonPlayers) {
		NonPlayer n;
		for (int i=0; i<nonPlayers.length; i++) {
			n = nonPlayers[i];
			n.getCurrentLocation().removePersons(n.getName());
			n.setCurrentLocation(this);
			npcs.put(nonPlayers[i].getName().toLowerCase(), nonPlayers[i]);
		}
	}
	
	public void removePersons(String... npcNames) {
		String lower;
		for (int i=0; i<npcNames.length; i++) {
			lower = npcNames[i].toLowerCase();
			if (npcs.containsKey(lower))
				npcs.remove(lower);
		}
	}
	
	public void addItems(Item... items) {
		for (int i=0; i<items.length; i++)
			this.items.put(items[i].getName().toLowerCase(), items[i]);
	}
	
	public Item removeItem(String itemName) {
		if (items.containsKey(itemName.toLowerCase()))
			return items.remove(itemName.toLowerCase());
		else
			return null;
	}
	
	public boolean hasItems() {
		//return !items.isEmpty();
		return true;
	}
	
	public String[] examine(){
		// TODO - set behavior of examine method
		return null;
	}
	
	public abstract void enter();
	
	public abstract void leave();
	
	public int getState() {
		return state;
	}

	public void setState(int i) {
		state = i;
	}

	public void print() {
		System.out.print(name);
		System.out.println(" - "+desc);
		Enumeration<String> nE = npcs.keys();
		String s;
		Item i;
		NonPlayer n;
		while (nE.hasMoreElements()) {
			s = nE.nextElement();
			n = npcs.get(s);
			System.out.printf("\t%s",n.getFullName());
			System.out.println(" - "+n.getDescription());
			//System.out.printf("\t\tsays: %s\n", n.getDialog());
		}
		Enumeration<String> iE = items.keys();
		while (iE.hasMoreElements()) {
			s = iE.nextElement();
			i = items.get(s);
			System.out.printf("\t%s",i.getName());
			System.out.println(" - "+i.getDescription());
		}
	}

	public Item getOnlyItem() {
		return new Fire();
	}

	/*public void makeInteresting() {
		Enumeration<String> nE = npcs.keys();
		String s;
		NonPlayer n;
		while (nE.hasMoreElements()) {
			s = nE.nextElement();
			n = npcs.get(s);
			n.nextState();
		}
	}*/
}
