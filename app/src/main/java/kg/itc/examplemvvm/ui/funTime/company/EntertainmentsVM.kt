package kg.itc.examplemvvm.ui.funTime.company

import androidx.lifecycle.LiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import kg.itc.examplemvvm.data.models.CompanyEntity
import kg.itc.examplemvvm.domain.use_cases.GetCompanyAsLiveDataUseCase
import kg.itc.examplemvvm.domain.use_cases.GetCompanyUseCase
import kg.itc.examplemvvm.ui.base.BaseVM
import kg.itc.examplemvvm.ui.base.Event
import javax.inject.Inject

@HiltViewModel
class EntertainmentsVM @Inject constructor(
    private val getCompanyUseCase: GetCompanyUseCase,
    private val getCompanyAsLiveDataUseCase: GetCompanyAsLiveDataUseCase
) : BaseVM() {

        val companies : LiveData<List<CompanyEntity>> = getCompanyAsLiveDataUseCase()

        init {
            getCompany()
        }

        fun getCompany(){
            _event.value = Event.ShowLoading
            disposable.add(
                getCompanyUseCase()
                    .doOnTerminate{
                        _event.value = Event.StopLoading
                    }
                    .subscribe({},{ handleError(it)})
            )
        }
}