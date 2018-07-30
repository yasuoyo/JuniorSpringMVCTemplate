package com.haomostudio.JuniorSpringMVCTemplate.po;

import com.haomo.plugin.Page;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ViewHmUserDepartmentRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public ViewHmUserDepartmentRoleExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andLoginidIsNull() {
            addCriterion("loginid is null");
            return (Criteria) this;
        }

        public Criteria andLoginidIsNotNull() {
            addCriterion("loginid is not null");
            return (Criteria) this;
        }

        public Criteria andLoginidEqualTo(String value) {
            addCriterion("loginid =", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotEqualTo(String value) {
            addCriterion("loginid <>", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidGreaterThan(String value) {
            addCriterion("loginid >", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidGreaterThanOrEqualTo(String value) {
            addCriterion("loginid >=", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidLessThan(String value) {
            addCriterion("loginid <", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidLessThanOrEqualTo(String value) {
            addCriterion("loginid <=", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidLike(String value) {
            addCriterion("loginid like", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotLike(String value) {
            addCriterion("loginid not like", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidIn(List<String> values) {
            addCriterion("loginid in", values, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotIn(List<String> values) {
            addCriterion("loginid not in", values, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidBetween(String value1, String value2) {
            addCriterion("loginid between", value1, value2, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotBetween(String value1, String value2) {
            addCriterion("loginid not between", value1, value2, "loginid");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
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

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeIsNull() {
            addCriterion("department_code is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeIsNotNull() {
            addCriterion("department_code is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeEqualTo(String value) {
            addCriterion("department_code =", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeNotEqualTo(String value) {
            addCriterion("department_code <>", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeGreaterThan(String value) {
            addCriterion("department_code >", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("department_code >=", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeLessThan(String value) {
            addCriterion("department_code <", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeLessThanOrEqualTo(String value) {
            addCriterion("department_code <=", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeLike(String value) {
            addCriterion("department_code like", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeNotLike(String value) {
            addCriterion("department_code not like", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeIn(List<String> values) {
            addCriterion("department_code in", values, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeNotIn(List<String> values) {
            addCriterion("department_code not in", values, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeBetween(String value1, String value2) {
            addCriterion("department_code between", value1, value2, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeNotBetween(String value1, String value2) {
            addCriterion("department_code not between", value1, value2, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(String value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(String value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(String value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(String value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(String value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLike(String value) {
            addCriterion("role_id like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotLike(String value) {
            addCriterion("role_id not like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<String> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<String> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(String value1, String value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(String value1, String value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andMeetingRemindingTimeIsNull() {
            addCriterion("meeting_reminding_time is null");
            return (Criteria) this;
        }

        public Criteria andMeetingRemindingTimeIsNotNull() {
            addCriterion("meeting_reminding_time is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingRemindingTimeEqualTo(Integer value) {
            addCriterion("meeting_reminding_time =", value, "meetingRemindingTime");
            return (Criteria) this;
        }

        public Criteria andMeetingRemindingTimeNotEqualTo(Integer value) {
            addCriterion("meeting_reminding_time <>", value, "meetingRemindingTime");
            return (Criteria) this;
        }

        public Criteria andMeetingRemindingTimeGreaterThan(Integer value) {
            addCriterion("meeting_reminding_time >", value, "meetingRemindingTime");
            return (Criteria) this;
        }

        public Criteria andMeetingRemindingTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("meeting_reminding_time >=", value, "meetingRemindingTime");
            return (Criteria) this;
        }

        public Criteria andMeetingRemindingTimeLessThan(Integer value) {
            addCriterion("meeting_reminding_time <", value, "meetingRemindingTime");
            return (Criteria) this;
        }

        public Criteria andMeetingRemindingTimeLessThanOrEqualTo(Integer value) {
            addCriterion("meeting_reminding_time <=", value, "meetingRemindingTime");
            return (Criteria) this;
        }

        public Criteria andMeetingRemindingTimeIn(List<Integer> values) {
            addCriterion("meeting_reminding_time in", values, "meetingRemindingTime");
            return (Criteria) this;
        }

        public Criteria andMeetingRemindingTimeNotIn(List<Integer> values) {
            addCriterion("meeting_reminding_time not in", values, "meetingRemindingTime");
            return (Criteria) this;
        }

        public Criteria andMeetingRemindingTimeBetween(Integer value1, Integer value2) {
            addCriterion("meeting_reminding_time between", value1, value2, "meetingRemindingTime");
            return (Criteria) this;
        }

        public Criteria andMeetingRemindingTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("meeting_reminding_time not between", value1, value2, "meetingRemindingTime");
            return (Criteria) this;
        }

        public Criteria andJobTitleIsNull() {
            addCriterion("job_title is null");
            return (Criteria) this;
        }

        public Criteria andJobTitleIsNotNull() {
            addCriterion("job_title is not null");
            return (Criteria) this;
        }

        public Criteria andJobTitleEqualTo(String value) {
            addCriterion("job_title =", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotEqualTo(String value) {
            addCriterion("job_title <>", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleGreaterThan(String value) {
            addCriterion("job_title >", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleGreaterThanOrEqualTo(String value) {
            addCriterion("job_title >=", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleLessThan(String value) {
            addCriterion("job_title <", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleLessThanOrEqualTo(String value) {
            addCriterion("job_title <=", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleLike(String value) {
            addCriterion("job_title like", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotLike(String value) {
            addCriterion("job_title not like", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleIn(List<String> values) {
            addCriterion("job_title in", values, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotIn(List<String> values) {
            addCriterion("job_title not in", values, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleBetween(String value1, String value2) {
            addCriterion("job_title between", value1, value2, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotBetween(String value1, String value2) {
            addCriterion("job_title not between", value1, value2, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("phone_number is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("phone_number =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("phone_number <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("phone_number >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("phone_number >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("phone_number <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("phone_number <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("phone_number like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("phone_number not like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("phone_number in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("phone_number not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("phone_number between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("phone_number not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberSpareIsNull() {
            addCriterion("phone_number_spare is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberSpareIsNotNull() {
            addCriterion("phone_number_spare is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberSpareEqualTo(String value) {
            addCriterion("phone_number_spare =", value, "phoneNumberSpare");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberSpareNotEqualTo(String value) {
            addCriterion("phone_number_spare <>", value, "phoneNumberSpare");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberSpareGreaterThan(String value) {
            addCriterion("phone_number_spare >", value, "phoneNumberSpare");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberSpareGreaterThanOrEqualTo(String value) {
            addCriterion("phone_number_spare >=", value, "phoneNumberSpare");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberSpareLessThan(String value) {
            addCriterion("phone_number_spare <", value, "phoneNumberSpare");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberSpareLessThanOrEqualTo(String value) {
            addCriterion("phone_number_spare <=", value, "phoneNumberSpare");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberSpareLike(String value) {
            addCriterion("phone_number_spare like", value, "phoneNumberSpare");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberSpareNotLike(String value) {
            addCriterion("phone_number_spare not like", value, "phoneNumberSpare");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberSpareIn(List<String> values) {
            addCriterion("phone_number_spare in", values, "phoneNumberSpare");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberSpareNotIn(List<String> values) {
            addCriterion("phone_number_spare not in", values, "phoneNumberSpare");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberSpareBetween(String value1, String value2) {
            addCriterion("phone_number_spare between", value1, value2, "phoneNumberSpare");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberSpareNotBetween(String value1, String value2) {
            addCriterion("phone_number_spare not between", value1, value2, "phoneNumberSpare");
            return (Criteria) this;
        }

        public Criteria andRankIsNull() {
            addCriterion("rank is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("rank is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(Integer value) {
            addCriterion("rank =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(Integer value) {
            addCriterion("rank <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(Integer value) {
            addCriterion("rank >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(Integer value) {
            addCriterion("rank <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(Integer value) {
            addCriterion("rank <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<Integer> values) {
            addCriterion("rank in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<Integer> values) {
            addCriterion("rank not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(Integer value1, Integer value2) {
            addCriterion("rank between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(Integer value1, Integer value2) {
            addCriterion("rank not between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andCommunityIsNull() {
            addCriterion("community is null");
            return (Criteria) this;
        }

        public Criteria andCommunityIsNotNull() {
            addCriterion("community is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityEqualTo(String value) {
            addCriterion("community =", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotEqualTo(String value) {
            addCriterion("community <>", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityGreaterThan(String value) {
            addCriterion("community >", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityGreaterThanOrEqualTo(String value) {
            addCriterion("community >=", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLessThan(String value) {
            addCriterion("community <", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLessThanOrEqualTo(String value) {
            addCriterion("community <=", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLike(String value) {
            addCriterion("community like", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotLike(String value) {
            addCriterion("community not like", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityIn(List<String> values) {
            addCriterion("community in", values, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotIn(List<String> values) {
            addCriterion("community not in", values, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityBetween(String value1, String value2) {
            addCriterion("community between", value1, value2, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotBetween(String value1, String value2) {
            addCriterion("community not between", value1, value2, "community");
            return (Criteria) this;
        }

        public Criteria andEnableIsNull() {
            addCriterion("enable is null");
            return (Criteria) this;
        }

        public Criteria andEnableIsNotNull() {
            addCriterion("enable is not null");
            return (Criteria) this;
        }

        public Criteria andEnableEqualTo(String value) {
            addCriterion("enable =", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotEqualTo(String value) {
            addCriterion("enable <>", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThan(String value) {
            addCriterion("enable >", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThanOrEqualTo(String value) {
            addCriterion("enable >=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThan(String value) {
            addCriterion("enable <", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThanOrEqualTo(String value) {
            addCriterion("enable <=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLike(String value) {
            addCriterion("enable like", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotLike(String value) {
            addCriterion("enable not like", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableIn(List<String> values) {
            addCriterion("enable in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotIn(List<String> values) {
            addCriterion("enable not in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableBetween(String value1, String value2) {
            addCriterion("enable between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotBetween(String value1, String value2) {
            addCriterion("enable not between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andHideIsNull() {
            addCriterion("hide is null");
            return (Criteria) this;
        }

        public Criteria andHideIsNotNull() {
            addCriterion("hide is not null");
            return (Criteria) this;
        }

        public Criteria andHideEqualTo(String value) {
            addCriterion("hide =", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideNotEqualTo(String value) {
            addCriterion("hide <>", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideGreaterThan(String value) {
            addCriterion("hide >", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideGreaterThanOrEqualTo(String value) {
            addCriterion("hide >=", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideLessThan(String value) {
            addCriterion("hide <", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideLessThanOrEqualTo(String value) {
            addCriterion("hide <=", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideLike(String value) {
            addCriterion("hide like", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideNotLike(String value) {
            addCriterion("hide not like", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideIn(List<String> values) {
            addCriterion("hide in", values, "hide");
            return (Criteria) this;
        }

        public Criteria andHideNotIn(List<String> values) {
            addCriterion("hide not in", values, "hide");
            return (Criteria) this;
        }

        public Criteria andHideBetween(String value1, String value2) {
            addCriterion("hide between", value1, value2, "hide");
            return (Criteria) this;
        }

        public Criteria andHideNotBetween(String value1, String value2) {
            addCriterion("hide not between", value1, value2, "hide");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(String value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(String value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(String value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(String value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLike(String value) {
            addCriterion("department_id like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotLike(String value) {
            addCriterion("department_id not like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<String> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<String> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(String value1, String value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andDepIdIsNull() {
            addCriterion("dep_id is null");
            return (Criteria) this;
        }

        public Criteria andDepIdIsNotNull() {
            addCriterion("dep_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepIdEqualTo(String value) {
            addCriterion("dep_id =", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotEqualTo(String value) {
            addCriterion("dep_id <>", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdGreaterThan(String value) {
            addCriterion("dep_id >", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdGreaterThanOrEqualTo(String value) {
            addCriterion("dep_id >=", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdLessThan(String value) {
            addCriterion("dep_id <", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdLessThanOrEqualTo(String value) {
            addCriterion("dep_id <=", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdLike(String value) {
            addCriterion("dep_id like", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotLike(String value) {
            addCriterion("dep_id not like", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdIn(List<String> values) {
            addCriterion("dep_id in", values, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotIn(List<String> values) {
            addCriterion("dep_id not in", values, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdBetween(String value1, String value2) {
            addCriterion("dep_id between", value1, value2, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotBetween(String value1, String value2) {
            addCriterion("dep_id not between", value1, value2, "depId");
            return (Criteria) this;
        }

        public Criteria andDepParentDepartmentCodeIsNull() {
            addCriterion("dep_parent_department_code is null");
            return (Criteria) this;
        }

        public Criteria andDepParentDepartmentCodeIsNotNull() {
            addCriterion("dep_parent_department_code is not null");
            return (Criteria) this;
        }

        public Criteria andDepParentDepartmentCodeEqualTo(String value) {
            addCriterion("dep_parent_department_code =", value, "depParentDepartmentCode");
            return (Criteria) this;
        }

        public Criteria andDepParentDepartmentCodeNotEqualTo(String value) {
            addCriterion("dep_parent_department_code <>", value, "depParentDepartmentCode");
            return (Criteria) this;
        }

        public Criteria andDepParentDepartmentCodeGreaterThan(String value) {
            addCriterion("dep_parent_department_code >", value, "depParentDepartmentCode");
            return (Criteria) this;
        }

        public Criteria andDepParentDepartmentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dep_parent_department_code >=", value, "depParentDepartmentCode");
            return (Criteria) this;
        }

        public Criteria andDepParentDepartmentCodeLessThan(String value) {
            addCriterion("dep_parent_department_code <", value, "depParentDepartmentCode");
            return (Criteria) this;
        }

        public Criteria andDepParentDepartmentCodeLessThanOrEqualTo(String value) {
            addCriterion("dep_parent_department_code <=", value, "depParentDepartmentCode");
            return (Criteria) this;
        }

        public Criteria andDepParentDepartmentCodeLike(String value) {
            addCriterion("dep_parent_department_code like", value, "depParentDepartmentCode");
            return (Criteria) this;
        }

        public Criteria andDepParentDepartmentCodeNotLike(String value) {
            addCriterion("dep_parent_department_code not like", value, "depParentDepartmentCode");
            return (Criteria) this;
        }

        public Criteria andDepParentDepartmentCodeIn(List<String> values) {
            addCriterion("dep_parent_department_code in", values, "depParentDepartmentCode");
            return (Criteria) this;
        }

        public Criteria andDepParentDepartmentCodeNotIn(List<String> values) {
            addCriterion("dep_parent_department_code not in", values, "depParentDepartmentCode");
            return (Criteria) this;
        }

        public Criteria andDepParentDepartmentCodeBetween(String value1, String value2) {
            addCriterion("dep_parent_department_code between", value1, value2, "depParentDepartmentCode");
            return (Criteria) this;
        }

        public Criteria andDepParentDepartmentCodeNotBetween(String value1, String value2) {
            addCriterion("dep_parent_department_code not between", value1, value2, "depParentDepartmentCode");
            return (Criteria) this;
        }

        public Criteria andDepCodeIsNull() {
            addCriterion("dep_code is null");
            return (Criteria) this;
        }

        public Criteria andDepCodeIsNotNull() {
            addCriterion("dep_code is not null");
            return (Criteria) this;
        }

        public Criteria andDepCodeEqualTo(String value) {
            addCriterion("dep_code =", value, "depCode");
            return (Criteria) this;
        }

        public Criteria andDepCodeNotEqualTo(String value) {
            addCriterion("dep_code <>", value, "depCode");
            return (Criteria) this;
        }

        public Criteria andDepCodeGreaterThan(String value) {
            addCriterion("dep_code >", value, "depCode");
            return (Criteria) this;
        }

        public Criteria andDepCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dep_code >=", value, "depCode");
            return (Criteria) this;
        }

        public Criteria andDepCodeLessThan(String value) {
            addCriterion("dep_code <", value, "depCode");
            return (Criteria) this;
        }

        public Criteria andDepCodeLessThanOrEqualTo(String value) {
            addCriterion("dep_code <=", value, "depCode");
            return (Criteria) this;
        }

        public Criteria andDepCodeLike(String value) {
            addCriterion("dep_code like", value, "depCode");
            return (Criteria) this;
        }

        public Criteria andDepCodeNotLike(String value) {
            addCriterion("dep_code not like", value, "depCode");
            return (Criteria) this;
        }

        public Criteria andDepCodeIn(List<String> values) {
            addCriterion("dep_code in", values, "depCode");
            return (Criteria) this;
        }

        public Criteria andDepCodeNotIn(List<String> values) {
            addCriterion("dep_code not in", values, "depCode");
            return (Criteria) this;
        }

        public Criteria andDepCodeBetween(String value1, String value2) {
            addCriterion("dep_code between", value1, value2, "depCode");
            return (Criteria) this;
        }

        public Criteria andDepCodeNotBetween(String value1, String value2) {
            addCriterion("dep_code not between", value1, value2, "depCode");
            return (Criteria) this;
        }

        public Criteria andDepNameIsNull() {
            addCriterion("dep_name is null");
            return (Criteria) this;
        }

        public Criteria andDepNameIsNotNull() {
            addCriterion("dep_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepNameEqualTo(String value) {
            addCriterion("dep_name =", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameNotEqualTo(String value) {
            addCriterion("dep_name <>", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameGreaterThan(String value) {
            addCriterion("dep_name >", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameGreaterThanOrEqualTo(String value) {
            addCriterion("dep_name >=", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameLessThan(String value) {
            addCriterion("dep_name <", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameLessThanOrEqualTo(String value) {
            addCriterion("dep_name <=", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameLike(String value) {
            addCriterion("dep_name like", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameNotLike(String value) {
            addCriterion("dep_name not like", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameIn(List<String> values) {
            addCriterion("dep_name in", values, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameNotIn(List<String> values) {
            addCriterion("dep_name not in", values, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameBetween(String value1, String value2) {
            addCriterion("dep_name between", value1, value2, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameNotBetween(String value1, String value2) {
            addCriterion("dep_name not between", value1, value2, "depName");
            return (Criteria) this;
        }

        public Criteria andDepDescriptionIsNull() {
            addCriterion("dep_description is null");
            return (Criteria) this;
        }

        public Criteria andDepDescriptionIsNotNull() {
            addCriterion("dep_description is not null");
            return (Criteria) this;
        }

        public Criteria andDepDescriptionEqualTo(String value) {
            addCriterion("dep_description =", value, "depDescription");
            return (Criteria) this;
        }

        public Criteria andDepDescriptionNotEqualTo(String value) {
            addCriterion("dep_description <>", value, "depDescription");
            return (Criteria) this;
        }

        public Criteria andDepDescriptionGreaterThan(String value) {
            addCriterion("dep_description >", value, "depDescription");
            return (Criteria) this;
        }

        public Criteria andDepDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("dep_description >=", value, "depDescription");
            return (Criteria) this;
        }

        public Criteria andDepDescriptionLessThan(String value) {
            addCriterion("dep_description <", value, "depDescription");
            return (Criteria) this;
        }

        public Criteria andDepDescriptionLessThanOrEqualTo(String value) {
            addCriterion("dep_description <=", value, "depDescription");
            return (Criteria) this;
        }

        public Criteria andDepDescriptionLike(String value) {
            addCriterion("dep_description like", value, "depDescription");
            return (Criteria) this;
        }

        public Criteria andDepDescriptionNotLike(String value) {
            addCriterion("dep_description not like", value, "depDescription");
            return (Criteria) this;
        }

        public Criteria andDepDescriptionIn(List<String> values) {
            addCriterion("dep_description in", values, "depDescription");
            return (Criteria) this;
        }

        public Criteria andDepDescriptionNotIn(List<String> values) {
            addCriterion("dep_description not in", values, "depDescription");
            return (Criteria) this;
        }

        public Criteria andDepDescriptionBetween(String value1, String value2) {
            addCriterion("dep_description between", value1, value2, "depDescription");
            return (Criteria) this;
        }

        public Criteria andDepDescriptionNotBetween(String value1, String value2) {
            addCriterion("dep_description not between", value1, value2, "depDescription");
            return (Criteria) this;
        }

        public Criteria andDepCreateTimeIsNull() {
            addCriterion("dep_create_time is null");
            return (Criteria) this;
        }

        public Criteria andDepCreateTimeIsNotNull() {
            addCriterion("dep_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andDepCreateTimeEqualTo(Date value) {
            addCriterion("dep_create_time =", value, "depCreateTime");
            return (Criteria) this;
        }

        public Criteria andDepCreateTimeNotEqualTo(Date value) {
            addCriterion("dep_create_time <>", value, "depCreateTime");
            return (Criteria) this;
        }

        public Criteria andDepCreateTimeGreaterThan(Date value) {
            addCriterion("dep_create_time >", value, "depCreateTime");
            return (Criteria) this;
        }

        public Criteria andDepCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dep_create_time >=", value, "depCreateTime");
            return (Criteria) this;
        }

        public Criteria andDepCreateTimeLessThan(Date value) {
            addCriterion("dep_create_time <", value, "depCreateTime");
            return (Criteria) this;
        }

        public Criteria andDepCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("dep_create_time <=", value, "depCreateTime");
            return (Criteria) this;
        }

        public Criteria andDepCreateTimeIn(List<Date> values) {
            addCriterion("dep_create_time in", values, "depCreateTime");
            return (Criteria) this;
        }

        public Criteria andDepCreateTimeNotIn(List<Date> values) {
            addCriterion("dep_create_time not in", values, "depCreateTime");
            return (Criteria) this;
        }

        public Criteria andDepCreateTimeBetween(Date value1, Date value2) {
            addCriterion("dep_create_time between", value1, value2, "depCreateTime");
            return (Criteria) this;
        }

        public Criteria andDepCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("dep_create_time not between", value1, value2, "depCreateTime");
            return (Criteria) this;
        }

        public Criteria andDepLastUpdateTimeIsNull() {
            addCriterion("dep_last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andDepLastUpdateTimeIsNotNull() {
            addCriterion("dep_last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andDepLastUpdateTimeEqualTo(Date value) {
            addCriterion("dep_last_update_time =", value, "depLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDepLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("dep_last_update_time <>", value, "depLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDepLastUpdateTimeGreaterThan(Date value) {
            addCriterion("dep_last_update_time >", value, "depLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDepLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dep_last_update_time >=", value, "depLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDepLastUpdateTimeLessThan(Date value) {
            addCriterion("dep_last_update_time <", value, "depLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDepLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("dep_last_update_time <=", value, "depLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDepLastUpdateTimeIn(List<Date> values) {
            addCriterion("dep_last_update_time in", values, "depLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDepLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("dep_last_update_time not in", values, "depLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDepLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("dep_last_update_time between", value1, value2, "depLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDepLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("dep_last_update_time not between", value1, value2, "depLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDepSimpleNameIsNull() {
            addCriterion("dep_simple_name is null");
            return (Criteria) this;
        }

        public Criteria andDepSimpleNameIsNotNull() {
            addCriterion("dep_simple_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepSimpleNameEqualTo(String value) {
            addCriterion("dep_simple_name =", value, "depSimpleName");
            return (Criteria) this;
        }

        public Criteria andDepSimpleNameNotEqualTo(String value) {
            addCriterion("dep_simple_name <>", value, "depSimpleName");
            return (Criteria) this;
        }

        public Criteria andDepSimpleNameGreaterThan(String value) {
            addCriterion("dep_simple_name >", value, "depSimpleName");
            return (Criteria) this;
        }

        public Criteria andDepSimpleNameGreaterThanOrEqualTo(String value) {
            addCriterion("dep_simple_name >=", value, "depSimpleName");
            return (Criteria) this;
        }

        public Criteria andDepSimpleNameLessThan(String value) {
            addCriterion("dep_simple_name <", value, "depSimpleName");
            return (Criteria) this;
        }

        public Criteria andDepSimpleNameLessThanOrEqualTo(String value) {
            addCriterion("dep_simple_name <=", value, "depSimpleName");
            return (Criteria) this;
        }

        public Criteria andDepSimpleNameLike(String value) {
            addCriterion("dep_simple_name like", value, "depSimpleName");
            return (Criteria) this;
        }

        public Criteria andDepSimpleNameNotLike(String value) {
            addCriterion("dep_simple_name not like", value, "depSimpleName");
            return (Criteria) this;
        }

        public Criteria andDepSimpleNameIn(List<String> values) {
            addCriterion("dep_simple_name in", values, "depSimpleName");
            return (Criteria) this;
        }

        public Criteria andDepSimpleNameNotIn(List<String> values) {
            addCriterion("dep_simple_name not in", values, "depSimpleName");
            return (Criteria) this;
        }

        public Criteria andDepSimpleNameBetween(String value1, String value2) {
            addCriterion("dep_simple_name between", value1, value2, "depSimpleName");
            return (Criteria) this;
        }

        public Criteria andDepSimpleNameNotBetween(String value1, String value2) {
            addCriterion("dep_simple_name not between", value1, value2, "depSimpleName");
            return (Criteria) this;
        }

        public Criteria andDepOrganizationNameIsNull() {
            addCriterion("dep_organization_name is null");
            return (Criteria) this;
        }

        public Criteria andDepOrganizationNameIsNotNull() {
            addCriterion("dep_organization_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepOrganizationNameEqualTo(String value) {
            addCriterion("dep_organization_name =", value, "depOrganizationName");
            return (Criteria) this;
        }

        public Criteria andDepOrganizationNameNotEqualTo(String value) {
            addCriterion("dep_organization_name <>", value, "depOrganizationName");
            return (Criteria) this;
        }

        public Criteria andDepOrganizationNameGreaterThan(String value) {
            addCriterion("dep_organization_name >", value, "depOrganizationName");
            return (Criteria) this;
        }

        public Criteria andDepOrganizationNameGreaterThanOrEqualTo(String value) {
            addCriterion("dep_organization_name >=", value, "depOrganizationName");
            return (Criteria) this;
        }

        public Criteria andDepOrganizationNameLessThan(String value) {
            addCriterion("dep_organization_name <", value, "depOrganizationName");
            return (Criteria) this;
        }

        public Criteria andDepOrganizationNameLessThanOrEqualTo(String value) {
            addCriterion("dep_organization_name <=", value, "depOrganizationName");
            return (Criteria) this;
        }

        public Criteria andDepOrganizationNameLike(String value) {
            addCriterion("dep_organization_name like", value, "depOrganizationName");
            return (Criteria) this;
        }

        public Criteria andDepOrganizationNameNotLike(String value) {
            addCriterion("dep_organization_name not like", value, "depOrganizationName");
            return (Criteria) this;
        }

        public Criteria andDepOrganizationNameIn(List<String> values) {
            addCriterion("dep_organization_name in", values, "depOrganizationName");
            return (Criteria) this;
        }

        public Criteria andDepOrganizationNameNotIn(List<String> values) {
            addCriterion("dep_organization_name not in", values, "depOrganizationName");
            return (Criteria) this;
        }

        public Criteria andDepOrganizationNameBetween(String value1, String value2) {
            addCriterion("dep_organization_name between", value1, value2, "depOrganizationName");
            return (Criteria) this;
        }

        public Criteria andDepOrganizationNameNotBetween(String value1, String value2) {
            addCriterion("dep_organization_name not between", value1, value2, "depOrganizationName");
            return (Criteria) this;
        }

        public Criteria andDepPersonLiableIsNull() {
            addCriterion("dep_person_liable is null");
            return (Criteria) this;
        }

        public Criteria andDepPersonLiableIsNotNull() {
            addCriterion("dep_person_liable is not null");
            return (Criteria) this;
        }

        public Criteria andDepPersonLiableEqualTo(String value) {
            addCriterion("dep_person_liable =", value, "depPersonLiable");
            return (Criteria) this;
        }

        public Criteria andDepPersonLiableNotEqualTo(String value) {
            addCriterion("dep_person_liable <>", value, "depPersonLiable");
            return (Criteria) this;
        }

        public Criteria andDepPersonLiableGreaterThan(String value) {
            addCriterion("dep_person_liable >", value, "depPersonLiable");
            return (Criteria) this;
        }

        public Criteria andDepPersonLiableGreaterThanOrEqualTo(String value) {
            addCriterion("dep_person_liable >=", value, "depPersonLiable");
            return (Criteria) this;
        }

        public Criteria andDepPersonLiableLessThan(String value) {
            addCriterion("dep_person_liable <", value, "depPersonLiable");
            return (Criteria) this;
        }

        public Criteria andDepPersonLiableLessThanOrEqualTo(String value) {
            addCriterion("dep_person_liable <=", value, "depPersonLiable");
            return (Criteria) this;
        }

        public Criteria andDepPersonLiableLike(String value) {
            addCriterion("dep_person_liable like", value, "depPersonLiable");
            return (Criteria) this;
        }

        public Criteria andDepPersonLiableNotLike(String value) {
            addCriterion("dep_person_liable not like", value, "depPersonLiable");
            return (Criteria) this;
        }

        public Criteria andDepPersonLiableIn(List<String> values) {
            addCriterion("dep_person_liable in", values, "depPersonLiable");
            return (Criteria) this;
        }

        public Criteria andDepPersonLiableNotIn(List<String> values) {
            addCriterion("dep_person_liable not in", values, "depPersonLiable");
            return (Criteria) this;
        }

        public Criteria andDepPersonLiableBetween(String value1, String value2) {
            addCriterion("dep_person_liable between", value1, value2, "depPersonLiable");
            return (Criteria) this;
        }

        public Criteria andDepPersonLiableNotBetween(String value1, String value2) {
            addCriterion("dep_person_liable not between", value1, value2, "depPersonLiable");
            return (Criteria) this;
        }

        public Criteria andDepOrganizationIdIsNull() {
            addCriterion("dep_organization_id is null");
            return (Criteria) this;
        }

        public Criteria andDepOrganizationIdIsNotNull() {
            addCriterion("dep_organization_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepOrganizationIdEqualTo(String value) {
            addCriterion("dep_organization_id =", value, "depOrganizationId");
            return (Criteria) this;
        }

        public Criteria andDepOrganizationIdNotEqualTo(String value) {
            addCriterion("dep_organization_id <>", value, "depOrganizationId");
            return (Criteria) this;
        }

        public Criteria andDepOrganizationIdGreaterThan(String value) {
            addCriterion("dep_organization_id >", value, "depOrganizationId");
            return (Criteria) this;
        }

        public Criteria andDepOrganizationIdGreaterThanOrEqualTo(String value) {
            addCriterion("dep_organization_id >=", value, "depOrganizationId");
            return (Criteria) this;
        }

        public Criteria andDepOrganizationIdLessThan(String value) {
            addCriterion("dep_organization_id <", value, "depOrganizationId");
            return (Criteria) this;
        }

        public Criteria andDepOrganizationIdLessThanOrEqualTo(String value) {
            addCriterion("dep_organization_id <=", value, "depOrganizationId");
            return (Criteria) this;
        }

        public Criteria andDepOrganizationIdLike(String value) {
            addCriterion("dep_organization_id like", value, "depOrganizationId");
            return (Criteria) this;
        }

        public Criteria andDepOrganizationIdNotLike(String value) {
            addCriterion("dep_organization_id not like", value, "depOrganizationId");
            return (Criteria) this;
        }

        public Criteria andDepOrganizationIdIn(List<String> values) {
            addCriterion("dep_organization_id in", values, "depOrganizationId");
            return (Criteria) this;
        }

        public Criteria andDepOrganizationIdNotIn(List<String> values) {
            addCriterion("dep_organization_id not in", values, "depOrganizationId");
            return (Criteria) this;
        }

        public Criteria andDepOrganizationIdBetween(String value1, String value2) {
            addCriterion("dep_organization_id between", value1, value2, "depOrganizationId");
            return (Criteria) this;
        }

        public Criteria andDepOrganizationIdNotBetween(String value1, String value2) {
            addCriterion("dep_organization_id not between", value1, value2, "depOrganizationId");
            return (Criteria) this;
        }

        public Criteria andDepRankIsNull() {
            addCriterion("dep_rank is null");
            return (Criteria) this;
        }

        public Criteria andDepRankIsNotNull() {
            addCriterion("dep_rank is not null");
            return (Criteria) this;
        }

        public Criteria andDepRankEqualTo(Integer value) {
            addCriterion("dep_rank =", value, "depRank");
            return (Criteria) this;
        }

        public Criteria andDepRankNotEqualTo(Integer value) {
            addCriterion("dep_rank <>", value, "depRank");
            return (Criteria) this;
        }

        public Criteria andDepRankGreaterThan(Integer value) {
            addCriterion("dep_rank >", value, "depRank");
            return (Criteria) this;
        }

        public Criteria andDepRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("dep_rank >=", value, "depRank");
            return (Criteria) this;
        }

        public Criteria andDepRankLessThan(Integer value) {
            addCriterion("dep_rank <", value, "depRank");
            return (Criteria) this;
        }

        public Criteria andDepRankLessThanOrEqualTo(Integer value) {
            addCriterion("dep_rank <=", value, "depRank");
            return (Criteria) this;
        }

        public Criteria andDepRankIn(List<Integer> values) {
            addCriterion("dep_rank in", values, "depRank");
            return (Criteria) this;
        }

        public Criteria andDepRankNotIn(List<Integer> values) {
            addCriterion("dep_rank not in", values, "depRank");
            return (Criteria) this;
        }

        public Criteria andDepRankBetween(Integer value1, Integer value2) {
            addCriterion("dep_rank between", value1, value2, "depRank");
            return (Criteria) this;
        }

        public Criteria andDepRankNotBetween(Integer value1, Integer value2) {
            addCriterion("dep_rank not between", value1, value2, "depRank");
            return (Criteria) this;
        }

        public Criteria andDepNumberReadingIsNull() {
            addCriterion("dep_number_reading is null");
            return (Criteria) this;
        }

        public Criteria andDepNumberReadingIsNotNull() {
            addCriterion("dep_number_reading is not null");
            return (Criteria) this;
        }

        public Criteria andDepNumberReadingEqualTo(Integer value) {
            addCriterion("dep_number_reading =", value, "depNumberReading");
            return (Criteria) this;
        }

        public Criteria andDepNumberReadingNotEqualTo(Integer value) {
            addCriterion("dep_number_reading <>", value, "depNumberReading");
            return (Criteria) this;
        }

        public Criteria andDepNumberReadingGreaterThan(Integer value) {
            addCriterion("dep_number_reading >", value, "depNumberReading");
            return (Criteria) this;
        }

        public Criteria andDepNumberReadingGreaterThanOrEqualTo(Integer value) {
            addCriterion("dep_number_reading >=", value, "depNumberReading");
            return (Criteria) this;
        }

        public Criteria andDepNumberReadingLessThan(Integer value) {
            addCriterion("dep_number_reading <", value, "depNumberReading");
            return (Criteria) this;
        }

        public Criteria andDepNumberReadingLessThanOrEqualTo(Integer value) {
            addCriterion("dep_number_reading <=", value, "depNumberReading");
            return (Criteria) this;
        }

        public Criteria andDepNumberReadingIn(List<Integer> values) {
            addCriterion("dep_number_reading in", values, "depNumberReading");
            return (Criteria) this;
        }

        public Criteria andDepNumberReadingNotIn(List<Integer> values) {
            addCriterion("dep_number_reading not in", values, "depNumberReading");
            return (Criteria) this;
        }

        public Criteria andDepNumberReadingBetween(Integer value1, Integer value2) {
            addCriterion("dep_number_reading between", value1, value2, "depNumberReading");
            return (Criteria) this;
        }

        public Criteria andDepNumberReadingNotBetween(Integer value1, Integer value2) {
            addCriterion("dep_number_reading not between", value1, value2, "depNumberReading");
            return (Criteria) this;
        }

        public Criteria andDepPersonLiableNameIsNull() {
            addCriterion("dep_person_liable_name is null");
            return (Criteria) this;
        }

        public Criteria andDepPersonLiableNameIsNotNull() {
            addCriterion("dep_person_liable_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepPersonLiableNameEqualTo(String value) {
            addCriterion("dep_person_liable_name =", value, "depPersonLiableName");
            return (Criteria) this;
        }

        public Criteria andDepPersonLiableNameNotEqualTo(String value) {
            addCriterion("dep_person_liable_name <>", value, "depPersonLiableName");
            return (Criteria) this;
        }

        public Criteria andDepPersonLiableNameGreaterThan(String value) {
            addCriterion("dep_person_liable_name >", value, "depPersonLiableName");
            return (Criteria) this;
        }

        public Criteria andDepPersonLiableNameGreaterThanOrEqualTo(String value) {
            addCriterion("dep_person_liable_name >=", value, "depPersonLiableName");
            return (Criteria) this;
        }

        public Criteria andDepPersonLiableNameLessThan(String value) {
            addCriterion("dep_person_liable_name <", value, "depPersonLiableName");
            return (Criteria) this;
        }

        public Criteria andDepPersonLiableNameLessThanOrEqualTo(String value) {
            addCriterion("dep_person_liable_name <=", value, "depPersonLiableName");
            return (Criteria) this;
        }

        public Criteria andDepPersonLiableNameLike(String value) {
            addCriterion("dep_person_liable_name like", value, "depPersonLiableName");
            return (Criteria) this;
        }

        public Criteria andDepPersonLiableNameNotLike(String value) {
            addCriterion("dep_person_liable_name not like", value, "depPersonLiableName");
            return (Criteria) this;
        }

        public Criteria andDepPersonLiableNameIn(List<String> values) {
            addCriterion("dep_person_liable_name in", values, "depPersonLiableName");
            return (Criteria) this;
        }

        public Criteria andDepPersonLiableNameNotIn(List<String> values) {
            addCriterion("dep_person_liable_name not in", values, "depPersonLiableName");
            return (Criteria) this;
        }

        public Criteria andDepPersonLiableNameBetween(String value1, String value2) {
            addCriterion("dep_person_liable_name between", value1, value2, "depPersonLiableName");
            return (Criteria) this;
        }

        public Criteria andDepPersonLiableNameNotBetween(String value1, String value2) {
            addCriterion("dep_person_liable_name not between", value1, value2, "depPersonLiableName");
            return (Criteria) this;
        }

        public Criteria andRolIdIsNull() {
            addCriterion("rol_id is null");
            return (Criteria) this;
        }

        public Criteria andRolIdIsNotNull() {
            addCriterion("rol_id is not null");
            return (Criteria) this;
        }

        public Criteria andRolIdEqualTo(String value) {
            addCriterion("rol_id =", value, "rolId");
            return (Criteria) this;
        }

        public Criteria andRolIdNotEqualTo(String value) {
            addCriterion("rol_id <>", value, "rolId");
            return (Criteria) this;
        }

        public Criteria andRolIdGreaterThan(String value) {
            addCriterion("rol_id >", value, "rolId");
            return (Criteria) this;
        }

        public Criteria andRolIdGreaterThanOrEqualTo(String value) {
            addCriterion("rol_id >=", value, "rolId");
            return (Criteria) this;
        }

        public Criteria andRolIdLessThan(String value) {
            addCriterion("rol_id <", value, "rolId");
            return (Criteria) this;
        }

        public Criteria andRolIdLessThanOrEqualTo(String value) {
            addCriterion("rol_id <=", value, "rolId");
            return (Criteria) this;
        }

        public Criteria andRolIdLike(String value) {
            addCriterion("rol_id like", value, "rolId");
            return (Criteria) this;
        }

        public Criteria andRolIdNotLike(String value) {
            addCriterion("rol_id not like", value, "rolId");
            return (Criteria) this;
        }

        public Criteria andRolIdIn(List<String> values) {
            addCriterion("rol_id in", values, "rolId");
            return (Criteria) this;
        }

        public Criteria andRolIdNotIn(List<String> values) {
            addCriterion("rol_id not in", values, "rolId");
            return (Criteria) this;
        }

        public Criteria andRolIdBetween(String value1, String value2) {
            addCriterion("rol_id between", value1, value2, "rolId");
            return (Criteria) this;
        }

        public Criteria andRolIdNotBetween(String value1, String value2) {
            addCriterion("rol_id not between", value1, value2, "rolId");
            return (Criteria) this;
        }

        public Criteria andRolNameIsNull() {
            addCriterion("rol_name is null");
            return (Criteria) this;
        }

        public Criteria andRolNameIsNotNull() {
            addCriterion("rol_name is not null");
            return (Criteria) this;
        }

        public Criteria andRolNameEqualTo(String value) {
            addCriterion("rol_name =", value, "rolName");
            return (Criteria) this;
        }

        public Criteria andRolNameNotEqualTo(String value) {
            addCriterion("rol_name <>", value, "rolName");
            return (Criteria) this;
        }

        public Criteria andRolNameGreaterThan(String value) {
            addCriterion("rol_name >", value, "rolName");
            return (Criteria) this;
        }

        public Criteria andRolNameGreaterThanOrEqualTo(String value) {
            addCriterion("rol_name >=", value, "rolName");
            return (Criteria) this;
        }

        public Criteria andRolNameLessThan(String value) {
            addCriterion("rol_name <", value, "rolName");
            return (Criteria) this;
        }

        public Criteria andRolNameLessThanOrEqualTo(String value) {
            addCriterion("rol_name <=", value, "rolName");
            return (Criteria) this;
        }

        public Criteria andRolNameLike(String value) {
            addCriterion("rol_name like", value, "rolName");
            return (Criteria) this;
        }

        public Criteria andRolNameNotLike(String value) {
            addCriterion("rol_name not like", value, "rolName");
            return (Criteria) this;
        }

        public Criteria andRolNameIn(List<String> values) {
            addCriterion("rol_name in", values, "rolName");
            return (Criteria) this;
        }

        public Criteria andRolNameNotIn(List<String> values) {
            addCriterion("rol_name not in", values, "rolName");
            return (Criteria) this;
        }

        public Criteria andRolNameBetween(String value1, String value2) {
            addCriterion("rol_name between", value1, value2, "rolName");
            return (Criteria) this;
        }

        public Criteria andRolNameNotBetween(String value1, String value2) {
            addCriterion("rol_name not between", value1, value2, "rolName");
            return (Criteria) this;
        }

        public Criteria andRolDescriptionIsNull() {
            addCriterion("rol_description is null");
            return (Criteria) this;
        }

        public Criteria andRolDescriptionIsNotNull() {
            addCriterion("rol_description is not null");
            return (Criteria) this;
        }

        public Criteria andRolDescriptionEqualTo(String value) {
            addCriterion("rol_description =", value, "rolDescription");
            return (Criteria) this;
        }

        public Criteria andRolDescriptionNotEqualTo(String value) {
            addCriterion("rol_description <>", value, "rolDescription");
            return (Criteria) this;
        }

        public Criteria andRolDescriptionGreaterThan(String value) {
            addCriterion("rol_description >", value, "rolDescription");
            return (Criteria) this;
        }

        public Criteria andRolDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("rol_description >=", value, "rolDescription");
            return (Criteria) this;
        }

        public Criteria andRolDescriptionLessThan(String value) {
            addCriterion("rol_description <", value, "rolDescription");
            return (Criteria) this;
        }

        public Criteria andRolDescriptionLessThanOrEqualTo(String value) {
            addCriterion("rol_description <=", value, "rolDescription");
            return (Criteria) this;
        }

        public Criteria andRolDescriptionLike(String value) {
            addCriterion("rol_description like", value, "rolDescription");
            return (Criteria) this;
        }

        public Criteria andRolDescriptionNotLike(String value) {
            addCriterion("rol_description not like", value, "rolDescription");
            return (Criteria) this;
        }

        public Criteria andRolDescriptionIn(List<String> values) {
            addCriterion("rol_description in", values, "rolDescription");
            return (Criteria) this;
        }

        public Criteria andRolDescriptionNotIn(List<String> values) {
            addCriterion("rol_description not in", values, "rolDescription");
            return (Criteria) this;
        }

        public Criteria andRolDescriptionBetween(String value1, String value2) {
            addCriterion("rol_description between", value1, value2, "rolDescription");
            return (Criteria) this;
        }

        public Criteria andRolDescriptionNotBetween(String value1, String value2) {
            addCriterion("rol_description not between", value1, value2, "rolDescription");
            return (Criteria) this;
        }

        public Criteria andRolCreateTimeIsNull() {
            addCriterion("rol_create_time is null");
            return (Criteria) this;
        }

        public Criteria andRolCreateTimeIsNotNull() {
            addCriterion("rol_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andRolCreateTimeEqualTo(Date value) {
            addCriterion("rol_create_time =", value, "rolCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolCreateTimeNotEqualTo(Date value) {
            addCriterion("rol_create_time <>", value, "rolCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolCreateTimeGreaterThan(Date value) {
            addCriterion("rol_create_time >", value, "rolCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rol_create_time >=", value, "rolCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolCreateTimeLessThan(Date value) {
            addCriterion("rol_create_time <", value, "rolCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("rol_create_time <=", value, "rolCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolCreateTimeIn(List<Date> values) {
            addCriterion("rol_create_time in", values, "rolCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolCreateTimeNotIn(List<Date> values) {
            addCriterion("rol_create_time not in", values, "rolCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolCreateTimeBetween(Date value1, Date value2) {
            addCriterion("rol_create_time between", value1, value2, "rolCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("rol_create_time not between", value1, value2, "rolCreateTime");
            return (Criteria) this;
        }

        public Criteria andRolGradeIsNull() {
            addCriterion("rol_grade is null");
            return (Criteria) this;
        }

        public Criteria andRolGradeIsNotNull() {
            addCriterion("rol_grade is not null");
            return (Criteria) this;
        }

        public Criteria andRolGradeEqualTo(Integer value) {
            addCriterion("rol_grade =", value, "rolGrade");
            return (Criteria) this;
        }

        public Criteria andRolGradeNotEqualTo(Integer value) {
            addCriterion("rol_grade <>", value, "rolGrade");
            return (Criteria) this;
        }

        public Criteria andRolGradeGreaterThan(Integer value) {
            addCriterion("rol_grade >", value, "rolGrade");
            return (Criteria) this;
        }

        public Criteria andRolGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("rol_grade >=", value, "rolGrade");
            return (Criteria) this;
        }

        public Criteria andRolGradeLessThan(Integer value) {
            addCriterion("rol_grade <", value, "rolGrade");
            return (Criteria) this;
        }

        public Criteria andRolGradeLessThanOrEqualTo(Integer value) {
            addCriterion("rol_grade <=", value, "rolGrade");
            return (Criteria) this;
        }

        public Criteria andRolGradeIn(List<Integer> values) {
            addCriterion("rol_grade in", values, "rolGrade");
            return (Criteria) this;
        }

        public Criteria andRolGradeNotIn(List<Integer> values) {
            addCriterion("rol_grade not in", values, "rolGrade");
            return (Criteria) this;
        }

        public Criteria andRolGradeBetween(Integer value1, Integer value2) {
            addCriterion("rol_grade between", value1, value2, "rolGrade");
            return (Criteria) this;
        }

        public Criteria andRolGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("rol_grade not between", value1, value2, "rolGrade");
            return (Criteria) this;
        }

        public Criteria andRolAbbreviationIsNull() {
            addCriterion("rol_abbreviation is null");
            return (Criteria) this;
        }

        public Criteria andRolAbbreviationIsNotNull() {
            addCriterion("rol_abbreviation is not null");
            return (Criteria) this;
        }

        public Criteria andRolAbbreviationEqualTo(String value) {
            addCriterion("rol_abbreviation =", value, "rolAbbreviation");
            return (Criteria) this;
        }

        public Criteria andRolAbbreviationNotEqualTo(String value) {
            addCriterion("rol_abbreviation <>", value, "rolAbbreviation");
            return (Criteria) this;
        }

        public Criteria andRolAbbreviationGreaterThan(String value) {
            addCriterion("rol_abbreviation >", value, "rolAbbreviation");
            return (Criteria) this;
        }

        public Criteria andRolAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("rol_abbreviation >=", value, "rolAbbreviation");
            return (Criteria) this;
        }

        public Criteria andRolAbbreviationLessThan(String value) {
            addCriterion("rol_abbreviation <", value, "rolAbbreviation");
            return (Criteria) this;
        }

        public Criteria andRolAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("rol_abbreviation <=", value, "rolAbbreviation");
            return (Criteria) this;
        }

        public Criteria andRolAbbreviationLike(String value) {
            addCriterion("rol_abbreviation like", value, "rolAbbreviation");
            return (Criteria) this;
        }

        public Criteria andRolAbbreviationNotLike(String value) {
            addCriterion("rol_abbreviation not like", value, "rolAbbreviation");
            return (Criteria) this;
        }

        public Criteria andRolAbbreviationIn(List<String> values) {
            addCriterion("rol_abbreviation in", values, "rolAbbreviation");
            return (Criteria) this;
        }

        public Criteria andRolAbbreviationNotIn(List<String> values) {
            addCriterion("rol_abbreviation not in", values, "rolAbbreviation");
            return (Criteria) this;
        }

        public Criteria andRolAbbreviationBetween(String value1, String value2) {
            addCriterion("rol_abbreviation between", value1, value2, "rolAbbreviation");
            return (Criteria) this;
        }

        public Criteria andRolAbbreviationNotBetween(String value1, String value2) {
            addCriterion("rol_abbreviation not between", value1, value2, "rolAbbreviation");
            return (Criteria) this;
        }

        public Criteria andRolLastUpdateTimeIsNull() {
            addCriterion("rol_last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andRolLastUpdateTimeIsNotNull() {
            addCriterion("rol_last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andRolLastUpdateTimeEqualTo(Date value) {
            addCriterion("rol_last_update_time =", value, "rolLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRolLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("rol_last_update_time <>", value, "rolLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRolLastUpdateTimeGreaterThan(Date value) {
            addCriterion("rol_last_update_time >", value, "rolLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRolLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rol_last_update_time >=", value, "rolLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRolLastUpdateTimeLessThan(Date value) {
            addCriterion("rol_last_update_time <", value, "rolLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRolLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("rol_last_update_time <=", value, "rolLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRolLastUpdateTimeIn(List<Date> values) {
            addCriterion("rol_last_update_time in", values, "rolLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRolLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("rol_last_update_time not in", values, "rolLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRolLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("rol_last_update_time between", value1, value2, "rolLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRolLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("rol_last_update_time not between", value1, value2, "rolLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRolRankIsNull() {
            addCriterion("rol_rank is null");
            return (Criteria) this;
        }

        public Criteria andRolRankIsNotNull() {
            addCriterion("rol_rank is not null");
            return (Criteria) this;
        }

        public Criteria andRolRankEqualTo(Integer value) {
            addCriterion("rol_rank =", value, "rolRank");
            return (Criteria) this;
        }

        public Criteria andRolRankNotEqualTo(Integer value) {
            addCriterion("rol_rank <>", value, "rolRank");
            return (Criteria) this;
        }

        public Criteria andRolRankGreaterThan(Integer value) {
            addCriterion("rol_rank >", value, "rolRank");
            return (Criteria) this;
        }

        public Criteria andRolRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("rol_rank >=", value, "rolRank");
            return (Criteria) this;
        }

        public Criteria andRolRankLessThan(Integer value) {
            addCriterion("rol_rank <", value, "rolRank");
            return (Criteria) this;
        }

        public Criteria andRolRankLessThanOrEqualTo(Integer value) {
            addCriterion("rol_rank <=", value, "rolRank");
            return (Criteria) this;
        }

        public Criteria andRolRankIn(List<Integer> values) {
            addCriterion("rol_rank in", values, "rolRank");
            return (Criteria) this;
        }

        public Criteria andRolRankNotIn(List<Integer> values) {
            addCriterion("rol_rank not in", values, "rolRank");
            return (Criteria) this;
        }

        public Criteria andRolRankBetween(Integer value1, Integer value2) {
            addCriterion("rol_rank between", value1, value2, "rolRank");
            return (Criteria) this;
        }

        public Criteria andRolRankNotBetween(Integer value1, Integer value2) {
            addCriterion("rol_rank not between", value1, value2, "rolRank");
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