package game;

import java.io.File;

public interface FileStructure {
	final String ROOT_DIR = "res";
	final String SAVE_SUB_DIR = "xml";
	final String IMG_SUB_DIR = "drawable";
	final String BINARY_SUB_DIR = "raw";
	final String NPC_IMG_SUB_DIR = "npcs";
	final String LOC_IMG_SUB_DIR = "locs";
	
	final String SAVE_FILE = ".xml";
	
	final File dir = new File(ROOT_DIR);
	final File saveSubDir = new File(dir, SAVE_SUB_DIR);
	final File imgSubDir = new File(dir, IMG_SUB_DIR);
	final File npcImgSubDir = new File(imgSubDir, NPC_IMG_SUB_DIR);
	final File locImgSubDir = new File(imgSubDir, LOC_IMG_SUB_DIR);
	final File binarySubDir = new File(dir, BINARY_SUB_DIR);
	
	final String AMBASSADOR_AMBER = "";
	final String CHANCELLOR_CHUCK = "";
	final String DICTATOR_DAVE = "";
	final String EMPORER_EDDY = "";
	final String KING_CARL = "";
	final String PHARAOD_FINEAS = "";
	final String PRESIDENT_PAUL = "";
	final String PRIME_MINISTER_PATRICK = "";
	final String QUEEN_LIZZY = "";
	final String SULTAN_SAM = "";
	
	final String AMBROSIA = "";
	final String CONCORDIA = "";
	final String DISLEXIA = "";
	final String EDENBOROUGH = "";
	final String KEYSER = "";
	final String ORIENT = "";
	final String PACIFICA = "";
	final String PEORIA = "";
	final String SCIMITAR = "";
	final String WALLABY = "";
	
	final String BOMB = "";
	final String CEREMONIAL_SWORD = "";
	final String DAGGER = "";
	final String GAVEL = "";
	final String PISTOL = "";
	final String POISON = "";
	final String ROPE = "";
	final String ROYAL_SCEPTER = "";
	final String STAFF = "";
	final String FIRE = "";
}
