package com.green.growgreen.user;

import com.green.growgreen.user.model.UserInsDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insUser(UserInsDto dto);
}
