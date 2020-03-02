package com.darja.feature_package.di;

import android.content.pm.PackageManager;

import com.darja.feature_package.data.AndroidPackagesRepository;
import com.darja.feature_package.domain.repo.PackagesRepository;
import com.darja.feature_package.domain.usecase.GetPackagesUseCase;

import dagger.Module;
import dagger.Provides;

@Module
public class PackagesModule {

    @Provides
    public PackagesRepository packagesRepository(PackageManager pm) {
        return new AndroidPackagesRepository(pm);
    }

    @Provides
    public GetPackagesUseCase getPackagesUseCase(PackagesRepository repo) {
        return new GetPackagesUseCase(repo);
    }
}
