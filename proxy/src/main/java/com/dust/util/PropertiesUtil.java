package com.dust.util;

import java.io.IOException;
import java.util.Properties;

/**
 * @author zgq
 * @data 2021/6/1  21:47
 **/
public class PropertiesUtil {

    static Properties properties = new Properties();

    public static boolean loadFile(String fileName) {
        try {
            properties.load(PropertiesUtil.class.getClassLoader().getResourceAsStream(fileName));
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static String getPropertyValue(String key) {
        return properties.getProperty(key);
    }


}
