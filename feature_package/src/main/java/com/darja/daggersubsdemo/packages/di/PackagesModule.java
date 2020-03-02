package com.darja.daggersubsdemo.packages.di;

import android.content.pm.PackageManager;
import android.util.Log;

import com.darja.daggersubsdemo.packages.data.AndroidPackagesRepository;
import com.darja.daggersubsdemo.packages.domain.repo.PackagesRepository;
import com.darja.daggersubsdemo.packages.domain.usecase.GetPackagesUseCase;

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
