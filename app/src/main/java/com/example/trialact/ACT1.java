package com.example.trialact;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ACT1 extends AppCompatActivity {
    String str="ACT1";
    Button bt,bt1;
    TextView ts;
    int cnt;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(str,"Created");
        cnt=0;
        setContentView(R.layout.activity_act1);
        bt = findViewById(R.id.button2);
        ts= findViewById(R.id.textView2);
        bt1 = findViewById(R.id.button3);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoadFragment(new TestFragment());
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                cnt+=1;
                ts.setText(Integer.toString(cnt));
                Log.i("Btt","Clicked");
            }
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("MyCnt",cnt);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        cnt= savedInstanceState.getInt("MyCnt");
        ts= findViewById(R.id.textView2);
        ts.setText(Integer.toString(cnt));
    }

    public void LoadFragment(Fragment fragment){
        FragmentManager fm= getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.container, fragment);
        ft.commit();
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
        cnt=0;
        Log.i(str,"Destroy");
    }

}