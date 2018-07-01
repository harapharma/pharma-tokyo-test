package jp.co.pds.PJ0001.dao.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DtAnswerDetailExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dt_answer_detail
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dt_answer_detail
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dt_answer_detail
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dt_answer_detail
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    public DtAnswerDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dt_answer_detail
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dt_answer_detail
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dt_answer_detail
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dt_answer_detail
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dt_answer_detail
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dt_answer_detail
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dt_answer_detail
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dt_answer_detail
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
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
     * This method corresponds to the database table dt_answer_detail
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dt_answer_detail
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dt_answer_detail
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
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

        public Criteria andAnswerIdIsNull() {
            addCriterion("ANSWER_ID is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIdIsNotNull() {
            addCriterion("ANSWER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerIdEqualTo(Integer value) {
            addCriterion("ANSWER_ID =", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotEqualTo(Integer value) {
            addCriterion("ANSWER_ID <>", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdGreaterThan(Integer value) {
            addCriterion("ANSWER_ID >", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ANSWER_ID >=", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdLessThan(Integer value) {
            addCriterion("ANSWER_ID <", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdLessThanOrEqualTo(Integer value) {
            addCriterion("ANSWER_ID <=", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdIn(List<Integer> values) {
            addCriterion("ANSWER_ID in", values, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotIn(List<Integer> values) {
            addCriterion("ANSWER_ID not in", values, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdBetween(Integer value1, Integer value2) {
            addCriterion("ANSWER_ID between", value1, value2, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ANSWER_ID not between", value1, value2, "answerId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNull() {
            addCriterion("QUESTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNotNull() {
            addCriterion("QUESTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdEqualTo(Integer value) {
            addCriterion("QUESTION_ID =", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotEqualTo(Integer value) {
            addCriterion("QUESTION_ID <>", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThan(Integer value) {
            addCriterion("QUESTION_ID >", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("QUESTION_ID >=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThan(Integer value) {
            addCriterion("QUESTION_ID <", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThanOrEqualTo(Integer value) {
            addCriterion("QUESTION_ID <=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIn(List<Integer> values) {
            addCriterion("QUESTION_ID in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotIn(List<Integer> values) {
            addCriterion("QUESTION_ID not in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdBetween(Integer value1, Integer value2) {
            addCriterion("QUESTION_ID between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("QUESTION_ID not between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIsNull() {
            addCriterion("SELECTION is null");
            return (Criteria) this;
        }

        public Criteria andSelectionIsNotNull() {
            addCriterion("SELECTION is not null");
            return (Criteria) this;
        }

        public Criteria andSelectionEqualTo(Integer value) {
            addCriterion("SELECTION =", value, "selection");
            return (Criteria) this;
        }

        public Criteria andSelectionNotEqualTo(Integer value) {
            addCriterion("SELECTION <>", value, "selection");
            return (Criteria) this;
        }

        public Criteria andSelectionGreaterThan(Integer value) {
            addCriterion("SELECTION >", value, "selection");
            return (Criteria) this;
        }

        public Criteria andSelectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("SELECTION >=", value, "selection");
            return (Criteria) this;
        }

        public Criteria andSelectionLessThan(Integer value) {
            addCriterion("SELECTION <", value, "selection");
            return (Criteria) this;
        }

        public Criteria andSelectionLessThanOrEqualTo(Integer value) {
            addCriterion("SELECTION <=", value, "selection");
            return (Criteria) this;
        }

        public Criteria andSelectionIn(List<Integer> values) {
            addCriterion("SELECTION in", values, "selection");
            return (Criteria) this;
        }

        public Criteria andSelectionNotIn(List<Integer> values) {
            addCriterion("SELECTION not in", values, "selection");
            return (Criteria) this;
        }

        public Criteria andSelectionBetween(Integer value1, Integer value2) {
            addCriterion("SELECTION between", value1, value2, "selection");
            return (Criteria) this;
        }

        public Criteria andSelectionNotBetween(Integer value1, Integer value2) {
            addCriterion("SELECTION not between", value1, value2, "selection");
            return (Criteria) this;
        }

        public Criteria andCorrectIsNull() {
            addCriterion("CORRECT is null");
            return (Criteria) this;
        }

        public Criteria andCorrectIsNotNull() {
            addCriterion("CORRECT is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectEqualTo(String value) {
            addCriterion("CORRECT =", value, "correct");
            return (Criteria) this;
        }

        public Criteria andCorrectNotEqualTo(String value) {
            addCriterion("CORRECT <>", value, "correct");
            return (Criteria) this;
        }

        public Criteria andCorrectGreaterThan(String value) {
            addCriterion("CORRECT >", value, "correct");
            return (Criteria) this;
        }

        public Criteria andCorrectGreaterThanOrEqualTo(String value) {
            addCriterion("CORRECT >=", value, "correct");
            return (Criteria) this;
        }

        public Criteria andCorrectLessThan(String value) {
            addCriterion("CORRECT <", value, "correct");
            return (Criteria) this;
        }

        public Criteria andCorrectLessThanOrEqualTo(String value) {
            addCriterion("CORRECT <=", value, "correct");
            return (Criteria) this;
        }

        public Criteria andCorrectLike(String value) {
            addCriterion("CORRECT like", value, "correct");
            return (Criteria) this;
        }

        public Criteria andCorrectNotLike(String value) {
            addCriterion("CORRECT not like", value, "correct");
            return (Criteria) this;
        }

        public Criteria andCorrectIn(List<String> values) {
            addCriterion("CORRECT in", values, "correct");
            return (Criteria) this;
        }

        public Criteria andCorrectNotIn(List<String> values) {
            addCriterion("CORRECT not in", values, "correct");
            return (Criteria) this;
        }

        public Criteria andCorrectBetween(String value1, String value2) {
            addCriterion("CORRECT between", value1, value2, "correct");
            return (Criteria) this;
        }

        public Criteria andCorrectNotBetween(String value1, String value2) {
            addCriterion("CORRECT not between", value1, value2, "correct");
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
     * This class corresponds to the database table dt_answer_detail
     *
     * @mbg.generated do_not_delete_during_merge Sat Mar 24 16:57:26 JST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dt_answer_detail
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
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