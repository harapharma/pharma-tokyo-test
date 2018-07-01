package jp.co.pds.PJ0001.dao.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MsQuestionGroupExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ms_question_group
     *
     * @mbg.generated Sat Mar 17 23:13:23 JST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ms_question_group
     *
     * @mbg.generated Sat Mar 17 23:13:23 JST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ms_question_group
     *
     * @mbg.generated Sat Mar 17 23:13:23 JST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_question_group
     *
     * @mbg.generated Sat Mar 17 23:13:23 JST 2018
     */
    public MsQuestionGroupExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_question_group
     *
     * @mbg.generated Sat Mar 17 23:13:23 JST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_question_group
     *
     * @mbg.generated Sat Mar 17 23:13:23 JST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_question_group
     *
     * @mbg.generated Sat Mar 17 23:13:23 JST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_question_group
     *
     * @mbg.generated Sat Mar 17 23:13:23 JST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_question_group
     *
     * @mbg.generated Sat Mar 17 23:13:23 JST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_question_group
     *
     * @mbg.generated Sat Mar 17 23:13:23 JST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_question_group
     *
     * @mbg.generated Sat Mar 17 23:13:23 JST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_question_group
     *
     * @mbg.generated Sat Mar 17 23:13:23 JST 2018
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
     * This method corresponds to the database table ms_question_group
     *
     * @mbg.generated Sat Mar 17 23:13:23 JST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_question_group
     *
     * @mbg.generated Sat Mar 17 23:13:23 JST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ms_question_group
     *
     * @mbg.generated Sat Mar 17 23:13:23 JST 2018
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

        public Criteria andQuestionGroupIdIsNull() {
            addCriterion("QUESTION_GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andQuestionGroupIdIsNotNull() {
            addCriterion("QUESTION_GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionGroupIdEqualTo(Integer value) {
            addCriterion("QUESTION_GROUP_ID =", value, "questionGroupId");
            return (Criteria) this;
        }

        public Criteria andQuestionGroupIdNotEqualTo(Integer value) {
            addCriterion("QUESTION_GROUP_ID <>", value, "questionGroupId");
            return (Criteria) this;
        }

        public Criteria andQuestionGroupIdGreaterThan(Integer value) {
            addCriterion("QUESTION_GROUP_ID >", value, "questionGroupId");
            return (Criteria) this;
        }

        public Criteria andQuestionGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("QUESTION_GROUP_ID >=", value, "questionGroupId");
            return (Criteria) this;
        }

        public Criteria andQuestionGroupIdLessThan(Integer value) {
            addCriterion("QUESTION_GROUP_ID <", value, "questionGroupId");
            return (Criteria) this;
        }

        public Criteria andQuestionGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("QUESTION_GROUP_ID <=", value, "questionGroupId");
            return (Criteria) this;
        }

        public Criteria andQuestionGroupIdIn(List<Integer> values) {
            addCriterion("QUESTION_GROUP_ID in", values, "questionGroupId");
            return (Criteria) this;
        }

        public Criteria andQuestionGroupIdNotIn(List<Integer> values) {
            addCriterion("QUESTION_GROUP_ID not in", values, "questionGroupId");
            return (Criteria) this;
        }

        public Criteria andQuestionGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("QUESTION_GROUP_ID between", value1, value2, "questionGroupId");
            return (Criteria) this;
        }

        public Criteria andQuestionGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("QUESTION_GROUP_ID not between", value1, value2, "questionGroupId");
            return (Criteria) this;
        }

        public Criteria andQuestionGroupNameIsNull() {
            addCriterion("QUESTION_GROUP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andQuestionGroupNameIsNotNull() {
            addCriterion("QUESTION_GROUP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionGroupNameEqualTo(String value) {
            addCriterion("QUESTION_GROUP_NAME =", value, "questionGroupName");
            return (Criteria) this;
        }

        public Criteria andQuestionGroupNameNotEqualTo(String value) {
            addCriterion("QUESTION_GROUP_NAME <>", value, "questionGroupName");
            return (Criteria) this;
        }

        public Criteria andQuestionGroupNameGreaterThan(String value) {
            addCriterion("QUESTION_GROUP_NAME >", value, "questionGroupName");
            return (Criteria) this;
        }

        public Criteria andQuestionGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("QUESTION_GROUP_NAME >=", value, "questionGroupName");
            return (Criteria) this;
        }

        public Criteria andQuestionGroupNameLessThan(String value) {
            addCriterion("QUESTION_GROUP_NAME <", value, "questionGroupName");
            return (Criteria) this;
        }

        public Criteria andQuestionGroupNameLessThanOrEqualTo(String value) {
            addCriterion("QUESTION_GROUP_NAME <=", value, "questionGroupName");
            return (Criteria) this;
        }

        public Criteria andQuestionGroupNameLike(String value) {
            addCriterion("QUESTION_GROUP_NAME like", value, "questionGroupName");
            return (Criteria) this;
        }

        public Criteria andQuestionGroupNameNotLike(String value) {
            addCriterion("QUESTION_GROUP_NAME not like", value, "questionGroupName");
            return (Criteria) this;
        }

        public Criteria andQuestionGroupNameIn(List<String> values) {
            addCriterion("QUESTION_GROUP_NAME in", values, "questionGroupName");
            return (Criteria) this;
        }

        public Criteria andQuestionGroupNameNotIn(List<String> values) {
            addCriterion("QUESTION_GROUP_NAME not in", values, "questionGroupName");
            return (Criteria) this;
        }

        public Criteria andQuestionGroupNameBetween(String value1, String value2) {
            addCriterion("QUESTION_GROUP_NAME between", value1, value2, "questionGroupName");
            return (Criteria) this;
        }

        public Criteria andQuestionGroupNameNotBetween(String value1, String value2) {
            addCriterion("QUESTION_GROUP_NAME not between", value1, value2, "questionGroupName");
            return (Criteria) this;
        }

        public Criteria andRegisterIdIsNull() {
            addCriterion("REGISTER_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegisterIdIsNotNull() {
            addCriterion("REGISTER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterIdEqualTo(String value) {
            addCriterion("REGISTER_ID =", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdNotEqualTo(String value) {
            addCriterion("REGISTER_ID <>", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdGreaterThan(String value) {
            addCriterion("REGISTER_ID >", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTER_ID >=", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdLessThan(String value) {
            addCriterion("REGISTER_ID <", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdLessThanOrEqualTo(String value) {
            addCriterion("REGISTER_ID <=", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdLike(String value) {
            addCriterion("REGISTER_ID like", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdNotLike(String value) {
            addCriterion("REGISTER_ID not like", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdIn(List<String> values) {
            addCriterion("REGISTER_ID in", values, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdNotIn(List<String> values) {
            addCriterion("REGISTER_ID not in", values, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdBetween(String value1, String value2) {
            addCriterion("REGISTER_ID between", value1, value2, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdNotBetween(String value1, String value2) {
            addCriterion("REGISTER_ID not between", value1, value2, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterDatimeIsNull() {
            addCriterion("REGISTER_DATIME is null");
            return (Criteria) this;
        }

        public Criteria andRegisterDatimeIsNotNull() {
            addCriterion("REGISTER_DATIME is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterDatimeEqualTo(Date value) {
            addCriterion("REGISTER_DATIME =", value, "registerDatime");
            return (Criteria) this;
        }

        public Criteria andRegisterDatimeNotEqualTo(Date value) {
            addCriterion("REGISTER_DATIME <>", value, "registerDatime");
            return (Criteria) this;
        }

        public Criteria andRegisterDatimeGreaterThan(Date value) {
            addCriterion("REGISTER_DATIME >", value, "registerDatime");
            return (Criteria) this;
        }

        public Criteria andRegisterDatimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REGISTER_DATIME >=", value, "registerDatime");
            return (Criteria) this;
        }

        public Criteria andRegisterDatimeLessThan(Date value) {
            addCriterion("REGISTER_DATIME <", value, "registerDatime");
            return (Criteria) this;
        }

        public Criteria andRegisterDatimeLessThanOrEqualTo(Date value) {
            addCriterion("REGISTER_DATIME <=", value, "registerDatime");
            return (Criteria) this;
        }

        public Criteria andRegisterDatimeIn(List<Date> values) {
            addCriterion("REGISTER_DATIME in", values, "registerDatime");
            return (Criteria) this;
        }

        public Criteria andRegisterDatimeNotIn(List<Date> values) {
            addCriterion("REGISTER_DATIME not in", values, "registerDatime");
            return (Criteria) this;
        }

        public Criteria andRegisterDatimeBetween(Date value1, Date value2) {
            addCriterion("REGISTER_DATIME between", value1, value2, "registerDatime");
            return (Criteria) this;
        }

        public Criteria andRegisterDatimeNotBetween(Date value1, Date value2) {
            addCriterion("REGISTER_DATIME not between", value1, value2, "registerDatime");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNull() {
            addCriterion("UPDATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNotNull() {
            addCriterion("UPDATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdEqualTo(String value) {
            addCriterion("UPDATE_ID =", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotEqualTo(String value) {
            addCriterion("UPDATE_ID <>", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThan(String value) {
            addCriterion("UPDATE_ID >", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_ID >=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThan(String value) {
            addCriterion("UPDATE_ID <", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_ID <=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLike(String value) {
            addCriterion("UPDATE_ID like", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotLike(String value) {
            addCriterion("UPDATE_ID not like", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIn(List<String> values) {
            addCriterion("UPDATE_ID in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotIn(List<String> values) {
            addCriterion("UPDATE_ID not in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdBetween(String value1, String value2) {
            addCriterion("UPDATE_ID between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotBetween(String value1, String value2) {
            addCriterion("UPDATE_ID not between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateDatimeIsNull() {
            addCriterion("UPDATE_DATIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatimeIsNotNull() {
            addCriterion("UPDATE_DATIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatimeEqualTo(Date value) {
            addCriterion("UPDATE_DATIME =", value, "updateDatime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatimeNotEqualTo(Date value) {
            addCriterion("UPDATE_DATIME <>", value, "updateDatime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatimeGreaterThan(Date value) {
            addCriterion("UPDATE_DATIME >", value, "updateDatime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATIME >=", value, "updateDatime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatimeLessThan(Date value) {
            addCriterion("UPDATE_DATIME <", value, "updateDatime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATIME <=", value, "updateDatime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatimeIn(List<Date> values) {
            addCriterion("UPDATE_DATIME in", values, "updateDatime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatimeNotIn(List<Date> values) {
            addCriterion("UPDATE_DATIME not in", values, "updateDatime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATIME between", value1, value2, "updateDatime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATIME not between", value1, value2, "updateDatime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ms_question_group
     *
     * @mbg.generated do_not_delete_during_merge Sat Mar 17 23:13:23 JST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ms_question_group
     *
     * @mbg.generated Sat Mar 17 23:13:23 JST 2018
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