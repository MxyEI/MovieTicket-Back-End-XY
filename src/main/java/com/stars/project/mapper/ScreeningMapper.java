package com.stars.project.mapper;

import com.stars.project.entity.Screening;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ScreeningMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Screening record);

    int insertSelective(Screening record);

    Screening selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Screening record);

    int updateByPrimaryKey(Screening record);
}