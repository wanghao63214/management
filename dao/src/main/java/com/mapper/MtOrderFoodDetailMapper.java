package com.mapper;

import com.beans.MtOrderFoodDetail;
import com.beans.MtOrderFoodDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MtOrderFoodDetailMapper {
    long countByExample(MtOrderFoodDetailExample example);

    int deleteByExample(MtOrderFoodDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MtOrderFoodDetail record);

    int insertSelective(MtOrderFoodDetail record);

    List<MtOrderFoodDetail> selectByExample(MtOrderFoodDetailExample example);

    MtOrderFoodDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MtOrderFoodDetail record, @Param("example") MtOrderFoodDetailExample example);

    int updateByExample(@Param("record") MtOrderFoodDetail record, @Param("example") MtOrderFoodDetailExample example);

    int updateByPrimaryKeySelective(MtOrderFoodDetail record);

    int updateByPrimaryKey(MtOrderFoodDetail record);
}