package com.example.todo_list;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class sign_in extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);
        TextView reset_txt = (TextView) findViewById(R.id.reset_link);
        reset_txt.setTextColor(Color.BLUE);
        ImageButton back_btn = (ImageButton) findViewById(R.id.back_button);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sign_in.this, MainActivity.class);
                startActivity(intent);
            }
        });


}
}
