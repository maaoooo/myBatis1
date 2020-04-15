package com.demogorgen;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author lzr
 * @date 2020 12 11:30
 * @description
 */
public class HelloMybatis {
    public static void main(String[] args) throws IOException {
        test4();
    }
    public static void test() throws IOException {
        //读取配置文件
        InputStream in = HelloMybatis.class.getClassLoader().getResourceAsStream("conf/sqlMapConfig.xml");
        //需要sqlsessionFactoryBulider
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        //创建sqlsessionfactory
        SqlSessionFactory ssf = ssfb.build(in);
        //生产sqlsession
        SqlSession session = ssf.openSession();
        //操作数据库
        User user=session.selectOne("UserMapper.SelectUserByID",1);
        System.out.println(user);
    }
    public static void test2() throws IOException {
        //读取配置文件
        InputStream in = HelloMybatis.class.getClassLoader().getResourceAsStream("conf/sqlMapConfig.xml");
        //需要sqlsessionFactoryBulider
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        //创建sqlsessionfactory
        SqlSessionFactory ssf = ssfb.build(in);
        //生产sqlsession
        SqlSession session = ssf.openSession();
        //操作数据库
        List<User> userList=session.selectList("UserMapper.SelectAllUser");
        for(User u:userList){
            System.out.println(u);
        }
    }
    public static void test3() throws IOException {
        //读取配置文件
        InputStream in = HelloMybatis.class.getClassLoader().getResourceAsStream("conf/sqlMapConfig.xml");
        //需要sqlsessionFactoryBulider
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        //创建sqlsessionfactory
        SqlSessionFactory ssf = ssfb.build(in);
        //生产sqlsession
        SqlSession session = ssf.openSession();
        //操作数据库
        List<User> userList=session.selectList("UserMapper.SelectAllLike","祈求");
        for(User u:userList){
            System.out.println(u);
        }
    }
    public static void test4() throws IOException {
        //读取配置文件
        InputStream in = HelloMybatis.class.getClassLoader().getResourceAsStream("conf/sqlMapConfig.xml");
        //需要sqlsessionFactoryBulider
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        //创建sqlsessionfactory
        SqlSessionFactory ssf = ssfb.build(in);
        //生产sqlsession
        SqlSession session = ssf.openSession();
        //操作数据库
        User user=new User();
        user.setPassword("123");
        user.setUsername("憨憨科长");
        session.insert("UserMapper.InsertUser",user);
        session.commit();
    }


}
