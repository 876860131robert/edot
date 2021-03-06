package com.asiainfo.aigov.model.edot.news;

import java.util.Date;

public class UserNewsCat {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ED_USER_NEWS_CAT.USER_CAT_ID
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
     */
    private String userCatId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ED_USER_NEWS_CAT.USER_ID
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ED_USER_NEWS_CAT.CAT_IDS
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
     */
    private String catIds;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ED_USER_NEWS_CAT.CREATE_TIME
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ED_USER_NEWS_CAT.DICT_ID
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
     */
    private String dictId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ED_USER_NEWS_CAT.USER_CAT_ID
     *
     * @return the value of ED_USER_NEWS_CAT.USER_CAT_ID
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
     */
    public String getUserCatId() {
        return userCatId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ED_USER_NEWS_CAT.USER_CAT_ID
     *
     * @param userCatId the value for ED_USER_NEWS_CAT.USER_CAT_ID
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
     */
    public void setUserCatId(String userCatId) {
        this.userCatId = userCatId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ED_USER_NEWS_CAT.USER_ID
     *
     * @return the value of ED_USER_NEWS_CAT.USER_ID
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ED_USER_NEWS_CAT.USER_ID
     *
     * @param userId the value for ED_USER_NEWS_CAT.USER_ID
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ED_USER_NEWS_CAT.CAT_IDS
     *
     * @return the value of ED_USER_NEWS_CAT.CAT_IDS
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
     */
    public String getCatIds() {
        return catIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ED_USER_NEWS_CAT.CAT_IDS
     *
     * @param catIds the value for ED_USER_NEWS_CAT.CAT_IDS
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
     */
    public void setCatIds(String catIds) {
        this.catIds = catIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ED_USER_NEWS_CAT.CREATE_TIME
     *
     * @return the value of ED_USER_NEWS_CAT.CREATE_TIME
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ED_USER_NEWS_CAT.CREATE_TIME
     *
     * @param createTime the value for ED_USER_NEWS_CAT.CREATE_TIME
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ED_USER_NEWS_CAT.DICT_ID
     *
     * @return the value of ED_USER_NEWS_CAT.DICT_ID
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
     */
    public String getDictId() {
        return dictId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ED_USER_NEWS_CAT.DICT_ID
     *
     * @param dictId the value for ED_USER_NEWS_CAT.DICT_ID
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
     */
    public void setDictId(String dictId) {
        this.dictId = dictId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_USER_NEWS_CAT
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userCatId=").append(userCatId);
        sb.append(", userId=").append(userId);
        sb.append(", catIds=").append(catIds);
        sb.append(", createTime=").append(createTime);
        sb.append(", dictId=").append(dictId);
        sb.append("]");
        return sb.toString();
    }
}