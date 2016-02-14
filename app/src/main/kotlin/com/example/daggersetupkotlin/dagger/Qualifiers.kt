package com.example.daggersetupkotlin.dagger

import javax.inject.Qualifier

/**
 * @author Lucía Payo
 * @since 14/02/16
 */
class Qualifiers {
    @Qualifier
    @Retention(AnnotationRetention.SOURCE)
    annotation class ForApplication

    @Qualifier
    @Retention(AnnotationRetention.SOURCE)
    annotation class ForActivity
}