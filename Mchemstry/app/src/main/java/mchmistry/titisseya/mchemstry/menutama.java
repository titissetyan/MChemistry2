package mchmistry.titisseya.mchemstry;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class menutama extends ActionBarActivity {
 ImageView imageView2;
 ImageView imageView4;

 ImageView imageView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menutama);
        {
            imageView2 = (ImageView) findViewById(R.id.imageView2);
            imageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent b= new Intent(getApplicationContext(), materi.class);
                    startActivity(b);
                }
            });

        }
        {
            imageView3 = (ImageView) findViewById(R.id.imageView3);
            imageView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent s= new Intent(getApplicationContext(), soal.class);
                    startActivity(s);
                }
            });

        }

        {
            imageView4 = (ImageView) findViewById(R.id.imageView4);
            imageView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent video= new Intent(getApplicationContext(), menuvideo.class);
                    startActivity(video);
                }
            });

        }
    }







    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menutama, menu);
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
}
