package com.example.registrationpart1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.registrationpart1.databinding.ActivityDimotikoBinding;

import java.util.ArrayList;

public class DimotikoActivity extends AppCompatActivity {

    ActivityDimotikoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDimotikoBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_dimotiko);
        setContentView(binding.getRoot());

        int[] imageId = {R.drawable.img_7, R.drawable.img_6, R.drawable.img_3, R.drawable.img_4, R.drawable.img_6, R.drawable.img_6, R.drawable.img_6, R.drawable.img_6, R.drawable.img_6};

        String[] name = {"Anthia", "Adamos", "Kostantinos", "Tasos", "Mixalis", "Mixalis", "Mixalis", "Mixalis", "Mixalis"};

        String[]lastMessage={"5years","5years","5years","5years","5years","5years","5years","5years","5years"};

        String[]lasttime= {"123","12313","2324","12321","1231","1231","1231","1231","1231"};

        String[]PhoneNumber={"96650561","99124828","99090909","987653542","99852556","Istoria","Istoria","Istoria","Istoria"};

        String[]lesson={"Eanlgish","Ellinika","Ximio","Gallika","Istoria","Istoria","Istoria","Istoria","Istoria"};

        String[]prices={"40$","50$","33$","68$","100$","100$","100$","100$","100$"};


        ArrayList<User> userArrayList = new ArrayList<>();

        for (int i = 0; i < imageId.length; i++) {
            User user = new User(name[i], lastMessage[i], lasttime[i], PhoneNumber[i], lesson[i],imageId[i],prices[i]);
            userArrayList.add(user);
        }

        ListAdapter listAdapter = new ListAdapter(DimotikoActivity.this, userArrayList);

        binding.listView.setAdapter(listAdapter);
        binding.listView.setClickable(true);




        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(DimotikoActivity.this, UserActivity.class);
                i.putExtra("name", name[position]);
                i.putExtra("phone", PhoneNumber[position]);
                i.putExtra("Lesson", lesson[position]);
                i.putExtra("prices",prices[position]);
                i.putExtra("imageId", imageId[position]);


                startActivity(i);
            }
        });
    }}
// Creating a list of teachers
//        ArrayList<word> words = new ArrayList<>();
//        words.add(new word("ADAM", R.drawable.img_4));
//        words.add(new word("ANDRE", R.drawable.img_2));
//
//
//        // Creating an adapter and setting it to the ListView
//        WordAdapter adapter = new WordAdapter(this, words);
//        ListView listView = findViewById(R.id.dimotiko);
//        listView.setAdapter(adapter);
//
//        listView.setOnItemClickListener((parent, view, position, id) -> {
//            word clickedTeacher = words.get(position);
//
//            // Launch the TeachersProfile activity with the clicked teacher's details
//            Intent intent = new Intent(this, TeachersProfile.class);
//            intent.putExtra("teacherName", clickedTeacher.getName());
//            intent.putExtra("teacherImage", clickedTeacher.getImage());
//            startActivity(intent);
//        });






// Handling click event for teachers' names
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                // Assuming 'words' list corresponds to the teachers
//                word clickedTeacher = words.get(position);
//
//                // Check if the clicked teacher is Maria
//                if (clickedTeacher.getName().equals("MARIA")) {
//                    // If Maria is clicked, open TeachersProfile activity with Maria's details
//                    Intent intent = new Intent(DimotikoActivity.this, TeachersProfile.class);
//                    intent.putExtra("teacherName", clickedTeacher.getName());
//                    // Add more details if needed
//                    startActivity(intent);
//                }
//            }
//        });
