package com.example.achan.fragmenttest;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    //动态添加碎片
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
//                AnotherRightFragment fragment=new AnotherRightFragment();
//                FragmentManager fragmentManager=getFragmentManager();
//                FragmentTransaction transaction=fragmentManager.beginTransaction();
//                transaction.replace(R.id.right_layout,fragment);
//                transaction.addToBackStack(null);
//                transaction.commit();
                break;
            default:
                break;
        }
    }
}
