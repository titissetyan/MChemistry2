package mchmistry.titisseya.mchemstry;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class menuvideo extends ActionBarActivity {
    Button button106;
    Button button107;
    Button button108;
    Button button109;
    Button button110;
    Button button111;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuvideo);

        button106 = (Button) findViewById(R.id.button106);
        button106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent video = new Intent(menuvideo.this, video.class);
                startActivity(video);
            }
        });
        button107 = (Button) findViewById(R.id.button107);
        button107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent videoreaksi = new Intent(menuvideo.this, video2.class);
                startActivity(videoreaksi);
            }
        });
        button108 = (Button) findViewById(R.id.button108);
        button108.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent elektrokimiavideo = new Intent(menuvideo.this, video3.class);
                startActivity(elektrokimiavideo);

            }
        });
        button109 = (Button) findViewById(R.id.button109);
        button109.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent videoperiodik = new Intent(menuvideo.this, videoperiodik.class);
                startActivity(videoperiodik);

            }
        });

        button110 = (Button) findViewById(R.id.button110);
        button110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent videomateri = new Intent(menuvideo.this, videomateri.class);
                startActivity(videomateri);

            }
        });
        button111 = (Button) findViewById(R.id.button111);
        button111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent back = new Intent(menuvideo.this, menutama.class);
                startActivity(back);

            }
        });
    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menuvideo, menu);
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
