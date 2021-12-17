package com.example.tost;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;
@SuppressWarnings("deprecation")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("토스트 띄우기");

        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast tMsg = Toast.makeText(MainActivity.this,"토스트 연습",Toast.LENGTH_SHORT);
                //현재화면 표시 : this , 토스트 메세지에 작성할 내용 ,길이
                Display display = ((WindowManager) getSystemService(WINDOW_SERVICE)).getDefaultDisplay();
                //현재 디스플레이 값
                int xOffset = (int) (Math.random() * display.getWidth()); //0~1 임의의 너비
                int yOffset = (int) (Math.random() * display.getHeight()); //높이

                tMsg.setGravity(Gravity.TOP | Gravity.LEFT, xOffset,yOffset); //gravity:위치지정
                tMsg.show();

            }
        });

    }
}