package com.haomostudio.JuniorSpringMVCTemplate.dao;

import com.haomostudio.JuniorSpringMVCTemplate.po.FunctionAuthority;
import com.haomostudio.JuniorSpringMVCTemplate.po.FunctionAuthorityExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface FunctionAuthorityMapper {
    long countByExample(FunctionAuthorityExample example);

    int deleteByExample(FunctionAuthorityExample example);

    int deleteByPrimaryKey(String id);

    int insert(FunctionAuthority record);

    int insertSelective(FunctionAuthority record);

    List<FunctionAuthority> selectByExampleWithRowbounds(FunctionAuthorityExample example, RowBounds rowBounds);

    List<FunctionAuthority> selectByExample(FunctionAuthorityExample example);

    FunctionAuthority selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FunctionAuthority record, @Param("example") FunctionAuthorityExample example);

    int updateByExample(@Param("record") FunctionAuthority record, @Param("example") FunctionAuthorityExample example);

    int updateByPrimaryKeySelective(FunctionAuthority record);

    int updateByPrimaryKey(FunctionAuthority record);
}