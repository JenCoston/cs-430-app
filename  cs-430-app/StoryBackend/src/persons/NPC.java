package persons;


public abstract class NPC extends Person {
	
	public NPC(String name) {
		super(name);
	}
	
	public abstract void satisfy();
	
	public abstract void converse();
}
