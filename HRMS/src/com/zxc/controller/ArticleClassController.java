package com.zxc.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zxc.entity.ArticleClass;
import com.zxc.service.ArticleClassService;

//通过@Controller注解标识UserController这个类是一个控制器
@Controller
@RequestMapping(value="/CArticleClass")
public class ArticleClassController extends BaseController {
	
	ArticleClassService acs = new ArticleClassService();
	
	@RequestMapping(value="/selectArticleClass",method=RequestMethod.GET)
	public ModelAndView selectArticleClass(){
		ModelAndView modelAndView = new ModelAndView();
		ArrayList<ArticleClass> articleClassList = (ArrayList<ArticleClass>)acs.selectArticleClasss();
		modelAndView.addObject("articleClassList", articleClassList);
		modelAndView.setViewName("/emp_system/JArticleClass/ArticleClass");
		return modelAndView;
	}
	
	@RequestMapping(value="/insertArticleClass",method=RequestMethod.GET)
	public ModelAndView insertArticleClass(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView();
		ArticleClass ac = new ArticleClass();
		ac.setFatherId(Integer.parseInt(getRequestValus(request, "fatherId")));
		ac.setArticleClassName(getRequestValus(request, "articleClassName"));
		acs.insertArticleClass(ac);
		modelAndView.setViewName("/CArticleClass/selectArticleClass");
		return modelAndView;
	}
	
	@RequestMapping(value="/deleteArticleClass",method=RequestMethod.GET)
	public ModelAndView deleteArticleClass(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView();
		ArticleClass ac = new ArticleClass();
		ac.setArticleId(Integer.parseInt(getRequestValus(request, "articleId")));
		acs.deleteArticleClass(ac);
		modelAndView.setViewName("/CArticleClass/selectArticleClass");
		return modelAndView;
	}
	
	
}
