package com.asiainfo.aigov.dao.edot.work;

import com.asiainfo.aigov.model.edot.work.WorkGuide;
import com.asiainfo.aigov.model.edot.work.WorkGuideExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WorkGuideMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_GUIDE
     *
     * @mbggenerated Tue Jun 07 11:36:11 GMT+08:00 2016
     */
    int countByExample(WorkGuideExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_GUIDE
     *
     * @mbggenerated Tue Jun 07 11:36:11 GMT+08:00 2016
     */
    int deleteByExample(WorkGuideExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_GUIDE
     *
     * @mbggenerated Tue Jun 07 11:36:11 GMT+08:00 2016
     */
    int deleteByPrimaryKey(String workCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_GUIDE
     *
     * @mbggenerated Tue Jun 07 11:36:11 GMT+08:00 2016
     */
    int insert(WorkGuide record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_GUIDE
     *
     * @mbggenerated Tue Jun 07 11:36:11 GMT+08:00 2016
     */
    int insertSelective(WorkGuide record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_GUIDE
     *
     * @mbggenerated Tue Jun 07 11:36:11 GMT+08:00 2016
     */
    List<WorkGuide> selectByExampleWithBLOBsWithRowbounds(WorkGuideExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_GUIDE
     *
     * @mbggenerated Tue Jun 07 11:36:11 GMT+08:00 2016
     */
    List<WorkGuide> selectByExampleWithBLOBs(WorkGuideExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_GUIDE
     *
     * @mbggenerated Tue Jun 07 11:36:11 GMT+08:00 2016
     */
    List<WorkGuide> selectByExampleWithRowbounds(WorkGuideExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_GUIDE
     *
     * @mbggenerated Tue Jun 07 11:36:11 GMT+08:00 2016
     */
    List<WorkGuide> selectByExample(WorkGuideExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_GUIDE
     *
     * @mbggenerated Tue Jun 07 11:36:11 GMT+08:00 2016
     */
    WorkGuide selectByPrimaryKey(String workCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_GUIDE
     *
     * @mbggenerated Tue Jun 07 11:36:11 GMT+08:00 2016
     */
    int updateByExampleSelective(@Param("record") WorkGuide record, @Param("example") WorkGuideExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_GUIDE
     *
     * @mbggenerated Tue Jun 07 11:36:11 GMT+08:00 2016
     */
    int updateByExampleWithBLOBs(@Param("record") WorkGuide record, @Param("example") WorkGuideExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_GUIDE
     *
     * @mbggenerated Tue Jun 07 11:36:11 GMT+08:00 2016
     */
    int updateByExample(@Param("record") WorkGuide record, @Param("example") WorkGuideExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_GUIDE
     *
     * @mbggenerated Tue Jun 07 11:36:11 GMT+08:00 2016
     */
    int updateByPrimaryKeySelective(WorkGuide record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_GUIDE
     *
     * @mbggenerated Tue Jun 07 11:36:11 GMT+08:00 2016
     */
    int updateByPrimaryKeyWithBLOBs(WorkGuide record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_GUIDE
     *
     * @mbggenerated Tue Jun 07 11:36:11 GMT+08:00 2016
     */
    int updateByPrimaryKey(WorkGuide record);
}