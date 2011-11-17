package main.pack.MakeSleep;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;

public class MakeSleepActivity extends Activity {
    /** Called when the activity is first created. */
	private  MediaPlayer player;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        try {
        	player = MediaPlayer.create(this, R.raw.raim);
        	player.start();
        	player.setLooping(true);
        
		} catch (Exception e) {
			// TODO: handle exception
			
		}
    }
	@Override
	public void onResume() {
		player.setLooping(false);
		player.stop();
	}
	
}