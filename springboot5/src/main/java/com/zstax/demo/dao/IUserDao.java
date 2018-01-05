package com.zstax.demo.dao;

import com.zstax.demo.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IUserDao {
    /** 
     * 根据ID删除
     * @param userId 主键ID
     */
    int deleteByPrimaryKey(Integer userId);

    /** 
     * 添加对象所有字段
     * @param record 插入字段对象(必须含ID）
     */
    int insert(User record);

    /** 
     * 添加对象对应字段
     * @param record 插入字段对象(必须含ID）
     */
    int insertSelective(User record);

    /** 
     * 根据ID查询
     * @param userId 主键ID
     */
    User selectByPrimaryKey(Integer userId);

    /** 
     * 根据ID修改对应字段
     * @param record 修改字段对象(必须含ID）
     */
    int updateByPrimaryKeySelective(User record);

    /** 
     * 根据ID修改所有字段(必须含ID）
     * @param record 修改字段对象(必须含ID）
     */
    int updateByPrimaryKey(User record);

    List<User> selectAll();
}