package com.dji.markDrone;

import android.app.Application;
import android.content.Context;

import com.secneo.sdk.Helper;

import androidx.multidex.MultiDex;


public class MApplication extends Application {

    private FPVDemoApplication fpvDemoApplication;
    @Override
    protected void attachBaseContext(Context paramContext) {
        super.attachBaseContext(paramContext);
        Helper.install(MApplication.this);
        if (fpvDemoApplication == null) {
            fpvDemoApplication = new FPVDemoApplication();
            fpvDemoApplication.setContext(this);
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        fpvDemoApplication.onCreate();
    }

}
