package com.mvvmdemo.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {
    public static Retrofit getClient() {
        /*HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();*/
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://freegreetingsadda.com/")
                .addConverterFactory(GsonConverterFactory.create())
                //.client(client)
                .build();
        return retrofit;
    }
}
