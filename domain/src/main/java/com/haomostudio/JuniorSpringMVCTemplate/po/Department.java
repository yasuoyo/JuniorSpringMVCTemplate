package com.haomostudio.JuniorSpringMVCTemplate.po;

import java.util.Date;

public class Department {
    private String id;

    private String parentDepartmentCode;

    private String code;

    private String name;

    private String description;

    private Date createTime;

    private Date lastUpdateTime;

    private String simpleName;

    private String organizationName;

    private String personLiable;

    private String organizationId;

    private Integer rank;

    private Integer numberReading;

    private String personLiableName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentDepartmentCode() {
        return parentDepartmentCode;
    }

    public void setParentDepartmentCode(String parentDepartmentCode) {
        this.parentDepartmentCode = parentDepartmentCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getPersonLiable() {
        return personLiable;
    }

    public void setPersonLiable(String personLiable) {
        this.personLiable = personLiable;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getNumberReading() {
        return numberReading;
    }

    public void setNumberReading(Integer numberReading) {
        this.numberReading = numberReading;
    }

    public String getPersonLiableName() {
        return personLiableName;
    }

    public void setPersonLiableName(String personLiableName) {
        this.personLiableName = personLiableName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentDepartmentCode=").append(parentDepartmentCode);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", simpleName=").append(simpleName);
        sb.append(", organizationName=").append(organizationName);
        sb.append(", personLiable=").append(personLiable);
        sb.append(", organizationId=").append(organizationId);
        sb.append(", rank=").append(rank);
        sb.append(", numberReading=").append(numberReading);
        sb.append(", personLiableName=").append(personLiableName);
        sb.append("]");
        return sb.toString();
    }
}