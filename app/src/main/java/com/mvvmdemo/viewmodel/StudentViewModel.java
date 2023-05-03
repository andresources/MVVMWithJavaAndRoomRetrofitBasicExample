package com.mvvmdemo.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.mvvmdemo.model.StudentModel;
import com.mvvmdemo.repositry.StudentRepo;

import java.util.List;

public class StudentViewModel extends ViewModel {
    private StudentRepo studentRepo;
    public StudentViewModel(){
        studentRepo = new StudentRepo();
    }

    public LiveData<List<StudentModel>> getStudentList(){
        return studentRepo.studentList();
    }
}
