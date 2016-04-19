package com.zxc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *文章栏目表 
 **/
@Entity
@Table(name="t_article_class")
public class ArticleClass {

	@Id
	@Column(name="articleClassId")
	private Integer articleId;
	
	@Column(name="articleClassName")
	private String articleClassName;
	
	@Column(name="fatherId")
	private Integer fatherId;

	public Integer getArticleId() {
		return articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public String getArticleClassName() {
		return articleClassName;
	}

	public void setArticleClassName(String articleClassName) {
		this.articleClassName = articleClassName;
	}

	public Integer getFatherId() {
		return fatherId;
	}

	public void setFatherId(Integer fatherId) {
		this.fatherId = fatherId;
	}
	
}
