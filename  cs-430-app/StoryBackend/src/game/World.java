package game;

import items.CeremonialSword;
import items.Item;
import items.JeweledLei;
import items.RoyalScepter;
import items.SmallPistol;
import locations.Ambrosia;
import locations.Concordia;
import locations.Edenborough;
import locations.Location;
import locations.Dislexia;
import locations.Orient;
import locations.Pacifica;
import locations.Keyser;
import locations.Peoria;
import locations.Scimitar;
import locations.Wallaby;

import persons.Leader;
import persons.leaders.AmbassadorAmber;
import persons.leaders.ChancellorChuck;
import persons.leaders.DictatorDave;
import persons.leaders.EmperorEddy;
import persons.leaders.KingCarl;
import persons.leaders.PharaohFineas;
import persons.leaders.PresidentPaul;
import persons.leaders.PrimeMinisterPatrick;
import persons.leaders.QueenLizzy;
import persons.leaders.SultanSam;

public class World {
	private static World w;
	private Leader[] leaders;
	//private NonPlayer[] bystanders;
	private Location[] locations;
	private int itemCount;
	
	private World() {
		populateLeaders();
		populateLocations();
		itemCount = 10;
	}
	
	public static World getWorld() {
		if (w==null)
			w = new World();
		return w;
	}
	
	private void populateLeaders() {
		Leader[] leaders = {
					DictatorDave.getDictatorDave(),
					EmperorEddy.getEmperorEddy(),
					PresidentPaul.getPresidentPaul(),
					KingCarl.getKingCarl(),
					AmbassadorAmber.getAmbassadorAmber(),
					QueenLizzy.getQueenLizzy(),
					ChancellorChuck.getChancellorChuck(),
					PrimeMinisterPatrick.getPrimeMinisterPatrick(),
					SultanSam.getSultanSam(),
					PharaohFineas.getPharaohFineas()
		};
		this.leaders = leaders;
	}
	
	private void populateLocations() {
		Location[] locations = {
						Dislexia.getDislexia(),
						Orient.getOrient(),
						Pacifica.getPacifica(),
						Keyser.getKeyser(),
						Ambrosia.getAmbrosia(),
						Edenborough.getEdenborough(),
						Concordia.getConcordia(),
						Peoria.getPeoria(),
						Scimitar.getScimitar(),
						Wallaby.getWallaby()
		};
		this.locations = locations;
	}
	
	public Leader getLeader(int p) {
		if (p>=leaders.length)
			return null;
		return leaders[p];
	}
	
	public Location getLocation(int l) {
		if (l>=locations.length)
			return null;
		return locations[l];
	}

	public int getPersonCount() {
		return leaders.length;
	}
	
	public int getLocationCount() {
		return locations.length;
	}
	
	public int getItemCount() {
		return itemCount;
	}
	
	public Item getItem(int id) {
		Item result;
		switch (id) {
			case 0:
				result = new CeremonialSword();
				break;
			case 1:
				result = new JeweledLei();
				break;
			case 2:
				result = new RoyalScepter();
				break;
			default:
				result = new SmallPistol();
		}
		return result;
	}
	
	public void printWorld() {
		for (int i=0; i<locations.length; i++) {
			locations[i].print();
		}
	}
}
