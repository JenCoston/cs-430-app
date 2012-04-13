package persons.leaders;

import persons.Leader;
import locations.Peoria;

public class PrimeMinisterPatrick extends Leader {
	private static PrimeMinisterPatrick t;
	
	private PrimeMinisterPatrick() {
		super("Prime Minister Patrick",
				"Peoria's esteemed leader",
				Peoria.getPeoria(),
				"Pleased to meet you... any chance you are a detective?",
				"I'll help if I can.");
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

}
