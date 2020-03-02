package com.darja.daggersubsdemo.packages.ui.packagedetail;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.darja.daggersubsdemo.packages.domain.usecase.GetPackagesUseCase;

import javax.inject.Inject;

public class PackageDetailViewModel extends ViewModel {
    private final GetPackagesUseCase useCase;

    @Inject
    public PackageDetailViewModel(GetPackagesUseCase useCase) {
        this.useCase = useCase;
    }

    public void load() {
        Log.d("PackagesFeature", "UseCase: " + useCase);
        useCase.execute();
    }
}
