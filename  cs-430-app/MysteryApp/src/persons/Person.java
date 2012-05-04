package persons;

import items.Item;

import java.util.ArrayList;

import locations.Location;


public abstract class Person {
	private String name;
	private ArrayList<Item> inventory;
	private Location currentLocation;
	private String acceptance;
	
	public Person(String name) {
		this.name = name;
		inventory = new ArrayList<Item>();
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
	
	public void setCurrentLocation(Location loc) {
		currentLocation = loc;
	}
	
	public String listItems(){
		String it = "";
		if(inventory != null){
			for(Item i: inventory){
					it += i.getName() + "\n";
				}
		}
		else{
			it = "No items currently in the inventory.";
		}
		return it;
	}
}
