package com.zxc.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.zxc.entity.User;

public class Test {

	public static void main(String[] args) {
		
		String resource = "com/zxc/config/conf.xml";
		InputStream is = Test.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		
		SqlSession session = sessionFactory.openSession();
		String statement = "com.zxc.mapper.UserMapper.getUser";
		User user = session.selectOne(statement, 2);
		List<User> userList = session.selectList("com.zxc.mapper.UserMapper.getAllUser");
		for(User u : userList){
			System.out.println(u.getUsername()+"---"+u.getPassword());
		}
		System.out.println(user.getUsername());
		
	}
	
}
