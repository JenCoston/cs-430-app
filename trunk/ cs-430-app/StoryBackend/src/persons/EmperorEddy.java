package persons;


public class EmperorEddy extends NPC {
	private static EmperorEddy t;
	
	private EmperorEddy() {
		super("Emperor Eddy of Orient");
	}
	
	public static EmperorEddy getEmperorEddy() {
		if (t==null)
			t = new EmperorEddy();
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
