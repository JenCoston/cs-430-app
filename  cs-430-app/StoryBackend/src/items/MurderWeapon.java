package items;

public abstract class MurderWeapon extends Item {
	private static int weapCount = 4;
	
	private MurderWeapon(){
		super("", "");
	}
	
	public static int getWeaponCount() {
		return weapCount;
	}
	
	public static Item getMurderWeapon(int i) {
		Item m;
		switch (i) {
			case 0:
				m = new RoyalScepter();
				break;
			case 1:
				m = new Rope();
				break;
			case 2:
				m = new CeremonialSword();
				break;
			default:
				m = new Pistol();
		}
		return m;
	}
}
