package com.asiainfo.aigov.dao.edot.lifeSVC;

import com.asiainfo.aigov.model.edot.lifeSVC.WebService;
import com.asiainfo.aigov.model.edot.lifeSVC.WebServiceExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WebServiceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service
     *
     * @mbggenerated Thu Aug 25 13:03:28 CST 2016
     */
    int countByExample(WebServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service
     *
     * @mbggenerated Thu Aug 25 13:03:28 CST 2016
     */
    int deleteByExample(WebServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service
     *
     * @mbggenerated Thu Aug 25 13:03:28 CST 2016
     */
    int deleteByPrimaryKey(Integer serviceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service
     *
     * @mbggenerated Thu Aug 25 13:03:28 CST 2016
     */
    int insert(WebService record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service
     *
     * @mbggenerated Thu Aug 25 13:03:28 CST 2016
     */
    int insertSelective(WebService record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service
     *
     * @mbggenerated Thu Aug 25 13:03:28 CST 2016
     */
    List<WebService> selectByExampleWithBLOBsWithRowbounds(WebServiceExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service
     *
     * @mbggenerated Thu Aug 25 13:03:28 CST 2016
     */
    List<WebService> selectByExampleWithBLOBs(WebServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service
     *
     * @mbggenerated Thu Aug 25 13:03:28 CST 2016
     */
    List<WebService> selectByExampleWithRowbounds(WebServiceExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service
     *
     * @mbggenerated Thu Aug 25 13:03:28 CST 2016
     */
    List<WebService> selectByExample(WebServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service
     *
     * @mbggenerated Thu Aug 25 13:03:28 CST 2016
     */
    WebService selectByPrimaryKey(Integer serviceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service
     *
     * @mbggenerated Thu Aug 25 13:03:28 CST 2016
     */
    int updateByExampleSelective(@Param("record") WebService record, @Param("example") WebServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service
     *
     * @mbggenerated Thu Aug 25 13:03:28 CST 2016
     */
    int updateByExampleWithBLOBs(@Param("record") WebService record, @Param("example") WebServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service
     *
     * @mbggenerated Thu Aug 25 13:03:28 CST 2016
     */
    int updateByExample(@Param("record") WebService record, @Param("example") WebServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service
     *
     * @mbggenerated Thu Aug 25 13:03:28 CST 2016
     */
    int updateByPrimaryKeySelective(WebService record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service
     *
     * @mbggenerated Thu Aug 25 13:03:28 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(WebService record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service
     *
     * @mbggenerated Thu Aug 25 13:03:28 CST 2016
     */
    int updateByPrimaryKey(WebService record);
    
    int updateChecknumByPrimaryKey(Integer serviceId);
    
    Map<String, Object> selectByServiceId(Integer serviceId);
    
}