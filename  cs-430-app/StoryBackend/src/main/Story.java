package main;

import items.Item;
import items.MurderWeapon;
import items.RoyalScepter;

import java.util.Random;

import locations.Location;

import persons.NPC;
import persons.Person;

public class Story {
	private NPC killer;
	private NPC victim;
	private Item murderWeapon;
	private Location murderLocation;
	private static Story s;
	
	private Story() {
		generateStory();
	}
	
	public static Story getStory() {
		if (s==null)
			s = new Story();
		return s;
	}
	
	private void generateStory() {
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
		killer = (NPC)w.getPerson(k);
		victim = (NPC)w.getPerson(v);
		murderWeapon = MurderWeapon.getMurderWeapon(gen.nextInt(weaps));
		murderLocation = w.getLocation(gen.nextInt(locs));
	}
	
	public void printStory() {
		System.out.println("It was "+killer.getFullName()+" killing "+victim.getFullName()+" with "
				+murderWeapon.getName()+" in "+murderLocation.getName());
	}
}
