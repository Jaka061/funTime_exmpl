package kg.itc.examplemvvm.ui.funTime

import kg.itc.examplemvvm.databinding.FragmentEditBinding
import kg.itc.examplemvvm.ui.base.BaseFragment

class UserEditFragment:BaseFragment<UserInfoVM,FragmentEditBinding>
    (UserInfoVM::class.java,{ FragmentEditBinding.inflate(it)}) {
}