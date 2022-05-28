package kg.itc.examplemvvm.ui.funTime.company

import dagger.hilt.android.lifecycle.HiltViewModel
import kg.itc.examplemvvm.domain.use_cases.GetCompanyUseCase
import kg.itc.examplemvvm.ui.base.BaseVM
import javax.inject.Inject

@HiltViewModel
class SearchingVM @Inject constructor(private val getCompanyUseCase: GetCompanyUseCase): BaseVM() {
}