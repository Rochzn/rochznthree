package com.example.shoppingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class Showactivity extends AppCompatActivity {
    ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12;
    Button bt1,bt2,bt3;

    private ImageView[] img=new ImageView[12];
    private int[] imagePath = new int[] { R.drawable.n1, R.drawable.n4,R.drawable.n3,R.drawable.n4,
            R.drawable.n5,R.drawable.n6,R.drawable.n7,R.drawable.n8,R.drawable.n9,R.drawable.n10,R.drawable.n11,R.drawable.n12};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show);
        GridLayout layout = findViewById(R.id.layout);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);

        bt1 = findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Showactivity.this, videoact.class);
                startActivity(intent);
            }
        });

        for(int i=0; i<imagePath.length; i++)
        {
            img[i] = new ImageView(Showactivity.this);
            img[i].setImageResource(imagePath[i]);
            img[i].setPadding(2,2,2,2);
            ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(116,68);
            img[i].setLayoutParams(params);
            layout.addView(img[i]);

        }
    }
}
