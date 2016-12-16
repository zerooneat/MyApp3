package com.ctc.nullcoder.myapp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Confirm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        LinearLayout layout = (LinearLayout) findViewById(R.id.activity_confirm);
        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        TextView introCon = new TextView(this);
        introCon.setText("We sent you a message");
        introCon.setTextSize(30);
        layout.addView(introCon,p);

        EditText editText = new EditText(this);
        editText.setHint("Enter 4 digit code");
        layout.addView(editText,p);

        Button button = new Button(this);
        button.setText("Finish");
        layout.addView(button,p);
    }
}
