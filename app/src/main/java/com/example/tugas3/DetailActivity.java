package com.example.tugas3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ImageView img       = findViewById(R.id.logo_image);
        TextView nameTxt    = findViewById(R.id.club_name);
        TextView descTxt    = findViewById(R.id.club_desc);

        Bundle extras = getIntent().getExtras();

        String images  = extras.getString("IMAGE_KEY");
        String name    = extras.getString("NAME_KEY");
        String desc    = extras.getString("DESC_KEY");

        setTitle("Detail "+ name);

        img.setImageURI(Uri.parse(images));
        Glide.with(this)
                .load(images)
                .into(img);

        nameTxt.setText(name);
        descTxt.setText(desc);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}
