package kg.itc.examplemvvm.di.annotations

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class CompanyApi

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class UserApi