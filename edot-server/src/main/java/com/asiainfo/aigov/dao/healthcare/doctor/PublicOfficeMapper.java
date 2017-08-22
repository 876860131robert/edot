package com.asiainfo.aigov.dao.healthcare.doctor;

import com.asiainfo.aigov.model.healthcare.doctor.PublicOffice;
import com.asiainfo.aigov.model.healthcare.doctor.PublicOfficeExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PublicOfficeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_OFFICE
     *
     * @mbggenerated Mon Apr 17 17:58:24 CST 2017
     */
    int countByExample(PublicOfficeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_OFFICE
     *
     * @mbggenerated Mon Apr 17 17:58:24 CST 2017
     */
    int deleteByExample(PublicOfficeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_OFFICE
     *
     * @mbggenerated Mon Apr 17 17:58:24 CST 2017
     */
    int deleteByPrimaryKey(BigDecimal officeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_OFFICE
     *
     * @mbggenerated Mon Apr 17 17:58:24 CST 2017
     */
    int insert(PublicOffice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_OFFICE
     *
     * @mbggenerated Mon Apr 17 17:58:24 CST 2017
     */
    int insertSelective(PublicOffice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_OFFICE
     *
     * @mbggenerated Mon Apr 17 17:58:24 CST 2017
     */
    List<PublicOffice> selectByExampleWithRowbounds(PublicOfficeExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_OFFICE
     *
     * @mbggenerated Mon Apr 17 17:58:24 CST 2017
     */
    List<PublicOffice> selectByExample(PublicOfficeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_OFFICE
     *
     * @mbggenerated Mon Apr 17 17:58:24 CST 2017
     */
    PublicOffice selectByPrimaryKey(BigDecimal officeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_OFFICE
     *
     * @mbggenerated Mon Apr 17 17:58:24 CST 2017
     */
    int updateByExampleSelective(@Param("record") PublicOffice record, @Param("example") PublicOfficeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_OFFICE
     *
     * @mbggenerated Mon Apr 17 17:58:24 CST 2017
     */
    int updateByExample(@Param("record") PublicOffice record, @Param("example") PublicOfficeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_OFFICE
     *
     * @mbggenerated Mon Apr 17 17:58:24 CST 2017
     */
    int updateByPrimaryKeySelective(PublicOffice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_OFFICE
     *
     * @mbggenerated Mon Apr 17 17:58:24 CST 2017
     */
    int updateByPrimaryKey(PublicOffice record);
}