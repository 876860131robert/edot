package com.asiainfo.aigov.dao.healthcare.order;

import com.asiainfo.aigov.model.healthcare.order.PublicOrder;
import com.asiainfo.aigov.model.healthcare.order.PublicOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PublicOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_ORDER
     *
     * @mbggenerated Sat Apr 22 18:02:09 CST 2017
     */
    int countByExample(PublicOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_ORDER
     *
     * @mbggenerated Sat Apr 22 18:02:09 CST 2017
     */
    int deleteByExample(PublicOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_ORDER
     *
     * @mbggenerated Sat Apr 22 18:02:09 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_ORDER
     *
     * @mbggenerated Sat Apr 22 18:02:09 CST 2017
     */
    int insert(PublicOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_ORDER
     *
     * @mbggenerated Sat Apr 22 18:02:09 CST 2017
     */
    int insertSelective(PublicOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_ORDER
     *
     * @mbggenerated Sat Apr 22 18:02:09 CST 2017
     */
    List<PublicOrder> selectByExampleWithRowbounds(PublicOrderExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_ORDER
     *
     * @mbggenerated Sat Apr 22 18:02:09 CST 2017
     */
    List<PublicOrder> selectByExample(PublicOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_ORDER
     *
     * @mbggenerated Sat Apr 22 18:02:09 CST 2017
     */
    PublicOrder selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_ORDER
     *
     * @mbggenerated Sat Apr 22 18:02:09 CST 2017
     */
    int updateByExampleSelective(@Param("record") PublicOrder record, @Param("example") PublicOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_ORDER
     *
     * @mbggenerated Sat Apr 22 18:02:09 CST 2017
     */
    int updateByExample(@Param("record") PublicOrder record, @Param("example") PublicOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_ORDER
     *
     * @mbggenerated Sat Apr 22 18:02:09 CST 2017
     */
    int updateByPrimaryKeySelective(PublicOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC_ORDER
     *
     * @mbggenerated Sat Apr 22 18:02:09 CST 2017
     */
    int updateByPrimaryKey(PublicOrder record);
}