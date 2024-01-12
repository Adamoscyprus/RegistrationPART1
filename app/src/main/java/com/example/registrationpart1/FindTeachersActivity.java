package com.example.registrationpart1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FindTeachersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_teachers);



        ArrayList<word> words = new ArrayList<word>();
        words.add(new word("DIMOTIKO", R.drawable.img));
        words.add(new word("GIMNASIO", R.drawable.img));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = findViewById(R.id.teachers);
        listView.setAdapter(adapter);

        // Set click listener for items in the ListView
        listView.setOnItemClickListener((parent, view, position, id) -> {
            word clickedWord = words.get(position);

            // Launch corresponding activity based on the clicked item
            Intent intent;
            switch (clickedWord.getName()) {
                case "DIMOTIKO":
                    intent = new Intent(this, DimotikoActivity.class);
                    break;
                case "GIMNASIO":
                    intent = new Intent(this, GIMNASIOACTIVITY.class);
                    break;
                default:
                    // If no matching activity found, go to a default activity or handle accordingly
                    intent = new Intent(this, defaultactivity.class);
                    intent.putExtra("errorMessage", "Activity not implemented for " + clickedWord.getName());
                    break;
            }
            startActivity(intent);
        });
    }
}


