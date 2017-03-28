package com.example.mypc.menuassignment51;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity { //step 1 - for showing action bar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option_menu);
        getSupportActionBar();//Step 2 - for showing action bar
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the main; this adds items to the action bar if it is present.
        MenuInflater M = getMenuInflater();
        M.inflate(R.menu.main, menu);

        //  getMenuInflater().inflate(R.main.main, main);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.red) {

// set button text colour to be red
           TextView tv=(TextView)findViewById(R.id.textcolor);
            tv.setTextColor(Color.RED);

            /*Toast.makeText(getApplicationContext(), "clicked on Red", Toast.LENGTH_LONG).show();*/
            return true;
        }else if (id == R.id.green) {
            TextView tv=(TextView)findViewById(R.id.textcolor);
            tv.setTextColor(Color.GREEN);
            return true;
        }
        else if (id == R.id.blue) {
            TextView tv=(TextView)findViewById(R.id.textcolor);
            tv.setTextColor(Color.BLUE);
           /* Toast.makeText(getApplicationContext(), "clicked on Blue", Toast.LENGTH_LONG).show();*/
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
