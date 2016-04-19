package com.zxc.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.zxc.entity.User;
import com.zxc.mapper.UserMapper;
import com.zxc.util.MyBatisUtil;

@Repository
public class UserDao {

	static SqlSessionFactory sqlSessionFactory = null;

	static {
		sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
	}

	public User selectUser(User user) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			user = userMapper.selectUser(user);
		} finally {
			sqlSession.close();
		}
		return user;
	}

	public List<User> selectUsers() {
		SqlSession session = sqlSessionFactory.openSession();
		List<User> users = null;
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			users = (List<User>) mapper.selectUsers();
			for (User user : users) {
				System.out.println(user.getUsername());
			}
		} finally {
			session.close();
		}
		return users;
	}
	
	public Integer insertUser(User user){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            UserMapper mapper = session.getMapper(UserMapper.class);  
            count = mapper.insertUser(user);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
	public Integer updateUser(User user){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            UserMapper mapper = session.getMapper(UserMapper.class);  
            count = mapper.updateUser(user);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
	public Integer deleteUser(User user){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            UserMapper mapper = session.getMapper(UserMapper.class);  
            count = mapper.deleteUser(user);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
	public static void main(String[] args) {
		UserDao ud = new UserDao();
		User user = new User();
		user.setUsername("chaos");
		user.setPassword("chaos");
		ud.selectUser(user);
	}
	
}