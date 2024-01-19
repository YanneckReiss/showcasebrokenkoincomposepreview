package com.yanneckreiss.showcasebrokenkoincomposepreview

import com.yanneckreiss.showcasebrokenkoincomposepreview.ExampleInjectableClass
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val appModule = module {
    singleOf(::ExampleInjectableClass)
}