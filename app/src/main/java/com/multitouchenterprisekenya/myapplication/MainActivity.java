package com.multitouchenterprisekenya.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );



    }
//    A method take in an int that is added to score and also take view when various method is called

    int scoreTeamA =0;
    int scoreTeamB =0;
    public void setScoreTeamA(int i,int id) {
        TextView scoreView = findViewById(id);
        scoreTeamA=scoreTeamA+i;
        scoreView.setText(String.valueOf( scoreTeamA ));
    }
    public void setScoreTeamB(int i,int id) {
        TextView scoreView = findViewById(id);
        scoreTeamB=scoreTeamB+i;
        scoreView.setText(String.valueOf( scoreTeamB ));
    }


    public void addThreeForTeamA(View view) {

      setScoreTeamA( 3 ,R.id.team_a_score);

    }


    public void addTwoForTeamA(View view) {
        setScoreTeamA( 2 ,R.id.team_a_score);
    }

    public void addOneForTeamA(View view) {
        setScoreTeamA( 1,R.id.team_a_score);
    }

    public void addOneForTeamB(View view) {
        setScoreTeamB( 1,R.id.team_b_score);
    }

    public void addTwoForTeamB(View view) {
        setScoreTeamB( 2,R.id.team_b_score);
    }
    public void addThreeForTeamB(View view) {
        setScoreTeamB( 3,R.id.team_b_score);
    }


    public void resetSCore(View view) {
        TextView restTextViewA= findViewById( R.id.team_a_score );
        TextView restTextViewB= findViewById( R.id.team_b_score );
        restTextViewA.setText( String.valueOf( scoreTeamA=0 ) );
        restTextViewB.setText( String.valueOf( scoreTeamB=0 ) );
    }
}