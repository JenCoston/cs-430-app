package coston.jennifer;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideosTake2Activity extends Activity {
  //  /** Called when the activity is first created. */
  //  @Override
  //  public void onCreate(Bundle savedInstanceState) {
   //     super.onCreate(savedInstanceState);
   //     setContentView(R.layout.main);
        
        
 //   }
//}

//public class TTTTest extends Activity {
    /** Called when the activity is first created. */
 private MediaController mc;
 VideoView vd;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        vd = (VideoView) findViewById(R.id.VideoView);

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lost);

        mc = new MediaController(this);
        vd.setMediaController(mc);

        vd.setVideoURI(uri);
        vd.start();
    }
}
