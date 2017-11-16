package com.example.hisham.recyclerviewexample1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.hisham.recyclerviewexample1.models.Student;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Student> studentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentDataFillList();
        initRecyclerView();

        String a = "ddddd";
        Toast.makeText(this, "" + studentList.get(0).getClass().getName(), Toast.LENGTH_LONG).show();
    }

    private void studentDataFillList() {
        studentList.add(new Student("Hisham Jihad", 201110270, 25, 85));
        studentList.add(new Student("Malik ", 200810223, 25, 85));
        studentList.add(new Student("Adnan ", 200510270, 25, 85));
        studentList.add(new Student("Hisham ", 201110270, 25, 85));
        studentList.add(new Student("Malik ", 200810223, 25, 85));
        studentList.add(new Student("Farhan ", 200510270, 25, 85));
        studentList.add(new Student("Sara ", 200810223, 25, 85));
    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recycler_activity_main);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new StudentAdapterList(studentList, this));
    }
}
