package com.haomostudio.JuniorSpringMVCTemplate.po;

import java.util.Date;

public class Team {
    private String id;

    private String logo;

    private String description;

    private Date createTime;

    private Date lastUpdateTime;

    private String creatorId;

    private String name;

    private Integer isDesign;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
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

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIsDesign() {
        return isDesign;
    }

    public void setIsDesign(Integer isDesign) {
        this.isDesign = isDesign;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", logo=").append(logo);
        sb.append(", description=").append(description);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", creatorId=").append(creatorId);
        sb.append(", name=").append(name);
        sb.append(", isDesign=").append(isDesign);
        sb.append("]");
        return sb.toString();
    }
}