package kg.itc.examplemvvm.ui.funTime.company

import dagger.hilt.android.lifecycle.HiltViewModel
import kg.itc.examplemvvm.domain.use_cases.GetUserUseCase
import kg.itc.examplemvvm.ui.base.BaseVM
import javax.inject.Inject

@HiltViewModel
class CompaniesVM @Inject constructor(private val getUserUseCase: GetUserUseCase):BaseVM() {
}