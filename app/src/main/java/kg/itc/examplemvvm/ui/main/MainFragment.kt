package kg.itc.examplemvvm.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kg.itc.examplemvvm.R
import kg.itc.examplemvvm.databinding.FragmentMainBinding
import kg.itc.examplemvvm.ui.base.BaseFragment
import kg.itc.examplemvvm.ui.funTime.login.AuthorizationFragment

class MainFragment: BaseFragment<MainFragmentVM, FragmentMainBinding>(MainFragmentVM::class.java,
    {
        FragmentMainBinding.inflate(it)
    }
) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if(savedInstanceState == null){
            openFragment(AuthorizationFragment(), false)
        }
    }

    private fun openFragment(fragment: Fragment, addToBackStack: Boolean? =  false) {
        childFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_secondary, fragment)
            .apply {
                if (addToBackStack == true) {
                    addToBackStack(null)
                }
            }
            .commit()
    }
}