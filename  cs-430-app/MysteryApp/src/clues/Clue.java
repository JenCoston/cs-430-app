package clues;

import java.util.ArrayList;

public abstract class Clue {
	private String text;
	private static String[] clueList;
	
	public Clue(String text) {
		this.text = text;
		populateClueList();
	}
	
	public String getText() {
		return text;
	}
	
	protected abstract void populateClueList();
}
