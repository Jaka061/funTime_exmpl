package kg.itc.examplemvvm.data.storage

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import kg.itc.examplemvvm.data.models.CompanyEntity
import kg.itc.examplemvvm.data.models.UserEntity

@TypeConverters(TypeListConverter::class)
@Database(entities = [UserEntity::class,CompanyEntity::class] ,version = 1)
abstract class AppDatabase: RoomDatabase()  {

    abstract fun userDao(): UserDao
    abstract fun companyDao(): CompanyDao

    companion object {
        const val DB_NAME = "funTime.db"
    }
}