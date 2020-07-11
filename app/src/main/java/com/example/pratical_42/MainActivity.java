package com.example.pratical_42;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toast(View view) {

        String msg = "Added :";
        StringBuffer toppings = new
                StringBuffer().append(getString(R.string.toppings_label));
        if  (((CheckBox) findViewById(R.id.chocolate)).isChecked()) {
            msg += "Chocolate Syrup, ";
        }
        if  (((CheckBox) findViewById(R.id.sprinkles)).isChecked()) {
            msg += "Sprinkles, ";
        }
        if  (((CheckBox) findViewById(R.id.nuts)).isChecked()) {
            msg +="Crushed Nuts, ";
        }
        if  (((CheckBox) findViewById(R.id.cherries)).isChecked()) {
            msg +="Cherries, " ;
        }
        if  (((CheckBox) findViewById(R.id.orio)).isChecked()) {
            msg +="Orio Cookies Crumbles, " ;

        }

        Toast.makeText(this, msg ,
                Toast.LENGTH_LONG).show();
// Code to display the result...
    }
}