package com.naimur978.ridpms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends Activity {

    private List<Content> contents;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_recycler_view);

        rv=(RecyclerView)findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        initializeData();
        initializeAdapter();
    }

    private void initializeData(){
        contents = new ArrayList<>();
        contents.add(new Content("pdf file 1", "memory te asd", R.drawable.pdf_icon));
        contents.add(new Content("image file 1", "internal e sad", R.drawable.image_icon));
        contents.add(new Content("pdf file 2", "memory teasd", R.drawable.pdf_icon));
    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(contents, new CustomItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                startActivity(new Intent(getApplicationContext(),PollActivity.class ));
                Toast.makeText(RecyclerViewActivity.this, "Clicked Item: "+position,Toast.LENGTH_SHORT).show();
            }
        });
        rv.setAdapter(adapter);
    }
}
