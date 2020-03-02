package com.darja.feature_package.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;
import javax.inject.Scope;

@Retention(RetentionPolicy.RUNTIME)
@Scope
public @interface PackagesFeatureScope {
}
