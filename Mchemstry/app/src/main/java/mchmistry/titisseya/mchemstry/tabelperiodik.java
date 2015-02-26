package mchmistry.titisseya.mchemstry;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class tabelperiodik extends ActionBarActivity implements View.OnClickListener {

    private MediaPlayer mediaPlayer;
    private Button button19;
    private Button button12;
    private Button button13;
    private Button button114;
    private Button button115;
    private Button button116;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabelperiodik);

        {
            button19 = (Button) findViewById(R.id.button19);
            button19.setOnClickListener(this);
        }
        {
            button12 = (Button) findViewById(R.id.button12);
            button12.setOnClickListener(this);
        }
        {
            button13 = (Button) findViewById(R.id.button13);
            button13.setOnClickListener(this);
        }
        {
            button114 = (Button) findViewById(R.id.button114);
            button114.setOnClickListener(this);
        }

        {
            button115 = (Button) findViewById(R.id.button115);
            button115.setOnClickListener(this);
        }
        {
            button116 = (Button) findViewById(R.id.button116);
            button116.setOnClickListener(this);
        }

    }

    public void OnPause() {
        try {
            super.onPause();
            mediaPlayer.pause();
        } catch (Exception a) {

        }
    }

    private void playSound(int aa) {
        try {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        } catch (Exception a) {
            Log.e("error", "blablabla");
        }


        if (aa == 1)
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.hydrogen);
        }

        else if (aa == 2)
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.lithium);
        }

        else if (aa == 3)
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.calcium);
        }

        else if (aa == 4)
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.argon);
        }
        else if (aa == 5)
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.neon);
        }
        else if (aa == 6)
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.helium);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tabelperiodik, menu);
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
        switch (v.getId()) {
            case R.id.button19:
                playSound(1);
                break;

            case R.id.button12:
                playSound(2);
                break;

            case R.id.button13:
                playSound(3);
                break;
            case R.id.button114:
                playSound(4);
                break;
            case R.id.button115:
                playSound(5);
                break;
            case R.id.button116:
                playSound(6);
                break;
        }

    }
}
