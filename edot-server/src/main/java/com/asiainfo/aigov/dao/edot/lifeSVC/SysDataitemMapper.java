package com.asiainfo.aigov.dao.edot.lifeSVC;

import com.asiainfo.aigov.model.edot.lifeSVC.SysDataitem;
import com.asiainfo.aigov.model.edot.lifeSVC.SysDataitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SysDataitemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dataitem
     *
     * @mbggenerated Thu Aug 25 13:01:07 CST 2016
     */
    int countByExample(SysDataitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dataitem
     *
     * @mbggenerated Thu Aug 25 13:01:07 CST 2016
     */
    int deleteByExample(SysDataitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dataitem
     *
     * @mbggenerated Thu Aug 25 13:01:07 CST 2016
     */
    int deleteByPrimaryKey(Integer itemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dataitem
     *
     * @mbggenerated Thu Aug 25 13:01:07 CST 2016
     */
    int insert(SysDataitem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dataitem
     *
     * @mbggenerated Thu Aug 25 13:01:07 CST 2016
     */
    int insertSelective(SysDataitem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dataitem
     *
     * @mbggenerated Thu Aug 25 13:01:07 CST 2016
     */
    List<SysDataitem> selectByExampleWithRowbounds(SysDataitemExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dataitem
     *
     * @mbggenerated Thu Aug 25 13:01:07 CST 2016
     */
    List<SysDataitem> selectByExample(SysDataitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dataitem
     *
     * @mbggenerated Thu Aug 25 13:01:07 CST 2016
     */
    SysDataitem selectByPrimaryKey(Integer itemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dataitem
     *
     * @mbggenerated Thu Aug 25 13:01:07 CST 2016
     */
    int updateByExampleSelective(@Param("record") SysDataitem record, @Param("example") SysDataitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dataitem
     *
     * @mbggenerated Thu Aug 25 13:01:07 CST 2016
     */
    int updateByExample(@Param("record") SysDataitem record, @Param("example") SysDataitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dataitem
     *
     * @mbggenerated Thu Aug 25 13:01:07 CST 2016
     */
    int updateByPrimaryKeySelective(SysDataitem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dataitem
     *
     * @mbggenerated Thu Aug 25 13:01:07 CST 2016
     */
    int updateByPrimaryKey(SysDataitem record);
}