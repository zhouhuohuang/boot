package com.springtest.boot.dao;

import com.springtest.boot.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
public interface LoginMapper {
	public UserEntity login(@Param("username") String username,@Param("password") String password);
}
