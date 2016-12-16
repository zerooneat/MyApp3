package com.ctc.nullcoder.myapp3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainLoginForm extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login_form);

        LinearLayout layout = (LinearLayout) findViewById(R.id.activity_main_login_form);

        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        EditText et1 = new EditText(this);
        et1.setHint("Enter a ID ");
        layout.addView(et1,p);

        EditText et2 = new EditText(this);
        et2.setHint("Enter a password");
        layout.addView(et2,p);


        for (int i = 1; i < 3; i++) {
            Button b = new Button(this);
            b.setText("" + i);
            b.setId(200 + i);
            b.setWidth(30);
            b.setHeight(20);
            layout.addView(b,p);
            b.setOnClickListener(this);
        }

    }
    @Override
    public void onClick(View view) {
        Intent i = null;
        int iBtnID = view.getId();
        switch (iBtnID) {
            case 201:
                //do something
                break;
            case 202:
                i=new Intent(this,MainSignUp.class);
                break;
        }
        startActivity(i);
    }


}
