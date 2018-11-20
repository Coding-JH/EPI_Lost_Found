package com.epi.test;

import com.epi.bean.User;
import com.epi.dao.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {

    @Autowired
    UserMapper userMapper;
    @Autowired
    SqlSession sqlSession;
    @Test
    public void TestCRUD() {

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //    int i = 100;
        //      while(i--!=0){
        String uid = UUID.randomUUID().toString().substring(0,9);
        mapper.insertSelective(new User(1, "apple", "12345",uid+"@qq.com",null));
        //     }
//        int j=10;
//        while(j--!=0){
//            String uid = UUID.randomUUID().toString().substring(0,5);
//            mapper.insertSelective(new User(null, uid, "34"+uid+"45",uid+"@qq.com","1"));
//        }
    }

}
