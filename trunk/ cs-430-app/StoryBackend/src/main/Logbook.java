package main;

import java.util.ArrayList;

public class Logbook {
	private static Logbook l;
	private ArrayList<String> notes;
	
	private Logbook() {
		notes = new ArrayList<String>();
	}
	
	public static Logbook getLogbook() {
		if (l == null)
			l = new Logbook();
		return l;
	}
	
	public void addNote(String note) {
		notes.add(note);
	}
	
	public int getNoteCount() {
		return notes.size();
	}
	
	public String getNote(int index) {
		return notes.get(index);
	}
}
