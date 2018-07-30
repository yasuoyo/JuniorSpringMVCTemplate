package com.haomostudio.JuniorSpringMVCTemplate.po;

import java.util.Date;

public class Organization {
    private String id;

    private String name;

    private Date createTime;

    private Date lastUpdateTime;

    private Integer rank;

    private String createPeple;

    private String linkToken;

    private String whetherInside;

    private String communityId;

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

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getCreatePeple() {
        return createPeple;
    }

    public void setCreatePeple(String createPeple) {
        this.createPeple = createPeple;
    }

    public String getLinkToken() {
        return linkToken;
    }

    public void setLinkToken(String linkToken) {
        this.linkToken = linkToken;
    }

    public String getWhetherInside() {
        return whetherInside;
    }

    public void setWhetherInside(String whetherInside) {
        this.whetherInside = whetherInside;
    }

    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", rank=").append(rank);
        sb.append(", createPeple=").append(createPeple);
        sb.append(", linkToken=").append(linkToken);
        sb.append(", whetherInside=").append(whetherInside);
        sb.append(", communityId=").append(communityId);
        sb.append("]");
        return sb.toString();
    }
}