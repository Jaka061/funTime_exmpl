package kg.itc.examplemvvm.data.repo

import io.reactivex.Single
import kg.itc.examplemvvm.data.models.UserDto
import kg.itc.examplemvvm.data.models.UserEntity
import kg.itc.examplemvvm.data.network.CompanyApi
import kg.itc.examplemvvm.data.network.UserApi
import kg.itc.examplemvvm.data.storage.CompanyDao
import kg.itc.examplemvvm.data.storage.UserDao
import javax.inject.Inject

class UserRepo @Inject constructor(
    private var userDao: UserDao,
    private var userApi: UserApi
) {

    fun getUserFromApi() = userApi.getUsers()

    fun getUserById(objectId : String) = userDao.getUserById(objectId)

    fun getUserId(objectId: String): Single<List<UserDto>> {
        return userApi.getUserById(objectId)
    }

    fun clearTable() {
        userDao.clearTable()
    }

    fun saveUsersToDb(users: List<UserEntity>) = userDao.insertUsers(users)

}