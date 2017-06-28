package com.albert.tt.aaa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_bbb;
    private Toolbar tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToolbar();
        btn_bbb = (Button) findViewById(R.id.activity_main_btn_bbb);
        btn_bbb.setOnClickListener(this);
    }

    private void initToolbar(){
        tb = (Toolbar) findViewById(R.id.activity_main_tb);
        setTitle("nmh");
        setSupportActionBar(tb);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.activity_main_btn_bbb:
                startActivity(new Intent(MainActivity.this , BbbActivity.class));
                break;
            default:

                break;
        }
    }
}
