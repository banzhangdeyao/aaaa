package com.albert.tt.aaa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class BbbActivity extends AppCompatActivity {

    private Toolbar tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbb);

        initToolBar();
    }

    private void initToolBar(){
        tb = (Toolbar) findViewById(R.id.activity_bbb_tb);
        tb.setTitle("bbb");

        setSupportActionBar(tb);
        tb.setNavigationIcon(R.mipmap.btn_back_normal);
        tb.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
