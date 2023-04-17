package com.example.trialact;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bt;
    String str="MainACT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG,"Created");
        setContentView(R.layout.activity_main);
        bt= findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenACT();
            }
        });
    }
    public void OpenACT(){
        Intent intent= new Intent(this,ACT1.class);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(str,"Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(str,"Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(str,"Stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(str,"Destroy");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(str,"Restart");
    }
}