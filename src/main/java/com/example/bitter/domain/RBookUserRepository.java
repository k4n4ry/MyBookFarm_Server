package com.example.bitter.domain;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface RBookUserRepository {

    @Insert("INSERT INTO r_bookuser VALUES(#{uid}, #{isbn}, \'0\')")
    public void insert(@Param("uid") String uid, @Param("isbn") String isbn);


}
