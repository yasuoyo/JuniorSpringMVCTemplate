package com.haomostudio.JuniorSpringMVCTemplate.dao;

import com.haomostudio.JuniorSpringMVCTemplate.po.HmLog;
import com.haomostudio.JuniorSpringMVCTemplate.po.HmLogExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface HmLogMapper {
    long countByExample(HmLogExample example);

    int deleteByExample(HmLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(HmLog record);

    int insertSelective(HmLog record);

    List<HmLog> selectByExampleWithRowbounds(HmLogExample example, RowBounds rowBounds);

    List<HmLog> selectByExample(HmLogExample example);

    HmLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HmLog record, @Param("example") HmLogExample example);

    int updateByExample(@Param("record") HmLog record, @Param("example") HmLogExample example);

    int updateByPrimaryKeySelective(HmLog record);

    int updateByPrimaryKey(HmLog record);
}