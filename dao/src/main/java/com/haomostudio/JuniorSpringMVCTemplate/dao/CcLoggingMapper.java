package com.haomostudio.JuniorSpringMVCTemplate.dao;


import com.haomostudio.JuniorSpringMVCTemplate.po.CcLogging;
import com.haomostudio.JuniorSpringMVCTemplate.po.CcLoggingExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CcLoggingMapper {
    long countByExample(CcLoggingExample example);

    int deleteByExample(CcLoggingExample example);

    int deleteByPrimaryKey(String id);

    int insert(CcLogging record);

    int insertSelective(CcLogging record);

    List<CcLogging> selectByExampleWithRowbounds(CcLoggingExample example, RowBounds rowBounds);

    List<CcLogging> selectByExample(CcLoggingExample example);

    CcLogging selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CcLogging record, @Param("example") CcLoggingExample example);

    int updateByExample(@Param("record") CcLogging record, @Param("example") CcLoggingExample example);

    int updateByPrimaryKeySelective(CcLogging record);

    int updateByPrimaryKey(CcLogging record);
}