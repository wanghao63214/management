package com.mapper;

import com.beans.MtCompletedOrder;
import com.beans.MtCompletedOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MtCompletedOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_completed_order
     *
     * @mbg.generated
     */
    long countByExample(MtCompletedOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_completed_order
     *
     * @mbg.generated
     */
    int deleteByExample(MtCompletedOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_completed_order
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_completed_order
     *
     * @mbg.generated
     */
    int insert(MtCompletedOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_completed_order
     *
     * @mbg.generated
     */
    int insertSelective(MtCompletedOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_completed_order
     *
     * @mbg.generated
     */
    List<MtCompletedOrder> selectByExampleWithBLOBs(MtCompletedOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_completed_order
     *
     * @mbg.generated
     */
    List<MtCompletedOrder> selectByExample(MtCompletedOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_completed_order
     *
     * @mbg.generated
     */
    MtCompletedOrder selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_completed_order
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MtCompletedOrder record, @Param("example") MtCompletedOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_completed_order
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") MtCompletedOrder record, @Param("example") MtCompletedOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_completed_order
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MtCompletedOrder record, @Param("example") MtCompletedOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_completed_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MtCompletedOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_completed_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(MtCompletedOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mt_completed_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MtCompletedOrder record);
}