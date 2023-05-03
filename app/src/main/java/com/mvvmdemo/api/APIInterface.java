package com.mvvmdemo.api;

import com.mvvmdemo.model.StudentModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    /*
    @Body - Sends Java objects as request body.
    @Url - use dynamic URLs.
    @Query - We can simply add a method parameter with @Query and a query parameter name, describing the type. To URL encode a query use the form: @Query(value = "auth_token",encoded = true) String auth_token
    @Field - send data as form-urlencoded. This requires a @FormUrlEncoded annotation attached with the method. The @Field parameter works only with a POST
    */
    @GET("/Test/stdList.php")
    Call<List<StudentModel>> getStudentList();
}
