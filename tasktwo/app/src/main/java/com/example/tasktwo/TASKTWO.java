package com.example.tasktwo;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    int scoreTemA = 0;
    int scoreTemB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void teamAOneScore(View view ){

        scoreTemA=scoreTemA+1;
        displayForTeamA(scoreTemA);
    }

    public void teamATwoScore(View view) {
        scoreTemA = scoreTemA + 2;
        displayForTeamA(scoreTemA);
    }

    public void teamAThreeScore(View view) {
        scoreTemA = scoreTemA + 3;
        displayForTeamA(scoreTemA);
    }

    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText("" + score);
    }

    public void teamBOneScore(View view) {
        scoreTemB = scoreTemB + 1;
        displayForTeamB(scoreTemB);
    }

    public void teamBTwoScore(View view) {
        scoreTemB = scoreTemB + 2;
        displayForTeamB(scoreTemB);
    }

    public void teamBThreeScore(View view) {
        scoreTemB = scoreTemB + 3;
        displayForTeamB(scoreTemB);
    }

    private void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}