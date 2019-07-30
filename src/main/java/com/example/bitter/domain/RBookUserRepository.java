package com.example.bitter.domain;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface RBookUserRepository {

    @Insert("INSERT INTO r_bookuser VALUES(#{uid}, #{isbn}, \'0\')")
    public void insert(@Param("uid") String uid, @Param("isbn") String isbn);

    @Select("SELECT * FROM r_bookuser WHERE uid = #{uid}")
    public List<RBookUser> getBookList(@Param("uid") String uid);

}
