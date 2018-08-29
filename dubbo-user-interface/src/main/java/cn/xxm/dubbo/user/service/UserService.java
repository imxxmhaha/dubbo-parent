package cn.xxm.dubbo.user.service;

import cn.xxm.dubbo.pojo.User;

/**
 * @author xxm
 * @create 2018-08-29 23:11
 */
public interface UserService {

    User findOne(Long id);
}
