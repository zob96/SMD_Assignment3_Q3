package com.example.smdassign3_q3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    RatingBar rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb= findViewById(R.id.ratingBar);
        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {

                if(v==1)
                {
                    Toast.makeText(getApplicationContext(), "Very Poor", Toast.LENGTH_LONG ).show();
                }

                else if(v==2)
                {
                        Toast.makeText(getApplicationContext(), "Poor", Toast.LENGTH_LONG ).show();

                }


                else if(v==3)
                {
                    Toast.makeText(getApplicationContext(), "Average", Toast.LENGTH_LONG ).show();

                }


                else if(v==4)
                {
                    Toast.makeText(getApplicationContext(), "Good", Toast.LENGTH_LONG ).show();

                }


                else if(v==5)
                {
                    Toast.makeText(getApplicationContext(), "Very Good", Toast.LENGTH_LONG ).show();

                }


            }
        });


    }



}
