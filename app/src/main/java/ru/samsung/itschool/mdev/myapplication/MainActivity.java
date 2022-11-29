package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        tv = findViewById(R.id.textView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               setValue();
            }
        });
    }

    public void setValue() {
        EditText editText = findViewById(R.id.editText);
        tv.setText(editText.getText().toString());
    }

    public void goTo() {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        String str = "https://myitschool.ru";
        intent.setData(Uri.parse(str));
        startActivity(intent);
    }
}