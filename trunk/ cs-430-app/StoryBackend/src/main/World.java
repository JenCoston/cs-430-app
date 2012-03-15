package main;

import locations.Ambrosia;
import locations.Concordia;
import locations.Edenborough;
import locations.Location;
import locations.Dislexia;
import locations.Orient;
import locations.Pacifica;
import locations.Keyser;

import persons.AmbassadorAmber;
import persons.ChancellorChuck;
import persons.Person;
import persons.DictatorDave;
import persons.EmperorEddy;
import persons.PresidentPaul;
import persons.KingCarl;
import persons.QueenLizzy;

public class World {
	private static World w;
	private Person[] people;
	private Location[] locations;
	
	private World() {
		populatePeople();
		populateLocations();
	}
	
	public static World getWorld() {
		if (w==null)
			w = new World();
		return w;
	}
	
	private void populatePeople() {
		Person[] people = {
					DictatorDave.getDictatorDave(),
					EmperorEddy.getEmperorEddy(),
					PresidentPaul.getPresidentPaul(),
					KingCarl.getKingCarl(),
					AmbassadorAmber.getAmbassadorAmber(),
					QueenLizzy.getQueenLizzy(),
					ChancellorChuck.getChancellorChuck()
		};
		this.people = people;
	}
	
	private void populateLocations() {
		Location[] locations = {
						Dislexia.getDislexia(),
						Orient.getOrient(),
						Pacifica.getPacifica(),
						Keyser.getKeyser(),
						Ambrosia.getAmbrosia(),
						Edenborough.getEdenborough(),
						Concordia.getConcordia()
		};
		this.locations = locations;
	}
	
	public Person getPerson(int p) {
		if (p>=people.length)
			return null;
		return people[p];
	}
	
	public Location getLocation(int l) {
		if (l>=locations.length)
			return null;
		return locations[l];
	}

	public int getPersonCount() {
		return people.length;
	}
	
	public int getLocationCount() {
		return locations.length;
	}
}
