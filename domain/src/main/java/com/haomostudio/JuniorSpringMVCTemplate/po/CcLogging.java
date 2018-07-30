package com.haomostudio.JuniorSpringMVCTemplate.po;

import java.util.Date;

public class CcLogging {
    private String id;

    private String operator;

    private Date loginTimePeriod;

    private Date operatingTimePeriod;

    private String loginType;

    private String typeOperation;

    private String operatingModule;

    private String affiliation;

    private String theirDepartment;

    private String logContent;

    private Date createTime;

    private Date lastUpdateTime;

    private String operatorId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Date getLoginTimePeriod() {
        return loginTimePeriod;
    }

    public void setLoginTimePeriod(Date loginTimePeriod) {
        this.loginTimePeriod = loginTimePeriod;
    }

    public Date getOperatingTimePeriod() {
        return operatingTimePeriod;
    }

    public void setOperatingTimePeriod(Date operatingTimePeriod) {
        this.operatingTimePeriod = operatingTimePeriod;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(String typeOperation) {
        this.typeOperation = typeOperation;
    }

    public String getOperatingModule() {
        return operatingModule;
    }

    public void setOperatingModule(String operatingModule) {
        this.operatingModule = operatingModule;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getTheirDepartment() {
        return theirDepartment;
    }

    public void setTheirDepartment(String theirDepartment) {
        this.theirDepartment = theirDepartment;
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", operator=").append(operator);
        sb.append(", loginTimePeriod=").append(loginTimePeriod);
        sb.append(", operatingTimePeriod=").append(operatingTimePeriod);
        sb.append(", loginType=").append(loginType);
        sb.append(", typeOperation=").append(typeOperation);
        sb.append(", operatingModule=").append(operatingModule);
        sb.append(", affiliation=").append(affiliation);
        sb.append(", theirDepartment=").append(theirDepartment);
        sb.append(", logContent=").append(logContent);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", operatorId=").append(operatorId);
        sb.append("]");
        return sb.toString();
    }
}