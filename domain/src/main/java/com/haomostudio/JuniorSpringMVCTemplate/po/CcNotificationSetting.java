package com.haomostudio.JuniorSpringMVCTemplate.po;

import java.util.Date;

public class CcNotificationSetting {
    private String id;

    private String name;

    private Integer remindingTime;

    private String type;

    private Date createTime;

    private String whetherReminding;

    private String reminderModule;

    private String people;

    private Integer rank;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRemindingTime() {
        return remindingTime;
    }

    public void setRemindingTime(Integer remindingTime) {
        this.remindingTime = remindingTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getWhetherReminding() {
        return whetherReminding;
    }

    public void setWhetherReminding(String whetherReminding) {
        this.whetherReminding = whetherReminding;
    }

    public String getReminderModule() {
        return reminderModule;
    }

    public void setReminderModule(String reminderModule) {
        this.reminderModule = reminderModule;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", remindingTime=").append(remindingTime);
        sb.append(", type=").append(type);
        sb.append(", createTime=").append(createTime);
        sb.append(", whetherReminding=").append(whetherReminding);
        sb.append(", reminderModule=").append(reminderModule);
        sb.append(", people=").append(people);
        sb.append(", rank=").append(rank);
        sb.append("]");
        return sb.toString();
    }
}