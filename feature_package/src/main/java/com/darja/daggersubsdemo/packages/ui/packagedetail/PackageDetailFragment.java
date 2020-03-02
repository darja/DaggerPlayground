package com.darja.daggersubsdemo.packages.ui.packagedetail;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.darja.daggersubsdemo.packages.R;
import com.darja.daggersubsdemo.packages.di.PackagesSubcomponent;
import com.darja.daggersubsdemo.packages.di.PackagesSubcomponentProvider;
import com.darja.daggersubsdemo.packages.domain.usecase.GetPackagesUseCase;

import javax.inject.Inject;

public class PackageDetailFragment extends Fragment {
    @Inject
    protected GetPackagesUseCase useCase;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        PackagesSubcomponent component = ((PackagesSubcomponentProvider)requireActivity()
                .getApplication()).providePackagesSubcomponent();
        component.inject(this);

        Log.d("PackageDetailFragment", "useCase = " + useCase);
    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_package_detail, container, false);
    }

}
