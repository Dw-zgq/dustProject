package com.dust.proxy;

import com.dust.dao.UserDaoImpl;

/**
 * @author zgq
 * @data 2021/5/31  22:35
 **/
public class UserDaoPowerImpl extends UserDaoImpl {
    @Override
    public void query() {

        System.out.println("power------");
        super.query();

    }
}
