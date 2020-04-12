package main.java.com.demogorgen;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author lzr
 * @date 2020 12 11:30
 * @description
 */
public class HelloMybatis {
    public static void main(String[] args) {

    }
    public void test() throws IOException {
        //读取配置文件
        InputStream in=Resources.getResourceAsStream("main/resource/conf-mapper/UserMapper.xml");
        //需要sqlsessionFactoryBulider
        SqlSessionFactoryBuilder ssfb=new SqlSessionFactoryBuilder();
        //创建sqlsessionfactory
        SqlSessionFactory ssf=ssfb.build(in);
        //生产sqlsession
        SqlSession session=ssf.openSession();
        //操作数据库
    }

}
