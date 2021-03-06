package com.asiainfo.aigov.dao.edot.work;

import com.asiainfo.aigov.model.edot.work.ServiceItem;
import com.asiainfo.aigov.model.edot.work.ServiceItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ServiceItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_SERVICE_ITEM
     *
     * @mbggenerated Tue Jul 12 10:54:14 GMT+08:00 2016
     */
    int countByExample(ServiceItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_SERVICE_ITEM
     *
     * @mbggenerated Tue Jul 12 10:54:14 GMT+08:00 2016
     */
    int deleteByExample(ServiceItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_SERVICE_ITEM
     *
     * @mbggenerated Tue Jul 12 10:54:14 GMT+08:00 2016
     */
    int deleteByPrimaryKey(String servno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_SERVICE_ITEM
     *
     * @mbggenerated Tue Jul 12 10:54:14 GMT+08:00 2016
     */
    int insert(ServiceItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_SERVICE_ITEM
     *
     * @mbggenerated Tue Jul 12 10:54:14 GMT+08:00 2016
     */
    int insertSelective(ServiceItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_SERVICE_ITEM
     *
     * @mbggenerated Tue Jul 12 10:54:14 GMT+08:00 2016
     */
    List<ServiceItem> selectByExampleWithBLOBsWithRowbounds(ServiceItemExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_SERVICE_ITEM
     *
     * @mbggenerated Tue Jul 12 10:54:14 GMT+08:00 2016
     */
    List<ServiceItem> selectByExampleWithBLOBs(ServiceItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_SERVICE_ITEM
     *
     * @mbggenerated Tue Jul 12 10:54:14 GMT+08:00 2016
     */
    List<ServiceItem> selectByExampleWithRowbounds(ServiceItemExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_SERVICE_ITEM
     *
     * @mbggenerated Tue Jul 12 10:54:14 GMT+08:00 2016
     */
    List<ServiceItem> selectByExample(ServiceItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_SERVICE_ITEM
     *
     * @mbggenerated Tue Jul 12 10:54:14 GMT+08:00 2016
     */
    ServiceItem selectByPrimaryKey(String servno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_SERVICE_ITEM
     *
     * @mbggenerated Tue Jul 12 10:54:14 GMT+08:00 2016
     */
    int updateByExampleSelective(@Param("record") ServiceItem record, @Param("example") ServiceItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_SERVICE_ITEM
     *
     * @mbggenerated Tue Jul 12 10:54:14 GMT+08:00 2016
     */
    int updateByExampleWithBLOBs(@Param("record") ServiceItem record, @Param("example") ServiceItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_SERVICE_ITEM
     *
     * @mbggenerated Tue Jul 12 10:54:14 GMT+08:00 2016
     */
    int updateByExample(@Param("record") ServiceItem record, @Param("example") ServiceItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_SERVICE_ITEM
     *
     * @mbggenerated Tue Jul 12 10:54:14 GMT+08:00 2016
     */
    int updateByPrimaryKeySelective(ServiceItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_SERVICE_ITEM
     *
     * @mbggenerated Tue Jul 12 10:54:14 GMT+08:00 2016
     */
    int updateByPrimaryKeyWithBLOBs(ServiceItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_SERVICE_ITEM
     *
     * @mbggenerated Tue Jul 12 10:54:14 GMT+08:00 2016
     */
    int updateByPrimaryKey(ServiceItem record);
}