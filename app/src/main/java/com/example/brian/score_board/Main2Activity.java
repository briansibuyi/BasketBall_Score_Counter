package com.example.brian.score_board;

import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }
    /*Team A Code Started*/

        public void teamAoneScore(View view)
        {
            scoreTeamA = scoreTeamA + 1;
            displayForTeamA(scoreTeamA);

        }
        public void teamATwoScore(View view)
        {
            scoreTeamA = scoreTeamA + 2;
            displayForTeamA(scoreTeamA);

        }
        public void teamAThreeScore(View view)
        {
            scoreTeamA = scoreTeamA + 3;
            displayForTeamA(scoreTeamA);

        }
        private  void displayForTeamA(int score)
        {
            TextView scoreView = (TextView)findViewById(R.id.team_a_score);
            scoreView.setText(" "+score);

        }

    /*end of team A code*/

     /*Team B code*/

        public void teamBoneScore(View view)
        {
            scoreTeamB = scoreTeamB +1;
            displayForTeamb(scoreTeamB);
        }

        public void teamTwoScore(View view)
        {
            scoreTeamB = scoreTeamB +2;
            displayForTeamb(scoreTeamB);
        }
        public void teamBThewwScore(View view)
        {
            scoreTeamB = scoreTeamB +3;
            displayForTeamb(scoreTeamB);
        }

        public void displayForTeamb(int score)
        {
            TextView scoreView = (TextView)findViewById(R.id.team_b_score);
            scoreView.setText(" "+score);
        }

        //reset button
        public void resetButton(View view)
        {
            AlertDialog.Builder dialog = new AlertDialog.Builder(Main2Activity.this);
            dialog.setTitle("Score Results");
           dialog.setMessage("Team A Results: " + scoreTeamA+"\nTeam B Results :"+scoreTeamB);


       dialog.setPositiveButton("Start Counter", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {
               dialog.dismiss();
           }
      });

       dialog.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {

               finish();
          }
       });

       dialog.show();

            scoreTeamA = 0;
            scoreTeamB = 0;
            displayForTeamA(0);
            displayForTeamb(0);
        }

    }




//    public void resetButton(View view){
//
//        AlertDialog.Builder dialog = new AlertDialog.Builder(Main2Activity.this);
//        dialog.setTitle("Score Results");
//
//        dialog.setMessage("Team A Results: ");
//
//        dialog.setPositiveButton("Start Counter", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                dialog.dismiss();
//            }
//        });
//
//        dialog.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//
//
//                dialog.dismiss();
//            }
//        });
//        dialog.show();
//    }


