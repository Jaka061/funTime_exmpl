package kg.itc.examplemvvm.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CompanyEntity(
    @PrimaryKey
    var objectId: String,
    var name: String,
    var region: String,
    var type:String,
    var img: String,
    var description:String,
    var email: String,
    var instagram: String,
    var address: String,
    var number: String
    )
