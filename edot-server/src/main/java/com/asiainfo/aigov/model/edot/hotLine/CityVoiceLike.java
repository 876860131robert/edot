package com.asiainfo.aigov.model.edot.hotLine;

import java.util.Date;

public class CityVoiceLike {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ED_CITY_VOICE_LIKE.LIKE_MAC
     *
     * @mbggenerated Fri Jun 17 10:05:15 CST 2016
     */
    private String likeMac;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ED_CITY_VOICE_LIKE.CITY_VOICE_ID
     *
     * @mbggenerated Fri Jun 17 10:05:15 CST 2016
     */
    private String cityVoiceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ED_CITY_VOICE_LIKE.LIKE_ID
     *
     * @mbggenerated Fri Jun 17 10:05:15 CST 2016
     */
    private String likeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ED_CITY_VOICE_LIKE.LIKE_CREATE_TIME
     *
     * @mbggenerated Fri Jun 17 10:05:15 CST 2016
     */
    private Date likeCreateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ED_CITY_VOICE_LIKE.LIKE_MAC
     *
     * @return the value of ED_CITY_VOICE_LIKE.LIKE_MAC
     *
     * @mbggenerated Fri Jun 17 10:05:15 CST 2016
     */
    public String getLikeMac() {
        return likeMac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ED_CITY_VOICE_LIKE.LIKE_MAC
     *
     * @param likeMac the value for ED_CITY_VOICE_LIKE.LIKE_MAC
     *
     * @mbggenerated Fri Jun 17 10:05:15 CST 2016
     */
    public void setLikeMac(String likeMac) {
        this.likeMac = likeMac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ED_CITY_VOICE_LIKE.CITY_VOICE_ID
     *
     * @return the value of ED_CITY_VOICE_LIKE.CITY_VOICE_ID
     *
     * @mbggenerated Fri Jun 17 10:05:15 CST 2016
     */
    public String getCityVoiceId() {
        return cityVoiceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ED_CITY_VOICE_LIKE.CITY_VOICE_ID
     *
     * @param cityVoiceId the value for ED_CITY_VOICE_LIKE.CITY_VOICE_ID
     *
     * @mbggenerated Fri Jun 17 10:05:15 CST 2016
     */
    public void setCityVoiceId(String cityVoiceId) {
        this.cityVoiceId = cityVoiceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ED_CITY_VOICE_LIKE.LIKE_ID
     *
     * @return the value of ED_CITY_VOICE_LIKE.LIKE_ID
     *
     * @mbggenerated Fri Jun 17 10:05:15 CST 2016
     */
    public String getLikeId() {
        return likeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ED_CITY_VOICE_LIKE.LIKE_ID
     *
     * @param likeId the value for ED_CITY_VOICE_LIKE.LIKE_ID
     *
     * @mbggenerated Fri Jun 17 10:05:15 CST 2016
     */
    public void setLikeId(String likeId) {
        this.likeId = likeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ED_CITY_VOICE_LIKE.LIKE_CREATE_TIME
     *
     * @return the value of ED_CITY_VOICE_LIKE.LIKE_CREATE_TIME
     *
     * @mbggenerated Fri Jun 17 10:05:15 CST 2016
     */
    public Date getLikeCreateTime() {
        return likeCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ED_CITY_VOICE_LIKE.LIKE_CREATE_TIME
     *
     * @param likeCreateTime the value for ED_CITY_VOICE_LIKE.LIKE_CREATE_TIME
     *
     * @mbggenerated Fri Jun 17 10:05:15 CST 2016
     */
    public void setLikeCreateTime(Date likeCreateTime) {
        this.likeCreateTime = likeCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_CITY_VOICE_LIKE
     *
     * @mbggenerated Fri Jun 17 10:05:15 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", likeMac=").append(likeMac);
        sb.append(", cityVoiceId=").append(cityVoiceId);
        sb.append(", likeId=").append(likeId);
        sb.append(", likeCreateTime=").append(likeCreateTime);
        sb.append("]");
        return sb.toString();
    }
}