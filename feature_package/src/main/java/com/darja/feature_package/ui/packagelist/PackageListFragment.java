package com.darja.feature_package.ui.packagelist;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.darja.feature_package.R;
import com.darja.feature_package.di.PackagesFeatureScope;
import com.darja.feature_package.di.PackagesSubcomponent;
import com.darja.feature_package.di.PackagesSubcomponentProvider;
import com.darja.feature_package.domain.usecase.GetPackagesUseCase;
import com.darja.feature_package.ui.packagedetail.PackageDetailFragment;

import javax.inject.Inject;

public class PackageListFragment extends Fragment {
    @Inject
    protected GetPackagesUseCase useCase;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_package_list, container, false);

        view.findViewById(R.id.open_details_button).setOnClickListener(button -> {
            requireActivity().getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, new PackageDetailFragment())
                    .addToBackStack(null)
                    .commit();
        });

        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        PackagesSubcomponent component = ((PackagesSubcomponentProvider)requireActivity()
                .getApplication()).providePackagesSubcomponent();
        component.inject(this);

        Log.d("PackageListFragment", "useCase = " + useCase);
    }
}
