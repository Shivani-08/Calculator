package com.example.shivani.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDiv,
            buttonMul, buttonClear, buttonEqual, buttonDecimal;
    TextView numTextView, resultTextView;
    float value1, value2;
    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button_0);
        button1 = (Button) findViewById(R.id.button_1);
        button2 = (Button) findViewById(R.id.button_2);
        button3 = (Button) findViewById(R.id.button_3);
        button4 = (Button) findViewById(R.id.button_4);
        button5 = (Button) findViewById(R.id.button_5);
        button6 = (Button) findViewById(R.id.button_6);
        button7 = (Button) findViewById(R.id.button_7);
        button8 = (Button) findViewById(R.id.button_8);
        button9 = (Button) findViewById(R.id.button_9);
        buttonAdd = (Button) findViewById(R.id.button_add);
        buttonSub = (Button) findViewById(R.id.button_sub);
        buttonMul = (Button) findViewById(R.id.button_mul);
        buttonDiv = (Button) findViewById(R.id.button_div);
        buttonClear = (Button) findViewById(R.id.button_clear);
        buttonEqual = (Button) findViewById(R.id.button_equals);
        buttonDecimal = (Button) findViewById(R.id.button_decimal);
        numTextView = (TextView) findViewById(R.id.num_text);
        resultTextView = (TextView) findViewById(R.id.result_text);

    }

    public void on7Click(View view) {
        /*resultTextView.setText(null);
        numTextView.setText(null);*/
        numTextView.setText(numTextView.getText()+"7");
    }

    public void on8Click(View view) {
       /* resultTextView.setText(null);
        numTextView.setText(null);*/
        numTextView.setText(numTextView.getText()+"8");
    }

    public void on9Click(View view) {
        /*resultTextView.setText(null);
        numTextView.setText(null);*/
        numTextView.setText(numTextView.getText()+"9");
    }


    public void ondivClick(View view) {
        if (numTextView == null){
            numTextView.setText("");
        }else {
            value1 = Float.parseFloat(numTextView.getText() + "");
            mDivision = true;
            numTextView.setText(null);
        }
    }

    public void on4Click(View view) {
        /*resultTextView.setText(null);
        numTextView.setText(null);*/
        numTextView.setText(numTextView.getText()+"4");
    }

    public void on5Click(View view) {
       /* resultTextView.setText(null);
        numTextView.setText(null);*/
        numTextView.setText(numTextView.getText()+"5");
    }

    public void on6Click(View view) {
       /* resultTextView.setText(null);
        numTextView.setText(null);*/
        numTextView.setText(numTextView.getText()+"6");
    }

    public void onmulClick(View view) {
        if (numTextView == null){
            numTextView.setText("");
        }else {
            value1 = Float.parseFloat(numTextView.getText() + "");
            mMultiplication = true;
            numTextView.setText(null);
        }
    }

    public void on1Click(View view) {
        /*resultTextView.setText(null);
        numTextView.setText(null);*/
        numTextView.setText(numTextView.getText()+"1");
    }

    public void on2Click(View view) {
        /*resultTextView.setText(null);
        numTextView.setText(null);*/
        numTextView.setText(numTextView.getText()+"2");
    }

    public void on3Click(View view) {
        /*resultTextView.setText(null);
        numTextView.setText(null);*/
        numTextView.setText(numTextView.getText()+"3");
    }

    public void onsubClick(View view) {
        if (numTextView == null){
            numTextView.setText("");
        }else {
            value1 = Float.parseFloat(numTextView.getText() + "");
            mSubtract = true;
            numTextView.setText(null);
        }
    }

    public void onclearClick(View view) {
        resultTextView.setText(null);
        numTextView.setText(null);
    }

    public void on0Click (View view){
        /*resultTextView.setText(null);
        numTextView.setText(null);*/
        numTextView.setText(numTextView.getText()+"0");
    }


    public void onequalsClick(View view) {
        value2 = Float.parseFloat(numTextView.getText() + "");

        if (mAddition == true){
            resultTextView.setText(value1 + value2 +"");
            mAddition=false;
        }


        if (mSubtract == true){
            resultTextView.setText(value1 - value2+"");
            mSubtract=false;
        }

        if (mMultiplication == true){
            resultTextView.setText(value1 * value2+"");
            mMultiplication=false;
        }

        if (mDivision == true){
            resultTextView.setText(value1 / value2+"");
            mDivision=false;
        }

    }

    public void onaddClick(View view) {
        if (numTextView == null){
            numTextView.setText("");
        }else {
            value1 = Float.parseFloat(numTextView.getText() + "");
            mAddition = true;
            numTextView.setText(null);
        }
    }

    public void ondecimalClick(View view) {
        numTextView.setText(numTextView.getText()+".");
    }
}
