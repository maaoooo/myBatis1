package com.demogorgen.bean;

/**
 * @author lzr
 * @date 2020/4/21 17:00:40
 * @description
 */
public class Country {
    private int id;
    private  String countryName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Country() {
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", countryName='" + countryName + '\'' +
                '}';
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Country(int id, String countryName) {
        this.id = id;
        this.countryName = countryName;
    }
}
