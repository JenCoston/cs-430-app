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

import persons.Citizen;
import persons.Leader;
import persons.citizens.Aadrika;
import persons.citizens.Adoette;
import persons.citizens.Akila;
import persons.citizens.Alexander;
import persons.citizens.Amun;
import persons.citizens.Andre;
import persons.citizens.Andrew;
import persons.citizens.Benjamin;
import persons.citizens.Bernette;
import persons.citizens.Calgary;
import persons.citizens.Catherine;
import persons.citizens.ChanJuan;
import persons.citizens.Christina;
import persons.citizens.David;
import persons.citizens.Elizaveta;
import persons.citizens.Emma;
import persons.citizens.Ethan;
import persons.citizens.Ewan;
import persons.citizens.Gabrielle;
import persons.citizens.Gadin;
import persons.citizens.Isabella;
import persons.citizens.Jackson;
import persons.citizens.James;
import persons.citizens.Joshua;
import persons.citizens.Machakw;
import persons.citizens.Mason;
import persons.citizens.Mathew;
import persons.citizens.Noah;
import persons.citizens.Ryan;
import persons.citizens.Saaras;
import persons.citizens.Samantha;
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
	private Citizen[] citizens;
	private Location[] locations;
	private int itemCount;
	
	private World() {
		populateLeaders();
		populateCitizens();
		populateLocations();
		putLeadersInLocations();
		putCitizensInLocations();
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
	
	private void populateCitizens() {
		Citizen[] citizens = {
				Gadin.getGadin(),
				Aadrika.getAadrika(),
				Saaras.getSaaras(),
				Catherine.getCatherine(),
				Ryan.getRyan(),
				Bernette.getBernette(),
				Gabrielle.getGabrielle(),
				Andre.getAndre(),
				Elizaveta.getElizaveta(),
				Alexander.getAlexander(),
				Mathew.getMathew(),
				Joshua.getJoshua(),
				Calgary.getCalgary(),
				Ewan.getEwan(),
				Machakw.getMachakw(),
				Adoette.getAdoette(),
				David.getDavid(),
				Mason.getMason(),
				Christina.getChristina(),
				ChanJuan.getChanJuan(),
				Andrew.getAndrew(),
				Emma.getEmma(),
				James.getJames(),
				Isabella.getIsabella(),
				Ethan.getEthan(),
				Noah.getNoah(),
				Benjamin.getBenjamin(),
				Jackson.getJackson(),
				Samantha.getSamantha(),
				Amun.getAmun(),
				Akila.getAkila()
		};
		this.citizens = citizens;
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
	
	private void putCitizensInLocations() {
		Concordia.getConcordia().addNonPlayers(Aadrika.getAadrika());
		Dislexia.getDislexia().addNonPlayers(Gadin.getGadin());
		Orient.getOrient().addNonPlayers(Samantha.getSamantha());
		Pacifica.getPacifica().addNonPlayers(James.getJames());
		Keyser.getKeyser().addNonPlayers(Mason.getMason());
		Ambrosia.getAmbrosia().addNonPlayers(David.getDavid());
		Edenborough.getEdenborough().addNonPlayers(Benjamin.getBenjamin());
		Peoria.getPeoria().addNonPlayers(Jackson.getJackson());
		Scimitar.getScimitar().addNonPlayers(Amun.getAmun());
		Wallaby.getWallaby().addNonPlayers(Noah.getNoah());
		Concordia.getConcordia().addNonPlayers(Ethan.getEthan());
		Dislexia.getDislexia().addNonPlayers(Isabella.getIsabella());
		Orient.getOrient().addNonPlayers(Joshua.getJoshua());
		Pacifica.getPacifica().addNonPlayers(Calgary.getCalgary());
		Keyser.getKeyser().addNonPlayers(Ewan.getEwan());
		Ambrosia.getAmbrosia().addNonPlayers(Akila.getAkila());
		Edenborough.getEdenborough().addNonPlayers(Emma.getEmma());
		Peoria.getPeoria().addNonPlayers(Andrew.getAndrew());
		Scimitar.getScimitar().addNonPlayers(ChanJuan.getChanJuan());
		Wallaby.getWallaby().addNonPlayers(Christina.getChristina());
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
