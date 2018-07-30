package com.haomostudio.JuniorSpringMVCTemplate.dao;

import com.haomostudio.JuniorSpringMVCTemplate.po.ViewHmUserDepartmentRole;
import com.haomostudio.JuniorSpringMVCTemplate.po.ViewHmUserDepartmentRoleExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface ViewHmUserDepartmentRoleMapper {
    long countByExample(ViewHmUserDepartmentRoleExample example);

    int deleteByExample(ViewHmUserDepartmentRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(ViewHmUserDepartmentRole record);

    int insertSelective(ViewHmUserDepartmentRole record);

    List<ViewHmUserDepartmentRole> selectByExampleWithRowbounds(ViewHmUserDepartmentRoleExample example, RowBounds rowBounds);

    List<ViewHmUserDepartmentRole> selectByExample(ViewHmUserDepartmentRoleExample example);

    ViewHmUserDepartmentRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ViewHmUserDepartmentRole record, @Param("example") ViewHmUserDepartmentRoleExample example);

    int updateByExample(@Param("record") ViewHmUserDepartmentRole record, @Param("example") ViewHmUserDepartmentRoleExample example);

    int updateByPrimaryKeySelective(ViewHmUserDepartmentRole record);

    int updateByPrimaryKey(ViewHmUserDepartmentRole record);
}