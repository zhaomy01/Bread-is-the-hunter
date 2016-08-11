package com.example.dllo.breadhunter.app;


import android.app.Application;
import android.content.Context;

public class MyApp extends Application{

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化
        context = getApplicationContext();
    }
    //对外提供context
    public static Context getContext(){
        return context;
    }
}
