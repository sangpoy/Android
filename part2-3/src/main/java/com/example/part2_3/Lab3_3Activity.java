package com.example.part2_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Lab3_3Activity extends AppCompatActivity implements View.OnClickListener{

    Button trueBtn;
    TextView targetTextView;
    Button fasleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_3);

        trueBtn=(Button)findViewById(R.id.btn_visible_true);
        targetTextView=(TextView)findViewById(R.id.text_visible_target);
        fasleBtn=(Button)findViewById(R.id.btn_visible_false);

        trueBtn.setOnClickListener(this);
        fasleBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if (v==trueBtn){
            targetTextView.setVisibility(View.VISIBLE);
        }else if (v==fasleBtn) {
            targetTextView.setVisibility(View.INVISIBLE);
        }



    }


}
