package kg.itc.examplemvvm.domain.use_cases

import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kg.itc.examplemvvm.data.models.CompanyEntity
import kg.itc.examplemvvm.data.repo.CompanyRepo
import kg.itc.examplemvvm.extensions.toCompanyEntity
import javax.inject.Inject

class GetUserUseCase @Inject constructor(
    private val companyRepo: CompanyRepo) {

    operator fun invoke(): Single<List<CompanyEntity>> {
        return companyRepo.getCompanyFromApi()
            .subscribeOn(Schedulers.io())
            .map {
                companyRepo.saveCompanyToDb(
                    it.map {
                    it.toCompanyEntity() })
                it.map { it.toCompanyEntity() }
            }
            .observeOn(AndroidSchedulers.mainThread())

    }
}