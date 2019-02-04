//https://high-programmer.com/2017/09/01/android-studio-memo-app-1/
package com.example.simplememo;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
                //CreateMemoActivityへ遷移
                Intent intent = new Intent(MainActivity.this, CreateMemoActivity.class);
                intent.putExtra("id", "");
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
