package com.example.kratos_pavilion.intentexample;

import android.annotation.SuppressLint;
import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;



public class IntentServices extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    private static final String TAG="com.example.kratos_pavilion.intentexample";

    public IntentServices() {
        super("IntentServices");
    }

    @SuppressLint("LongLogTag")
    @Override
    protected void onHandleIntent(Intent intent) {
    //This is what service does
        Log.i(TAG,"Service has now started");

    }
}
