package com.zxc.mybatis;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.zxc.entity.User;

public class UserMybatis extends BaseMybatis {

	InputStream is = null;
	SqlSessionFactory sessionFactory = null;
	SqlSession session = null;
	
	public UserMybatis(){
		is = UserMybatis.class.getClassLoader().getResourceAsStream(resource);
		sessionFactory = new SqlSessionFactoryBuilder().build(is);
		session = sessionFactory.openSession();
	}
	
	public User selectUser(User user){
		return session.selectOne("com.zxc.mapper.UserMapper.selectUser", user);
	}
	
	public User selectUser2(String where){
		return session.selectOne("com.zxc.mapper.UserMapper.selectUserList", where);
	}
	
	public List<User> selectUserList(String where){
		return session.selectList("com.zxc.mapper.UserMapper.selectUserList", where);
	}
	
	public int deleteUserById(String where){  
        int count = 0;  
        try {  
            count = session.delete("com.zxc.mapper.UserMapper.deleteUser", where);
            session.commit();  
        } finally {  
            session.close();  
        }  
        return count;  
    }  
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		session.close();
		is.close();
	}
	
	public static void main(String[] args) {
		UserMybatis um = new UserMybatis();
		System.out.println(um.selectUser2(" where username = 'chaos'").getUsername());
	}
	
}
