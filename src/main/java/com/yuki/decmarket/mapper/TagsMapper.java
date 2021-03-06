package com.yuki.decmarket.mapper;

import com.yuki.decmarket.model.Tags;
import com.yuki.decmarket.model.TagsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TagsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tags
     *
     * @mbggenerated Mon Jul 16 16:46:29 CST 2018
     */
    int countByExample(TagsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tags
     *
     * @mbggenerated Mon Jul 16 16:46:29 CST 2018
     */
    int deleteByExample(TagsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tags
     *
     * @mbggenerated Mon Jul 16 16:46:29 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tags
     *
     * @mbggenerated Mon Jul 16 16:46:29 CST 2018
     */
    int insert(Tags record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tags
     *
     * @mbggenerated Mon Jul 16 16:46:29 CST 2018
     */
    int insertSelective(Tags record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tags
     *
     * @mbggenerated Mon Jul 16 16:46:29 CST 2018
     */
    List<Tags> selectByExample(TagsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tags
     *
     * @mbggenerated Mon Jul 16 16:46:29 CST 2018
     */
    Tags selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tags
     *
     * @mbggenerated Mon Jul 16 16:46:29 CST 2018
     */
    int updateByExampleSelective(@Param("record") Tags record, @Param("example") TagsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tags
     *
     * @mbggenerated Mon Jul 16 16:46:29 CST 2018
     */
    int updateByExample(@Param("record") Tags record, @Param("example") TagsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tags
     *
     * @mbggenerated Mon Jul 16 16:46:29 CST 2018
     */
    int updateByPrimaryKeySelective(Tags record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tags
     *
     * @mbggenerated Mon Jul 16 16:46:29 CST 2018
     */
    int updateByPrimaryKey(Tags record);

    Tags getTagByName(String name);
}