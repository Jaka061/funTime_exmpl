package kg.itc.examplemvvm.data.storage

import androidx.room.Dao
import androidx.room.Insert
import io.reactivex.Completable
import kg.itc.examplemvvm.data.models.UserEntity

@Dao
interface UserDao {
    @Insert
    fun insertUsers(user: List<UserEntity>): Completable
}