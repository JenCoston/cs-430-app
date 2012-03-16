package persons;

import locations.Peoria;

public class PrimeMinisterPatrick extends NPC {
	private static PrimeMinisterPatrick t;
	
	private PrimeMinisterPatrick() {
		super("Prime Minister Patrick", Peoria.getPeoria());
	}
		
	public static PrimeMinisterPatrick getPrimeMinisterPatrick() {
		if (t==null)
			t = new PrimeMinisterPatrick();
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
