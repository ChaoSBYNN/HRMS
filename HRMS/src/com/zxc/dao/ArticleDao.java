package com.zxc.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.zxc.entity.Article;
import com.zxc.mapper.ArticleMapper;
import com.zxc.util.MyBatisUtil;

public class ArticleDao {

	static SqlSessionFactory sqlSessionFactory = null;

	static {
		sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
	}

	public Article selectArticle(Article Article) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			ArticleMapper ArticleMapper = sqlSession.getMapper(ArticleMapper.class);
			Article = ArticleMapper.selectArticle(Article);
		} finally {
			sqlSession.close();
		}
		return Article;
	}

	public List<Article> selectArticles() {
		SqlSession session = sqlSessionFactory.openSession();
		List<Article> Articles = null;
		try {
			ArticleMapper mapper = session.getMapper(ArticleMapper.class);
			Articles = (List<Article>) mapper.selectArticles();
			for (Article Article : Articles) {
				System.out.println(Article.getArticleName());
			}
		} finally {
			session.close();
		}
		return Articles;
	}
	
	public Integer insertArticle(Article Article){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            ArticleMapper mapper = session.getMapper(ArticleMapper.class);  
            count = mapper.insertArticle(Article);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
	public Integer updateArticle(Article Article){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            ArticleMapper mapper = session.getMapper(ArticleMapper.class);  
            count = mapper.updateArticle(Article);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
	public Integer deleteArticle(Article Article){
		SqlSession session = sqlSessionFactory.openSession();
		int count= 0;
		try {  
            ArticleMapper mapper = session.getMapper(ArticleMapper.class);  
            count = mapper.deleteArticle(Article);  
            //*
            session.commit();  
        } finally {  
            session.close();  
        }  
		return count;
	}
	
}