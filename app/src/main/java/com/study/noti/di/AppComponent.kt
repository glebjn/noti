package com.study.noti.di

import android.content.Context
import com.study.noti.NotiesApp
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AppModule::class]
)
interface AppComponent {

    fun inject(app: NotiesApp)

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance context: Context,
            appModule: AppModule
        ): AppComponent
    }
}