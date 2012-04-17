package game;

import items.Item;
import items.MurderWeapon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import locations.Location;

import persons.Leader;
import persons.NonPlayer;
import persons.states.NonPlayerState;
import persons.states.NonPlayerStateFactory;
import persons.states.RiddleState;
import persons.states.WantItemState;

public class Story {
	private Leader killer;
	private Leader victim;
	private Item murderWeapon;
	private Location murderLocation;
	private static Story s;
	private ArrayList<NonPlayer> npcs;
	private int interestingNPC;
	private NonPlayerStateFactory factory;
	
	private Story() {
		generateStory();
		interestingNPC = 0;
		npcs = new ArrayList<NonPlayer>();
		//fill npcs with states
		NonPlayer interestingNP = getInterestingNonPlayer();
		String wanted = murderWeapon.getName();
		//interestingNP.makeInteresting(new WantItemState(interestingNP, wanted));
		//interestingNP.makeInteresting(new RiddleState(interestingNP, "", ""));
		factory = new NonPlayerStateFactory();
		interestingNP.makeInteresting(factory.getNextState(interestingNP));
	}
	
	public static Story getStory() {
		if (s==null)
			s = new Story();
		return s;
	}
	
	private void generateStory() {
		ArrayList<Item> items;//
		ArrayList<Location> locs;
		World w = World.getWorld();
		//Leader l;
		Location destination;
		generateMurder();
		locs = generateLocationFillSequence();
		items = generateItemFillSequence();
		for (int i=0; i<locs.size(); i++) {
			destination = locs.get(i);
			destination.addItems(items.get(i));
			//l = w.getLeader(i);
			//if (l.getName().equalsIgnoreCase(victim.getName()) == false)
			//	destination.addNonPlayers(l);
		}//Not used right now
	}
	
	private void generateMurder() {
		int k = 0;
		int v = 0;
		int persons, locs, weaps;
		Random gen = new Random();
		World w = World.getWorld();
		persons = w.getNonPlayerCount();
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
	
	private ArrayList<NonPlayer> generateNonPlayerFillSequence() {
		World w = World.getWorld();
		Leader[] leaders = w.getLeaders();
		ArrayList<NonPlayer> result = new ArrayList<NonPlayer>();
		for (int i=0; i<leaders.length; i++) {
			if (leaders[i].getName().equalsIgnoreCase(victim.getName()) == false)
				result.add(leaders[i]);
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
	
	public NonPlayer getInterestingNonPlayer() {
		ArrayList<NonPlayer> tempNPCs;
		NonPlayer n;
		if (interestingNPC >= npcs.size()) {
			tempNPCs = generateNonPlayerFillSequence();
			for (int i=0; i<tempNPCs.size(); i++)
				npcs.add(tempNPCs.get(i));
			if ((interestingNPC > 0) && (npcs.get(interestingNPC-1).getName().equalsIgnoreCase(npcs.get(interestingNPC).getName()))) {
				n = npcs.remove(interestingNPC);
				npcs.add(n);
			}
		}
		return npcs.get(interestingNPC);
	}
	
	/*public void advanceInterestingNonPlayer() {
		NonPlayer n = getInterestingNonPlayer();
		while (n.isInteresting()) {
			n.makeUninteresting();
			interestingNPC++;
			n = getInterestingNonPlayer();
		}
		n.makeInteresting();
	}*/
	
	public void advanceInterestingNonPlayer() {
		NonPlayer n = getInterestingNonPlayer();
		while (n.isInteresting()) {
			n.makeUninteresting();
			interestingNPC++;
			n = getInterestingNonPlayer();
		}
		n.makeInteresting(factory.getNextState(n));
	}
	
	public boolean isVictim(NonPlayer np) {
		if (np.getName().equalsIgnoreCase(victim.getName()))
			return true;
		else
			return false;
	}
	
	public Leader getVictim(){
		return victim;
	}
	
	public NonPlayer getNextUninterestingNonPlayer() {
		ArrayList<NonPlayer> tempNPCs;
		NonPlayer n;
		if (interestingNPC+1 >= npcs.size()) {
			tempNPCs = generateNonPlayerFillSequence();
			for (int i=0; i<tempNPCs.size(); i++)
				npcs.add(tempNPCs.get(i));
			if ((interestingNPC > 0) && (npcs.get(interestingNPC-1).getName().equalsIgnoreCase(npcs.get(interestingNPC).getName()))) {
				n = npcs.remove(interestingNPC);
				npcs.add(n);
			}
		}
		return npcs.get(interestingNPC+1);
	}
}
