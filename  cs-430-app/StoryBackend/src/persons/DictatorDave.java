package persons;

import locations.Dislexia;


public class DictatorDave extends NPC {
	private static DictatorDave t;
	
	private DictatorDave() {
		super("Dictator Dave", Dislexia.getDislexia());
	}
	
	public static DictatorDave getDictatorDave() {
		if (t==null)
			t = new DictatorDave();
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
