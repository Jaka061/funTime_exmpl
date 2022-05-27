package kg.itc.examplemvvm.data.repo

import io.reactivex.Scheduler
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import kg.itc.examplemvvm.data.models.CompanyEntity
import kg.itc.examplemvvm.data.network.CompanyApi
import kg.itc.examplemvvm.data.storage.CompanyDao
import javax.inject.Inject

class CompanyRepo @Inject constructor(
    private var companyDao: CompanyDao,
    private var companyApi: CompanyApi
) {

    fun getCompanyFromApi() = companyApi.getCompany()

    fun getCompanyById(objectId : String) : Single<CompanyEntity>{
        return companyDao.getCompanyById(objectId)
            .subscribeOn(Schedulers.io())
    }

    fun saveCompanyToDb(company: List<CompanyEntity>) = companyDao.insertCompany(company)


}