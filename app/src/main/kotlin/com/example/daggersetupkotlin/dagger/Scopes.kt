package com.example.daggersetupkotlin.dagger

import javax.inject.Scope

/**
 * @author Lucía Payo
 * @since 14/02/16
 */
class Scopes {
    @Scope
    @Retention(AnnotationRetention.RUNTIME)
    annotation class ActivityScope
}