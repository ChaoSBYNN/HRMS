package com.zxc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zxc.dao.ArticleClassDao;
import com.zxc.entity.ArticleClass;

@Service
public class ArticleClassService {
	
private ArticleClassDao ArticleClassDao;
	
	public ArticleClass selectArticleClass(ArticleClass ArticleClass){
		ArticleClassDao = new ArticleClassDao();
		return ArticleClassDao.selectArticleClass(ArticleClass);
	}

	public Integer insertArticleClass(ArticleClass ArticleClass){
		ArticleClassDao = new ArticleClassDao();
		return ArticleClassDao.insertArticleClass(ArticleClass);
	}
	
	public List<ArticleClass> selectArticleClasss(){
		ArticleClassDao = new ArticleClassDao();
		return ArticleClassDao.selectArticleClasss();
	}
	
	public Integer updateArticleClass(ArticleClass ArticleClass){
		ArticleClassDao = new ArticleClassDao();
		return ArticleClassDao.updateArticleClass(ArticleClass);
	}
	
	public Integer deleteArticleClass(ArticleClass ArticleClass){
		ArticleClassDao = new ArticleClassDao();
		return ArticleClassDao.deleteArticleClass(ArticleClass);
	}
}
