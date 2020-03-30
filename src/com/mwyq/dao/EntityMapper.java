package com.mwyq.dao;

import com.mwyq.model.Entity;
import com.mwyq.model.EntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entity
     *
     * @mbggenerated
     */
    int countByExample(EntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entity
     *
     * @mbggenerated
     */
    int deleteByExample(EntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entity
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer entity_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entity
     *
     * @mbggenerated
     */
    int insert(Entity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entity
     *
     * @mbggenerated
     */
    int insertSelective(Entity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entity
     *
     * @mbggenerated
     */
    List<Entity> selectByExample(EntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entity
     *
     * @mbggenerated
     */
    Entity selectByPrimaryKey(Integer entity_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entity
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Entity record, @Param("example") EntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entity
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Entity record, @Param("example") EntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entity
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Entity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entity
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Entity record);
    
    
    List<Entity> getTopPer(@Param("lang") String lang);
    
    
    List<Entity> getTopLoc(@Param("lang") String lang);
    
    List<Entity> getTopOrg(@Param("lang") String lang);
    
    List<Entity> getTopAll(@Param("lang") String lang);
}