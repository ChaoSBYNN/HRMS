package com.zxc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zxc.dao.ArticleDao;
import com.zxc.entity.Article;

@Service
public class ArticleService {
	
private ArticleDao ArticleDao;
	
	public Article selectArticle(Article Article){
		ArticleDao = new ArticleDao();
		return ArticleDao.selectArticle(Article);
	}

	public Integer insertArticle(Article Article){
		ArticleDao = new ArticleDao();
		return ArticleDao.insertArticle(Article);
	}
	
	public List<Article> selectArticles(){
		ArticleDao = new ArticleDao();
		return ArticleDao.selectArticles();
	}
	
	public Integer updateArticle(Article Article){
		ArticleDao = new ArticleDao();
		return ArticleDao.updateArticle(Article);
	}
	
	public Integer deleteArticle(Article Article){
		ArticleDao = new ArticleDao();
		return ArticleDao.deleteArticle(Article);
	}
}
