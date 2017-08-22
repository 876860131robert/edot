package com.asiainfo.aigov.model.healthcare.guidance;

import java.math.BigDecimal;

public class ZwzdPartyJibing {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ZWZD_PARTY_JIBING.PARTYID
     *
     * @mbggenerated Wed May 03 13:13:43 CST 2017
     */
    private BigDecimal partyid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ZWZD_PARTY_JIBING.PARTYNAME
     *
     * @mbggenerated Wed May 03 13:13:43 CST 2017
     */
    private String partyname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ZWZD_PARTY_JIBING.SEX
     *
     * @mbggenerated Wed May 03 13:13:43 CST 2017
     */
    private BigDecimal sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ZWZD_PARTY_JIBING.JIBINGCODE
     *
     * @mbggenerated Wed May 03 13:13:43 CST 2017
     */
    private BigDecimal jibingcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ZWZD_PARTY_JIBING.JIBINGDESC
     *
     * @mbggenerated Wed May 03 13:13:43 CST 2017
     */
    private String jibingdesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ZWZD_PARTY_JIBING.PARTYID
     *
     * @return the value of ZWZD_PARTY_JIBING.PARTYID
     *
     * @mbggenerated Wed May 03 13:13:43 CST 2017
     */
    public BigDecimal getPartyid() {
        return partyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ZWZD_PARTY_JIBING.PARTYID
     *
     * @param partyid the value for ZWZD_PARTY_JIBING.PARTYID
     *
     * @mbggenerated Wed May 03 13:13:43 CST 2017
     */
    public void setPartyid(BigDecimal partyid) {
        this.partyid = partyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ZWZD_PARTY_JIBING.PARTYNAME
     *
     * @return the value of ZWZD_PARTY_JIBING.PARTYNAME
     *
     * @mbggenerated Wed May 03 13:13:43 CST 2017
     */
    public String getPartyname() {
        return partyname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ZWZD_PARTY_JIBING.PARTYNAME
     *
     * @param partyname the value for ZWZD_PARTY_JIBING.PARTYNAME
     *
     * @mbggenerated Wed May 03 13:13:43 CST 2017
     */
    public void setPartyname(String partyname) {
        this.partyname = partyname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ZWZD_PARTY_JIBING.SEX
     *
     * @return the value of ZWZD_PARTY_JIBING.SEX
     *
     * @mbggenerated Wed May 03 13:13:43 CST 2017
     */
    public BigDecimal getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ZWZD_PARTY_JIBING.SEX
     *
     * @param sex the value for ZWZD_PARTY_JIBING.SEX
     *
     * @mbggenerated Wed May 03 13:13:43 CST 2017
     */
    public void setSex(BigDecimal sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ZWZD_PARTY_JIBING.JIBINGCODE
     *
     * @return the value of ZWZD_PARTY_JIBING.JIBINGCODE
     *
     * @mbggenerated Wed May 03 13:13:43 CST 2017
     */
    public BigDecimal getJibingcode() {
        return jibingcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ZWZD_PARTY_JIBING.JIBINGCODE
     *
     * @param jibingcode the value for ZWZD_PARTY_JIBING.JIBINGCODE
     *
     * @mbggenerated Wed May 03 13:13:43 CST 2017
     */
    public void setJibingcode(BigDecimal jibingcode) {
        this.jibingcode = jibingcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ZWZD_PARTY_JIBING.JIBINGDESC
     *
     * @return the value of ZWZD_PARTY_JIBING.JIBINGDESC
     *
     * @mbggenerated Wed May 03 13:13:43 CST 2017
     */
    public String getJibingdesc() {
        return jibingdesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ZWZD_PARTY_JIBING.JIBINGDESC
     *
     * @param jibingdesc the value for ZWZD_PARTY_JIBING.JIBINGDESC
     *
     * @mbggenerated Wed May 03 13:13:43 CST 2017
     */
    public void setJibingdesc(String jibingdesc) {
        this.jibingdesc = jibingdesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZWZD_PARTY_JIBING
     *
     * @mbggenerated Wed May 03 13:13:43 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", partyid=").append(partyid);
        sb.append(", partyname=").append(partyname);
        sb.append(", sex=").append(sex);
        sb.append(", jibingcode=").append(jibingcode);
        sb.append(", jibingdesc=").append(jibingdesc);
        sb.append("]");
        return sb.toString();
    }
}