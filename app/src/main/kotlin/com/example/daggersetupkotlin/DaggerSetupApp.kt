package com.example.daggersetupkotlin

import android.app.Application
import com.example.daggersetupkotlin.dagger.component.AppComponent
import com.example.daggersetupkotlin.dagger.component.DaggerAppComponent
import com.example.daggersetupkotlin.dagger.module.AppModule

/**
 * @author Lucía Payo
 * @since 14/02/16
 */
class DaggerSetupApp : Application() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build();
        appComponent.inject(this);
    }

    public fun getAppComponent(): AppComponent {
        return appComponent
    }
}