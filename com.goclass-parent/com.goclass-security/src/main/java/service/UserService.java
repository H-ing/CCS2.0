package service;

import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Service;

import app.entity.User;


@Service
public class UserService {

    /**
     * 模拟查询返回用户信息
     * @param uname
     * @return
     */
    public User findUserByName(String uname){
        User user = new User();
        return user;
    }
}
