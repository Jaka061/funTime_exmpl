package kg.itc.examplemvvm.ui.funTime.company

import kg.itc.examplemvvm.databinding.FragmentSearchingBinding
import kg.itc.examplemvvm.ui.base.BaseFragment

class SearchingFragment :BaseFragment<SearchingVM,FragmentSearchingBinding>
    (SearchingVM::class.java,{ FragmentSearchingBinding.inflate(it)}) {
}