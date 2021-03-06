package com.asiainfo.aigov.model.edot.common;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EdHttpLogExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ED_HTTP_LOG
     *
     * @mbggenerated Fri Jun 03 18:47:58 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ED_HTTP_LOG
     *
     * @mbggenerated Fri Jun 03 18:47:58 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ED_HTTP_LOG
     *
     * @mbggenerated Fri Jun 03 18:47:58 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_HTTP_LOG
     *
     * @mbggenerated Fri Jun 03 18:47:58 CST 2016
     */
    public EdHttpLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_HTTP_LOG
     *
     * @mbggenerated Fri Jun 03 18:47:58 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_HTTP_LOG
     *
     * @mbggenerated Fri Jun 03 18:47:58 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_HTTP_LOG
     *
     * @mbggenerated Fri Jun 03 18:47:58 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_HTTP_LOG
     *
     * @mbggenerated Fri Jun 03 18:47:58 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_HTTP_LOG
     *
     * @mbggenerated Fri Jun 03 18:47:58 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_HTTP_LOG
     *
     * @mbggenerated Fri Jun 03 18:47:58 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_HTTP_LOG
     *
     * @mbggenerated Fri Jun 03 18:47:58 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_HTTP_LOG
     *
     * @mbggenerated Fri Jun 03 18:47:58 CST 2016
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
     * This method corresponds to the database table ED_HTTP_LOG
     *
     * @mbggenerated Fri Jun 03 18:47:58 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_HTTP_LOG
     *
     * @mbggenerated Fri Jun 03 18:47:58 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ED_HTTP_LOG
     *
     * @mbggenerated Fri Jun 03 18:47:58 CST 2016
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

        public Criteria andLogIdIsNull() {
            addCriterion("LOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("LOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Long value) {
            addCriterion("LOG_ID =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Long value) {
            addCriterion("LOG_ID <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Long value) {
            addCriterion("LOG_ID >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LOG_ID >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Long value) {
            addCriterion("LOG_ID <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Long value) {
            addCriterion("LOG_ID <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Long> values) {
            addCriterion("LOG_ID in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Long> values) {
            addCriterion("LOG_ID not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Long value1, Long value2) {
            addCriterion("LOG_ID between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Long value1, Long value2) {
            addCriterion("LOG_ID not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogMonthIsNull() {
            addCriterion("LOG_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andLogMonthIsNotNull() {
            addCriterion("LOG_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andLogMonthEqualTo(Integer value) {
            addCriterion("LOG_MONTH =", value, "logMonth");
            return (Criteria) this;
        }

        public Criteria andLogMonthNotEqualTo(Integer value) {
            addCriterion("LOG_MONTH <>", value, "logMonth");
            return (Criteria) this;
        }

        public Criteria andLogMonthGreaterThan(Integer value) {
            addCriterion("LOG_MONTH >", value, "logMonth");
            return (Criteria) this;
        }

        public Criteria andLogMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOG_MONTH >=", value, "logMonth");
            return (Criteria) this;
        }

        public Criteria andLogMonthLessThan(Integer value) {
            addCriterion("LOG_MONTH <", value, "logMonth");
            return (Criteria) this;
        }

        public Criteria andLogMonthLessThanOrEqualTo(Integer value) {
            addCriterion("LOG_MONTH <=", value, "logMonth");
            return (Criteria) this;
        }

        public Criteria andLogMonthIn(List<Integer> values) {
            addCriterion("LOG_MONTH in", values, "logMonth");
            return (Criteria) this;
        }

        public Criteria andLogMonthNotIn(List<Integer> values) {
            addCriterion("LOG_MONTH not in", values, "logMonth");
            return (Criteria) this;
        }

        public Criteria andLogMonthBetween(Integer value1, Integer value2) {
            addCriterion("LOG_MONTH between", value1, value2, "logMonth");
            return (Criteria) this;
        }

        public Criteria andLogMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("LOG_MONTH not between", value1, value2, "logMonth");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNull() {
            addCriterion("LOG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNotNull() {
            addCriterion("LOG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLogTypeEqualTo(String value) {
            addCriterion("LOG_TYPE =", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotEqualTo(String value) {
            addCriterion("LOG_TYPE <>", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThan(String value) {
            addCriterion("LOG_TYPE >", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_TYPE >=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThan(String value) {
            addCriterion("LOG_TYPE <", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThanOrEqualTo(String value) {
            addCriterion("LOG_TYPE <=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLike(String value) {
            addCriterion("LOG_TYPE like", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotLike(String value) {
            addCriterion("LOG_TYPE not like", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeIn(List<String> values) {
            addCriterion("LOG_TYPE in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotIn(List<String> values) {
            addCriterion("LOG_TYPE not in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeBetween(String value1, String value2) {
            addCriterion("LOG_TYPE between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotBetween(String value1, String value2) {
            addCriterion("LOG_TYPE not between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andAccessUrlIsNull() {
            addCriterion("ACCESS_URL is null");
            return (Criteria) this;
        }

        public Criteria andAccessUrlIsNotNull() {
            addCriterion("ACCESS_URL is not null");
            return (Criteria) this;
        }

        public Criteria andAccessUrlEqualTo(String value) {
            addCriterion("ACCESS_URL =", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlNotEqualTo(String value) {
            addCriterion("ACCESS_URL <>", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlGreaterThan(String value) {
            addCriterion("ACCESS_URL >", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESS_URL >=", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlLessThan(String value) {
            addCriterion("ACCESS_URL <", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlLessThanOrEqualTo(String value) {
            addCriterion("ACCESS_URL <=", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlLike(String value) {
            addCriterion("ACCESS_URL like", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlNotLike(String value) {
            addCriterion("ACCESS_URL not like", value, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlIn(List<String> values) {
            addCriterion("ACCESS_URL in", values, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlNotIn(List<String> values) {
            addCriterion("ACCESS_URL not in", values, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlBetween(String value1, String value2) {
            addCriterion("ACCESS_URL between", value1, value2, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andAccessUrlNotBetween(String value1, String value2) {
            addCriterion("ACCESS_URL not between", value1, value2, "accessUrl");
            return (Criteria) this;
        }

        public Criteria andReqContentIsNull() {
            addCriterion("REQ_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andReqContentIsNotNull() {
            addCriterion("REQ_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andReqContentEqualTo(String value) {
            addCriterion("REQ_CONTENT =", value, "reqContent");
            return (Criteria) this;
        }

        public Criteria andReqContentNotEqualTo(String value) {
            addCriterion("REQ_CONTENT <>", value, "reqContent");
            return (Criteria) this;
        }

        public Criteria andReqContentGreaterThan(String value) {
            addCriterion("REQ_CONTENT >", value, "reqContent");
            return (Criteria) this;
        }

        public Criteria andReqContentGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_CONTENT >=", value, "reqContent");
            return (Criteria) this;
        }

        public Criteria andReqContentLessThan(String value) {
            addCriterion("REQ_CONTENT <", value, "reqContent");
            return (Criteria) this;
        }

        public Criteria andReqContentLessThanOrEqualTo(String value) {
            addCriterion("REQ_CONTENT <=", value, "reqContent");
            return (Criteria) this;
        }

        public Criteria andReqContentLike(String value) {
            addCriterion("REQ_CONTENT like", value, "reqContent");
            return (Criteria) this;
        }

        public Criteria andReqContentNotLike(String value) {
            addCriterion("REQ_CONTENT not like", value, "reqContent");
            return (Criteria) this;
        }

        public Criteria andReqContentIn(List<String> values) {
            addCriterion("REQ_CONTENT in", values, "reqContent");
            return (Criteria) this;
        }

        public Criteria andReqContentNotIn(List<String> values) {
            addCriterion("REQ_CONTENT not in", values, "reqContent");
            return (Criteria) this;
        }

        public Criteria andReqContentBetween(String value1, String value2) {
            addCriterion("REQ_CONTENT between", value1, value2, "reqContent");
            return (Criteria) this;
        }

        public Criteria andReqContentNotBetween(String value1, String value2) {
            addCriterion("REQ_CONTENT not between", value1, value2, "reqContent");
            return (Criteria) this;
        }

        public Criteria andLogTimeIsNull() {
            addCriterion("LOG_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLogTimeIsNotNull() {
            addCriterion("LOG_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLogTimeEqualTo(Date value) {
            addCriterion("LOG_TIME =", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotEqualTo(Date value) {
            addCriterion("LOG_TIME <>", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeGreaterThan(Date value) {
            addCriterion("LOG_TIME >", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LOG_TIME >=", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeLessThan(Date value) {
            addCriterion("LOG_TIME <", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeLessThanOrEqualTo(Date value) {
            addCriterion("LOG_TIME <=", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeIn(List<Date> values) {
            addCriterion("LOG_TIME in", values, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotIn(List<Date> values) {
            addCriterion("LOG_TIME not in", values, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeBetween(Date value1, Date value2) {
            addCriterion("LOG_TIME between", value1, value2, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotBetween(Date value1, Date value2) {
            addCriterion("LOG_TIME not between", value1, value2, "logTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ED_HTTP_LOG
     *
     * @mbggenerated do_not_delete_during_merge Fri Jun 03 18:47:58 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ED_HTTP_LOG
     *
     * @mbggenerated Fri Jun 03 18:47:58 CST 2016
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