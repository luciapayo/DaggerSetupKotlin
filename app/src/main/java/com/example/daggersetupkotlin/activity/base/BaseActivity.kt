package com.example.daggersetupkotlin.activity.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.example.daggersetupkotlin.dagger.Injectable

/**
 * @author Lucía Payo
 * @since 14/02/16
 */
abstract class BaseActivity : AppCompatActivity(), Injectable {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        onInject()
    }

    override abstract fun onInject()
}