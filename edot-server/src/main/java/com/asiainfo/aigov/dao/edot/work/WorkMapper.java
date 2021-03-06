package com.asiainfo.aigov.dao.edot.work;

import com.asiainfo.aigov.model.edot.work.Work;
import com.asiainfo.aigov.model.edot.work.WorkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WorkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK
     *
     * @mbggenerated Tue Jun 07 11:35:56 GMT+08:00 2016
     */
    int countByExample(WorkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK
     *
     * @mbggenerated Tue Jun 07 11:35:56 GMT+08:00 2016
     */
    int deleteByExample(WorkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK
     *
     * @mbggenerated Tue Jun 07 11:35:56 GMT+08:00 2016
     */
    int deleteByPrimaryKey(String workCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK
     *
     * @mbggenerated Tue Jun 07 11:35:56 GMT+08:00 2016
     */
    int insert(Work record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK
     *
     * @mbggenerated Tue Jun 07 11:35:56 GMT+08:00 2016
     */
    int insertSelective(Work record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK
     *
     * @mbggenerated Tue Jun 07 11:35:56 GMT+08:00 2016
     */
    List<Work> selectByExampleWithRowbounds(WorkExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK
     *
     * @mbggenerated Tue Jun 07 11:35:56 GMT+08:00 2016
     */
    List<Work> selectByExample(WorkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK
     *
     * @mbggenerated Tue Jun 07 11:35:56 GMT+08:00 2016
     */
    Work selectByPrimaryKey(String workCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK
     *
     * @mbggenerated Tue Jun 07 11:35:56 GMT+08:00 2016
     */
    int updateByExampleSelective(@Param("record") Work record, @Param("example") WorkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK
     *
     * @mbggenerated Tue Jun 07 11:35:56 GMT+08:00 2016
     */
    int updateByExample(@Param("record") Work record, @Param("example") WorkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK
     *
     * @mbggenerated Tue Jun 07 11:35:56 GMT+08:00 2016
     */
    int updateByPrimaryKeySelective(Work record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK
     *
     * @mbggenerated Tue Jun 07 11:35:56 GMT+08:00 2016
     */
    int updateByPrimaryKey(Work record);
}