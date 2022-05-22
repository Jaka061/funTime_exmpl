package kg.itc.examplemvvm.extensions

import kg.itc.examplemvvm.data.models.UserDto
import kg.itc.examplemvvm.data.models.UserEntity
import kg.itc.examplemvvm.domain.models.User


fun UserDto.toUserEntity(): UserEntity{
    return UserEntity(
        id,
        name,
        surname
    )
}


fun UserDto.toUser(): User {
    return User(
        id,name,surname
    )
}