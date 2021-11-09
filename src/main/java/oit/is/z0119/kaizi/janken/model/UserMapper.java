package oit.is.z0119.kaizi.janken.model;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

  @Select("SELECT * FROM USERS")
  ArrayList<User> selectAll();

  @Select("SELECT * FROM USERS WHERE USER1 = #{id}")
  User selectById(int id);

  @Select("SELECT * FROM USERS WHERE NAME = #{name}")
  User selectByName(String name);
}
