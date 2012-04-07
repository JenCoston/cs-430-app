package persons.leaders;

import persons.Leader;
import locations.Concordia;

public class ChancellorChuck extends Leader {
	private static ChancellorChuck t;
		
	private ChancellorChuck() {
		super("Chancellor Chuck", Concordia.getConcordia());
		setDescriptions("Condordia's beloved executive");
		setDialog("What a dreadful deed that has been done!");
	}
		
	public static ChancellorChuck getChancellorChuck() {
		if (t==null)
			t = new ChancellorChuck();
		return t;
	}

	@Override
	public void satisfy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String converse() {
		// TODO Auto-generated method stub
		String hint = "Its not my fault!";
		return hint;
		
	}
}

