package com.haomostudio.JuniorSpringMVCTemplate.po;

import com.haomo.plugin.Page;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CcNotificationSettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public CcNotificationSettingExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andRemindingTimeIsNull() {
            addCriterion("reminding_time is null");
            return (Criteria) this;
        }

        public Criteria andRemindingTimeIsNotNull() {
            addCriterion("reminding_time is not null");
            return (Criteria) this;
        }

        public Criteria andRemindingTimeEqualTo(Integer value) {
            addCriterion("reminding_time =", value, "remindingTime");
            return (Criteria) this;
        }

        public Criteria andRemindingTimeNotEqualTo(Integer value) {
            addCriterion("reminding_time <>", value, "remindingTime");
            return (Criteria) this;
        }

        public Criteria andRemindingTimeGreaterThan(Integer value) {
            addCriterion("reminding_time >", value, "remindingTime");
            return (Criteria) this;
        }

        public Criteria andRemindingTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("reminding_time >=", value, "remindingTime");
            return (Criteria) this;
        }

        public Criteria andRemindingTimeLessThan(Integer value) {
            addCriterion("reminding_time <", value, "remindingTime");
            return (Criteria) this;
        }

        public Criteria andRemindingTimeLessThanOrEqualTo(Integer value) {
            addCriterion("reminding_time <=", value, "remindingTime");
            return (Criteria) this;
        }

        public Criteria andRemindingTimeIn(List<Integer> values) {
            addCriterion("reminding_time in", values, "remindingTime");
            return (Criteria) this;
        }

        public Criteria andRemindingTimeNotIn(List<Integer> values) {
            addCriterion("reminding_time not in", values, "remindingTime");
            return (Criteria) this;
        }

        public Criteria andRemindingTimeBetween(Integer value1, Integer value2) {
            addCriterion("reminding_time between", value1, value2, "remindingTime");
            return (Criteria) this;
        }

        public Criteria andRemindingTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("reminding_time not between", value1, value2, "remindingTime");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andWhetherRemindingIsNull() {
            addCriterion("whether_reminding is null");
            return (Criteria) this;
        }

        public Criteria andWhetherRemindingIsNotNull() {
            addCriterion("whether_reminding is not null");
            return (Criteria) this;
        }

        public Criteria andWhetherRemindingEqualTo(String value) {
            addCriterion("whether_reminding =", value, "whetherReminding");
            return (Criteria) this;
        }

        public Criteria andWhetherRemindingNotEqualTo(String value) {
            addCriterion("whether_reminding <>", value, "whetherReminding");
            return (Criteria) this;
        }

        public Criteria andWhetherRemindingGreaterThan(String value) {
            addCriterion("whether_reminding >", value, "whetherReminding");
            return (Criteria) this;
        }

        public Criteria andWhetherRemindingGreaterThanOrEqualTo(String value) {
            addCriterion("whether_reminding >=", value, "whetherReminding");
            return (Criteria) this;
        }

        public Criteria andWhetherRemindingLessThan(String value) {
            addCriterion("whether_reminding <", value, "whetherReminding");
            return (Criteria) this;
        }

        public Criteria andWhetherRemindingLessThanOrEqualTo(String value) {
            addCriterion("whether_reminding <=", value, "whetherReminding");
            return (Criteria) this;
        }

        public Criteria andWhetherRemindingLike(String value) {
            addCriterion("whether_reminding like", value, "whetherReminding");
            return (Criteria) this;
        }

        public Criteria andWhetherRemindingNotLike(String value) {
            addCriterion("whether_reminding not like", value, "whetherReminding");
            return (Criteria) this;
        }

        public Criteria andWhetherRemindingIn(List<String> values) {
            addCriterion("whether_reminding in", values, "whetherReminding");
            return (Criteria) this;
        }

        public Criteria andWhetherRemindingNotIn(List<String> values) {
            addCriterion("whether_reminding not in", values, "whetherReminding");
            return (Criteria) this;
        }

        public Criteria andWhetherRemindingBetween(String value1, String value2) {
            addCriterion("whether_reminding between", value1, value2, "whetherReminding");
            return (Criteria) this;
        }

        public Criteria andWhetherRemindingNotBetween(String value1, String value2) {
            addCriterion("whether_reminding not between", value1, value2, "whetherReminding");
            return (Criteria) this;
        }

        public Criteria andReminderModuleIsNull() {
            addCriterion("reminder_module is null");
            return (Criteria) this;
        }

        public Criteria andReminderModuleIsNotNull() {
            addCriterion("reminder_module is not null");
            return (Criteria) this;
        }

        public Criteria andReminderModuleEqualTo(String value) {
            addCriterion("reminder_module =", value, "reminderModule");
            return (Criteria) this;
        }

        public Criteria andReminderModuleNotEqualTo(String value) {
            addCriterion("reminder_module <>", value, "reminderModule");
            return (Criteria) this;
        }

        public Criteria andReminderModuleGreaterThan(String value) {
            addCriterion("reminder_module >", value, "reminderModule");
            return (Criteria) this;
        }

        public Criteria andReminderModuleGreaterThanOrEqualTo(String value) {
            addCriterion("reminder_module >=", value, "reminderModule");
            return (Criteria) this;
        }

        public Criteria andReminderModuleLessThan(String value) {
            addCriterion("reminder_module <", value, "reminderModule");
            return (Criteria) this;
        }

        public Criteria andReminderModuleLessThanOrEqualTo(String value) {
            addCriterion("reminder_module <=", value, "reminderModule");
            return (Criteria) this;
        }

        public Criteria andReminderModuleLike(String value) {
            addCriterion("reminder_module like", value, "reminderModule");
            return (Criteria) this;
        }

        public Criteria andReminderModuleNotLike(String value) {
            addCriterion("reminder_module not like", value, "reminderModule");
            return (Criteria) this;
        }

        public Criteria andReminderModuleIn(List<String> values) {
            addCriterion("reminder_module in", values, "reminderModule");
            return (Criteria) this;
        }

        public Criteria andReminderModuleNotIn(List<String> values) {
            addCriterion("reminder_module not in", values, "reminderModule");
            return (Criteria) this;
        }

        public Criteria andReminderModuleBetween(String value1, String value2) {
            addCriterion("reminder_module between", value1, value2, "reminderModule");
            return (Criteria) this;
        }

        public Criteria andReminderModuleNotBetween(String value1, String value2) {
            addCriterion("reminder_module not between", value1, value2, "reminderModule");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNull() {
            addCriterion("people is null");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNotNull() {
            addCriterion("people is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleEqualTo(String value) {
            addCriterion("people =", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotEqualTo(String value) {
            addCriterion("people <>", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThan(String value) {
            addCriterion("people >", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("people >=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThan(String value) {
            addCriterion("people <", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThanOrEqualTo(String value) {
            addCriterion("people <=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLike(String value) {
            addCriterion("people like", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotLike(String value) {
            addCriterion("people not like", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleIn(List<String> values) {
            addCriterion("people in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotIn(List<String> values) {
            addCriterion("people not in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleBetween(String value1, String value2) {
            addCriterion("people between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotBetween(String value1, String value2) {
            addCriterion("people not between", value1, value2, "people");
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