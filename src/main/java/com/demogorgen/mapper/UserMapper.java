package com.demogorgen.mapper;

import com.demogorgen.bean.User;
import com.demogorgen.bean.UserVo;

import java.util.List;

/**
 * @author lzr
 * @date 2020/4/17 10:47:17
 * @description
 */
public interface UserMapper {
    //mapper动态代理开发四大原则
    //接口方法名必须与mapper。xml要调用的sql语句id一致
    //接口的形参类型需要与mapper.xml parameterType一致
    //接口的返回值需要与mapper.xml resultType一致
    //mapper.xml 中namespace要与接口的全包名一致
    //注意mapper动态代理开发中，根据返回值类型来自动选择

    //通过id查询一个用户
    public User SelectUserByID(int id);
    public List<User> SelectAllUser();
    public List<User> SelectAllLike(String name);
    public  User SelectUserByUserVoId(UserVo vo);
    public  int SelectUserCount();
}
