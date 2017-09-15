package com.example.goddness.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

       // Intent intent = getIntent();
       // String name = intent.getStringExtra("name");
      //  String age = intent.getStringExtra("age");

      //  Toast.makeText(this,name+age, Toast.LENGTH_LONG).show();
      //  final Button button=(Button)findViewById(R.id.Button2);
        Button button=(Button)findViewById(R.id.Button2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
             //   Intent intent = new Intent(AnotherActivity.this, MainActivity.class);
           //     startActivity(intent);
           //     finish();
                        Intent intent = getIntent();
                        String name = intent.getStringExtra("name");
                        intent.putExtra("result","姓名:"+name);
                        setResult(0, intent);
                        finish();
                    }

         //   }
             //   Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
             //   setSupportActionBar(toolbar);

             //   FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

             //   fab.setOnClickListener(new View.OnClickListener() {
              //      @Override
             //       public void onClick(View view) {
               //         Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
              //                  .setAction("Action", null).show();
                 //   }
                });
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");

        Toast.makeText(this,name,Toast.LENGTH_LONG).show();
            }
}





