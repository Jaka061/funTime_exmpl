package kg.itc.examplemvvm.domain.use_cases

import android.util.Log
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kg.itc.examplemvvm.data.models.UserEntity
import kg.itc.examplemvvm.data.repo.UserRepo
import kg.itc.examplemvvm.extensions.toUserEntity
import java.util.*
import javax.inject.Inject

class GetUserUseCase @Inject constructor(
    private val userRepo: UserRepo) {

    operator fun invoke(objectId : String): Single<UserEntity> {
        return userRepo.getUserId(objectId)
            .subscribeOn(Schedulers.io())
            .map {
                Log.d("List", it.toString())
                it.first()
            }
            .map {
                Log.d("List2", it.toString())
//                println(it)
//                userRepo.saveUsersToDb(it.map { it.toUserEntity() })
                it.toUserEntity()
            }
            .observeOn(AndroidSchedulers.mainThread())
    }
}