package com.example.hisham.recyclerviewexample1.activites;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import com.example.hisham.recyclerviewexample1.R;
import com.example.hisham.recyclerviewexample1.models.Student;
import com.example.hisham.recyclerviewexample1.sqlite.DBHandlers;
import com.gdacciaro.iOSDialog.iOSDialog;

public class StudentDetailsActivity extends AppCompatActivity implements View.OnClickListener {
    private DBHandlers db;
    private Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);
        db = new DBHandlers(this);
        fillStudentDetails();
    }

    private void fillStudentDetails() {
        student = db.getStudent(getIntent().getExtras().getInt("ID"));
        if (student == (null)) {
            return;
        }
        ((TextView) (findViewById(R.id.textView_student_details_name))).setText(student.getName());
        ((TextView) (findViewById(R.id.textView_activity_student_id))).setText(String.valueOf(student.getId()));
        ((TextView) (findViewById(R.id.textView_activity_student_age))).setText(String.valueOf(student.getAge()));
        ((TextView) (findViewById(R.id.textView_activity_student_avg))).setText(String.valueOf(student.getAvg()));
        (findViewById(R.id.button_student_details_delete)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (student == (null)) {
            return;
        }
        switch (v.getId()) {
            case R.id.button_student_details_delete:
                db.deleteStudent(student);
                getDialogStudentDeleted();
                break;
        }
    }

    private void getDialogStudentDeleted() {
        final iOSDialog iOSDialog = new iOSDialog(this);
        iOSDialog.setTitle( "Message");
        iOSDialog.setSubtitle("Student successfully deleted");
        iOSDialog.setPositiveLabel("ok");
        iOSDialog.setBoldPositiveLabel(true);
        iOSDialog.setPositiveListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iOSDialog.dismiss();
                finish();
            }
        });
        iOSDialog.show();
    }
}

