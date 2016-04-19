package com.zxc.mapper;

import java.util.List;

import com.zxc.entity.ArticleClass;

public interface ArticleClassMapper {

	public ArticleClass selectArticleClass(ArticleClass articleClass);

	public Integer insertArticleClass(ArticleClass articleClass);
	
	public List<ArticleClass> selectArticleClasss();
	
	public Integer updateArticleClass(ArticleClass articleClass);
	
	public Integer deleteArticleClass(ArticleClass articleClass);

	
}
