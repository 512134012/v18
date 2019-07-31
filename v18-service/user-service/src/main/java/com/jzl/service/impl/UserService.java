package com.jzl.service.impl;

import com.jzl.entity.TUser;
import com.jzl.mapper.TUserMapper;
import com.jzl.pojo.ResultBean;
import com.jzl.userapi.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 项目名：v18
 * HAPPY JAVA ！
 * Create by jiangzonglin on 2019-07-29 下午 8:53
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private TUserMapper tUserMapper;

    /**
     * 注册用户
     * @param tUser
     * @return
     */
    @Override
    public ResultBean addUser(TUser tUser) {
        int i = tUserMapper.insert(tUser);//添加用户
        if (i == 1) {
            return new ResultBean("200","注册成功！");
        }
        return new ResultBean("500","注册失败，请重新注册！");
    }
}
