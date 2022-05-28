package kg.itc.examplemvvm.ui.funTime.company

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import kg.itc.examplemvvm.R
import kg.itc.examplemvvm.databinding.FragmentCompaniesBinding
import kg.itc.examplemvvm.ui.OnClick
import kg.itc.examplemvvm.ui.base.BaseFragment
import kg.itc.examplemvvm.ui.main.rv.CompanyAdapter

class TypesFragment : BaseFragment<TypesVM,FragmentCompaniesBinding>(
    TypesVM::class.java,
    {
        FragmentCompaniesBinding.inflate(it)
    }),CompanyAdapter.Listener
{
    private lateinit var listener : OnClick
    private val companyAdapter: CompanyAdapter = CompanyAdapter(this)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
        subscribeToLiveData()

        val menu = requireActivity().findViewById<BottomNavigationView>(R.id.btnNav)
        menu.visibility = View.VISIBLE
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
            Log.e("setData Comp Fr","Ok - $it")
        }

    }

    override fun onClick(index: Int) {
        viewModel.companies.value?.get(index)?.let {
            listener.openFragment(CompanyFragment(),true)
        }
    }

}
