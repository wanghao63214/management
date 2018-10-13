package com.mapper;

import com.beans.MtCompletedOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MtCompletedOrderMapper_Manual {
    List<Map<String, Object>> selectListMap(MtCompletedOrderExample mtCompletedOrderExample);

    Map<String, Object> selectMap(String faLogin);

    List<Map<String, Object>> selectFoodDetailsListMap(Map paraMap);
}