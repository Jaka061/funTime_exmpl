package kg.itc.examplemvvm.ui.funTime.company

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint
import kg.itc.examplemvvm.R
import kg.itc.examplemvvm.databinding.FragmentEntertainmentBinding
import kg.itc.examplemvvm.ui.OnClick
import kg.itc.examplemvvm.ui.base.BaseFragment
import kg.itc.examplemvvm.ui.main.rv.EntertainmentAdapter

@AndroidEntryPoint
class EntertainmentsFragment: BaseFragment<EntertainmentsVM,FragmentEntertainmentBinding>
    (EntertainmentsVM::class.java,{
    FragmentEntertainmentBinding.inflate(it)
}) , EntertainmentAdapter.Listener
{

    private lateinit var listener : OnClick
    private val entertainmentAdapter : EntertainmentAdapter = EntertainmentAdapter(this)

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as OnClick
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val menu = requireActivity().findViewById<BottomNavigationView>(R.id.btnNav)
        menu.visibility = View.VISIBLE

        setupView()
        subscribeToLiveData()
        //viewModel.getCompany()

    }

    private fun setupView(){
        with(binding){
            Log.e("view","Ok ")
            recyclerEntertainment.adapter = entertainmentAdapter
            recyclerEntertainment.layoutManager = LinearLayoutManager(activity)
            //viewModel.getCompany()
        }
    }
    private fun subscribeToLiveData() {
        viewModel.companies.observe(viewLifecycleOwner) {
            entertainmentAdapter.setData(it)
            Log.e("setData Fr","Ok - $it")
        }

    }

    override fun onClick(index: Int) {
        viewModel.companies.value?.get(index)?.let {
            listener.openFragment(TypesFragment(),true)
        }
    }
}