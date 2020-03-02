package com.darja.daggersubsdemo;

import android.app.Application;

import com.darja.daggersubsdemo.di.DaggerDemoAppComponent;
import com.darja.daggersubsdemo.di.DemoAppComponent;
import com.darja.daggersubsdemo.packages.di.PackagesSubcomponent;
import com.darja.daggersubsdemo.packages.di.PackagesSubcomponentProvider;

public class DemoApplication extends Application implements PackagesSubcomponentProvider {
    DemoAppComponent appComponent;
    private PackagesSubcomponent packagesSubcomponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerDemoAppComponent.factory().create(getApplicationContext());
    }

    @Override
    public PackagesSubcomponent providePackagesSubcomponent() {
        if (packagesSubcomponent == null) {
            packagesSubcomponent = appComponent.packageSubcomponentFactory().create();
        }
        return packagesSubcomponent;
    }
}
