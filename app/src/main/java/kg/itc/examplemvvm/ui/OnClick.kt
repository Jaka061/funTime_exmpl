package kg.itc.examplemvvm.ui

import androidx.fragment.app.Fragment

interface OnClick {
    fun openFragment(fragment: Fragment, addToBackStack: Boolean? = true)
}