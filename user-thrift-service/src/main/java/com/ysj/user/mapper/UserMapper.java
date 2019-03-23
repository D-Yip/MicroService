package com.ysj.user.mapper;

import com.ysj.thrift.user.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select" +
            " id,username,password,real_name as realName,mobile,email" +
            " from pe_user where id = #{id}")
    UserInfo getUserById(@Param("id") int id);

    @Select("select" +
            " id,username,password,real_name as realName,mobile,email" +
            " from pe_user where username = #{username}")
    UserInfo getUserByName(@Param("username") String username);

    @Insert("insert into " +
            "pe_user(username,password,real_name,mobile,email) " +
            "values(#{user.username},#{user.password},#{user.realName},#{user.mobile},#{user.email})")
    void registerUser(@Param("user") UserInfo userInfo);
}
