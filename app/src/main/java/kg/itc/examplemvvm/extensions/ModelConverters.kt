package kg.itc.examplemvvm.extensions

import kg.itc.examplemvvm.data.models.*

fun UserDto.toUserEntity(): UserEntity {
    return UserEntity(
        objectId = this.objectId,
        name = this.name,
        email = this.email,
        surname = this.surname,
        password = this.password,
        age = this.age
    )
}

fun CompanyDto.toCompanyEntity(): CompanyEntity {
    return CompanyEntity(
        objectId = this.objectId,
        name = this.name,
        region = this.region,
        type = this.type,
        description = this.description,
        img = this.img,
        email = this.email,
        number = this.number,
        instagram = this.instagram,
        address = this.address
    )
}

fun TypesDto.toTypesEntity(): TypesEntity{
    return TypesEntity(
        objectId = this.objectId,
        name = this.name,
        img = this.img,
        count = this.count
    )
}

