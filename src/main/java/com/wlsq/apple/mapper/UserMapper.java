package com.wlsq.apple.mapper;

import com.wlsq.apple.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMapper {
    @Select("select * from users")
    public List<User> getAllUsers();

    @Select("select * from users where id=#{id}")
    public User getUsersById(int id);

}
