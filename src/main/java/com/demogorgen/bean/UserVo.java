package com.demogorgen.bean;

/**
 * @author lzr
 * @date 2020/4/21 14:26:48
 * @description
 */
public class UserVo extends User{
    private Country country;




    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "country=" + country +
                "} " + super.toString();
    }

    public UserVo() {
    }
}
