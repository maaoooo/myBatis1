package com.demogorgen.dao;

import com.demogorgen.User;

/**
 * @author lzr
 * @date 2020/4/16 17:10:55
 * @description
 */
public interface UserDao {
    //根据id查询用户
    public User getUserByID(int id);
}
