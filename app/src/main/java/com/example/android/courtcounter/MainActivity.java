package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int score =0;
    int number_of_thre_points =0;
    int number_of_two_pnts=0;
    int number_of_frees=0;
    int num_of_shot_attemps=0;
    int num_of_fouls=0;
    int scoreb =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(score);
        displayForTeamb(scoreb);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void show (View view){

        displayForTeamA(score+3);
        score=score+3;
number_of_thre_points++;
    }
    public void show2 (View view){
        displayForTeamA(score+2);
score=score+2;
        number_of_two_pnts++;
    }
    public void show3 (View view){
        displayForTeamA(score+1);
score=score+1;
        number_of_frees++;
    }
    public void displayForTeamb(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void showb (View view){

        displayForTeamb(scoreb+3);
        scoreb=scoreb+3;
        number_of_thre_points++;
    }
    public void show2b (View view){
        displayForTeamb(scoreb+2);
        scoreb=scoreb+2;
        number_of_two_pnts++;
    }
    public void show3b (View view){
        displayForTeamb(scoreb+1);
        scoreb=scoreb+1;
        number_of_frees++;
    }

    public void reset (View view){
        displayForTeamA(0);
        displayForTeamb(0);
        scoreb=0;
        score =0;
    }



}
