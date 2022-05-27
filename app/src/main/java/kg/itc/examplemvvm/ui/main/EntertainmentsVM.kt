package kg.itc.examplemvvm.ui.main

import kg.itc.examplemvvm.domain.use_cases.GetUserUseCase
import kg.itc.examplemvvm.ui.base.BaseVM
import javax.inject.Inject

class EntertainmentsVM @Inject constructor(
    private val getUserUseCase: GetUserUseCase): BaseVM(){
}