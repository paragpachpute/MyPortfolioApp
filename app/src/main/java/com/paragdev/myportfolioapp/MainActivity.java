package com.paragdev.myportfolioapp;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("My App Portfolio");

        Button buttonSpotify = (Button) findViewById(R.id.buttonSpotify);
        Button buttonScores = (Button) findViewById(R.id.buttonScore);
        Button buttonLibrary = (Button) findViewById(R.id.buttonLibrary);
        Button buttonBuild = (Button) findViewById(R.id.buttonBuild);
        Button buttonXYZ = (Button) findViewById(R.id.buttonXYZ);
        Button buttonCapstone = (Button) findViewById(R.id.buttonCapstone);

        buttonSpotify.setOnClickListener(this);
        buttonScores.setOnClickListener(this);
        buttonLibrary.setOnClickListener(this);
        buttonBuild.setOnClickListener(this);
        buttonXYZ.setOnClickListener(this);
        buttonCapstone.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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

    @Override
    public void onClick(View v) {
        String defaultString = "this button will launch ";
        switch(v.getId()){
            case R.id.buttonSpotify:
                Toast.makeText(this, defaultString + "Spotify Streamer App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonScore:
                Toast.makeText(this, defaultString + "Scores App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonLibrary:
                Toast.makeText(this, defaultString + "Library App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonBuild:
                Toast.makeText(this, defaultString + "Build It Bigger App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonXYZ:
                Toast.makeText(this, defaultString + "XYZ Reader App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonCapstone:
                Toast.makeText(this, defaultString + "My Capstone App ", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
