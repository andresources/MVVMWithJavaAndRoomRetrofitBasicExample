package com.mvvmdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.mvvmdemo.model.StudentModel;
import com.mvvmdemo.viewmodel.StudentViewModel;

import java.util.List;

public class StudenstListActivity extends AppCompatActivity {
    private StudentViewModel studentViewModel;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studenst_list);
        tv = findViewById(R.id.tvData);
        studentViewModel = new ViewModelProvider(this).get(StudentViewModel.class);
        LiveData<List<StudentModel>> students=studentViewModel.getStudentList();
        students.observe(this, new Observer<List<StudentModel>>() {
            @Override
            public void onChanged(List<StudentModel> studentModels) {
                tv.setText("No.of Students : "+studentModels.size());
                //Here you can set recycler view data
            }
        });
    }
}