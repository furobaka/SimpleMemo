package com.example.simplememo;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //新規作成ボタンを押した処理

        Button newButton = (Button)findViewById(R.id.newButton);
        newButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //CreateaMemoActivityへ遷移
                Intent intent = new Intent(ListActivity.this, CreateMemoActivity.class);
                intent.putExtra("id", "");
                startActivity(intent);
            }
        });
    }
}
