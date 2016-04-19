package com.zxc.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.zxc.entity.ArticleClass;
import com.zxc.mapper.ArticleClassMapper;
import com.zxc.util.MyBatisUtil;

public class ArticleClassDao {

	static SqlSessionFactory sqlSessionFactory = null;

	static {
		sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
	}

	public ArticleClass selectArticleClass(ArticleClass ArticleClass) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			ArticleClassMapper ArticleClassMapper = sqlSession.getMapper(ArticleClassMapper.class);
			ArticleClass = ArticleClassMapper.selectArticleClass(ArticleClass);
		} finally {
			sqlSession.close();
		}
		return ArticleClass;
	}

	public List<ArticleClass> selectArticleClasss() {
		SqlSession session = sqlSessionFactory.openSession();
		List<ArticleClass> ArticleClasss = null;
		try {
			ArticleClassMapper mapper = session.getMapper(ArticleClassMapper.class);
			ArticleClasss = (List<ArticleClass>) mapper.selectArticleClasss();
			for (ArticleClass ArticleClass : ArticleClasss) {
				System.out.println(ArticleClass.getArticleClassName());
			}
		} finally {
			session.close();
		}
		return ArticleClasss;
	}
	
	public Integer insertArticleClass(ArticleClass ArticleClass){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            ArticleClassMapper mapper = session.getMapper(ArticleClassMapper.class);  
            count = mapper.insertArticleClass(ArticleClass);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
	public Integer updateArticleClass(ArticleClass ArticleClass){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            ArticleClassMapper mapper = session.getMapper(ArticleClassMapper.class);  
            count = mapper.updateArticleClass(ArticleClass);  
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
	public Integer deleteArticleClass(ArticleClass ArticleClass){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            ArticleClassMapper mapper = session.getMapper(ArticleClassMapper.class);  
            count = mapper.deleteArticleClass(ArticleClass);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
}