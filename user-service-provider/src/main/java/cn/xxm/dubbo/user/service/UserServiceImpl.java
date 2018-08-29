package cn.xxm.dubbo.user.service;

import cn.xxm.dubbo.dao.UserDao;
import cn.xxm.dubbo.pojo.User;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author xxm
 * @create 2018-08-29 23:11
 */
@Service
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User findOne(Long id) {
        return userDao.selectByPrimaryKey(id);
    }
}
