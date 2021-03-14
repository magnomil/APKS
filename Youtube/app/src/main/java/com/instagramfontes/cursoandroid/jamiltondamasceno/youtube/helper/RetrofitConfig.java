package com.instagramfontes.cursoandroid.jamiltondamasceno.youtube.helper;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jamiltondamasceno
 */

public class RetrofitConfig {

    public static Retrofit getRetrofit(){
        return new Retrofit.Builder()
                .baseUrl( YoutubeConfig.URL_BASE )
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

}
