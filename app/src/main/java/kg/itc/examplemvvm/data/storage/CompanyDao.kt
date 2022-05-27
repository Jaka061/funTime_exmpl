package kg.itc.examplemvvm.data.storage

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import io.reactivex.Completable
import io.reactivex.Single
import kg.itc.examplemvvm.data.models.CompanyEntity

@Dao
interface CompanyDao {

    @Query("SELECT * FROM CompanyEntity")
    fun getAll(): LiveData<List<CompanyEntity>>

    @Query("SELECT * FROM CompanyEntity WHERE objectId = :objectId ")
    fun getCompanyById(objectId : String): Single<CompanyEntity>

    @Query("DELETE FROM CompanyEntity")
    fun clearTable()

    @Insert
    fun insertCompany(company : List<CompanyEntity>): Completable
}