package com.demogorgen.test;

import com.demogorgen.bean.Country;
import com.demogorgen.mapper.CountryMapper;
import com.demogorgen.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lzr
 * @date 2020/4/21 17:09:54
 * @description
 */
public class CountryTest {
    public static void main(String[] args) {
        test1();
    }
    public static void test1(){
        InputStream in=MapperTest.class.getClassLoader().getResourceAsStream("conf/sqlMapConfig.xml");
        SqlSessionFactoryBuilder ssfb=new SqlSessionFactoryBuilder();
        SqlSessionFactory ssf=ssfb.build(in);
        SqlSession session=ssf.openSession();
        CountryMapper countryMapper=session.getMapper(CountryMapper.class);
        List<Country> countryList;
        countryList=countryMapper.SelectAllCountry();
        for(Country c:countryList){
            System.out.println(c);
        }
    }
}
