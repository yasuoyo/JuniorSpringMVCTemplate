package com.haomostudio.JuniorSpringMVCTemplate.dao;

import com.haomostudio.JuniorSpringMVCTemplate.po.Team;
import com.haomostudio.JuniorSpringMVCTemplate.po.TeamExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface TeamMapper {
    long countByExample(TeamExample example);

    int deleteByExample(TeamExample example);

    int deleteByPrimaryKey(String id);

    int insert(Team record);

    int insertSelective(Team record);

    List<Team> selectByExampleWithRowbounds(TeamExample example, RowBounds rowBounds);

    List<Team> selectByExample(TeamExample example);

    Team selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Team record, @Param("example") TeamExample example);

    int updateByExample(@Param("record") Team record, @Param("example") TeamExample example);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKey(Team record);
}