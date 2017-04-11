package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    private static int goalsTeamA = 0;
    private static int goalsTeamB = 0;
    private static int foulsTeamA = 0;
    private static int foulsTeamB = 0;
    private static int offsidesTeamA = 0;
    private static int offsidesTeamB = 0;
    private static int cornersTeamA = 0;
    private static int cornersTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayGoalsForTeamA(goalsTeamA);
        displayGoalsForTeamB(goalsTeamB);
        displayOffsidesForTeamA(offsidesTeamA);
        displayOffsidesForTeamB(offsidesTeamB);
        displayCornersForTeamA(cornersTeamA);
        displayCornersForTeamB(cornersTeamB);
    }

    public void addGoalForTeamA(View view) {
        displayGoalsForTeamA(++goalsTeamA);
    }

    public void addGoalForTeamB(View view) {
        displayGoalsForTeamB(++goalsTeamB);
    }

    public void addFoulForTeamA(View view) {
        displayFoulsForTeamA(++foulsTeamA);
    }

    public void addFoulForTeamB(View view) {
        displayFoulsForTeamB(++foulsTeamB);
    }

    public void addOffsideForTeamA(View view) {
        displayOffsidesForTeamA(++offsidesTeamA);
    }

    public void addOffsideForTeamB(View view) {
        displayOffsidesForTeamB(++offsidesTeamB);
    }

    public void addCornerForTeamA(View view) {
        displayCornersForTeamA(++cornersTeamA);
    }

    public void addCornerForTeamB(View view) {
        displayCornersForTeamB(++cornersTeamB);
    }

    public void reset(View view) {
        goalsTeamA = 0;
        goalsTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        offsidesTeamA = 0;
        offsidesTeamB = 0;
        cornersTeamA = 0;
        cornersTeamB = 0;
        displayGoalsForTeamA(goalsTeamA);
        displayGoalsForTeamB(goalsTeamB);
        displayFoulsForTeamA(foulsTeamA);
        displayFoulsForTeamB(foulsTeamB);
        displayOffsidesForTeamA(offsidesTeamA);
        displayOffsidesForTeamB(offsidesTeamB);
        displayCornersForTeamA(cornersTeamA);
        displayCornersForTeamB(cornersTeamB);
    }

    public void displayGoalsForTeamA(int goals) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goals);
        scoreView.setText(String.valueOf(goals));
    }

    public void displayGoalsForTeamB(int goals) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goals);
        scoreView.setText(String.valueOf(goals));
    }

    public void displayFoulsForTeamA(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(fouls));
    }

    public void displayFoulsForTeamB(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(fouls));
    }

    public void displayOffsidesForTeamA(int offsides) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_offsides);
        scoreView.setText(String.valueOf(offsides));
    }

    public void displayOffsidesForTeamB(int offsides) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_offsides);
        scoreView.setText(String.valueOf(offsides));
    }

    public void displayCornersForTeamA(int corners) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_corners);
        scoreView.setText(String.valueOf(corners));
    }

    public void displayCornersForTeamB(int corners) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_corners);
        scoreView.setText(String.valueOf(corners));
    }
}