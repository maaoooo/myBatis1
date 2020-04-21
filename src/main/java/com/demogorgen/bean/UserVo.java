package com.demogorgen.bean;

/**
 * @author lzr
 * @date 2020/4/21 14:26:48
 * @description
 */
public class UserVo {
    //包装类

    //需要全部的User信息
    private User user;

    public User getUser(){
        return user;
    }
    public  void setUser(User user){
        this.user=user;
    }
    //需要表B的id name属性

}
