package com.darja.daggersubsdemo.packages.di;

import com.darja.daggersubsdemo.packages.ui.packagedetail.PackageDetailFragment;
import com.darja.daggersubsdemo.packages.ui.packagelist.PackageListFragment;

import dagger.Subcomponent;

@Subcomponent(modules = {PackagesModule.class, PackagesViewModelModule.class})
@PackagesFeatureScope
public interface PackagesSubcomponent {
    @Subcomponent.Factory
    interface Factory {
        PackagesSubcomponent create();
    }

    void inject(PackageListFragment fragment);
    void inject(PackageDetailFragment fragment);
}
