package com.gmh.wzz.core.dao;

import com.gmh.wzz.api.model.TbWzzInfo;
import com.gmh.wzz.api.model.TbWzzInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbWzzInfoDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_info
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    int countByExample(TbWzzInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_info
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    int deleteByExample(TbWzzInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_info
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_info
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    int insert(TbWzzInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_info
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    int insertSelective(TbWzzInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_info
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    List<TbWzzInfo> selectByExample(TbWzzInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_info
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    TbWzzInfo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_info
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    int updateByExampleSelective(@Param("record") TbWzzInfo record, @Param("example") TbWzzInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_info
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    int updateByExample(@Param("record") TbWzzInfo record, @Param("example") TbWzzInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_info
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    int updateByPrimaryKeySelective(TbWzzInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_info
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    int updateByPrimaryKey(TbWzzInfo record);
}