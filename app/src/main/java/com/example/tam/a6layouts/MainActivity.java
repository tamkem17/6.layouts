package com.example.tam.a6layouts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioGroup rdo_group;
    RadioButton rdo_red, rdo_white, rdo_blue;
    Button setColor, clear;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        setColor.setOnClickListener(new SetColor());
        clear.setOnClickListener(new Clear());

    }

    public void AnhXa(){
        rdo_group = (RadioGroup)findViewById(R.id.rdo_group);
        rdo_red = (RadioButton)findViewById(R.id.rdo_red);
        rdo_blue = (RadioButton)findViewById(R.id.rdo_blue);
        rdo_white = (RadioButton)findViewById(R.id.rdo_white);
        setColor = (Button)findViewById(R.id.btn_setColor);
        clear = (Button)findViewById(R.id.btn_clear);
        txt = (TextView)findViewById(R.id.txt);
    }

    private class SetColor implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            int isCheck = rdo_group.getCheckedRadioButtonId();
            switch (isCheck){
                case R.id.rdo_red:
                    txt.setBackgroundColor(Color.RED);
                    break;
                case R.id.rdo_white:
                    txt.setBackgroundColor(Color.WHITE);
                    break;
                case R.id.rdo_blue:
                    txt.setBackgroundColor(Color.BLUE);
                    break;
                default:
                    break;
            }
        }
    }

    private class Clear implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            txt.setBackgroundColor(Color.BLACK);
        }
    }
}
