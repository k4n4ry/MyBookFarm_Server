package com.example.bitter.domain;

import com.example.bitter.domain.entity.TUserProgress;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TUserProgressRepository {

    @Insert("INSERT INTO t_user_progress VALUES(#{uid}, cast(#{ymd} as datetime), #{kbn}, #{isbn}, #{progress})")
    public void regist(String uid, String ymd, String kbn, String isbn, int progress);

    @Select("SELECT * FROM t_user_progress WHERE uid = #{uid}")
    List<TUserProgress> get(String uid, String yyyymm);
}
