package com.adrianraff.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.content.Intent;
import android.net.Uri;


public class MainActivity extends AppCompatActivity {

    ImageView imgClick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgClick = (ImageView)findViewById(R.id.qr_view);

        imgClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Now taking you to You Tube for a Video", Toast.LENGTH_LONG).show();
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://youtu.be/5gLp8T4Cev0"));
                startActivity(intent);
            }
        });

    }
}
