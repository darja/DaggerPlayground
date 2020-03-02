package com.darja.feature_package.di;

import com.darja.feature_package.ui.packagedetail.PackageDetailFragment;
import com.darja.feature_package.ui.packagelist.PackageListFragment;

import dagger.Subcomponent;

@Subcomponent(modules = {PackagesModule.class})
@PackagesFeatureScope
public interface PackagesSubcomponent {
    @Subcomponent.Factory
    interface Factory {
        PackagesSubcomponent create();
    }

    void inject(PackageListFragment fragment);
    void inject(PackageDetailFragment fragment);
}
