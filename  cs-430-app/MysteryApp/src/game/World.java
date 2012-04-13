package game;

import items.Bomb;
import items.CeremonialSword;
import items.Dagger;
import items.Fire;
import items.Gavel;
import items.Item;
import items.Poison;
import items.Rope;
import items.RoyalScepter;
import items.Pistol;
import items.Staff;
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
		putLeadersInLocations();
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
	
	private void putLeadersInLocations() {
		Dislexia.getDislexia().addNonPlayers(DictatorDave.getDictatorDave());
		Orient.getOrient().addNonPlayers(EmperorEddy.getEmperorEddy());
		Pacifica.getPacifica().addNonPlayers(PresidentPaul.getPresidentPaul());
		Keyser.getKeyser().addNonPlayers(KingCarl.getKingCarl());
		Ambrosia.getAmbrosia().addNonPlayers(AmbassadorAmber.getAmbassadorAmber());
		Edenborough.getEdenborough().addNonPlayers(QueenLizzy.getQueenLizzy());
		Concordia.getConcordia().addNonPlayers(ChancellorChuck.getChancellorChuck());
		Peoria.getPeoria().addNonPlayers(PrimeMinisterPatrick.getPrimeMinisterPatrick());
		Scimitar.getScimitar().addNonPlayers(SultanSam.getSultanSam());
		Wallaby.getWallaby().addNonPlayers(PharaohFineas.getPharaohFineas());
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

	public int getNonPlayerCount() {
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
				result = new Rope();
				break;
			case 2:
				result = new RoyalScepter();
				break;
			case 3:
				result = new Bomb();
				break;
			case 4:
				result = new Fire();
				break;
			case 5:
				result = new Gavel();
				break;
			case 6:
				result = new Poison();
				break;
			case 7:
				result = new Staff();
				break;
			case 8:
				result = new Dagger();
				break;
			default:
				result = new Pistol();
		}
		return result;
	}
	
	public void printWorld() {
		for (int i=0; i<locations.length; i++) {
			locations[i].print();
		}
	}
	
	public Leader[] getLeaders() {
		return leaders;
	}
}
