package kg.itc.examplemvvm.ui.main

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint
import kg.itc.examplemvvm.R
import kg.itc.examplemvvm.databinding.FragmentMainBinding
import kg.itc.examplemvvm.ui.OnClick
import kg.itc.examplemvvm.ui.base.BaseFragment
import kg.itc.examplemvvm.ui.funTime.company.EntertainmentsFragment

@AndroidEntryPoint
class MainFragment: BaseFragment<MainVM, FragmentMainBinding>
    (MainVM::class.java, {
    FragmentMainBinding.inflate(it)
    })
{
    private lateinit var companyListener : OnClick

    override fun onAttach(context: Context) {
        super.onAttach(context)
        companyListener = context as OnClick
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val menu = requireActivity().findViewById<BottomNavigationView>(R.id.btnNav)
        menu.visibility = View.GONE

        binding.apply {
            btnNext.setOnClickListener {
                companyListener.openFragment(EntertainmentsFragment(),false)
            }
        }
    }

}