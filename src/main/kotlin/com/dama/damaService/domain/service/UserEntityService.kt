package com.dama.damaService.domain.service


import com.dama.damaService.domain.entity.UserEntity
import com.dama.damaService.domain.mapper.UserEntityMapper
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class UserEntityService(private val mapper: UserEntityMapper) {

    fun find() : List<UserEntity> = mapper.find()

}