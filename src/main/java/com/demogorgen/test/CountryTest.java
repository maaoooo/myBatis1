package com.demogorgen.test;

import com.demogorgen.bean.Country;
import com.demogorgen.bean.CountryVo;
import com.demogorgen.bean.UserVo;
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
        InputStream in=CountryTest.class.getClassLoader().getResourceAsStream("conf/sqlMapConfig.xml");
        SqlSessionFactoryBuilder ssfb=new SqlSessionFactoryBuilder();
        SqlSessionFactory ssf=ssfb.build(in);
        SqlSession session=ssf.openSession();
        CountryMapper countryMapper=session.getMapper(CountryMapper.class);
        List<CountryVo> userVoList=countryMapper.SelectAllCountryVo();
        for(CountryVo cvo:userVoList){
            System.out.println(cvo);
        }
    }
}
