package game;

import items.Item;
import items.MurderWeapon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import locations.Location;

import persons.Leader;
import persons.NonPlayer;

public class Story {
	private Leader killer;
	private Leader victim;
	private Item murderWeapon;
	private Location murderLocation;
	private static Story s;
	private ArrayList<Location> locs;
	private int interestingLoc;
	
	private Story() {
		generateStory();
		interestingLoc = 0;
		locs.get(interestingLoc).makeInteresting();
	}
	
	public static Story getStory() {
		if (s==null)
			s = new Story();
		return s;
	}
	
	private void generateStory() {
		ArrayList<Item> items;//
		World w = World.getWorld();
		Leader l;
		Location destination;
		generateMurder();
		locs = generateLocationFillSequence();
		/*items = generateItemFillSequence();
		for (int i=0; i<locs.size(); i++) {
			destination = locs.get(i);
			destination.addItems(items.get(i));
			l = w.getLeader(i);
			if (l.getName().equalsIgnoreCase(victim.getName()) == false)
				destination.addNonPlayers(l);
		}*///Not used right now
	}
	
	private void generateMurder() {
		int k = 0;
		int v = 0;
		int persons, locs, weaps;
		Random gen = new Random();
		World w = World.getWorld();
		persons = w.getPersonCount();
		locs = w.getLocationCount();
		weaps = MurderWeapon.getWeaponCount();
		k = gen.nextInt(persons);
		v = gen.nextInt(persons);
		while (k == v)
			v = gen.nextInt(persons);
		killer = w.getLeader(k);
		victim = w.getLeader(v);
		murderWeapon = MurderWeapon.getMurderWeapon(gen.nextInt(weaps));
		murderLocation = w.getLocation(gen.nextInt(locs));
	}
	
	private ArrayList<Location> generateLocationFillSequence() {
		World w = World.getWorld();
		ArrayList<Location> result = new ArrayList<Location>();
		for (int i=0; i<w.getLocationCount(); i++) {
			result.add(w.getLocation(i));
		}
		Collections.shuffle(result);
		return result;
	}
	
	private ArrayList<Item> generateItemFillSequence() {
		World w = World.getWorld();
		ArrayList<Item> result = new ArrayList<Item>();
		for (int i=0; i<w.getItemCount(); i++) {
			result.add(w.getItem(i));
		}
		Collections.shuffle(result);
		return result;
	}
	
	public void printMurder() {
		System.out.println(getMurder());
	}
	
	public String getMurder() {
		return "It was "+killer.getFullName()+" killing "+victim.getFullName()+" with "
				+murderWeapon.getName()+" in "+murderLocation.getName();
	}

	public String getInterestingLocation() {
		if (interestingLoc <= locs.size())
			return locs.get(interestingLoc).getName();
		else
			return null;//REPLACE with error checking later
	}
	
	public void advanceInterestingLocation() {
		interestingLoc++;
		locs.get(interestingLoc).makeInteresting();
	}
	
	public boolean isVictim(NonPlayer np) {
		if (np.getName().equalsIgnoreCase(victim.getName()))
			return true;
		else
			return false;
	}
}
