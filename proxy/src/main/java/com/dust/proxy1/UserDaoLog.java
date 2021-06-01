package com.dust.proxy1;

import com.dust.dao.UserDao;

/**
 * @author zgq
 * @data 2021/5/31  23:07
 **/
public class UserDaoLog implements UserDao {

    UserDao dao;

    public UserDaoLog(UserDao dao){
        this.dao = dao;
    }


    @Override
    public void query() {

        System.out.println("log---");

    }
}
