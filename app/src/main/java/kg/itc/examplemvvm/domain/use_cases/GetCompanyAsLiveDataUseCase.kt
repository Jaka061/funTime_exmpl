package kg.itc.examplemvvm.domain.use_cases

import androidx.lifecycle.LiveData
import kg.itc.examplemvvm.data.models.CompanyEntity
import kg.itc.examplemvvm.data.repo.CompanyRepo
import javax.inject.Inject

class GetCompanyAsLiveDataUseCase @Inject constructor(
    private val companyRepo: CompanyRepo
){
    operator fun invoke(): LiveData<List<CompanyEntity>>{
        return companyRepo.getCompanyFromDB()
    }
}