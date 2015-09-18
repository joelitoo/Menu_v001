package com.example.toshiba.menu_v001;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout ll=(LinearLayout) findViewById(R.id.ll);

        SharedPreferences sp= PreferenceManager.getDefaultSharedPreferences(getBaseContext());
         Boolean fondo=sp.getBoolean("checkbox",true);
        if (fondo==true)
        {
            ll.setBackgroundColor(Color.GREEN);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
          super.onCreateOptionsMenu(menu);
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

       switch (item.getItemId())
       {
           case  R.id.idconoce:
               Intent c=new Intent("com.example.toshiba.menu_v001.CONOCE");
               startActivity(c);
               break;

           case  R.id.iprefes:
               Intent P=new Intent("com.example.toshiba.menu_v001.PREFS");
               startActivity(P);
               break;

           case  R.id.isalir:
               finish();
               break;
       }

        return  false;


    }


}
