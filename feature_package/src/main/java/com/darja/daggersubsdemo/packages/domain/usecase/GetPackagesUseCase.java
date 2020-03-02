package com.darja.daggersubsdemo.packages.domain.usecase;

import android.content.pm.PackageInfo;
import android.util.Log;

import com.darja.daggersubsdemo.packages.domain.repo.PackagesRepository;

import java.util.List;

public class GetPackagesUseCase {
    private final PackagesRepository repo;

    public GetPackagesUseCase(PackagesRepository repo) {
        this.repo = repo;
    }

    public List<PackageInfo> execute() {
        Log.d("GetPackagesUseCase", "Repository: " + repo);
        return repo.getPackages();
    }
}
