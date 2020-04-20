package com.demogorgen.dao;

import com.demogorgen.bean.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @author lzr
 * @date 2020/4/16 17:06:45
 * @description
 */
public class UserDaoimpl implements UserDao{
    //sqlSession工厂
    private SqlSessionFactory ssf;

    public UserDaoimpl (SqlSessionFactory ssf){
        this.ssf=ssf;
    }
    @Override
    public User getUserByID(int id) {
        //生产sqlsession
        SqlSession session = ssf.openSession();
        //操作数据库
        return session.selectOne("UserMapper.SelectUserByID",id);
    }

    @Override
    public List<User> SelectAllUser() {
        SqlSession session=ssf.openSession();
        return session.selectList("UserMapper.SelectAllUser");
    }
}
