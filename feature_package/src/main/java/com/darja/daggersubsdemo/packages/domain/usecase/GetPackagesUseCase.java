package com.darja.daggersubsdemo.packages.domain.usecase;

import android.content.pm.PackageInfo;

import com.darja.daggersubsdemo.packages.domain.repo.PackagesRepository;

import java.util.List;

public class GetPackagesUseCase {
    private final PackagesRepository repo;

    public GetPackagesUseCase(PackagesRepository repo) {
        this.repo = repo;
    }

    List<PackageInfo> execute() {
        return repo.getPackages();
    }
}
