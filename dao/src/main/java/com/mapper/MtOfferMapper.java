package com.mapper;

import com.beans.MtOffer;
import com.beans.MtOfferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MtOfferMapper {
    long countByExample(MtOfferExample example);

    int deleteByExample(MtOfferExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MtOffer record);

    int insertSelective(MtOffer record);

    List<MtOffer> selectByExample(MtOfferExample example);

    MtOffer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MtOffer record, @Param("example") MtOfferExample example);

    int updateByExample(@Param("record") MtOffer record, @Param("example") MtOfferExample example);

    int updateByPrimaryKeySelective(MtOffer record);

    int updateByPrimaryKey(MtOffer record);
}