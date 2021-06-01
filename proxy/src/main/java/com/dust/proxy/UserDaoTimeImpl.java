package com.dust.proxy;

import com.dust.dao.UserDaoImpl;

import java.util.Date;

/**
 * @author zgq
 * @data 2021/5/31  22:35
 **/
public class UserDaoTimeImpl extends UserDaoImpl {
    @Override
    public void query() {

        System.out.println("time------"+new Date());
        super.query();

    }
}
