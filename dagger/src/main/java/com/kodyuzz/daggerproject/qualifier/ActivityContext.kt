package com.kodyuzz.daggerproject.qualifier

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Qualifier


@Qualifier
@Retention(RetentionPolicy.RUNTIME)
annotation class ActivityContext
