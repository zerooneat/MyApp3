package com.ctc.nullcoder.myapp3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout layout = (LinearLayout) findViewById(R.id.main_layout);
        for (int i = 1; i < 3; i++) {
            LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
            Button b = new Button(this);
            b.setText("" + i);
            b.setId(100 + i);
            b.setWidth(30);
            b.setHeight(20);
            layout.addView(b, p);
            b.setOnClickListener(this);
        }

    }

    @Override
    public void onClick(View view) {
        Intent i = null;
        int iBtnID = view.getId();
        switch (iBtnID) {
            case 101:
                i=new Intent(this,CusMap.class);
                break;
            case 102:
                i=new Intent(this,MainLoginForm.class);
                break;
        }
        startActivity(i);
    }
}

