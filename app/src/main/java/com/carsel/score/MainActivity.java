package com.carsel.score;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    String Score_A,Score_B;
    TextView TeamA,TeamB;
    int temp=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tow_teams);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);

        TeamA = findViewById(R.id.textView2);
        TeamB = findViewById(R.id.textView4);
    }
//    TeamA Score
    public void A_3(View view){
        Score_A = TeamA.getText().toString();
        Log.i("---------------------","------------------------------------");
        Log.i("TAG","Score_A="+Score_A);
        temp=Integer.parseInt(Score_A)+3;
        TeamA.setText(String.valueOf(temp));

    }
    public void A_2(View view){
        Score_A = TeamA.getText().toString();
        temp=Integer.parseInt(Score_A)+2;
        TeamA.setText(String.valueOf(temp));
    }
    public void A_1(View view){
        Score_A = TeamA.getText().toString();
        temp=Integer.parseInt(Score_A)+1;
        TeamA.setText(String.valueOf(temp));
    }
//   TeamB Score
    public void B_3(View view){
        Score_B = TeamB.getText().toString();
        temp=Integer.parseInt(Score_B)+3;
        TeamB.setText(String.valueOf(temp));
    }
    public void B_2(View view){
        Score_B = TeamB.getText().toString();
        temp=Integer.parseInt(Score_B)+2;
        TeamB.setText(String.valueOf(temp));
    }
    public void B_1(View view){
        Score_B = TeamB.getText().toString();
        temp=Integer.parseInt(Score_B)+1;
        TeamB.setText(String.valueOf(temp));
    }
//    reset
    public void reset(View view){
        TeamA.setText("0");
        TeamB.setText("0");
    }
}