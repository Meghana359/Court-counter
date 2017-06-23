package app.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score1 = 0;
    int score2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void button1(View view) {
        score1 = score1 + 3;
        display(score1);
    }

    public void button2(View view) {
        score1 = score1 + 2;
        display(score1);
    }

    public void button3(View view) {
        score1 = score1 + 1;
        display(score1);
    }

    public void display(int n) {
        TextView quantity = (TextView) findViewById(R.id.no);
        quantity.setText(String.valueOf(n));
    }

    public void button4(View view) {
        score2 = score2 + 3;
        display1(score2);
    }

    public void button5(View view) {
        score2 = score2 + 2;
        display1(score2);
    }

    public void button6(View view) {
        score2 = score2 + 1;
        display1(score2);
    }

    public void display1(int n1) {
        TextView quantity = (TextView) findViewById(R.id.no1);
        quantity.setText(String.valueOf(n1));
    }
    public void reset(View view){
        score1=0;
        score2=0;
        display(score1);
        display1(score2);
    }


}
