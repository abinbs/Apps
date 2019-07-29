package com.example.wordgame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Correct_Page extends AppCompatActivity {

    TextView tv_textCScreen, tv_textCorrectScreen, tv_textBtn,tv_textTitle1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct__page);
        Typeface typeface= Typeface.createFromAsset(getAssets(), "fonts/FredokaOneRegular.ttf");

        tv_textBtn = (TextView)findViewById(R.id.tv_textBtn);
        tv_textCorrectScreen = (TextView)findViewById(R.id.tv_textCorrectScreen);
        tv_textCScreen = (TextView)findViewById(R.id.tv_textCScreen);
        tv_textTitle1 = (TextView)findViewById(R.id.textTitle1);


        tv_textCScreen.setTypeface(typeface);
        tv_textCorrectScreen.setTypeface(typeface);
        tv_textBtn.setTypeface(typeface);
        tv_textTitle1.setTypeface(typeface);
    }
}
