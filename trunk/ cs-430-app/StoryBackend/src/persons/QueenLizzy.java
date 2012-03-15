package persons;

public class QueenLizzy extends NPC {
	private static QueenLizzy t;
		
	private QueenLizzy() {
		super("Queen Lizzy of Edenborough");
	}
		
	public static QueenLizzy getQueenLizzy() {
		if (t==null)
			t = new QueenLizzy();
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
