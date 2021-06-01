package com.dust.test;

import com.dust.dao.UserDaoImpl;
import com.dust.proxy.UserDaoLogImpl;
import com.dust.proxy.UserDaoTimeImpl;

/**
 * @author zgq
 * @data 2021/5/31  22:17
 **/
public class test {

    public static void main(String[] args) {
//        UserDaoImpl dao = new UserDaoImpl();
//        dao.query();
        UserDaoImpl daoLog = new UserDaoTimeImpl();
        daoLog.query();


    }
}
