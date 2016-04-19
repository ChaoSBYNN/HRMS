package com.zxc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 文章表
 **/
@Entity
@Table(name = "t_article")
public class Article {

	@Id
	@Column(name = "articleId")
	private Integer articleId;

	@Column(name = "articleClassId")
	private Integer articleClassId;

	@Column(name = "issuerId")
	private Integer issuerId;

	@Column(name = "articleName")
	private String articleName;

	@Column(name = "articleType")
	private String articleType;

	@Column(name = "issuedate")
	private Date issuedate;

	@Column(name = "content")
	private String content;

	public Integer getArticleId() {
		return articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public Integer getArticleClassId() {
		return articleClassId;
	}

	public void setArticleClassId(Integer articleClassId) {
		this.articleClassId = articleClassId;
	}

	public Integer getIssuerId() {
		return issuerId;
	}

	public void setIssuerid(Integer issuerId) {
		this.issuerId = issuerId;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public String getArticleType() {
		return articleType;
	}

	public void setArticleType(String articleType) {
		this.articleType = articleType;
	}

	public Date getIssuedate() {
		return issuedate;
	}

	public void setIssuedate(Date issuedate) {
		this.issuedate = issuedate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
