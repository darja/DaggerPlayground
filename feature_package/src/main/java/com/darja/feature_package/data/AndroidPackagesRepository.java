package com.darja.feature_package.data;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import com.darja.feature_package.domain.repo.PackagesRepository;

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
