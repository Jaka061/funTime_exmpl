package kg.itc.examplemvvm.domain.use_cases

import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kg.itc.examplemvvm.data.models.UserDto
import kg.itc.examplemvvm.data.repo.UserRepo
import kg.itc.examplemvvm.domain.models.User
import kg.itc.examplemvvm.extensions.toUser
import kg.itc.examplemvvm.extensions.toUserEntity
import javax.inject.Inject

class GetUserUseCase @Inject constructor(
    private val userRepo: UserRepo
) {

    operator fun invoke(): Single<List<User>> {
        return userRepo.getUserFromApi()
            .subscribeOn(Schedulers.io())
            .map {
                userRepo.saveUsersToDb(it.map { it.toUserEntity() })
                it.map { it.toUser() }
            }
            .observeOn(AndroidSchedulers.mainThread())

    }
}