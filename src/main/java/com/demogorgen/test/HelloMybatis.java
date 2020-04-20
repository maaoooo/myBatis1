package com.demogorgen.test;

import com.demogorgen.bean.User;
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
        test2();
//        test();
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
        User user=session.selectOne("UserMapper.SelectUserByID",6);
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
//            System.out.println(u);
            System.out.println("这位员工名字叫："+u.getUsername()+"密码是："+u.getPassword());
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
        List<User> userList=session.selectList("UserMapper.SelectAllLike","憨憨科长");
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
        user.setUsername("Aran");
        session.insert("UserMapper.InsertUser",user);
        session.commit();
    }
    public static void test5() throws IOException {
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
        user.setId(6);
        user.setUsername("小刚门");
        session.update("UserMapper.updataName",user);
        session.commit();
    }
    public static void test6() throws IOException {//根据id删除用户
        //读取配置文件
        InputStream in = HelloMybatis.class.getClassLoader().getResourceAsStream("conf/sqlMapConfig.xml");
        //需要sqlsessionFactoryBulider
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        //创建sqlsessionfactory
        SqlSessionFactory ssf = ssfb.build(in);
        //生产sqlsession
        SqlSession session = ssf.openSession();
        //操作数据库
        session.delete("UserMapper.DelectByID",6);
        session.commit();
    }


}
