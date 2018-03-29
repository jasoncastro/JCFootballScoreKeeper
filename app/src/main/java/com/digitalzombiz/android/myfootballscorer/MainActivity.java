package com.digitalzombiz.android.myfootballscorer;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends Activity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        //display initial scores
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    //Add score for team A
    public void AddTeamASix(View v) {
        scoreTeamA = scoreTeamA + 6;

        displayForTeamA(scoreTeamA);
    }

    public void AddTeamAThree(View v) {
        scoreTeamA = scoreTeamA + 3;

        displayForTeamA(scoreTeamA);
    }

    public void AddTeamATwo(View v) {
        scoreTeamA = scoreTeamA + 2;

        displayForTeamA(scoreTeamA);
    }

    public void AddTeamAOne(View v) {
        scoreTeamA = scoreTeamA + 1;

        displayForTeamA(scoreTeamA);
    }

    //Add score for team B
    public void AddTeamBSix(View v) {
        scoreTeamB = scoreTeamB + 6;

        displayForTeamB(scoreTeamB);
    }

    public void AddTeamBThree(View v) {
        scoreTeamB = scoreTeamB + 3;

        displayForTeamB(scoreTeamB);
    }

    public void AddTeamBTwo(View v) {
        scoreTeamB = scoreTeamB + 2;

        displayForTeamB(scoreTeamB);
    }

    public void AddTeamBOne(View v) {
        scoreTeamB = scoreTeamB + 1;

        displayForTeamB(scoreTeamB);
    }

    //Reset
    public void resetDisplay(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.txt_score_team_a);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.txt_score_team_b);
        scoreView.setText(String.valueOf(score));
    }
}
