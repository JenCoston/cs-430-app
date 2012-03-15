package persons;

import locations.Peoria;

public class PrimeMinisterPatricia extends NPC {
	private static PrimeMinisterPatricia t;
	
	private PrimeMinisterPatricia() {
		super("Prime Minister Patricia", Peoria.getPeoria());
	}
		
	public static PrimeMinisterPatricia getPrimeMinisterPatricia() {
		if (t==null)
			t = new PrimeMinisterPatricia();
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
