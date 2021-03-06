package com.fuh.testapplication.util

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.fuh.testapplication.App
import com.fuh.testapplication.AppComponent

/**
 * Created by Nick on 22.03.2017.
 */
abstract class BaseActivity: AppCompatActivity() {

    protected val appComponent: AppComponent = App.appComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupDependencies()
    }

    abstract protected fun setupDependencies()
}