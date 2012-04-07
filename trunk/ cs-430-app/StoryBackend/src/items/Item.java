package items;

public abstract class Item {
	private String name;
	private String desc;
	
	public Item(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return desc;
	}

}