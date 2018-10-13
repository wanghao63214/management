package com.mapper;

import com.beans.AppCode;
import com.beans.AppCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppCodeMapper {
    long countByExample(AppCodeExample example);

    int deleteByExample(AppCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppCode record);

    int insertSelective(AppCode record);

    List<AppCode> selectByExample(AppCodeExample example);

    AppCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppCode record, @Param("example") AppCodeExample example);

    int updateByExample(@Param("record") AppCode record, @Param("example") AppCodeExample example);

    int updateByPrimaryKeySelective(AppCode record);

    int updateByPrimaryKey(AppCode record);
}