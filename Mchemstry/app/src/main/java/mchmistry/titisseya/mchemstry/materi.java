package mchmistry.titisseya.mchemstry;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class materi extends ActionBarActivity {

    Button button;
    Button button3;
    Button button6;
    Button button5;
    Button button4;
    Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);
        {

            button = (Button) findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent masukkonsepmol = new Intent(materi.this, konsepmol.class);
                    startActivity(masukkonsepmol);
                }
            });

            button3 = (Button) findViewById(R.id.button3);
            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent masukreaksikimia = new Intent(materi.this, reaksikimia.class);
                    startActivity(masukreaksikimia);
                }
            });

            button5 = (Button) findViewById(R.id.button5);
            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent tabelperiodik = new Intent(materi.this, tabelperiodik.class);
                    startActivity(tabelperiodik);
                }
            });

            button4 = (Button) findViewById(R.id.button4);
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent elektrokimia = new Intent(materi.this, elektrokimia.class);
                    startActivity(elektrokimia);
                }
            });

            button6 = (Button) findViewById(R.id.button6);
            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent materidanperubahan = new Intent(materi.this, materidanperubahan.class);
                    startActivity(materidanperubahan);
                }
            });

            button7 = (Button) findViewById(R.id.button7);
            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent kembali = new Intent(materi.this, menutama.class);
                    startActivity(kembali);
                }
            });
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_materi, menu);
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
