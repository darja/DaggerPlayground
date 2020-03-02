package com.darja.daggersubsdemo.packages.ui.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.darja.daggersubsdemo.packages.R;
import com.darja.daggersubsdemo.packages.ui.packagelist.PackageListFragment;

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
