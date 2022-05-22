package kg.itc.examplemvvm.ui.funTime

import kg.itc.examplemvvm.databinding.FragmentCompanyInfoBinding
import kg.itc.examplemvvm.ui.base.BaseFragment


class CompanyInfoFragment : BaseFragment<CompanyInfoVM,FragmentCompanyInfoBinding>
    (CompanyInfoVM::class.java,{ FragmentCompanyInfoBinding.inflate(it) })
{
}