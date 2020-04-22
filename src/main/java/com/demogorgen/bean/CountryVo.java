package com.demogorgen.bean;

import java.util.List;

/**
 * @author lzr
 * @date 2020/4/22 15:56:14
 * @description
 */
public class CountryVo extends Country{
    private List<User> userList;

    @Override
    public String toString() {
        return "CountryVo{" +
                "userList=" + userList +
                "} " + super.toString();
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
