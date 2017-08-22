package com.asiainfo.aigov.dao.edot.work;

import com.asiainfo.aigov.model.edot.work.BusinessClass;
import com.asiainfo.aigov.model.edot.work.BusinessClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BusinessClassMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_BUSINESS_CLASS
     *
     * @mbggenerated Tue Jul 12 11:37:37 GMT+08:00 2016
     */
    int countByExample(BusinessClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_BUSINESS_CLASS
     *
     * @mbggenerated Tue Jul 12 11:37:37 GMT+08:00 2016
     */
    int deleteByExample(BusinessClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_BUSINESS_CLASS
     *
     * @mbggenerated Tue Jul 12 11:37:37 GMT+08:00 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_BUSINESS_CLASS
     *
     * @mbggenerated Tue Jul 12 11:37:37 GMT+08:00 2016
     */
    int insert(BusinessClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_BUSINESS_CLASS
     *
     * @mbggenerated Tue Jul 12 11:37:37 GMT+08:00 2016
     */
    int insertSelective(BusinessClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_BUSINESS_CLASS
     *
     * @mbggenerated Tue Jul 12 11:37:37 GMT+08:00 2016
     */
    List<BusinessClass> selectByExampleWithRowbounds(BusinessClassExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_BUSINESS_CLASS
     *
     * @mbggenerated Tue Jul 12 11:37:37 GMT+08:00 2016
     */
    List<BusinessClass> selectByExample(BusinessClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_BUSINESS_CLASS
     *
     * @mbggenerated Tue Jul 12 11:37:37 GMT+08:00 2016
     */
    BusinessClass selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_BUSINESS_CLASS
     *
     * @mbggenerated Tue Jul 12 11:37:37 GMT+08:00 2016
     */
    int updateByExampleSelective(@Param("record") BusinessClass record, @Param("example") BusinessClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_BUSINESS_CLASS
     *
     * @mbggenerated Tue Jul 12 11:37:37 GMT+08:00 2016
     */
    int updateByExample(@Param("record") BusinessClass record, @Param("example") BusinessClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_BUSINESS_CLASS
     *
     * @mbggenerated Tue Jul 12 11:37:37 GMT+08:00 2016
     */
    int updateByPrimaryKeySelective(BusinessClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_BUSINESS_CLASS
     *
     * @mbggenerated Tue Jul 12 11:37:37 GMT+08:00 2016
     */
    int updateByPrimaryKey(BusinessClass record);
}