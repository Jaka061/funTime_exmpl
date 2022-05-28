package kg.itc.examplemvvm.ui.funTime.company

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import kg.itc.examplemvvm.databinding.FragmentCompaniesBinding
import kg.itc.examplemvvm.databinding.FragmentCompanyBinding
import kg.itc.examplemvvm.ui.OnClick
import kg.itc.examplemvvm.ui.base.BaseFragment
import kg.itc.examplemvvm.ui.main.rv.CompanyAdapter
import kg.itc.examplemvvm.ui.main.rv.EntertainmentAdapter

@AndroidEntryPoint
class CompanyFragment : BaseFragment<CompanyInfoVM,FragmentCompaniesBinding>
    (CompanyInfoVM::class.java,{ FragmentCompaniesBinding.inflate(it) }),CompanyAdapter.Listener
{
    private lateinit var listener : OnClick
    private val companyAdapter : CompanyAdapter = CompanyAdapter(this)

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as OnClick
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
        subscribeToLiveData()

    }
    private fun setupView(){
        with(binding){
            Log.e("recycle company","Ok")
            recyclerCompany.adapter = companyAdapter
            recyclerCompany.layoutManager = LinearLayoutManager(activity)
        }
    }
    private fun subscribeToLiveData() {
        viewModel.companies.observe(viewLifecycleOwner) {
            companyAdapter.setData(it)
            Log.e("setData Fr","Ok - $it")
        }

    }

    override fun onClick(index: Int) {
        viewModel.companies.value?.get(index)?.let {
            listener.openFragment(CompanyFragment(),true)
        }
    }

}