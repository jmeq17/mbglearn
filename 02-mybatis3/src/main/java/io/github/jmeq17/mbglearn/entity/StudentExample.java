package io.github.jmeq17.mbglearn.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("stu_alias.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("stu_alias.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("stu_alias.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("stu_alias.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("stu_alias.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_alias.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("stu_alias.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("stu_alias.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("stu_alias.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("stu_alias.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("stu_alias.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_alias.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMynameIsNull() {
            addCriterion("stu_alias.name is null");
            return (Criteria) this;
        }

        public Criteria andMynameIsNotNull() {
            addCriterion("stu_alias.name is not null");
            return (Criteria) this;
        }

        public Criteria andMynameEqualTo(String value) {
            addCriterion("stu_alias.name =", value, "myname");
            return (Criteria) this;
        }

        public Criteria andMynameNotEqualTo(String value) {
            addCriterion("stu_alias.name <>", value, "myname");
            return (Criteria) this;
        }

        public Criteria andMynameGreaterThan(String value) {
            addCriterion("stu_alias.name >", value, "myname");
            return (Criteria) this;
        }

        public Criteria andMynameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_alias.name >=", value, "myname");
            return (Criteria) this;
        }

        public Criteria andMynameLessThan(String value) {
            addCriterion("stu_alias.name <", value, "myname");
            return (Criteria) this;
        }

        public Criteria andMynameLessThanOrEqualTo(String value) {
            addCriterion("stu_alias.name <=", value, "myname");
            return (Criteria) this;
        }

        public Criteria andMynameLike(String value) {
            addCriterion("stu_alias.name like", value, "myname");
            return (Criteria) this;
        }

        public Criteria andMynameNotLike(String value) {
            addCriterion("stu_alias.name not like", value, "myname");
            return (Criteria) this;
        }

        public Criteria andMynameIn(List<String> values) {
            addCriterion("stu_alias.name in", values, "myname");
            return (Criteria) this;
        }

        public Criteria andMynameNotIn(List<String> values) {
            addCriterion("stu_alias.name not in", values, "myname");
            return (Criteria) this;
        }

        public Criteria andMynameBetween(String value1, String value2) {
            addCriterion("stu_alias.name between", value1, value2, "myname");
            return (Criteria) this;
        }

        public Criteria andMynameNotBetween(String value1, String value2) {
            addCriterion("stu_alias.name not between", value1, value2, "myname");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("stu_alias.age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("stu_alias.age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("stu_alias.age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("stu_alias.age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("stu_alias.age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_alias.age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("stu_alias.age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("stu_alias.age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("stu_alias.age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("stu_alias.age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("stu_alias.age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_alias.age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("stu_alias.gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("stu_alias.gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("stu_alias.gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("stu_alias.gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("stu_alias.gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("stu_alias.gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("stu_alias.gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("stu_alias.gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("stu_alias.gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("stu_alias.gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("stu_alias.gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("stu_alias.gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("stu_alias.gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("stu_alias.gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andClass_IsNull() {
            addCriterion("stu_alias.class is null");
            return (Criteria) this;
        }

        public Criteria andClass_IsNotNull() {
            addCriterion("stu_alias.class is not null");
            return (Criteria) this;
        }

        public Criteria andClass_EqualTo(String value) {
            addCriterion("stu_alias.class =", value, "class_");
            return (Criteria) this;
        }

        public Criteria andClass_NotEqualTo(String value) {
            addCriterion("stu_alias.class <>", value, "class_");
            return (Criteria) this;
        }

        public Criteria andClass_GreaterThan(String value) {
            addCriterion("stu_alias.class >", value, "class_");
            return (Criteria) this;
        }

        public Criteria andClass_GreaterThanOrEqualTo(String value) {
            addCriterion("stu_alias.class >=", value, "class_");
            return (Criteria) this;
        }

        public Criteria andClass_LessThan(String value) {
            addCriterion("stu_alias.class <", value, "class_");
            return (Criteria) this;
        }

        public Criteria andClass_LessThanOrEqualTo(String value) {
            addCriterion("stu_alias.class <=", value, "class_");
            return (Criteria) this;
        }

        public Criteria andClass_Like(String value) {
            addCriterion("stu_alias.class like", value, "class_");
            return (Criteria) this;
        }

        public Criteria andClass_NotLike(String value) {
            addCriterion("stu_alias.class not like", value, "class_");
            return (Criteria) this;
        }

        public Criteria andClass_In(List<String> values) {
            addCriterion("stu_alias.class in", values, "class_");
            return (Criteria) this;
        }

        public Criteria andClass_NotIn(List<String> values) {
            addCriterion("stu_alias.class not in", values, "class_");
            return (Criteria) this;
        }

        public Criteria andClass_Between(String value1, String value2) {
            addCriterion("stu_alias.class between", value1, value2, "class_");
            return (Criteria) this;
        }

        public Criteria andClass_NotBetween(String value1, String value2) {
            addCriterion("stu_alias.class not between", value1, value2, "class_");
            return (Criteria) this;
        }

        public Criteria andEnrollmentDateIsNull() {
            addCriterion("stu_alias.enrollment_date is null");
            return (Criteria) this;
        }

        public Criteria andEnrollmentDateIsNotNull() {
            addCriterion("stu_alias.enrollment_date is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollmentDateEqualTo(LocalDate value) {
            addCriterion("stu_alias.enrollment_date =", value, "enrollmentDate");
            return (Criteria) this;
        }

        public Criteria andEnrollmentDateNotEqualTo(LocalDate value) {
            addCriterion("stu_alias.enrollment_date <>", value, "enrollmentDate");
            return (Criteria) this;
        }

        public Criteria andEnrollmentDateGreaterThan(LocalDate value) {
            addCriterion("stu_alias.enrollment_date >", value, "enrollmentDate");
            return (Criteria) this;
        }

        public Criteria andEnrollmentDateGreaterThanOrEqualTo(LocalDate value) {
            addCriterion("stu_alias.enrollment_date >=", value, "enrollmentDate");
            return (Criteria) this;
        }

        public Criteria andEnrollmentDateLessThan(LocalDate value) {
            addCriterion("stu_alias.enrollment_date <", value, "enrollmentDate");
            return (Criteria) this;
        }

        public Criteria andEnrollmentDateLessThanOrEqualTo(LocalDate value) {
            addCriterion("stu_alias.enrollment_date <=", value, "enrollmentDate");
            return (Criteria) this;
        }

        public Criteria andEnrollmentDateIn(List<LocalDate> values) {
            addCriterion("stu_alias.enrollment_date in", values, "enrollmentDate");
            return (Criteria) this;
        }

        public Criteria andEnrollmentDateNotIn(List<LocalDate> values) {
            addCriterion("stu_alias.enrollment_date not in", values, "enrollmentDate");
            return (Criteria) this;
        }

        public Criteria andEnrollmentDateBetween(LocalDate value1, LocalDate value2) {
            addCriterion("stu_alias.enrollment_date between", value1, value2, "enrollmentDate");
            return (Criteria) this;
        }

        public Criteria andEnrollmentDateNotBetween(LocalDate value1, LocalDate value2) {
            addCriterion("stu_alias.enrollment_date not between", value1, value2, "enrollmentDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

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