package com.asiainfo.aigov.model.edot.work;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkDeptExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ED_WORK_DEPT
     *
     * @mbggenerated Thu Jul 07 17:19:23 GMT+08:00 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ED_WORK_DEPT
     *
     * @mbggenerated Thu Jul 07 17:19:23 GMT+08:00 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ED_WORK_DEPT
     *
     * @mbggenerated Thu Jul 07 17:19:23 GMT+08:00 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_DEPT
     *
     * @mbggenerated Thu Jul 07 17:19:23 GMT+08:00 2016
     */
    public WorkDeptExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_DEPT
     *
     * @mbggenerated Thu Jul 07 17:19:23 GMT+08:00 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_DEPT
     *
     * @mbggenerated Thu Jul 07 17:19:23 GMT+08:00 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_DEPT
     *
     * @mbggenerated Thu Jul 07 17:19:23 GMT+08:00 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_DEPT
     *
     * @mbggenerated Thu Jul 07 17:19:23 GMT+08:00 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_DEPT
     *
     * @mbggenerated Thu Jul 07 17:19:23 GMT+08:00 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_DEPT
     *
     * @mbggenerated Thu Jul 07 17:19:23 GMT+08:00 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_DEPT
     *
     * @mbggenerated Thu Jul 07 17:19:23 GMT+08:00 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_DEPT
     *
     * @mbggenerated Thu Jul 07 17:19:23 GMT+08:00 2016
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
     * This method corresponds to the database table ED_WORK_DEPT
     *
     * @mbggenerated Thu Jul 07 17:19:23 GMT+08:00 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_WORK_DEPT
     *
     * @mbggenerated Thu Jul 07 17:19:23 GMT+08:00 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ED_WORK_DEPT
     *
     * @mbggenerated Thu Jul 07 17:19:23 GMT+08:00 2016
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

        public Criteria andDeptcodeIsNull() {
            addCriterion("DEPTCODE is null");
            return (Criteria) this;
        }

        public Criteria andDeptcodeIsNotNull() {
            addCriterion("DEPTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDeptcodeEqualTo(String value) {
            addCriterion("DEPTCODE =", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotEqualTo(String value) {
            addCriterion("DEPTCODE <>", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeGreaterThan(String value) {
            addCriterion("DEPTCODE >", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTCODE >=", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeLessThan(String value) {
            addCriterion("DEPTCODE <", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeLessThanOrEqualTo(String value) {
            addCriterion("DEPTCODE <=", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeLike(String value) {
            addCriterion("DEPTCODE like", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotLike(String value) {
            addCriterion("DEPTCODE not like", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeIn(List<String> values) {
            addCriterion("DEPTCODE in", values, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotIn(List<String> values) {
            addCriterion("DEPTCODE not in", values, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeBetween(String value1, String value2) {
            addCriterion("DEPTCODE between", value1, value2, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotBetween(String value1, String value2) {
            addCriterion("DEPTCODE not between", value1, value2, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNull() {
            addCriterion("DEPTNAME is null");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNotNull() {
            addCriterion("DEPTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDeptnameEqualTo(String value) {
            addCriterion("DEPTNAME =", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotEqualTo(String value) {
            addCriterion("DEPTNAME <>", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThan(String value) {
            addCriterion("DEPTNAME >", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTNAME >=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThan(String value) {
            addCriterion("DEPTNAME <", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThanOrEqualTo(String value) {
            addCriterion("DEPTNAME <=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLike(String value) {
            addCriterion("DEPTNAME like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotLike(String value) {
            addCriterion("DEPTNAME not like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameIn(List<String> values) {
            addCriterion("DEPTNAME in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotIn(List<String> values) {
            addCriterion("DEPTNAME not in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameBetween(String value1, String value2) {
            addCriterion("DEPTNAME between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotBetween(String value1, String value2) {
            addCriterion("DEPTNAME not between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptphoneIsNull() {
            addCriterion("DEPTPHONE is null");
            return (Criteria) this;
        }

        public Criteria andDeptphoneIsNotNull() {
            addCriterion("DEPTPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andDeptphoneEqualTo(String value) {
            addCriterion("DEPTPHONE =", value, "deptphone");
            return (Criteria) this;
        }

        public Criteria andDeptphoneNotEqualTo(String value) {
            addCriterion("DEPTPHONE <>", value, "deptphone");
            return (Criteria) this;
        }

        public Criteria andDeptphoneGreaterThan(String value) {
            addCriterion("DEPTPHONE >", value, "deptphone");
            return (Criteria) this;
        }

        public Criteria andDeptphoneGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTPHONE >=", value, "deptphone");
            return (Criteria) this;
        }

        public Criteria andDeptphoneLessThan(String value) {
            addCriterion("DEPTPHONE <", value, "deptphone");
            return (Criteria) this;
        }

        public Criteria andDeptphoneLessThanOrEqualTo(String value) {
            addCriterion("DEPTPHONE <=", value, "deptphone");
            return (Criteria) this;
        }

        public Criteria andDeptphoneLike(String value) {
            addCriterion("DEPTPHONE like", value, "deptphone");
            return (Criteria) this;
        }

        public Criteria andDeptphoneNotLike(String value) {
            addCriterion("DEPTPHONE not like", value, "deptphone");
            return (Criteria) this;
        }

        public Criteria andDeptphoneIn(List<String> values) {
            addCriterion("DEPTPHONE in", values, "deptphone");
            return (Criteria) this;
        }

        public Criteria andDeptphoneNotIn(List<String> values) {
            addCriterion("DEPTPHONE not in", values, "deptphone");
            return (Criteria) this;
        }

        public Criteria andDeptphoneBetween(String value1, String value2) {
            addCriterion("DEPTPHONE between", value1, value2, "deptphone");
            return (Criteria) this;
        }

        public Criteria andDeptphoneNotBetween(String value1, String value2) {
            addCriterion("DEPTPHONE not between", value1, value2, "deptphone");
            return (Criteria) this;
        }

        public Criteria andDeptsimplenameIsNull() {
            addCriterion("DEPTSIMPLENAME is null");
            return (Criteria) this;
        }

        public Criteria andDeptsimplenameIsNotNull() {
            addCriterion("DEPTSIMPLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andDeptsimplenameEqualTo(String value) {
            addCriterion("DEPTSIMPLENAME =", value, "deptsimplename");
            return (Criteria) this;
        }

        public Criteria andDeptsimplenameNotEqualTo(String value) {
            addCriterion("DEPTSIMPLENAME <>", value, "deptsimplename");
            return (Criteria) this;
        }

        public Criteria andDeptsimplenameGreaterThan(String value) {
            addCriterion("DEPTSIMPLENAME >", value, "deptsimplename");
            return (Criteria) this;
        }

        public Criteria andDeptsimplenameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTSIMPLENAME >=", value, "deptsimplename");
            return (Criteria) this;
        }

        public Criteria andDeptsimplenameLessThan(String value) {
            addCriterion("DEPTSIMPLENAME <", value, "deptsimplename");
            return (Criteria) this;
        }

        public Criteria andDeptsimplenameLessThanOrEqualTo(String value) {
            addCriterion("DEPTSIMPLENAME <=", value, "deptsimplename");
            return (Criteria) this;
        }

        public Criteria andDeptsimplenameLike(String value) {
            addCriterion("DEPTSIMPLENAME like", value, "deptsimplename");
            return (Criteria) this;
        }

        public Criteria andDeptsimplenameNotLike(String value) {
            addCriterion("DEPTSIMPLENAME not like", value, "deptsimplename");
            return (Criteria) this;
        }

        public Criteria andDeptsimplenameIn(List<String> values) {
            addCriterion("DEPTSIMPLENAME in", values, "deptsimplename");
            return (Criteria) this;
        }

        public Criteria andDeptsimplenameNotIn(List<String> values) {
            addCriterion("DEPTSIMPLENAME not in", values, "deptsimplename");
            return (Criteria) this;
        }

        public Criteria andDeptsimplenameBetween(String value1, String value2) {
            addCriterion("DEPTSIMPLENAME between", value1, value2, "deptsimplename");
            return (Criteria) this;
        }

        public Criteria andDeptsimplenameNotBetween(String value1, String value2) {
            addCriterion("DEPTSIMPLENAME not between", value1, value2, "deptsimplename");
            return (Criteria) this;
        }

        public Criteria andDeptsortIsNull() {
            addCriterion("DEPTSORT is null");
            return (Criteria) this;
        }

        public Criteria andDeptsortIsNotNull() {
            addCriterion("DEPTSORT is not null");
            return (Criteria) this;
        }

        public Criteria andDeptsortEqualTo(String value) {
            addCriterion("DEPTSORT =", value, "deptsort");
            return (Criteria) this;
        }

        public Criteria andDeptsortNotEqualTo(String value) {
            addCriterion("DEPTSORT <>", value, "deptsort");
            return (Criteria) this;
        }

        public Criteria andDeptsortGreaterThan(String value) {
            addCriterion("DEPTSORT >", value, "deptsort");
            return (Criteria) this;
        }

        public Criteria andDeptsortGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTSORT >=", value, "deptsort");
            return (Criteria) this;
        }

        public Criteria andDeptsortLessThan(String value) {
            addCriterion("DEPTSORT <", value, "deptsort");
            return (Criteria) this;
        }

        public Criteria andDeptsortLessThanOrEqualTo(String value) {
            addCriterion("DEPTSORT <=", value, "deptsort");
            return (Criteria) this;
        }

        public Criteria andDeptsortLike(String value) {
            addCriterion("DEPTSORT like", value, "deptsort");
            return (Criteria) this;
        }

        public Criteria andDeptsortNotLike(String value) {
            addCriterion("DEPTSORT not like", value, "deptsort");
            return (Criteria) this;
        }

        public Criteria andDeptsortIn(List<String> values) {
            addCriterion("DEPTSORT in", values, "deptsort");
            return (Criteria) this;
        }

        public Criteria andDeptsortNotIn(List<String> values) {
            addCriterion("DEPTSORT not in", values, "deptsort");
            return (Criteria) this;
        }

        public Criteria andDeptsortBetween(String value1, String value2) {
            addCriterion("DEPTSORT between", value1, value2, "deptsort");
            return (Criteria) this;
        }

        public Criteria andDeptsortNotBetween(String value1, String value2) {
            addCriterion("DEPTSORT not between", value1, value2, "deptsort");
            return (Criteria) this;
        }

        public Criteria andParentcodeIsNull() {
            addCriterion("PARENTCODE is null");
            return (Criteria) this;
        }

        public Criteria andParentcodeIsNotNull() {
            addCriterion("PARENTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andParentcodeEqualTo(String value) {
            addCriterion("PARENTCODE =", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeNotEqualTo(String value) {
            addCriterion("PARENTCODE <>", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeGreaterThan(String value) {
            addCriterion("PARENTCODE >", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PARENTCODE >=", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeLessThan(String value) {
            addCriterion("PARENTCODE <", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeLessThanOrEqualTo(String value) {
            addCriterion("PARENTCODE <=", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeLike(String value) {
            addCriterion("PARENTCODE like", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeNotLike(String value) {
            addCriterion("PARENTCODE not like", value, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeIn(List<String> values) {
            addCriterion("PARENTCODE in", values, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeNotIn(List<String> values) {
            addCriterion("PARENTCODE not in", values, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeBetween(String value1, String value2) {
            addCriterion("PARENTCODE between", value1, value2, "parentcode");
            return (Criteria) this;
        }

        public Criteria andParentcodeNotBetween(String value1, String value2) {
            addCriterion("PARENTCODE not between", value1, value2, "parentcode");
            return (Criteria) this;
        }

        public Criteria andClicknumIsNull() {
            addCriterion("CLICKNUM is null");
            return (Criteria) this;
        }

        public Criteria andClicknumIsNotNull() {
            addCriterion("CLICKNUM is not null");
            return (Criteria) this;
        }

        public Criteria andClicknumEqualTo(BigDecimal value) {
            addCriterion("CLICKNUM =", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumNotEqualTo(BigDecimal value) {
            addCriterion("CLICKNUM <>", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumGreaterThan(BigDecimal value) {
            addCriterion("CLICKNUM >", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CLICKNUM >=", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumLessThan(BigDecimal value) {
            addCriterion("CLICKNUM <", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CLICKNUM <=", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumIn(List<BigDecimal> values) {
            addCriterion("CLICKNUM in", values, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumNotIn(List<BigDecimal> values) {
            addCriterion("CLICKNUM not in", values, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLICKNUM between", value1, value2, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLICKNUM not between", value1, value2, "clicknum");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ED_WORK_DEPT
     *
     * @mbggenerated do_not_delete_during_merge Thu Jul 07 17:19:23 GMT+08:00 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ED_WORK_DEPT
     *
     * @mbggenerated Thu Jul 07 17:19:23 GMT+08:00 2016
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