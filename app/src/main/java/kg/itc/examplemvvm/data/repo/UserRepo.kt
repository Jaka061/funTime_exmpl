package kg.itc.examplemvvm.data.repo

import kg.itc.examplemvvm.data.models.UserEntity
import kg.itc.examplemvvm.data.network.UserApi
import kg.itc.examplemvvm.data.storage.UserDao
import javax.inject.Inject

class UserRepo @Inject constructor(
    private var userDao: UserDao,
    private var userApi: UserApi
) {

    fun getUserFromApi() = userApi.getUsers()

    fun saveUsersToDb(users: List<UserEntity>) = userDao.insertUsers(users)
}