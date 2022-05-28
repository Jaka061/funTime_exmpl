package kg.itc.examplemvvm.ui.main

import androidx.lifecycle.LiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import kg.itc.examplemvvm.data.models.CompanyEntity
import kg.itc.examplemvvm.domain.use_cases.GetCompanyAsLiveDataUseCase
import kg.itc.examplemvvm.domain.use_cases.GetCompanyUseCase
import kg.itc.examplemvvm.ui.base.Event
import kg.itc.examplemvvm.ui.base.BaseVM
import javax.inject.Inject

@HiltViewModel
class MainVM @Inject constructor(): BaseVM()
{

}