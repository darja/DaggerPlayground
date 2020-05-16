package com.darja.daggersubsdemo.packages.di;

import androidx.lifecycle.ViewModel;

import com.darja.daggersubsdemo.core.di.ViewModelKey;
import com.darja.daggersubsdemo.packages.ui.packagedetail.PackageDetailViewModel;
import com.darja.daggersubsdemo.packages.ui.packagelist.PackageListViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class PackagesViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(value = PackageListViewModel.class)
    abstract ViewModel packageListViewModel(PackageListViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(value = PackageDetailViewModel.class)
    abstract ViewModel packageDetailViewModel(PackageDetailViewModel viewModel);
}
