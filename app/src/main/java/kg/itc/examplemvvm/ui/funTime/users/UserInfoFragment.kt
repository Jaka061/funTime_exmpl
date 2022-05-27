package kg.itc.examplemvvm.ui.funTime.users

import kg.itc.examplemvvm.databinding.FragmentUserInfoBinding
import kg.itc.examplemvvm.ui.base.BaseFragment

class UserInfoFragment: BaseFragment<UserInfoVM,FragmentUserInfoBinding>(UserInfoVM::class.java,{ FragmentUserInfoBinding.inflate(it)}) {
}