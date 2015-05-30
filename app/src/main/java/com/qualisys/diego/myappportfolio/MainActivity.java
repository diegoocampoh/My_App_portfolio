package com.qualisys.diego.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createButtonListeners();
    }

    private void createButtonListeners() {
        Button spotifyAppButton = (Button) findViewById(R.id.spotify_streamer_app_button);
        Button scoresAppButton = (Button) findViewById(R.id.football_scores_app_button);
        Button libraryAppButton = (Button) findViewById(R.id.library_app_button);
        Button buildItBiggerAppButton = (Button) findViewById(R.id.build_it_bigger_app_button);
        Button xyzAppButton = (Button) findViewById(R.id.xyz_Reader_app_button);
        Button capstoneButton = (Button) findViewById(R.id.capstone_app_button);

        spotifyAppButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                displayShortToast(getString(R.string.text_toast_spotify_streamer));
            }
        });

        scoresAppButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                displayShortToast(getString(R.string.text_toast_football_scores_app));
            }
        });

        libraryAppButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                displayShortToast(getString(R.string.text_toast_library_app));
            }
        });

        buildItBiggerAppButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                displayShortToast(getString(R.string.text_toast_build_it_bigger_app));
            }
        });

        xyzAppButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                displayShortToast(getString(R.string.text_toast_xyz_reader_app));
            }
        });

        capstoneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                displayShortToast(getString(R.string.text_toast_capstone_app));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private void displayShortToast(String message){
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
