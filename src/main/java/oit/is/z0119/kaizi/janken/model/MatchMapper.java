package oit.is.z0119.kaizi.janken.model;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MatchMapper {

  @Select("SELECT * FROM MATCHES")
  ArrayList<Match> selectAll();

  @Select("SELECT * FROM MATCHES WHERE USER1 = #{id}")
  ArrayList<Match> selectById(int id);
}
