package com.example.toshiba.menu_v001;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by Toshiba on 18/09/2015.
 */
public class Prefes  extends PreferenceActivity {
    protected  void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.prefencias);
    }

}
