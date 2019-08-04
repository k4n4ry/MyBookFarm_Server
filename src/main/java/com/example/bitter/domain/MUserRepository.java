package com.example.bitter.domain;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MUserRepository {

    @Insert("INSERT INTO m_user VALUES(#{uid}, #{uname}, #{description})")
    public void insert(@Param("uid") String uid, @Param("uname") String uname, @Param("description")String description);

//    @Select("SELECT * FROM r_bookuser WHERE uid = #{uid}")
//    public List<RBookUser> getBookList(@Param("uid") String uid);
//
//    @Select("SELECT * FROM r_bookuser WHERE uid = #{uid} AND isbn = #{isbn}")
//    public List<RBookUser> getBookListIsbn(@Param("uid") String uid, @Param("isbn") String isbn);
//
//    @Update("UPDATE r_bookuser set progress = #{progress} WHERE uid = #{uid} AND isbn = #{isbn}")
//    public void update(@Param("uid") String uid, @Param("isbn") String isbn, @Param("progress") int progress);

}