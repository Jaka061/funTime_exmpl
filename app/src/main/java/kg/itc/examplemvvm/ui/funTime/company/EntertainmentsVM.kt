package kg.itc.examplemvvm.ui.funTime.company

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
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

        private val _companies = MutableLiveData<List<CompanyEntity>>()
        val companies : LiveData<List<CompanyEntity>>
        get() = _companies

        init {
            getCompany()
        }

        fun getCompany(){
            _event.value = Event.ShowLoading
            disposable.add(
                getCompanyUseCase()
                    .subscribe({
                        try {
                            _companies.value = it
                            Log.d("all","${it}")

                        }
                        catch (e: Throwable) {
                            val a = e
                        }
                    },
                    {
                        Log.d("cdc","cdcn")
                    })

            )
        }
}