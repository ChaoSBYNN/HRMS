package com.zxc.controller;

import javax.servlet.http.HttpServletRequest;

import com.zxc.util.StringUtils;

public class BaseController {

	public String getRequestValus(HttpServletRequest request,String str) {
		return StringUtils.isEmpty(request.getParameter(str));
	}
	
}
