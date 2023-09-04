package com.arash.guessgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    boolean create = true;
    int p =0;
    public int randomize () {

        if (create == true) {
            Random rand = new Random();
            int random = rand.nextInt(20);
            create= false;
            p=random;
        }
        return p;
    }
    public void clickFunction(View view){
        String  n = "0";
        EditText txtguess = (EditText)  findViewById(R.id.txtGuess);
        if(txtguess.getText().toString()==null)
            txtguess.setText(n);
        int a = randomize();
        Log.i("i", String.valueOf(a));
        String b;
        b = txtguess.getText().toString();
        String c =" ";
        if(a == Integer.parseInt(txtguess.getText().toString())){

            c="You Guess Right  :))";
            create=true;
        }
        if(a < Integer.parseInt(txtguess.getText().toString())){

            c="Guess Lower Number";
        }
        if(a > Integer.parseInt(txtguess.getText().toString())){

            c="Guess Higher Number";
        }
        Toast.makeText(this,c, Toast.LENGTH_SHORT).show();




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
