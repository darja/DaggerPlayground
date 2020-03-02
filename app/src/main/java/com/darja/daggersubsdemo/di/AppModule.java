package com.darja.daggersubsdemo.di;

import android.content.Context;
import android.content.pm.PackageManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    @Provides
    public PackageManager packageManager(Context appContext) {
        return appContext.getPackageManager();
    }
}
