package com.example.hisham.recyclerviewexample1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Student> studentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentDataFillList();
        initRecyclerView();
    }

    private void studentDataFillList() {
        studentList.add(new Student("Hisham Jihad", "201110270", "25", "85"));
        studentList.add(new Student("Malik abualzait", "200810223", "25", "93"));
        studentList.add(new Student("Adnan", "200510270", "25", "93"));
        studentList.add(new Student("Heba Jamal", "201110270", "25", "85"));
    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recycler_activity_main);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new StudentAdapterList(studentList));
    }
}
