package com.asiainfo.aigov.dao.edot.lifeSVC;

import com.asiainfo.aigov.model.edot.lifeSVC.WebServiceComment;
import com.asiainfo.aigov.model.edot.lifeSVC.WebServiceCommentExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WebServiceCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service_comment
     *
     * @mbggenerated Thu Aug 25 13:04:57 CST 2016
     */
    int countByExample(WebServiceCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service_comment
     *
     * @mbggenerated Thu Aug 25 13:04:57 CST 2016
     */
    int deleteByExample(WebServiceCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service_comment
     *
     * @mbggenerated Thu Aug 25 13:04:57 CST 2016
     */
    int deleteByPrimaryKey(Integer commentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service_comment
     *
     * @mbggenerated Thu Aug 25 13:04:57 CST 2016
     */
    int insert(WebServiceComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service_comment
     *
     * @mbggenerated Thu Aug 25 13:04:57 CST 2016
     */
    int insertSelective(WebServiceComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service_comment
     *
     * @mbggenerated Thu Aug 25 13:04:57 CST 2016
     */
    List<WebServiceComment> selectByExampleWithRowbounds(WebServiceCommentExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service_comment
     *
     * @mbggenerated Thu Aug 25 13:04:57 CST 2016
     */
    List<WebServiceComment> selectByExample(WebServiceCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service_comment
     *
     * @mbggenerated Thu Aug 25 13:04:57 CST 2016
     */
    WebServiceComment selectByPrimaryKey(Integer commentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service_comment
     *
     * @mbggenerated Thu Aug 25 13:04:57 CST 2016
     */
    int updateByExampleSelective(@Param("record") WebServiceComment record, @Param("example") WebServiceCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service_comment
     *
     * @mbggenerated Thu Aug 25 13:04:57 CST 2016
     */
    int updateByExample(@Param("record") WebServiceComment record, @Param("example") WebServiceCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service_comment
     *
     * @mbggenerated Thu Aug 25 13:04:57 CST 2016
     */
    int updateByPrimaryKeySelective(WebServiceComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service_comment
     *
     * @mbggenerated Thu Aug 25 13:04:57 CST 2016
     */
    int updateByPrimaryKey(WebServiceComment record);
    
    List<Map<String, Object>> selectByServiceId(Integer serviceId);

}