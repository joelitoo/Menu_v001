package com.example.toshiba.menu_v001;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Toshiba on 17/09/2015.
 */
public class Conoce extends Activity{

   @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

       setContentView(R.layout.conoce);

       Button b=(Button) findViewById(R.id.btsalirConoce);
       b.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               finish();

           }
       });
    }
}
