package items;

public abstract class Item {
	private String name;
	private String desc;
	private int smallImgId;
	
	public Item(String name, String desc, int smallImgId) {
		this.name = name;
		this.desc = desc;
		this.smallImgId = smallImgId;
	}

	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return desc;
	}

	public int getSmallImgId() {
		return smallImgId;
	}

}
