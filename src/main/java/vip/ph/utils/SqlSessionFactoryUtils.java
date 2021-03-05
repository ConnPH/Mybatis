package vip.ph.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * 添加SqlSessionFactoryUtils工具类 这是一个懒汉式单例Bean
 */
public class SqlSessionFactoryUtils {

    private static SqlSessionFactory sqlSessionFactory = null;



    public static SqlSessionFactory getInstance(){

        if (sqlSessionFactory == null){
            try {
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return sqlSessionFactory;

    }
}
