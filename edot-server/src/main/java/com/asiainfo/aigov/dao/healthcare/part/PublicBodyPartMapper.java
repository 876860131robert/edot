package com.asiainfo.aigov.dao.healthcare.part;

import com.asiainfo.aigov.model.healthcare.part.PublicBodyPart;
import com.asiainfo.aigov.model.healthcare.part.PublicBodyPartExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PublicBodyPartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_BODY_PART
     *
     * @mbggenerated Thu Apr 27 11:23:03 CST 2017
     */
    int countByExample(PublicBodyPartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_BODY_PART
     *
     * @mbggenerated Thu Apr 27 11:23:03 CST 2017
     */
    int deleteByExample(PublicBodyPartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_BODY_PART
     *
     * @mbggenerated Thu Apr 27 11:23:03 CST 2017
     */
    int deleteByPrimaryKey(BigDecimal partId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_BODY_PART
     *
     * @mbggenerated Thu Apr 27 11:23:03 CST 2017
     */
    int insert(PublicBodyPart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_BODY_PART
     *
     * @mbggenerated Thu Apr 27 11:23:03 CST 2017
     */
    int insertSelective(PublicBodyPart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_BODY_PART
     *
     * @mbggenerated Thu Apr 27 11:23:03 CST 2017
     */
    List<PublicBodyPart> selectByExampleWithRowbounds(PublicBodyPartExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_BODY_PART
     *
     * @mbggenerated Thu Apr 27 11:23:03 CST 2017
     */
    List<PublicBodyPart> selectByExample(PublicBodyPartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_BODY_PART
     *
     * @mbggenerated Thu Apr 27 11:23:03 CST 2017
     */
    PublicBodyPart selectByPrimaryKey(BigDecimal partId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_BODY_PART
     *
     * @mbggenerated Thu Apr 27 11:23:03 CST 2017
     */
    int updateByExampleSelective(@Param("record") PublicBodyPart record, @Param("example") PublicBodyPartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_BODY_PART
     *
     * @mbggenerated Thu Apr 27 11:23:03 CST 2017
     */
    int updateByExample(@Param("record") PublicBodyPart record, @Param("example") PublicBodyPartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_BODY_PART
     *
     * @mbggenerated Thu Apr 27 11:23:03 CST 2017
     */
    int updateByPrimaryKeySelective(PublicBodyPart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_BODY_PART
     *
     * @mbggenerated Thu Apr 27 11:23:03 CST 2017
     */
    int updateByPrimaryKey(PublicBodyPart record);
}