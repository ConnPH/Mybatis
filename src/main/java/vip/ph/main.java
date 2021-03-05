package vip.ph;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import vip.ph.mapper.UserMapper;
import vip.ph.model.User;
import vip.ph.utils.SqlSessionFactoryUtils;
import java.util.List;

public class main {
    public static void main(String[] args) {

        try {

            SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getInstance();

            SqlSession sqlSession = sqlSessionFactory.openSession();

            UserMapper mapper = sqlSession.getMapper(UserMapper.class);

            List<User> user = mapper.findAll();
            user.forEach(user1 -> System.out.println("user1 = " + user1));

            sqlSession.close();
        }catch (Exception e) {
         e.printStackTrace();
        }
    }
}
