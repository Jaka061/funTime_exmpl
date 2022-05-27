package kg.itc.examplemvvm.ui.funTime.users

import dagger.hilt.android.lifecycle.HiltViewModel
import kg.itc.examplemvvm.domain.use_cases.GetUserUseCase
import kg.itc.examplemvvm.ui.base.BaseVM
import javax.inject.Inject

@HiltViewModel
class UserEditVM @Inject constructor(private  val getUserUseCase: GetUserUseCase):BaseVM() {
}