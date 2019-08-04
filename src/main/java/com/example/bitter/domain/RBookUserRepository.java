package com.example.bitter.domain;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface RBookUserRepository {

    @Insert("INSERT INTO r_bookuser VALUES(#{uid}, #{isbn}, \'0\', 0, '')")
    public void insert(@Param("uid") String uid, @Param("isbn") String isbn);

    @Select("SELECT * FROM r_bookuser WHERE uid = #{uid}")
    public List<RBookUser> getBookList(@Param("uid") String uid);

    @Select("SELECT * FROM r_bookuser WHERE uid = #{uid} AND isbn = #{isbn}")
    public List<RBookUser> getBookListIsbn(@Param("uid") String uid, @Param("isbn") String isbn);

    @Update("UPDATE r_bookuser set progress = #{progress}, memo = #{memo} WHERE uid = #{uid} AND isbn = #{isbn}")
    public void update(@Param("uid") String uid, @Param("isbn") String isbn, @Param("progress") int progress, @Param("memo") String memo);

}
