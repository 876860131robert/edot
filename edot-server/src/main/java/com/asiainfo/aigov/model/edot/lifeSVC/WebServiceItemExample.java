package com.asiainfo.aigov.model.edot.lifeSVC;

import java.util.ArrayList;
import java.util.List;

public class WebServiceItemExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table web_service_item
     *
     * @mbggenerated Thu Aug 25 13:04:08 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table web_service_item
     *
     * @mbggenerated Thu Aug 25 13:04:08 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table web_service_item
     *
     * @mbggenerated Thu Aug 25 13:04:08 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service_item
     *
     * @mbggenerated Thu Aug 25 13:04:08 CST 2016
     */
    public WebServiceItemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service_item
     *
     * @mbggenerated Thu Aug 25 13:04:08 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service_item
     *
     * @mbggenerated Thu Aug 25 13:04:08 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service_item
     *
     * @mbggenerated Thu Aug 25 13:04:08 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service_item
     *
     * @mbggenerated Thu Aug 25 13:04:08 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service_item
     *
     * @mbggenerated Thu Aug 25 13:04:08 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service_item
     *
     * @mbggenerated Thu Aug 25 13:04:08 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service_item
     *
     * @mbggenerated Thu Aug 25 13:04:08 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service_item
     *
     * @mbggenerated Thu Aug 25 13:04:08 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service_item
     *
     * @mbggenerated Thu Aug 25 13:04:08 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_service_item
     *
     * @mbggenerated Thu Aug 25 13:04:08 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table web_service_item
     *
     * @mbggenerated Thu Aug 25 13:04:08 CST 2016
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNull() {
            addCriterion("service_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNotNull() {
            addCriterion("service_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceIdEqualTo(Integer value) {
            addCriterion("service_id =", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotEqualTo(Integer value) {
            addCriterion("service_id <>", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThan(Integer value) {
            addCriterion("service_id >", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_id >=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThan(Integer value) {
            addCriterion("service_id <", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThanOrEqualTo(Integer value) {
            addCriterion("service_id <=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIn(List<Integer> values) {
            addCriterion("service_id in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotIn(List<Integer> values) {
            addCriterion("service_id not in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdBetween(Integer value1, Integer value2) {
            addCriterion("service_id between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("service_id not between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andItemPhoneIsNull() {
            addCriterion("item_phone is null");
            return (Criteria) this;
        }

        public Criteria andItemPhoneIsNotNull() {
            addCriterion("item_phone is not null");
            return (Criteria) this;
        }

        public Criteria andItemPhoneEqualTo(String value) {
            addCriterion("item_phone =", value, "itemPhone");
            return (Criteria) this;
        }

        public Criteria andItemPhoneNotEqualTo(String value) {
            addCriterion("item_phone <>", value, "itemPhone");
            return (Criteria) this;
        }

        public Criteria andItemPhoneGreaterThan(String value) {
            addCriterion("item_phone >", value, "itemPhone");
            return (Criteria) this;
        }

        public Criteria andItemPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("item_phone >=", value, "itemPhone");
            return (Criteria) this;
        }

        public Criteria andItemPhoneLessThan(String value) {
            addCriterion("item_phone <", value, "itemPhone");
            return (Criteria) this;
        }

        public Criteria andItemPhoneLessThanOrEqualTo(String value) {
            addCriterion("item_phone <=", value, "itemPhone");
            return (Criteria) this;
        }

        public Criteria andItemPhoneLike(String value) {
            addCriterion("item_phone like", value, "itemPhone");
            return (Criteria) this;
        }

        public Criteria andItemPhoneNotLike(String value) {
            addCriterion("item_phone not like", value, "itemPhone");
            return (Criteria) this;
        }

        public Criteria andItemPhoneIn(List<String> values) {
            addCriterion("item_phone in", values, "itemPhone");
            return (Criteria) this;
        }

        public Criteria andItemPhoneNotIn(List<String> values) {
            addCriterion("item_phone not in", values, "itemPhone");
            return (Criteria) this;
        }

        public Criteria andItemPhoneBetween(String value1, String value2) {
            addCriterion("item_phone between", value1, value2, "itemPhone");
            return (Criteria) this;
        }

        public Criteria andItemPhoneNotBetween(String value1, String value2) {
            addCriterion("item_phone not between", value1, value2, "itemPhone");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("item_name is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("item_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("item_name =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("item_name <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("item_name >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_name >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("item_name <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("item_name <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("item_name like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("item_name not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("item_name in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("item_name not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("item_name between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("item_name not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemAddressIsNull() {
            addCriterion("item_address is null");
            return (Criteria) this;
        }

        public Criteria andItemAddressIsNotNull() {
            addCriterion("item_address is not null");
            return (Criteria) this;
        }

        public Criteria andItemAddressEqualTo(String value) {
            addCriterion("item_address =", value, "itemAddress");
            return (Criteria) this;
        }

        public Criteria andItemAddressNotEqualTo(String value) {
            addCriterion("item_address <>", value, "itemAddress");
            return (Criteria) this;
        }

        public Criteria andItemAddressGreaterThan(String value) {
            addCriterion("item_address >", value, "itemAddress");
            return (Criteria) this;
        }

        public Criteria andItemAddressGreaterThanOrEqualTo(String value) {
            addCriterion("item_address >=", value, "itemAddress");
            return (Criteria) this;
        }

        public Criteria andItemAddressLessThan(String value) {
            addCriterion("item_address <", value, "itemAddress");
            return (Criteria) this;
        }

        public Criteria andItemAddressLessThanOrEqualTo(String value) {
            addCriterion("item_address <=", value, "itemAddress");
            return (Criteria) this;
        }

        public Criteria andItemAddressLike(String value) {
            addCriterion("item_address like", value, "itemAddress");
            return (Criteria) this;
        }

        public Criteria andItemAddressNotLike(String value) {
            addCriterion("item_address not like", value, "itemAddress");
            return (Criteria) this;
        }

        public Criteria andItemAddressIn(List<String> values) {
            addCriterion("item_address in", values, "itemAddress");
            return (Criteria) this;
        }

        public Criteria andItemAddressNotIn(List<String> values) {
            addCriterion("item_address not in", values, "itemAddress");
            return (Criteria) this;
        }

        public Criteria andItemAddressBetween(String value1, String value2) {
            addCriterion("item_address between", value1, value2, "itemAddress");
            return (Criteria) this;
        }

        public Criteria andItemAddressNotBetween(String value1, String value2) {
            addCriterion("item_address not between", value1, value2, "itemAddress");
            return (Criteria) this;
        }

        public Criteria andItemTimeIsNull() {
            addCriterion("item_time is null");
            return (Criteria) this;
        }

        public Criteria andItemTimeIsNotNull() {
            addCriterion("item_time is not null");
            return (Criteria) this;
        }

        public Criteria andItemTimeEqualTo(String value) {
            addCriterion("item_time =", value, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemTimeNotEqualTo(String value) {
            addCriterion("item_time <>", value, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemTimeGreaterThan(String value) {
            addCriterion("item_time >", value, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemTimeGreaterThanOrEqualTo(String value) {
            addCriterion("item_time >=", value, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemTimeLessThan(String value) {
            addCriterion("item_time <", value, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemTimeLessThanOrEqualTo(String value) {
            addCriterion("item_time <=", value, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemTimeLike(String value) {
            addCriterion("item_time like", value, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemTimeNotLike(String value) {
            addCriterion("item_time not like", value, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemTimeIn(List<String> values) {
            addCriterion("item_time in", values, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemTimeNotIn(List<String> values) {
            addCriterion("item_time not in", values, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemTimeBetween(String value1, String value2) {
            addCriterion("item_time between", value1, value2, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemTimeNotBetween(String value1, String value2) {
            addCriterion("item_time not between", value1, value2, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemRemarksIsNull() {
            addCriterion("item_remarks is null");
            return (Criteria) this;
        }

        public Criteria andItemRemarksIsNotNull() {
            addCriterion("item_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andItemRemarksEqualTo(String value) {
            addCriterion("item_remarks =", value, "itemRemarks");
            return (Criteria) this;
        }

        public Criteria andItemRemarksNotEqualTo(String value) {
            addCriterion("item_remarks <>", value, "itemRemarks");
            return (Criteria) this;
        }

        public Criteria andItemRemarksGreaterThan(String value) {
            addCriterion("item_remarks >", value, "itemRemarks");
            return (Criteria) this;
        }

        public Criteria andItemRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("item_remarks >=", value, "itemRemarks");
            return (Criteria) this;
        }

        public Criteria andItemRemarksLessThan(String value) {
            addCriterion("item_remarks <", value, "itemRemarks");
            return (Criteria) this;
        }

        public Criteria andItemRemarksLessThanOrEqualTo(String value) {
            addCriterion("item_remarks <=", value, "itemRemarks");
            return (Criteria) this;
        }

        public Criteria andItemRemarksLike(String value) {
            addCriterion("item_remarks like", value, "itemRemarks");
            return (Criteria) this;
        }

        public Criteria andItemRemarksNotLike(String value) {
            addCriterion("item_remarks not like", value, "itemRemarks");
            return (Criteria) this;
        }

        public Criteria andItemRemarksIn(List<String> values) {
            addCriterion("item_remarks in", values, "itemRemarks");
            return (Criteria) this;
        }

        public Criteria andItemRemarksNotIn(List<String> values) {
            addCriterion("item_remarks not in", values, "itemRemarks");
            return (Criteria) this;
        }

        public Criteria andItemRemarksBetween(String value1, String value2) {
            addCriterion("item_remarks between", value1, value2, "itemRemarks");
            return (Criteria) this;
        }

        public Criteria andItemRemarksNotBetween(String value1, String value2) {
            addCriterion("item_remarks not between", value1, value2, "itemRemarks");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(String value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(String value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(String value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(String value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(String value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLike(String value) {
            addCriterion("create_date like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotLike(String value) {
            addCriterion("create_date not like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<String> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<String> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(String value1, String value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(String value1, String value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andItemStateIsNull() {
            addCriterion("item_state is null");
            return (Criteria) this;
        }

        public Criteria andItemStateIsNotNull() {
            addCriterion("item_state is not null");
            return (Criteria) this;
        }

        public Criteria andItemStateEqualTo(String value) {
            addCriterion("item_state =", value, "itemState");
            return (Criteria) this;
        }

        public Criteria andItemStateNotEqualTo(String value) {
            addCriterion("item_state <>", value, "itemState");
            return (Criteria) this;
        }

        public Criteria andItemStateGreaterThan(String value) {
            addCriterion("item_state >", value, "itemState");
            return (Criteria) this;
        }

        public Criteria andItemStateGreaterThanOrEqualTo(String value) {
            addCriterion("item_state >=", value, "itemState");
            return (Criteria) this;
        }

        public Criteria andItemStateLessThan(String value) {
            addCriterion("item_state <", value, "itemState");
            return (Criteria) this;
        }

        public Criteria andItemStateLessThanOrEqualTo(String value) {
            addCriterion("item_state <=", value, "itemState");
            return (Criteria) this;
        }

        public Criteria andItemStateLike(String value) {
            addCriterion("item_state like", value, "itemState");
            return (Criteria) this;
        }

        public Criteria andItemStateNotLike(String value) {
            addCriterion("item_state not like", value, "itemState");
            return (Criteria) this;
        }

        public Criteria andItemStateIn(List<String> values) {
            addCriterion("item_state in", values, "itemState");
            return (Criteria) this;
        }

        public Criteria andItemStateNotIn(List<String> values) {
            addCriterion("item_state not in", values, "itemState");
            return (Criteria) this;
        }

        public Criteria andItemStateBetween(String value1, String value2) {
            addCriterion("item_state between", value1, value2, "itemState");
            return (Criteria) this;
        }

        public Criteria andItemStateNotBetween(String value1, String value2) {
            addCriterion("item_state not between", value1, value2, "itemState");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(String value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(String value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(String value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(String value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(String value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(String value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLike(String value) {
            addCriterion("is_del like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotLike(String value) {
            addCriterion("is_del not like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<String> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<String> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(String value1, String value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(String value1, String value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table web_service_item
     *
     * @mbggenerated do_not_delete_during_merge Thu Aug 25 13:04:08 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table web_service_item
     *
     * @mbggenerated Thu Aug 25 13:04:08 CST 2016
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}