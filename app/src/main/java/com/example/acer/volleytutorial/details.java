package com.example.acer.volleytutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class details extends AppCompatActivity {
    ImageView imageView1;
    TextView  tauthor,ttitle,tdesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        tauthor=findViewById(R.id.author);
        ttitle=findViewById(R.id.title);
        tdesc=findViewById(R.id.description);
        imageView1=findViewById(R.id.detailimage);

        Picasso.with(this).load(getIntent().getStringExtra("imagelink")).into(imageView1);
        tauthor.setText(getIntent().getStringExtra("author"));
        ttitle.setText(getIntent().getStringExtra("title"));
        tdesc.setText(getIntent().getStringExtra("desc"));

    }
}
