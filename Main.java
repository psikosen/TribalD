package com.example.tribald;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.act_main);
	}
}


///
package com.mygdx.game.android;

import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

/**
 * Created by Rook on 5/30/2015.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        LwjglApplicationConfiguration cfg = new
                LwjglApplicationConfiguration();
        cfg.title = "demo";
        cfg.width = 480;
        cfg.height = 320;
     //   new LwjglApplication(new AndroidLauncher(), cfg);
    }
}

