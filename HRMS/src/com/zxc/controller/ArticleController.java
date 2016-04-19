package com.zxc.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zxc.entity.Article;
import com.zxc.service.ArticleService;

//通过@Controller注解标识UserController这个类是一个控制器
@Controller
@RequestMapping(value="/CArticle")
public class ArticleController extends BaseController {
	
	ArticleService as = new ArticleService();
	
	@RequestMapping(value="/selectArticle",method=RequestMethod.GET)
	public ModelAndView selectArticle(){
		ModelAndView modelAndView = new ModelAndView();
		ArrayList<Article> ArticleList = (ArrayList<Article>)as.selectArticles();
		modelAndView.addObject("ArticleList", ArticleList);
		modelAndView.setViewName("/emp_system/JArticle/Article");
		return modelAndView;
	}
	
	@RequestMapping(value="/insertArticle",method=RequestMethod.GET)
	public ModelAndView insertArticle(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView();
		Article ac = new Article();
		ac.setArticleName(getRequestValus(request, "ArticleName"));
		as.insertArticle(ac);
		modelAndView.setViewName("/CArticle/selectArticle");
		return modelAndView;
	}
	
	@RequestMapping(value="/deleteArticle",method=RequestMethod.GET)
	public ModelAndView deleteArticle(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView();
		Article ac = new Article();
		ac.setArticleId(Integer.parseInt(getRequestValus(request, "articleId")));
		as.deleteArticle(ac);
		modelAndView.setViewName("/CArticle/selectArticle");
		return modelAndView;
	}
}
