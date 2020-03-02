package com.darja.feature_package.di;

import android.content.pm.PackageManager;
import android.util.Log;

import com.darja.feature_package.data.AndroidPackagesRepository;
import com.darja.feature_package.domain.repo.PackagesRepository;
import com.darja.feature_package.domain.usecase.GetPackagesUseCase;

import dagger.Module;
import dagger.Provides;

@SuppressWarnings("WeakerAccess")
@Module
public class PackagesModule {

    @PackagesFeatureScope
    @Provides
    public PackagesRepository packagesRepository(PackageManager pm) {
        return new AndroidPackagesRepository(pm);
    }

    @PackagesFeatureScope
    @Provides
    public GetPackagesUseCase getPackagesUseCase(PackagesRepository repo) {
        Log.w("PackagesModule", "Create new UseCase");
        return new GetPackagesUseCase(repo);
    }
}
