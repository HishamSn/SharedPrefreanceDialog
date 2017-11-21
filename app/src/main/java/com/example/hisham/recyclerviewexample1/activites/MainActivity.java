package com.example.hisham.recyclerviewexample1.activites;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.hisham.recyclerviewexample1.*;
import com.example.hisham.recyclerviewexample1.adapters.StudentAdapterList;
import com.example.hisham.recyclerviewexample1.models.Student;
import com.example.hisham.recyclerviewexample1.sqlite.*;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private DBHandlers db;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        db = new DBHandlers(this);
        setContentView(R.layout.activity_main);
        studentDataFillList();
        initRecyclerView();
        setAdapterRecyclerStudent();
    }

    private void studentDataFillList() {
        if (db.isEmpty()) {
            db.addStudent(new Student("Malik ", 200810223, 25, 85));
            db.addStudent(new Student("Adnan ", 200510270, 25, 85));
            db.addStudent(new Student("Hisham ", 201110270, 25, 85));
        }
    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recycler_activity_main);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setAdapterRecyclerStudent() {
        List<Student> listStudent = db.getAllStudent();
        recyclerView.setAdapter(new StudentAdapterList(listStudent, this));
    }

    @Override
    protected void onResume() {
        super.onResume();
        setAdapterRecyclerStudent();
    }
}
