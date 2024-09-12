package com.example.bvn_loginlayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TextView name = findViewById(R.id.name);
        EditText input_pass =findViewById(R.id.input_password);
        EditText input_user = findViewById(R.id.input_username);
        Button lgin = findViewById(R.id.login);
        Button lgout = findViewById(R.id.logout);
        TextView social = findViewById(R.id.social);
        LinearLayout lay = findViewById(R.id.imagelayout);
        lgin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setText(input_user.getText().toString());
                lgout.setVisibility(View.VISIBLE);
                lgin.setVisibility(View.INVISIBLE);
                social.setVisibility(View.INVISIBLE);
                lay.setVisibility(View.INVISIBLE);
                input_user.setVisibility(View.INVISIBLE);
                input_pass.setVisibility(View.INVISIBLE);
            }
        });
        lgout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setText("Welcome");
                lgout.setVisibility(View.INVISIBLE);
                lgin.setVisibility(View.VISIBLE);
                social.setVisibility(View.VISIBLE);
                lay.setVisibility(View.VISIBLE);
                input_user.setVisibility(View.VISIBLE);
                input_pass.setVisibility(View.VISIBLE);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}