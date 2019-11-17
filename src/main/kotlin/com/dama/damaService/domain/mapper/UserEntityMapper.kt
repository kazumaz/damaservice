package com.dama.damaService.domain.mapper

import org.apache.ibatis.annotations.Mapper
import com.dama.damaService.domain.entity.UserEntity

@Mapper
interface UserEntityMapper {
    // 抽象メソッドで定義する
    fun find(): List<UserEntity>

}