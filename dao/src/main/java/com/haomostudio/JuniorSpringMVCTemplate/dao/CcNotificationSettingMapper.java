package com.haomostudio.JuniorSpringMVCTemplate.dao;

import com.haomostudio.JuniorSpringMVCTemplate.po.CcNotificationSetting;
import com.haomostudio.JuniorSpringMVCTemplate.po.CcNotificationSettingExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CcNotificationSettingMapper {
    long countByExample(CcNotificationSettingExample example);

    int deleteByExample(CcNotificationSettingExample example);

    int deleteByPrimaryKey(String id);

    int insert(CcNotificationSetting record);

    int insertSelective(CcNotificationSetting record);

    List<CcNotificationSetting> selectByExampleWithRowbounds(CcNotificationSettingExample example, RowBounds rowBounds);

    List<CcNotificationSetting> selectByExample(CcNotificationSettingExample example);

    CcNotificationSetting selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CcNotificationSetting record, @Param("example") CcNotificationSettingExample example);

    int updateByExample(@Param("record") CcNotificationSetting record, @Param("example") CcNotificationSettingExample example);

    int updateByPrimaryKeySelective(CcNotificationSetting record);

    int updateByPrimaryKey(CcNotificationSetting record);
}