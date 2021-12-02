package oit.is.z0119.kaizi.janken.model;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Insert;

@Mapper
public interface MatchMapper {

  @Select("SELECT * FROM MATCHES")
  ArrayList<Match> selectAll();

  @Select("SELECT * FROM MATCHES WHERE NAME = #{name}")
  Match selectByName(String name);

  @Select("SELECT * FROM MATCHES WHERE id = #{id}")
  Match selectById(int id);

  @Insert("INSERT INTO MATCHES (user1,user2,user1Hand,user2Hand) VALUES (#{user1},#{user2},#{user1Hand},#{user2Hand});")
  void insertMatches(Match match);
}
