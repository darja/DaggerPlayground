package com.darja.daggersubsdemo;

import android.app.Application;

import com.darja.daggersubsdemo.di.DaggerDemoAppComponent;
import com.darja.daggersubsdemo.di.DemoAppComponent;
import com.darja.feature_package.di.PackagesSubcomponent;
import com.darja.feature_package.di.PackagesSubcomponentProvider;

public class DemoApplication extends Application implements PackagesSubcomponentProvider {
    DemoAppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerDemoAppComponent.factory().create(getApplicationContext());
    }

    @Override
    public PackagesSubcomponent providePackagesSubcomponent() {
        return appComponent.packageSubcomponentFactory().create();
    }
}
