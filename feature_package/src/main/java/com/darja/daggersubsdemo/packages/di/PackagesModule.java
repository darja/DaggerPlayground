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
    @Provides
    @PackagesFeatureScope
    public PackagesRepository packagesRepository(PackageManager pm) {
        Log.w("PackagesFeature", "Create new PackagesRepository");
        return new AndroidPackagesRepository(pm);
    }

    @Provides
    public GetPackagesUseCase getPackagesUseCase(@PackagesFeatureScope PackagesRepository repo) {
        Log.w("PackagesFeature", "Create new GetPackagesUseCase");
        return new GetPackagesUseCase(repo);
    }
}
