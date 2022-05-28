package kg.itc.examplemvvm.data.network

import io.reactivex.Single
import kg.itc.examplemvvm.data.models.CompanyDto
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface CompanyApi {

    @GET("data/Entertainment")
    fun getCompany(): Single<List<CompanyDto>>

    @GET("data/Entertainment/{objectId}")
    fun getCompanyById(@Path("objectId") objectId:String): Single<List<CompanyDto>>

    @POST("data/Entertainment")
    fun insertCompany(companyDto: CompanyDto)
}