package model.tuanmei_operation.dao;

import java.util.List;
import model.tuanmei_operation.pojo.jumei_deals_plugin;
import model.tuanmei_operation.pojo.jumei_deals_pluginExample;
import org.apache.ibatis.annotations.Param;

public interface jumei_deals_pluginMapper {
    long countByExample(jumei_deals_pluginExample example);

    int deleteByExample(jumei_deals_pluginExample example);

    int deleteByPrimaryKey(String hashId);

    int insert(jumei_deals_plugin record);

    int insertSelective(jumei_deals_plugin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jumei_deals_plugin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    jumei_deals_plugin selectOneByExample(jumei_deals_pluginExample example);

    List<jumei_deals_plugin> selectByExample(jumei_deals_pluginExample example);

    jumei_deals_plugin selectByPrimaryKey(String hashId);

    int updateByExampleSelective(@Param("record") jumei_deals_plugin record, @Param("example") jumei_deals_pluginExample example);

    int updateByExample(@Param("record") jumei_deals_plugin record, @Param("example") jumei_deals_pluginExample example);

    int updateByPrimaryKeySelective(jumei_deals_plugin record);

    int updateByPrimaryKey(jumei_deals_plugin record);
}