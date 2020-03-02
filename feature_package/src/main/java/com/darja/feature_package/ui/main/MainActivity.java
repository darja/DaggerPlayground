package com.darja.feature_package.ui.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.darja.feature_package.R;
import com.darja.feature_package.ui.packagelist.PackageListFragment;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new PackageListFragment())
                .commit();
    }
}
