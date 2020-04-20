package com.demogorgen.test;

import com.demogorgen.bean.User;
import com.demogorgen.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * @author lzr
 * @date 2020/4/17 10:55:35
 * @description
 */
public class   MapperTest {
    public static void main(String[] args) {
        MapperTest mapperTest=new MapperTest();
        mapperTest.Test3();
    }
    public void Test1(){
        //读取配置文件
        InputStream in = HelloMybatis.class.getClassLoader().getResourceAsStream("conf/sqlMapConfig.xml");
        //需要sqlsessionFactoryBulider
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        //创建sqlsessionfactory
        SqlSessionFactory ssf = ssfb.build(in);
        //生产sqlsession
        SqlSession session = ssf.openSession();
        //操作数据库
        UserMapper mapper=session.getMapper(UserMapper.class);
        User user=mapper.SelectUserByID(2);
        System.out.println(user);
    }
    public void Test2(){
        //读取配置文件
        InputStream in = HelloMybatis.class.getClassLoader().getResourceAsStream("conf/sqlMapConfig.xml");
        //需要sqlsessionFactoryBulider
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        //创建sqlsessionfactory
        SqlSessionFactory ssf = ssfb.build(in);
        //生产sqlsession
        SqlSession session = ssf.openSession();
        //操作数据库
        UserMapper mapper=session.getMapper(UserMapper.class);
        List<User> userList=mapper.SelectAllUser();
        for(User u:userList){
            System.out.println(u);
        }
    }
    public void Test3(){
        //读取配置文件
        InputStream in = HelloMybatis.class.getClassLoader().getResourceAsStream("conf/sqlMapConfig.xml");
        //需要sqlsessionFactoryBulider
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        //创建sqlsessionfactory
        SqlSessionFactory ssf = ssfb.build(in);
        //生产sqlsession
        SqlSession session = ssf.openSession();
        //操作数据库
        UserMapper mapper=session.getMapper(UserMapper.class);
        List<User> userList=mapper.SelectAllLike("克");
        for(User u:userList){
            System.out.println(u);
        }
    }

}
