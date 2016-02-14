package com.example.daggersetupkotlin.dagger.component

import com.example.daggersetupkotlin.DaggerSetupApp
import com.example.daggersetupkotlin.activity.MainActivity
import com.example.daggersetupkotlin.dagger.module.AppModule
import dagger.Component
import javax.inject.Singleton

/**
 * @author Lucía Payo
 * @since 14/02/16
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(application: DaggerSetupApp)

    fun inject(activity: MainActivity)
}