package com.demogorgen.test;

import com.demogorgen.bean.User;
import com.demogorgen.bean.UserVo;
import com.demogorgen.mapper.UserMapper;
import org.apache.ibatis.annotations.Mapper;
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
//        mapperTest.Test3();
//        mapperTest.Test4();
        mapperTest.Test9();
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
//    public void Test4(){
//        //读取配置文件
//        InputStream in = HelloMybatis.class.getClassLoader().getResourceAsStream("conf/sqlMapConfig.xml");
//        //需要sqlsessionFactoryBulider
//        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
//        //创建sqlsessionfactory
//        SqlSessionFactory ssf = ssfb.build(in);
//        //生产sqlsession
//        SqlSession session = ssf.openSession();
//        //操作数据库
//        UserVo userVo=new UserVo();
//        User user=new User();
//        user.setId(1);
//        userVo.setUser(user);
//        UserMapper mapper=session.getMapper(UserMapper.class);
//        UserMapper userMapper=session.getMapper(UserMapper.class);
//        User returnUser=userMapper.SelectUserByUserVoId(userVo);
//        System.out.println(returnUser);
//    }
    public void Test5(){
        //读取配置文件
        InputStream in = HelloMybatis.class.getClassLoader().getResourceAsStream("conf/sqlMapConfig.xml");
        //需要sqlsessionFactoryBulider
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        //创建sqlsessionfactory
        SqlSessionFactory ssf = ssfb.build(in);
        //生产sqlsession
        SqlSession session = ssf.openSession();
        //操作数据库
        UserMapper userMapper=session.getMapper(UserMapper.class);
        int count=userMapper.SelectUserCount();
        System.out.println(count);
    }
    public void Test6(){
        //读取配置文件
        InputStream in = HelloMybatis.class.getClassLoader().getResourceAsStream("conf/sqlMapConfig.xml");
        //需要sqlsessionFactoryBulider
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        //创建sqlsessionfactory
        SqlSessionFactory ssf = ssfb.build(in);
        //生产sqlsession
        SqlSession session = ssf.openSession();
        //操作数据库
        UserMapper userMapper=session.getMapper(UserMapper.class);
        List<UserVo> userVoList=userMapper.SelectAllUserVo();
        for(UserVo uvo:userVoList){
            System.out.println(uvo);
        }
    }
    public void Test7(){
        //读取配置文件
        InputStream in = HelloMybatis.class.getClassLoader().getResourceAsStream("conf/sqlMapConfig.xml");
        //需要sqlsessionFactoryBulider
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        //创建sqlsessionfactory
        SqlSessionFactory ssf = ssfb.build(in);
        //生产sqlsession
        SqlSession session = ssf.openSession();
        //操作数据库
        UserMapper userMapper=session.getMapper(UserMapper.class);
        User user=new User();
//        user.setId(2);
        user.setUsername("i");
//        user.setPassword("2");
        List<User> userList=userMapper.SelectLike(user);
        for(User u:userList){
            System.out.println(u);
        }
    }
    public void Test8(){
        //读取配置文件
        InputStream in = HelloMybatis.class.getClassLoader().getResourceAsStream("conf/sqlMapConfig.xml");
        //需要sqlsessionFactoryBulider
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        //创建sqlsessionfactory
        SqlSessionFactory ssf = ssfb.build(in);
        //生产sqlsession
        SqlSession session = ssf.openSession();
        //操作数据库
        UserMapper userMapper=session.getMapper(UserMapper.class);
        User user=new User();
        user.setId(1);
        user.setUsername("先知");
        user.setPassword("1010101");
        userMapper.UpdateUser(user);
        session.commit();
    }
    public void Test9(){
        //读取配置文件
        InputStream in = HelloMybatis.class.getClassLoader().getResourceAsStream("conf/sqlMapConfig.xml");
        //需要sqlsessionFactoryBulider
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        //创建sqlsessionfactory
        SqlSessionFactory ssf = ssfb.build(in);
        //生产sqlsession
        SqlSession session = ssf.openSession();
        //操作数据库
        UserMapper userMapper=session.getMapper(UserMapper.class);
        int[] ids={1,2,3};
        List<User> userList=userMapper.SelectUserByIds(ids);
        for(User u:userList){
            System.out.println(u);
        }
    }

}
