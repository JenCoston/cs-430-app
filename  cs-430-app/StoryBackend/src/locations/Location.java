package locations;

import java.util.Hashtable;

import persons.Person;

import items.Item;

public abstract class Location {
	private String name;
	private Hashtable<String, Person> people;
	private Hashtable<String, Item> items;
	private String desc;
	private int state;
	
	public Location(String n, String description) {
		name = n;
		people = new Hashtable<String, Person>();
		items = new Hashtable<String, Item>();
		desc = description;
	}

	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return desc;
	}
	
	public void addPersons(Person... persons) {
		for (int i=0; i<persons.length; i++) {
			people.put(persons[i].getName().toLowerCase(), persons[i]);
		}
	}
	
	public void removePersons(String... personNames) {
		for (int i=0; i<personNames.length; i++)
			people.remove(personNames[i].toLowerCase());
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

}
