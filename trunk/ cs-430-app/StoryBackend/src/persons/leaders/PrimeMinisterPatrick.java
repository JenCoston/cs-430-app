package persons.leaders;

import persons.Leader;
import locations.Peoria;

public class PrimeMinisterPatrick extends Leader {
	private static PrimeMinisterPatrick t;
	
	private PrimeMinisterPatrick() {
		super("Prime Minister Patrick", Peoria.getPeoria());
		setDescriptions("Peoria's esteemed leader");
		setDialog("Pleased to meet you... any chance you are a detective?");
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
