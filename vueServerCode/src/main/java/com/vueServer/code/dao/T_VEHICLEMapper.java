package com.vueServer.code.dao;

import com.vueServer.code.pojo.T_VEHICLE;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface T_VEHICLEMapper {
    int deleteByPrimaryKey(@Param("hphm") String hphm, @Param("hpzl") String hpzl);

    int insert(T_VEHICLE record);

    int insertSelective(T_VEHICLE record);

    T_VEHICLE selectByPrimaryKey(@Param("hphm") String hphm, @Param("hpzl") String hpzl);

    int updateByPrimaryKeySelective(T_VEHICLE record);

    int updateByPrimaryKey(T_VEHICLE record);

    List<T_VEHICLE> findAll();
}