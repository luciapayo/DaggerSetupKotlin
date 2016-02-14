package com.example.daggersetupkotlin.dagger.module

import android.app.Application
import android.content.Context
import com.example.daggersetupkotlin.dagger.Qualifiers
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @author Lucía Payo
 * @since 14/02/16
 */
@Module
class AppModule(private val application: Application) {

    @Provides
    @Singleton
    @Qualifiers.ForApplication
    fun provideApplicationContext(): Context {
        return application.applicationContext;
    }
}