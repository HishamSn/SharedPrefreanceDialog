package com.example.hisham.recyclerviewexample1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.hisham.recyclerviewexample1.models.Student;

public class StudentDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);
        fillStudentDetails();
    }

    private void fillStudentDetails() {
        Student student = (Student) getIntent().getSerializableExtra("dataStudent");
        if (student.equals(null)) {
        } else {
            ((TextView) (findViewById(R.id.textView_student_details_name))).setText(student.getName());
            ((TextView) (findViewById(R.id.textView_activity_student_id))).setText(String.valueOf(student.getId()));
            ((TextView) (findViewById(R.id.textView_activity_student_age))).setText(String.valueOf(student.getAge()));
            ((TextView) (findViewById(R.id.textView_activity_student_avg))).setText(String.valueOf(student.getAvg()));
        }
    }
}
