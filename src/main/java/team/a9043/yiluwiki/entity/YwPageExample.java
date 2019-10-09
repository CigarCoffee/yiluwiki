package team.a9043.yiluwiki.entity;

import java.util.ArrayList;
import java.util.List;

public class YwPageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YwPageExample() {
        oredCriteria = new ArrayList<Criteria>();
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

        public Criteria andYpIdIsNull() {
            addCriterion("yp_id is null");
            return (Criteria) this;
        }

        public Criteria andYpIdIsNotNull() {
            addCriterion("yp_id is not null");
            return (Criteria) this;
        }

        public Criteria andYpIdEqualTo(Integer value) {
            addCriterion("yp_id =", value, "ypId");
            return (Criteria) this;
        }

        public Criteria andYpIdNotEqualTo(Integer value) {
            addCriterion("yp_id <>", value, "ypId");
            return (Criteria) this;
        }

        public Criteria andYpIdGreaterThan(Integer value) {
            addCriterion("yp_id >", value, "ypId");
            return (Criteria) this;
        }

        public Criteria andYpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("yp_id >=", value, "ypId");
            return (Criteria) this;
        }

        public Criteria andYpIdLessThan(Integer value) {
            addCriterion("yp_id <", value, "ypId");
            return (Criteria) this;
        }

        public Criteria andYpIdLessThanOrEqualTo(Integer value) {
            addCriterion("yp_id <=", value, "ypId");
            return (Criteria) this;
        }

        public Criteria andYpIdIn(List<Integer> values) {
            addCriterion("yp_id in", values, "ypId");
            return (Criteria) this;
        }

        public Criteria andYpIdNotIn(List<Integer> values) {
            addCriterion("yp_id not in", values, "ypId");
            return (Criteria) this;
        }

        public Criteria andYpIdBetween(Integer value1, Integer value2) {
            addCriterion("yp_id between", value1, value2, "ypId");
            return (Criteria) this;
        }

        public Criteria andYpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("yp_id not between", value1, value2, "ypId");
            return (Criteria) this;
        }

        public Criteria andYpTypeIsNull() {
            addCriterion("yp_type is null");
            return (Criteria) this;
        }

        public Criteria andYpTypeIsNotNull() {
            addCriterion("yp_type is not null");
            return (Criteria) this;
        }

        public Criteria andYpTypeEqualTo(String value) {
            addCriterion("yp_type =", value, "ypType");
            return (Criteria) this;
        }

        public Criteria andYpTypeNotEqualTo(String value) {
            addCriterion("yp_type <>", value, "ypType");
            return (Criteria) this;
        }

        public Criteria andYpTypeGreaterThan(String value) {
            addCriterion("yp_type >", value, "ypType");
            return (Criteria) this;
        }

        public Criteria andYpTypeGreaterThanOrEqualTo(String value) {
            addCriterion("yp_type >=", value, "ypType");
            return (Criteria) this;
        }

        public Criteria andYpTypeLessThan(String value) {
            addCriterion("yp_type <", value, "ypType");
            return (Criteria) this;
        }

        public Criteria andYpTypeLessThanOrEqualTo(String value) {
            addCriterion("yp_type <=", value, "ypType");
            return (Criteria) this;
        }

        public Criteria andYpTypeLike(String value) {
            addCriterion("yp_type like", value, "ypType");
            return (Criteria) this;
        }

        public Criteria andYpTypeNotLike(String value) {
            addCriterion("yp_type not like", value, "ypType");
            return (Criteria) this;
        }

        public Criteria andYpTypeIn(List<String> values) {
            addCriterion("yp_type in", values, "ypType");
            return (Criteria) this;
        }

        public Criteria andYpTypeNotIn(List<String> values) {
            addCriterion("yp_type not in", values, "ypType");
            return (Criteria) this;
        }

        public Criteria andYpTypeBetween(String value1, String value2) {
            addCriterion("yp_type between", value1, value2, "ypType");
            return (Criteria) this;
        }

        public Criteria andYpTypeNotBetween(String value1, String value2) {
            addCriterion("yp_type not between", value1, value2, "ypType");
            return (Criteria) this;
        }

        public Criteria andYpNameIsNull() {
            addCriterion("yp_name is null");
            return (Criteria) this;
        }

        public Criteria andYpNameIsNotNull() {
            addCriterion("yp_name is not null");
            return (Criteria) this;
        }

        public Criteria andYpNameEqualTo(String value) {
            addCriterion("yp_name =", value, "ypName");
            return (Criteria) this;
        }

        public Criteria andYpNameNotEqualTo(String value) {
            addCriterion("yp_name <>", value, "ypName");
            return (Criteria) this;
        }

        public Criteria andYpNameGreaterThan(String value) {
            addCriterion("yp_name >", value, "ypName");
            return (Criteria) this;
        }

        public Criteria andYpNameGreaterThanOrEqualTo(String value) {
            addCriterion("yp_name >=", value, "ypName");
            return (Criteria) this;
        }

        public Criteria andYpNameLessThan(String value) {
            addCriterion("yp_name <", value, "ypName");
            return (Criteria) this;
        }

        public Criteria andYpNameLessThanOrEqualTo(String value) {
            addCriterion("yp_name <=", value, "ypName");
            return (Criteria) this;
        }

        public Criteria andYpNameLike(String value) {
            addCriterion("yp_name like", value, "ypName");
            return (Criteria) this;
        }

        public Criteria andYpNameNotLike(String value) {
            addCriterion("yp_name not like", value, "ypName");
            return (Criteria) this;
        }

        public Criteria andYpNameIn(List<String> values) {
            addCriterion("yp_name in", values, "ypName");
            return (Criteria) this;
        }

        public Criteria andYpNameNotIn(List<String> values) {
            addCriterion("yp_name not in", values, "ypName");
            return (Criteria) this;
        }

        public Criteria andYpNameBetween(String value1, String value2) {
            addCriterion("yp_name between", value1, value2, "ypName");
            return (Criteria) this;
        }

        public Criteria andYpNameNotBetween(String value1, String value2) {
            addCriterion("yp_name not between", value1, value2, "ypName");
            return (Criteria) this;
        }

        public Criteria andYpAbstractIsNull() {
            addCriterion("yp_abstract is null");
            return (Criteria) this;
        }

        public Criteria andYpAbstractIsNotNull() {
            addCriterion("yp_abstract is not null");
            return (Criteria) this;
        }

        public Criteria andYpAbstractEqualTo(String value) {
            addCriterion("yp_abstract =", value, "ypAbstract");
            return (Criteria) this;
        }

        public Criteria andYpAbstractNotEqualTo(String value) {
            addCriterion("yp_abstract <>", value, "ypAbstract");
            return (Criteria) this;
        }

        public Criteria andYpAbstractGreaterThan(String value) {
            addCriterion("yp_abstract >", value, "ypAbstract");
            return (Criteria) this;
        }

        public Criteria andYpAbstractGreaterThanOrEqualTo(String value) {
            addCriterion("yp_abstract >=", value, "ypAbstract");
            return (Criteria) this;
        }

        public Criteria andYpAbstractLessThan(String value) {
            addCriterion("yp_abstract <", value, "ypAbstract");
            return (Criteria) this;
        }

        public Criteria andYpAbstractLessThanOrEqualTo(String value) {
            addCriterion("yp_abstract <=", value, "ypAbstract");
            return (Criteria) this;
        }

        public Criteria andYpAbstractLike(String value) {
            addCriterion("yp_abstract like", value, "ypAbstract");
            return (Criteria) this;
        }

        public Criteria andYpAbstractNotLike(String value) {
            addCriterion("yp_abstract not like", value, "ypAbstract");
            return (Criteria) this;
        }

        public Criteria andYpAbstractIn(List<String> values) {
            addCriterion("yp_abstract in", values, "ypAbstract");
            return (Criteria) this;
        }

        public Criteria andYpAbstractNotIn(List<String> values) {
            addCriterion("yp_abstract not in", values, "ypAbstract");
            return (Criteria) this;
        }

        public Criteria andYpAbstractBetween(String value1, String value2) {
            addCriterion("yp_abstract between", value1, value2, "ypAbstract");
            return (Criteria) this;
        }

        public Criteria andYpAbstractNotBetween(String value1, String value2) {
            addCriterion("yp_abstract not between", value1, value2, "ypAbstract");
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