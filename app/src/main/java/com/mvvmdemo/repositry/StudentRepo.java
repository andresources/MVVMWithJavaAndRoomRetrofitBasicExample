package com.mvvmdemo.repositry;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.mvvmdemo.api.APIClient;
import com.mvvmdemo.api.APIInterface;
import com.mvvmdemo.model.StudentModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StudentRepo {
    List<StudentModel> studentList;
    public MutableLiveData<List<StudentModel>> studentList(){
        MutableLiveData<List<StudentModel>> list=new MutableLiveData<>();
         APIInterface api=APIClient.getClient().create(APIInterface.class);
         api.getStudentList().enqueue(new Callback<List<StudentModel>>() {
            @Override
            public void onResponse(Call<List<StudentModel>> call, Response<List<StudentModel>> response) {
                list.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<StudentModel>> call, Throwable t) {

            }
        });
        return list;
    }
}
