package com.firstapp.task_ods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.imageview.ShapeableImageView;

public class MainActivity2 extends AppCompatActivity {

    TextView name,number,location;

    ShapeableImageView shapeableImageView;

    String nameStr,numberStr,locationStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name=findViewById(R.id.name);
        number=findViewById(R.id.number);
        location=findViewById(R.id.Location);
        shapeableImageView=findViewById(R.id.imgid);

        nameStr=getIntent().getStringExtra("namekey");
        numberStr=getIntent().getStringExtra("numberkey");
        locationStr=getIntent().getStringExtra("locationkey");

        int img=getIntent().getIntExtra("imagekey",0);
        shapeableImageView.setImageResource(img);



        name.setText(""+nameStr);
        number.setText(""+numberStr);
        location.setText(""+locationStr);
    }
}