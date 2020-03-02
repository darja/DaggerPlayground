package com.darja.daggersubsdemo.di;

import android.content.Context;

import com.darja.daggersubsdemo.core.di.ViewModelFactoryModule;
import com.darja.daggersubsdemo.packages.di.PackagesSubcomponent;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {
        AppModule.class,
        ViewModelFactoryModule.class,
        SubcomponentsModule.class
})
public interface DemoAppComponent {
    @Component.Factory
    interface Factory {
        DemoAppComponent create(@BindsInstance Context applicationContext);
    }

    PackagesSubcomponent.Factory packageSubcomponentFactory();
}
