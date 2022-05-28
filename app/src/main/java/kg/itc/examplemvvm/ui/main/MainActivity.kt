package kg.itc.examplemvvm.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint
import kg.itc.examplemvvm.R
import kg.itc.examplemvvm.databinding.ActivityMainBinding
import kg.itc.examplemvvm.ui.OnClick
import kg.itc.examplemvvm.ui.funTime.company.EntertainmentsFragment
import kg.itc.examplemvvm.ui.funTime.company.SearchingFragment
import kg.itc.examplemvvm.ui.funTime.users.UserInfoFragment

@AndroidEntryPoint
class MainActivity: AppCompatActivity(),OnClick {
    private lateinit var binding: ActivityMainBinding
    lateinit var clickView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            openFragment(MainFragment(), false)

        }

        binding.run {
            supportActionBar?.hide()
            clickView = binding.btnNav

            clickView.setOnItemSelectedListener {
                when (it.itemId) {
                    R.id.search -> {
                        openFragment(SearchingFragment(), false)
                    }
                    R.id.home -> {
                        openFragment(EntertainmentsFragment(), false)
                    }
                    R.id.profile -> {
                        openFragment(UserInfoFragment(), false)
                    }
                }
                true
            }
        }
    }

    override fun openFragment(fragment: Fragment, addToBackStack: Boolean?) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container1,fragment)
            .apply {
                if(addToBackStack == true) {
                    addToBackStack("")
                }
            }
            .commit()
    }
}
