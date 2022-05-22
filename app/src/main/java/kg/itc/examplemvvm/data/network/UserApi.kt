package kg.itc.examplemvvm.data.network

import io.reactivex.Single
import kg.itc.examplemvvm.data.models.UserDto
import retrofit2.http.GET

interface UserApi {

    @GET("example/get_users")
    fun getUsers(): Single<List<UserDto>>
}