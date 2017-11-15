package com.example.hisham.recyclerviewexample1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hisham.recyclerviewexample1.models.Student;

import java.util.List;

/**
 * Created by Hisham on 11/14/2017.
 */

public class StudentAdapterList extends RecyclerView.Adapter<StudentAdapterList.StudentViewHolder> {

    private List<Student> studentList;

    public StudentAdapterList() {
    }

    public StudentAdapterList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public StudentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_student, parent, false);
        return new StudentViewHolder(row);
    }

    @Override
    public void onBindViewHolder(StudentViewHolder holder, int position) {
         Student student= studentList.get(position);

        holder.name.setText(student.getName());
        holder.id.setText(""+student.getId());
        holder.age.setText(""+student.getAge());
        holder.avg.setText(""+student.getAvg());
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    class StudentViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView id;
        TextView age;
        TextView avg;

        public StudentViewHolder(View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.textView_row_student_name);
            id = itemView.findViewById(R.id.textView_row_student_id);
            age = itemView.findViewById(R.id.textView_student_age);
            avg = itemView.findViewById(R.id.textView_row_student_avg);
        }


    }
}
