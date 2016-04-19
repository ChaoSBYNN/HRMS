package com.zxc.mapper;

import java.util.List;

import com.zxc.entity.Article;

public interface ArticleMapper {

	public Article selectArticle(Article article);

	public Integer insertArticle(Article article);
	
	public List<Article> selectArticles();
	
	public Integer updateArticle(Article article);
	
	public Integer deleteArticle(Article article);

	
}
