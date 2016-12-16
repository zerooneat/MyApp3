package com.ctc.nullcoder.myapp3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainSignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sign_up);
        LinearLayout layout = (LinearLayout) findViewById(R.id.activity_main_sign_up);

        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        EditText et1 = new EditText(this);
        et1.setHint("Enter a ID ");
        layout.addView(et1,p);

        EditText et2 = new EditText(this);
        et2.setHint("Enter a password");
        layout.addView(et2,p);

        EditText et3 = new EditText(this);
        et3.setHint("Enter a phone number");
        layout.addView(et3,p);

        Button btnSignup = new Button(this);
        btnSignup.setText("Signup");
        layout.addView(btnSignup,p);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startConfirm(view);
            }
        });
    }
    private void startConfirm(View view){
        Intent intent = new Intent(this,Confirm.class);
        startActivity(intent);
    }
}

