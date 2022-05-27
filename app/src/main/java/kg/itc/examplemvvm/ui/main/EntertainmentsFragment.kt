package kg.itc.examplemvvm.ui.main

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import kg.itc.examplemvvm.databinding.FragmentEntertainmentBinding
import kg.itc.examplemvvm.ui.OnClick
import kg.itc.examplemvvm.ui.base.BaseFragment

@AndroidEntryPoint
class EntertainmentsFragment: BaseFragment<MainVM, FragmentEntertainmentBinding>
    (MainVM::class.java, { FragmentEntertainmentBinding.inflate(it) })
{
    private lateinit var listener : OnClick
    private var _binding: FragmentEntertainmentBinding? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
       // _binding = FragmentMainBinding.inflate(inflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}