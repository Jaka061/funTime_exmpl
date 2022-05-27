package kg.itc.examplemvvm.ui.funTime.company

import android.os.Bundle
import android.view.View
import kg.itc.examplemvvm.databinding.FragmentEntertainmentBinding
import kg.itc.examplemvvm.ui.base.BaseFragment

class CompaniesFragment : BaseFragment<CompaniesVM,FragmentEntertainmentBinding>
    (
    CompaniesVM::class.java,
    {
        FragmentEntertainmentBinding.inflate(it)
    })
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}
