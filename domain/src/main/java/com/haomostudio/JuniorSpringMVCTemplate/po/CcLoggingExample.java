package com.haomostudio.JuniorSpringMVCTemplate.po;

import com.haomo.plugin.Page;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CcLoggingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public CcLoggingExample() {
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

    public void setPage(Page page) {
        this.page=page;
    }

    public Page getPage() {
        return page;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andLoginTimePeriodIsNull() {
            addCriterion("login_time_period is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimePeriodIsNotNull() {
            addCriterion("login_time_period is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimePeriodEqualTo(Date value) {
            addCriterion("login_time_period =", value, "loginTimePeriod");
            return (Criteria) this;
        }

        public Criteria andLoginTimePeriodNotEqualTo(Date value) {
            addCriterion("login_time_period <>", value, "loginTimePeriod");
            return (Criteria) this;
        }

        public Criteria andLoginTimePeriodGreaterThan(Date value) {
            addCriterion("login_time_period >", value, "loginTimePeriod");
            return (Criteria) this;
        }

        public Criteria andLoginTimePeriodGreaterThanOrEqualTo(Date value) {
            addCriterion("login_time_period >=", value, "loginTimePeriod");
            return (Criteria) this;
        }

        public Criteria andLoginTimePeriodLessThan(Date value) {
            addCriterion("login_time_period <", value, "loginTimePeriod");
            return (Criteria) this;
        }

        public Criteria andLoginTimePeriodLessThanOrEqualTo(Date value) {
            addCriterion("login_time_period <=", value, "loginTimePeriod");
            return (Criteria) this;
        }

        public Criteria andLoginTimePeriodIn(List<Date> values) {
            addCriterion("login_time_period in", values, "loginTimePeriod");
            return (Criteria) this;
        }

        public Criteria andLoginTimePeriodNotIn(List<Date> values) {
            addCriterion("login_time_period not in", values, "loginTimePeriod");
            return (Criteria) this;
        }

        public Criteria andLoginTimePeriodBetween(Date value1, Date value2) {
            addCriterion("login_time_period between", value1, value2, "loginTimePeriod");
            return (Criteria) this;
        }

        public Criteria andLoginTimePeriodNotBetween(Date value1, Date value2) {
            addCriterion("login_time_period not between", value1, value2, "loginTimePeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingTimePeriodIsNull() {
            addCriterion("operating_time_period is null");
            return (Criteria) this;
        }

        public Criteria andOperatingTimePeriodIsNotNull() {
            addCriterion("operating_time_period is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingTimePeriodEqualTo(Date value) {
            addCriterion("operating_time_period =", value, "operatingTimePeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingTimePeriodNotEqualTo(Date value) {
            addCriterion("operating_time_period <>", value, "operatingTimePeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingTimePeriodGreaterThan(Date value) {
            addCriterion("operating_time_period >", value, "operatingTimePeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingTimePeriodGreaterThanOrEqualTo(Date value) {
            addCriterion("operating_time_period >=", value, "operatingTimePeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingTimePeriodLessThan(Date value) {
            addCriterion("operating_time_period <", value, "operatingTimePeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingTimePeriodLessThanOrEqualTo(Date value) {
            addCriterion("operating_time_period <=", value, "operatingTimePeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingTimePeriodIn(List<Date> values) {
            addCriterion("operating_time_period in", values, "operatingTimePeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingTimePeriodNotIn(List<Date> values) {
            addCriterion("operating_time_period not in", values, "operatingTimePeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingTimePeriodBetween(Date value1, Date value2) {
            addCriterion("operating_time_period between", value1, value2, "operatingTimePeriod");
            return (Criteria) this;
        }

        public Criteria andOperatingTimePeriodNotBetween(Date value1, Date value2) {
            addCriterion("operating_time_period not between", value1, value2, "operatingTimePeriod");
            return (Criteria) this;
        }

        public Criteria andLoginTypeIsNull() {
            addCriterion("login_type is null");
            return (Criteria) this;
        }

        public Criteria andLoginTypeIsNotNull() {
            addCriterion("login_type is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTypeEqualTo(String value) {
            addCriterion("login_type =", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeNotEqualTo(String value) {
            addCriterion("login_type <>", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeGreaterThan(String value) {
            addCriterion("login_type >", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeGreaterThanOrEqualTo(String value) {
            addCriterion("login_type >=", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeLessThan(String value) {
            addCriterion("login_type <", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeLessThanOrEqualTo(String value) {
            addCriterion("login_type <=", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeLike(String value) {
            addCriterion("login_type like", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeNotLike(String value) {
            addCriterion("login_type not like", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeIn(List<String> values) {
            addCriterion("login_type in", values, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeNotIn(List<String> values) {
            addCriterion("login_type not in", values, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeBetween(String value1, String value2) {
            addCriterion("login_type between", value1, value2, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeNotBetween(String value1, String value2) {
            addCriterion("login_type not between", value1, value2, "loginType");
            return (Criteria) this;
        }

        public Criteria andTypeOperationIsNull() {
            addCriterion("type_operation is null");
            return (Criteria) this;
        }

        public Criteria andTypeOperationIsNotNull() {
            addCriterion("type_operation is not null");
            return (Criteria) this;
        }

        public Criteria andTypeOperationEqualTo(String value) {
            addCriterion("type_operation =", value, "typeOperation");
            return (Criteria) this;
        }

        public Criteria andTypeOperationNotEqualTo(String value) {
            addCriterion("type_operation <>", value, "typeOperation");
            return (Criteria) this;
        }

        public Criteria andTypeOperationGreaterThan(String value) {
            addCriterion("type_operation >", value, "typeOperation");
            return (Criteria) this;
        }

        public Criteria andTypeOperationGreaterThanOrEqualTo(String value) {
            addCriterion("type_operation >=", value, "typeOperation");
            return (Criteria) this;
        }

        public Criteria andTypeOperationLessThan(String value) {
            addCriterion("type_operation <", value, "typeOperation");
            return (Criteria) this;
        }

        public Criteria andTypeOperationLessThanOrEqualTo(String value) {
            addCriterion("type_operation <=", value, "typeOperation");
            return (Criteria) this;
        }

        public Criteria andTypeOperationLike(String value) {
            addCriterion("type_operation like", value, "typeOperation");
            return (Criteria) this;
        }

        public Criteria andTypeOperationNotLike(String value) {
            addCriterion("type_operation not like", value, "typeOperation");
            return (Criteria) this;
        }

        public Criteria andTypeOperationIn(List<String> values) {
            addCriterion("type_operation in", values, "typeOperation");
            return (Criteria) this;
        }

        public Criteria andTypeOperationNotIn(List<String> values) {
            addCriterion("type_operation not in", values, "typeOperation");
            return (Criteria) this;
        }

        public Criteria andTypeOperationBetween(String value1, String value2) {
            addCriterion("type_operation between", value1, value2, "typeOperation");
            return (Criteria) this;
        }

        public Criteria andTypeOperationNotBetween(String value1, String value2) {
            addCriterion("type_operation not between", value1, value2, "typeOperation");
            return (Criteria) this;
        }

        public Criteria andOperatingModuleIsNull() {
            addCriterion("operating_module is null");
            return (Criteria) this;
        }

        public Criteria andOperatingModuleIsNotNull() {
            addCriterion("operating_module is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingModuleEqualTo(String value) {
            addCriterion("operating_module =", value, "operatingModule");
            return (Criteria) this;
        }

        public Criteria andOperatingModuleNotEqualTo(String value) {
            addCriterion("operating_module <>", value, "operatingModule");
            return (Criteria) this;
        }

        public Criteria andOperatingModuleGreaterThan(String value) {
            addCriterion("operating_module >", value, "operatingModule");
            return (Criteria) this;
        }

        public Criteria andOperatingModuleGreaterThanOrEqualTo(String value) {
            addCriterion("operating_module >=", value, "operatingModule");
            return (Criteria) this;
        }

        public Criteria andOperatingModuleLessThan(String value) {
            addCriterion("operating_module <", value, "operatingModule");
            return (Criteria) this;
        }

        public Criteria andOperatingModuleLessThanOrEqualTo(String value) {
            addCriterion("operating_module <=", value, "operatingModule");
            return (Criteria) this;
        }

        public Criteria andOperatingModuleLike(String value) {
            addCriterion("operating_module like", value, "operatingModule");
            return (Criteria) this;
        }

        public Criteria andOperatingModuleNotLike(String value) {
            addCriterion("operating_module not like", value, "operatingModule");
            return (Criteria) this;
        }

        public Criteria andOperatingModuleIn(List<String> values) {
            addCriterion("operating_module in", values, "operatingModule");
            return (Criteria) this;
        }

        public Criteria andOperatingModuleNotIn(List<String> values) {
            addCriterion("operating_module not in", values, "operatingModule");
            return (Criteria) this;
        }

        public Criteria andOperatingModuleBetween(String value1, String value2) {
            addCriterion("operating_module between", value1, value2, "operatingModule");
            return (Criteria) this;
        }

        public Criteria andOperatingModuleNotBetween(String value1, String value2) {
            addCriterion("operating_module not between", value1, value2, "operatingModule");
            return (Criteria) this;
        }

        public Criteria andAffiliationIsNull() {
            addCriterion("affiliation is null");
            return (Criteria) this;
        }

        public Criteria andAffiliationIsNotNull() {
            addCriterion("affiliation is not null");
            return (Criteria) this;
        }

        public Criteria andAffiliationEqualTo(String value) {
            addCriterion("affiliation =", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationNotEqualTo(String value) {
            addCriterion("affiliation <>", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationGreaterThan(String value) {
            addCriterion("affiliation >", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationGreaterThanOrEqualTo(String value) {
            addCriterion("affiliation >=", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationLessThan(String value) {
            addCriterion("affiliation <", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationLessThanOrEqualTo(String value) {
            addCriterion("affiliation <=", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationLike(String value) {
            addCriterion("affiliation like", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationNotLike(String value) {
            addCriterion("affiliation not like", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationIn(List<String> values) {
            addCriterion("affiliation in", values, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationNotIn(List<String> values) {
            addCriterion("affiliation not in", values, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationBetween(String value1, String value2) {
            addCriterion("affiliation between", value1, value2, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationNotBetween(String value1, String value2) {
            addCriterion("affiliation not between", value1, value2, "affiliation");
            return (Criteria) this;
        }

        public Criteria andTheirDepartmentIsNull() {
            addCriterion("their_department is null");
            return (Criteria) this;
        }

        public Criteria andTheirDepartmentIsNotNull() {
            addCriterion("their_department is not null");
            return (Criteria) this;
        }

        public Criteria andTheirDepartmentEqualTo(String value) {
            addCriterion("their_department =", value, "theirDepartment");
            return (Criteria) this;
        }

        public Criteria andTheirDepartmentNotEqualTo(String value) {
            addCriterion("their_department <>", value, "theirDepartment");
            return (Criteria) this;
        }

        public Criteria andTheirDepartmentGreaterThan(String value) {
            addCriterion("their_department >", value, "theirDepartment");
            return (Criteria) this;
        }

        public Criteria andTheirDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("their_department >=", value, "theirDepartment");
            return (Criteria) this;
        }

        public Criteria andTheirDepartmentLessThan(String value) {
            addCriterion("their_department <", value, "theirDepartment");
            return (Criteria) this;
        }

        public Criteria andTheirDepartmentLessThanOrEqualTo(String value) {
            addCriterion("their_department <=", value, "theirDepartment");
            return (Criteria) this;
        }

        public Criteria andTheirDepartmentLike(String value) {
            addCriterion("their_department like", value, "theirDepartment");
            return (Criteria) this;
        }

        public Criteria andTheirDepartmentNotLike(String value) {
            addCriterion("their_department not like", value, "theirDepartment");
            return (Criteria) this;
        }

        public Criteria andTheirDepartmentIn(List<String> values) {
            addCriterion("their_department in", values, "theirDepartment");
            return (Criteria) this;
        }

        public Criteria andTheirDepartmentNotIn(List<String> values) {
            addCriterion("their_department not in", values, "theirDepartment");
            return (Criteria) this;
        }

        public Criteria andTheirDepartmentBetween(String value1, String value2) {
            addCriterion("their_department between", value1, value2, "theirDepartment");
            return (Criteria) this;
        }

        public Criteria andTheirDepartmentNotBetween(String value1, String value2) {
            addCriterion("their_department not between", value1, value2, "theirDepartment");
            return (Criteria) this;
        }

        public Criteria andLogContentIsNull() {
            addCriterion("log_content is null");
            return (Criteria) this;
        }

        public Criteria andLogContentIsNotNull() {
            addCriterion("log_content is not null");
            return (Criteria) this;
        }

        public Criteria andLogContentEqualTo(String value) {
            addCriterion("log_content =", value, "logContent");
            return (Criteria) this;
        }

        public Criteria andLogContentNotEqualTo(String value) {
            addCriterion("log_content <>", value, "logContent");
            return (Criteria) this;
        }

        public Criteria andLogContentGreaterThan(String value) {
            addCriterion("log_content >", value, "logContent");
            return (Criteria) this;
        }

        public Criteria andLogContentGreaterThanOrEqualTo(String value) {
            addCriterion("log_content >=", value, "logContent");
            return (Criteria) this;
        }

        public Criteria andLogContentLessThan(String value) {
            addCriterion("log_content <", value, "logContent");
            return (Criteria) this;
        }

        public Criteria andLogContentLessThanOrEqualTo(String value) {
            addCriterion("log_content <=", value, "logContent");
            return (Criteria) this;
        }

        public Criteria andLogContentLike(String value) {
            addCriterion("log_content like", value, "logContent");
            return (Criteria) this;
        }

        public Criteria andLogContentNotLike(String value) {
            addCriterion("log_content not like", value, "logContent");
            return (Criteria) this;
        }

        public Criteria andLogContentIn(List<String> values) {
            addCriterion("log_content in", values, "logContent");
            return (Criteria) this;
        }

        public Criteria andLogContentNotIn(List<String> values) {
            addCriterion("log_content not in", values, "logContent");
            return (Criteria) this;
        }

        public Criteria andLogContentBetween(String value1, String value2) {
            addCriterion("log_content between", value1, value2, "logContent");
            return (Criteria) this;
        }

        public Criteria andLogContentNotBetween(String value1, String value2) {
            addCriterion("log_content not between", value1, value2, "logContent");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("last_update_time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("last_update_time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("last_update_time >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("last_update_time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_update_time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("last_update_time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("last_update_time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("last_update_time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_update_time not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNull() {
            addCriterion("operator_id is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(String value) {
            addCriterion("operator_id =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(String value) {
            addCriterion("operator_id <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(String value) {
            addCriterion("operator_id >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("operator_id >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(String value) {
            addCriterion("operator_id <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(String value) {
            addCriterion("operator_id <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLike(String value) {
            addCriterion("operator_id like", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotLike(String value) {
            addCriterion("operator_id not like", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<String> values) {
            addCriterion("operator_id in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<String> values) {
            addCriterion("operator_id not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(String value1, String value2) {
            addCriterion("operator_id between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(String value1, String value2) {
            addCriterion("operator_id not between", value1, value2, "operatorId");
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