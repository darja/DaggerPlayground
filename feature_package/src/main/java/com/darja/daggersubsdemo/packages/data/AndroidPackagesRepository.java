package com.darja.daggersubsdemo.packages.data;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import com.darja.daggersubsdemo.packages.domain.repo.PackagesRepository;

import java.util.List;

public class AndroidPackagesRepository implements PackagesRepository {
    private final PackageManager packageManager;

    public AndroidPackagesRepository(PackageManager packageManager) {
        this.packageManager = packageManager;
    }

    @Override
    public List<PackageInfo> getPackages() {
        return packageManager.getInstalledPackages(0);
    }
}
