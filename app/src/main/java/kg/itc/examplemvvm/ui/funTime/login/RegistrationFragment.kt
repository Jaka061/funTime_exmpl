package kg.itc.examplemvvm.ui.funTime.login

import dagger.hilt.android.AndroidEntryPoint
import kg.itc.examplemvvm.databinding.FragmentRegistrationBinding
import kg.itc.examplemvvm.ui.base.BaseFragment

@AndroidEntryPoint
class RegistrationFragment :BaseFragment<RegistrationVM,FragmentRegistrationBinding>(RegistrationVM::class.java,{
    FragmentRegistrationBinding.inflate(it)
})  {
}