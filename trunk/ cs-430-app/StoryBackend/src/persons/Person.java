package persons;

import items.Item;

import java.util.ArrayList;

import locations.Location;


public abstract class Person {
	private String name;
	private ArrayList<Item> inventory;
	private Location currentLocation;
	private int state;
	protected ArrayList<String> dialog;
	protected ArrayList<String> descs;
	private String acceptance;
	
	public Person(String name) {
		this.name = name;
		descs = new ArrayList<String>();
		dialog = new ArrayList<String>();
		inventory = new ArrayList<Item>();
		state = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean hasItem(String name) {
		for (int i=0; i<inventory.size(); i++) {
			if (inventory.get(i).getName().equalsIgnoreCase(name)==true)
				return true;
		}
		return false;
	}
	
	public void setDescriptions(String... descs) {
		for (int i=0; i<descs.length; i++)
			this.descs.add(descs[i]);
	}
	
	public void setDialog(String... choices) {
		for (int i=0; i<choices.length; i++)
			dialog.add(choices[i]);
	}
	
	public void addItems(Item... items) {
		for (int i=0; i<items.length; i++)
			inventory.add(items[i]);
	}
	
	public Item getItem(String itemName) {
		for (int i=0; i<inventory.size(); i++) {
			if (inventory.get(i).getName().equalsIgnoreCase(itemName))
				return inventory.get(i);
		}
		return null;
	}
	
	public void removeItem(String itemName) {
		for (int i=0; i<inventory.size(); i++) {
			if (inventory.get(i).getName().equalsIgnoreCase(itemName))
				inventory.remove(i);
		}
	}
	
	public void giveItemTo(String itemName, Person person) {
		for (int i=0; i<inventory.size(); i++) {
			if (inventory.get(i).getName().equalsIgnoreCase(itemName))
				person.acceptItem(inventory.get(i));
				removeItem(itemName);
		}
	}
	
	public void setAcceptance(String acc) {
		acceptance = acc;
	}
	
	public String acceptItem(Item item) {
		inventory.add(item);
		return acceptance;
	}
	
	public Location getCurrentLocation() {
		return currentLocation;
	}
	
	public String getDescription() {
		return descs.get(state);
	}
	
	public String getDialog() {
		return dialog.get(state);
	}
	
	public void setCurrentLocation(Location loc) {
		currentLocation = loc;
	}
	
}
