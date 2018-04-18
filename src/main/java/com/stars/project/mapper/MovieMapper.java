package com.stars.project.mapper;

import com.stars.project.entity.Movie;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MovieMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Movie record);

    int insertSelective(Movie record);

    Movie selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Movie record);

    int updateByPrimaryKey(Movie record);
}