package com.darja.feature_package.di;

import com.darja.feature_package.ui.packagelist.PackageListFragment;

import dagger.Subcomponent;

@Subcomponent(modules = {PackagesModule.class})
public interface PackagesSubcomponent {
    @Subcomponent.Factory
    interface Factory {
        PackagesSubcomponent create();
    }

    void inject(PackageListFragment fragment);
}
