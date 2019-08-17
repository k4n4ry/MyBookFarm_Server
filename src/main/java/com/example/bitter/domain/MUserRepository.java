package com.example.bitter.domain;

import com.example.bitter.domain.entity.MUser;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MUserRepository {

    @Insert("INSERT INTO m_user VALUES(#{uid}, #{uname}, #{description})")
    void insert(@Param("uid") String uid, @Param("uname") String uname, @Param("description")String description);

    @Select("SELECT * FROM m_user WHERE uid = #{uid}")
    List<MUser> get(@Param("uid") String uid);

    @Update("UPDATE m_user set uname = #{uname}, description = #{description} WHERE uid = #{uid}")
    void update(String uid, String uname, String description);

    @Select("SELECT * FROM m_user WHERE uid in (SELECT uid FROM r_bookuser WHERE isbn = #{isbn})")
    List<MUser> getOnIsbn(String isbn);

//    @Select("SELECT * FROM r_bookuser WHERE uid = #{uid}")
//    public List<RBookUser> getBookList(@Param("uid") String uid);
//
//    @Select("SELECT * FROM r_bookuser WHERE uid = #{uid} AND isbn = #{isbn}")
//    public List<RBookUser> getBookListIsbn(@Param("uid") String uid, @Param("isbn") String isbn);
//
//    @Update("UPDATE r_bookuser set progress = #{progress} WHERE uid = #{uid} AND isbn = #{isbn}")
//    public void update(@Param("uid") String uid, @Param("isbn") String isbn, @Param("progress") int progress);

}
