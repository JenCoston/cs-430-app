package persons;

import locations.Wallaby;

public class ArchdukeAlex extends NPC {
	private static ArchdukeAlex t;
	
	private ArchdukeAlex() {
		super("Archduke Alex", Wallaby.getWallaby());
	}
		
	public static ArchdukeAlex getArchdukeAlex() {
		if (t==null)
			t = new ArchdukeAlex();
		return t;
	}
	
	@Override
	public void satisfy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void converse() {
		// TODO Auto-generated method stub

	}

}
