package kg.itc.examplemvvm.ui.funTime.login

import kg.itc.examplemvvm.databinding.FragmentAuthorizationBinding
import kg.itc.examplemvvm.ui.base.BaseFragment

class AuthorizationFragment : BaseFragment<AuthorizationVM, FragmentAuthorizationBinding>(
    AuthorizationVM::class.java,
    {
        FragmentAuthorizationBinding.inflate(it)
    }
) {}