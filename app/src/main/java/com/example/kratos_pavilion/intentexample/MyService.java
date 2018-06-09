package com.example.kratos_pavilion.intentexample;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    private static final String TAG="com.example.kratos_pavilion.intentexample";


    public MyService() {
    }

    //On destroy method started
    @SuppressLint("LongLogTag")
    @Override
    public void onDestroy() {
        Log.i(TAG,"Ondestroy method is called");
    }
    ///on destroy method ends


    @SuppressLint("LongLogTag")
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG, "On start method is called");

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    long futureTime = System.currentTimeMillis() + 5000;
                    while (System.currentTimeMillis() < futureTime) {
                        synchronized (this) {
                            try {
                                wait(futureTime - System.currentTimeMillis());
                                Log.i(TAG,"Service is doing something");
                            } catch (Exception e) {
                            }
                        }

                    }
                }
            }
        };

        Thread thread=new Thread(r);
        thread.start();
        return Service.START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
