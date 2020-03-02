package com.darja.daggersubsdemo.di;

import android.content.Context;

import com.darja.feature_package.di.PackagesSubcomponent;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {
        AppModule.class,
        SubcomponentsModule.class
})
public interface DemoAppComponent {
    @Component.Factory
    interface Factory {
        DemoAppComponent create(@BindsInstance Context applicationContext);
    }

    PackagesSubcomponent.Factory packageSubcomponentFactory();
}
