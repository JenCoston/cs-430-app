package game;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class DataLoader extends Activity {
	private static DataLoader d;
	
	public static DataLoader getDataLoader() {
		if (d==null)
			d = new DataLoader();
		return d;
	}
	
	public boolean save1HasSaveFile(Context context) {
		SharedPreferences settings = context.getSharedPreferences("save1", MODE_PRIVATE);
		return settings.getBoolean("save1File", false);
	}

	public boolean save2HasSaveFile(Context context) {
		SharedPreferences settings = context.getSharedPreferences("save2", MODE_PRIVATE);
		return settings.getBoolean("save2File", false);
	}

	public boolean save3HasSaveFile(Context context) {
		SharedPreferences settings = context.getSharedPreferences("save3", MODE_PRIVATE);
		return settings.getBoolean("save3File", false);
	}
	
	public CharSequence[] getSaveStatuses(Context context) {
		CharSequence[] result = new CharSequence[3];
		boolean hasSave = false;
		hasSave = save1HasSaveFile(context);
		if (hasSave)
			result[0] = "Save 1 (overwrite)";
		else
			result[0] = "Save 1 (empty)";
		hasSave = save2HasSaveFile(context);
		if (hasSave)
			result[1] = "Save 2 (overwrite)";
		else
			result[1] = "Save 2 (empty)";
		hasSave = save3HasSaveFile(context);
		if (hasSave)
			result[2] = "Save 3 (overwrite)";
		else
			result[2] = "Save 3 (empty)";
		return result;
	}

	public void setSaveStatus(Context context, int choice, boolean value) {
		String saveFileSelect;
		switch (choice) {
			case 0:
				saveFileSelect = "save1";
				break;
			case 1:
				saveFileSelect = "save2";
				break;
			case 2:
				saveFileSelect = "save3";
				break;
			default:
				saveFileSelect = "save1";
		}
		SharedPreferences settings = context.getSharedPreferences(saveFileSelect, MODE_PRIVATE);
        Editor editor = settings.edit();
        editor.putBoolean("save"+(choice+1)+"File", value);
        editor.commit();
	}
}
