package com.darja.daggersubsdemo.di;

import com.darja.feature_package.di.PackagesSubcomponent;

import dagger.Module;

@Module(subcomponents = {PackagesSubcomponent.class})
public class SubcomponentsModule {
}
