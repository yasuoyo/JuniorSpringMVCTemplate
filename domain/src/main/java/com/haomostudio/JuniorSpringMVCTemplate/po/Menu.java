package com.haomostudio.JuniorSpringMVCTemplate.po;

import java.util.Date;

public class Menu {
    private String id;

    private String name;

    private String menuLogo;

    private String superiorMenuId;

    private Integer grade;

    private Date createTime;

    private String link;

    private String type;

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

    public String getMenuLogo() {
        return menuLogo;
    }

    public void setMenuLogo(String menuLogo) {
        this.menuLogo = menuLogo;
    }

    public String getSuperiorMenuId() {
        return superiorMenuId;
    }

    public void setSuperiorMenuId(String superiorMenuId) {
        this.superiorMenuId = superiorMenuId;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        sb.append(", menuLogo=").append(menuLogo);
        sb.append(", superiorMenuId=").append(superiorMenuId);
        sb.append(", grade=").append(grade);
        sb.append(", createTime=").append(createTime);
        sb.append(", link=").append(link);
        sb.append(", type=").append(type);
        sb.append(", rank=").append(rank);
        sb.append("]");
        return sb.toString();
    }
}