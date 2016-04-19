<%@page import="java.text.SimpleDateFormat,com.zxc.entity.*"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<link href="../emp/css/style.default.css" rel="stylesheet">
<div class="mainpanel">

    <div class="headerbar">

      <a class="menutoggle"><i class="fa fa-bars"></i></a>

      <form class="searchform" action="index.html" method="post">
        <input type="text" class="form-control" name="keyword" placeholder="搜索..." />
      </form>

      <div class="header-right">
        <ul class="headermenu">
          <li>
            <div class="btn-group">
              <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                <img src="../emp/images/photos/loggeduser.png" alt="" />
                ***用户名***
                <span class="caret"></span>
              </button>
              <ul class="dropdown-menu dropdown-menu-usermenu pull-right">
                <li><a href="<%=basePath%>CEmp/selectEmp"><i class="glyphicon glyphicon-user"></i> 个人信息</a></li>
                <li><a href="#"><i class="glyphicon glyphicon-cog"></i> 用户设置</a></li>
				<li><a href="#"><i class="glyphicon glyphicon-lock"></i> 锁屏</a></li>
                <li><a href="#"><i class="glyphicon glyphicon-question-sign"></i> 帮助</a></li>
                <li><a href="<%=basePath%>CIndex/signin"><i class="glyphicon glyphicon-log-out"></i> 注销</a></li>
              </ul>
            </div>
          </li>
          <li>
            <button id="chatview" class="btn btn-default tp-icon chat-icon">
                <i class="glyphicon glyphicon-comment"></i>
            </button>
          </li>
        </ul>
      </div><!-- header-right -->

    </div><!-- headerbar -->

    <div class="pageheader">
      <h2><i class="fa fa-home"></i> 主页 <span>Subtitle goes here...</span></h2>
      <div class="breadcrumb-wrapper">
        <span class="label">您的位置:</span>  
        <ol class="breadcrumb">
          <li><a href="index.html">HRMS</a></li>
          <li class="active">主页</li>
        </ol>
      </div>
    </div>
    
    
    
    
    

  </div><!-- mainpanel -->