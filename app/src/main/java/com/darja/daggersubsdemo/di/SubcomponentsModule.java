package com.darja.daggersubsdemo.di;

import com.darja.daggersubsdemo.packages.di.PackagesSubcomponent;

import dagger.Module;

@Module(subcomponents = {PackagesSubcomponent.class})
public class SubcomponentsModule {
}
