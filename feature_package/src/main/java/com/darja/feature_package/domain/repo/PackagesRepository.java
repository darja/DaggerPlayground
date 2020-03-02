package com.darja.feature_package.domain.repo;

import android.content.pm.PackageInfo;

import java.util.List;

public interface PackagesRepository {
    List<PackageInfo> getPackages();
}
