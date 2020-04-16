package com.demogorgen.test;

import com.demogorgen.User;
import com.demogorgen.dao.UserDao;
import com.demogorgen.dao.UserDaoimpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author lzr
 * @date 2020/4/16 17:42:24
 * @description
 */
public class UserDaoTest {
    public static void main(String[] args) {
        //读取配置文件
        InputStream in = HelloMybatis.class.getClassLoader().getResourceAsStream("conf/sqlMapConfig.xml");
        //需要sqlsessionFactoryBulider
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        //创建sqlsessionfactory
        SqlSessionFactory ssf = ssfb.build(in);
        UserDao userDao=new UserDaoimpl(ssf);
        User user=userDao.getUserByID(2);
        System.out.println(user);
    }
}
