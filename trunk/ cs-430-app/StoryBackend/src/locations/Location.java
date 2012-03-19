package locations;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

import persons.NonPlayer;

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
		System.out.println(name);
		Enumeration<String> nE = npcs.keys();
		while (nE.hasMoreElements())
			System.out.printf("\t%s\n",npcs.get((String) nE.nextElement()).getFullName());
		Enumeration<String> iE = items.keys();
		while (iE.hasMoreElements())
			System.out.printf("\t%s\n",items.get((String) iE.nextElement()).getName());
	}
}
