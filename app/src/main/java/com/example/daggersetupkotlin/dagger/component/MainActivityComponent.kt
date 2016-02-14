package com.example.daggersetupkotlin.dagger.component

import com.example.daggersetupkotlin.activity.MainActivity
import com.example.daggersetupkotlin.dagger.Scopes
import dagger.Component

/**
 * @author Lucía Payo
 * @since 14/02/16
 */
@Scopes.ActivityScope
@Component
interface MainActivityComponent {
    fun inject(activity: MainActivity);
}