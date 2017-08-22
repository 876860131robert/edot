package com.asiainfo.aigov.model.edot.news;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserNewsCatExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ED_USER_NEWS_CAT
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ED_USER_NEWS_CAT
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ED_USER_NEWS_CAT
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_USER_NEWS_CAT
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
     */
    public UserNewsCatExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_USER_NEWS_CAT
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_USER_NEWS_CAT
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_USER_NEWS_CAT
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_USER_NEWS_CAT
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_USER_NEWS_CAT
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_USER_NEWS_CAT
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_USER_NEWS_CAT
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_USER_NEWS_CAT
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
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
     * This method corresponds to the database table ED_USER_NEWS_CAT
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ED_USER_NEWS_CAT
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ED_USER_NEWS_CAT
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUserCatIdIsNull() {
            addCriterion("USER_CAT_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserCatIdIsNotNull() {
            addCriterion("USER_CAT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserCatIdEqualTo(String value) {
            addCriterion("USER_CAT_ID =", value, "userCatId");
            return (Criteria) this;
        }

        public Criteria andUserCatIdNotEqualTo(String value) {
            addCriterion("USER_CAT_ID <>", value, "userCatId");
            return (Criteria) this;
        }

        public Criteria andUserCatIdGreaterThan(String value) {
            addCriterion("USER_CAT_ID >", value, "userCatId");
            return (Criteria) this;
        }

        public Criteria andUserCatIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_CAT_ID >=", value, "userCatId");
            return (Criteria) this;
        }

        public Criteria andUserCatIdLessThan(String value) {
            addCriterion("USER_CAT_ID <", value, "userCatId");
            return (Criteria) this;
        }

        public Criteria andUserCatIdLessThanOrEqualTo(String value) {
            addCriterion("USER_CAT_ID <=", value, "userCatId");
            return (Criteria) this;
        }

        public Criteria andUserCatIdLike(String value) {
            addCriterion("USER_CAT_ID like", value, "userCatId");
            return (Criteria) this;
        }

        public Criteria andUserCatIdNotLike(String value) {
            addCriterion("USER_CAT_ID not like", value, "userCatId");
            return (Criteria) this;
        }

        public Criteria andUserCatIdIn(List<String> values) {
            addCriterion("USER_CAT_ID in", values, "userCatId");
            return (Criteria) this;
        }

        public Criteria andUserCatIdNotIn(List<String> values) {
            addCriterion("USER_CAT_ID not in", values, "userCatId");
            return (Criteria) this;
        }

        public Criteria andUserCatIdBetween(String value1, String value2) {
            addCriterion("USER_CAT_ID between", value1, value2, "userCatId");
            return (Criteria) this;
        }

        public Criteria andUserCatIdNotBetween(String value1, String value2) {
            addCriterion("USER_CAT_ID not between", value1, value2, "userCatId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCatIdsIsNull() {
            addCriterion("CAT_IDS is null");
            return (Criteria) this;
        }

        public Criteria andCatIdsIsNotNull() {
            addCriterion("CAT_IDS is not null");
            return (Criteria) this;
        }

        public Criteria andCatIdsEqualTo(String value) {
            addCriterion("CAT_IDS =", value, "catIds");
            return (Criteria) this;
        }

        public Criteria andCatIdsNotEqualTo(String value) {
            addCriterion("CAT_IDS <>", value, "catIds");
            return (Criteria) this;
        }

        public Criteria andCatIdsGreaterThan(String value) {
            addCriterion("CAT_IDS >", value, "catIds");
            return (Criteria) this;
        }

        public Criteria andCatIdsGreaterThanOrEqualTo(String value) {
            addCriterion("CAT_IDS >=", value, "catIds");
            return (Criteria) this;
        }

        public Criteria andCatIdsLessThan(String value) {
            addCriterion("CAT_IDS <", value, "catIds");
            return (Criteria) this;
        }

        public Criteria andCatIdsLessThanOrEqualTo(String value) {
            addCriterion("CAT_IDS <=", value, "catIds");
            return (Criteria) this;
        }

        public Criteria andCatIdsLike(String value) {
            addCriterion("CAT_IDS like", value, "catIds");
            return (Criteria) this;
        }

        public Criteria andCatIdsNotLike(String value) {
            addCriterion("CAT_IDS not like", value, "catIds");
            return (Criteria) this;
        }

        public Criteria andCatIdsIn(List<String> values) {
            addCriterion("CAT_IDS in", values, "catIds");
            return (Criteria) this;
        }

        public Criteria andCatIdsNotIn(List<String> values) {
            addCriterion("CAT_IDS not in", values, "catIds");
            return (Criteria) this;
        }

        public Criteria andCatIdsBetween(String value1, String value2) {
            addCriterion("CAT_IDS between", value1, value2, "catIds");
            return (Criteria) this;
        }

        public Criteria andCatIdsNotBetween(String value1, String value2) {
            addCriterion("CAT_IDS not between", value1, value2, "catIds");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andDictIdIsNull() {
            addCriterion("DICT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDictIdIsNotNull() {
            addCriterion("DICT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDictIdEqualTo(String value) {
            addCriterion("DICT_ID =", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdNotEqualTo(String value) {
            addCriterion("DICT_ID <>", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdGreaterThan(String value) {
            addCriterion("DICT_ID >", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdGreaterThanOrEqualTo(String value) {
            addCriterion("DICT_ID >=", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdLessThan(String value) {
            addCriterion("DICT_ID <", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdLessThanOrEqualTo(String value) {
            addCriterion("DICT_ID <=", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdLike(String value) {
            addCriterion("DICT_ID like", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdNotLike(String value) {
            addCriterion("DICT_ID not like", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdIn(List<String> values) {
            addCriterion("DICT_ID in", values, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdNotIn(List<String> values) {
            addCriterion("DICT_ID not in", values, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdBetween(String value1, String value2) {
            addCriterion("DICT_ID between", value1, value2, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdNotBetween(String value1, String value2) {
            addCriterion("DICT_ID not between", value1, value2, "dictId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ED_USER_NEWS_CAT
     *
     * @mbggenerated do_not_delete_during_merge Tue Jun 28 11:46:13 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ED_USER_NEWS_CAT
     *
     * @mbggenerated Tue Jun 28 11:46:13 CST 2016
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