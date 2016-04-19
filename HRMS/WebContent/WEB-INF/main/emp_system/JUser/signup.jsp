<%@page import="java.text.SimpleDateFormat,com.zxc.entity.*"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
  <meta name="description" content="">
  <meta name="author" content="">
  <link rel="shortcut icon" href="../emp/images/favicon.png" type="../emp/image/png">

  <title>(HRMS)High Resolution Mass Spectrometer</title>

  <link href="../emp/css/style.default.css" rel="stylesheet">

</head>

<body class="signin">





<section>
  
    <div class="signuppanel">
        
        <div class="row">
            
            <div class="col-md-6">
                
                <div class="signup-info">
                    <div class="logopanel">
                        <h1><span>[</span> HRMS <span>]</span></h1>
                    </div><!-- logopanel -->
                
                    <div class="mb20"></div>
                
                    <h5><strong>(HRMS)High Resolution Mass Spectrometer</strong></h5>
                    <p>本系统采用B/S架构，总共分为三层:表示层、逻辑层、数据持久层;模块:权限管理模块、人员管理模块、个人信息管理模块、聘用管理模块、系统管理模块。</p>
                    <div class="mb20"></div>
                    
                    <div class="feat-list">
                        <i class="fa fa-wrench"></i>
                        <h4 class="text-success">时效性</h4>
                        <p>更及时信息提供</p>
                    </div>
                    
                    <div class="feat-list">
                        <i class="fa fa-compress"></i>
                        <h4 class="text-success">准确性</h4>
                        <p>更准确职位报告</p>
                    </div>
                    
                    <div class="feat-list mb20">
                        <i class="fa fa-search-plus"></i>
                        <h4 class="text-success">高效性</h4>
                        <p>更快捷方便管理</p>
                    </div>
                    
                    <h4 class="mb20">更多优势...</h4>
                
                </div><!-- signup-info -->
            
            </div><!-- col-sm-6 -->
            
            <div class="col-md-6">
                
                <form method="post" action="<%=basePath%>CUser/signup">
                    
                    <h3 class="nomargin">注册</h3>
                    <p class="mt5 mb20">已经存在账号? <a href="<%=basePath%>CIndex/signin"><strong>登录</strong></a></p>
                
                    <div class="mb10">
                        <label class="control-label">用户名</label>
                        <input id="username" name="username" type="text" class="form-control" />
                    </div>
                    
                    <div class="mb10">
                        <label class="control-label">密码</label>
                        <input id="password" name="password" type="password" class="form-control" />
                    </div>
                    
                    <div class="mb10">
                        <label class="control-label">确认密码</label>
                        <input id="repassword" name="repassword" type="password" class="form-control" />
                    </div>
                    
                    <br />
                    
                    <button class="btn btn-success btn-block">注册</button>     
                </form>
            </div><!-- col-sm-6 -->
            
        </div><!-- row -->
        
        <div class="signup-footer">
            <div class="pull-left">
                &copy; 2014. All Rights Reserved. Bracket Bootstrap 3 Admin Template
            </div>
            <div class="pull-right">
                Created By: <a href="http://themepixels.com/" target="_blank">ThemePixels</a>
            </div>
        </div>
        
    </div><!-- signuppanel -->
  
</section>


<script src="../emp/js/jquery-1.11.1.min.js"></script>
<script src="../emp/js/jquery-migrate-1.2.1.min.js"></script>
<script src="../emp/js/bootstrap.min.js"></script>
<script src="../emp/js/modernizr.min.js"></script>
<script src="../emp/js/jquery.sparkline.min.js"></script>
<script src="../emp/js/jquery.cookies.js"></script>

<script src="../emp/js/toggles.min.js"></script>
<script src="../emp/js/retina.min.js"></script>

<script src="../emp/js/select2.min.js"></script>

<script src="../emp/js/custom.js"></script>
<script>
    jQuery(document).ready(function(){
        
        jQuery(".select2").select2({
            width: '100%',
            minimumResultsForSearch: -1
        });
        
        jQuery(".select2-2").select2({
            width: '100%'
        });
        
        
        // Please do not use the code below
        // This is for demo purposes only
        var c = jQuery.cookie('change-skin');
        if (c && c == 'greyjoy') {
            jQuery('.btn-success').addClass('btn-orange').removeClass('btn-success');
        } else if(c && c == 'dodgerblue') {
            jQuery('.btn-success').addClass('btn-primary').removeClass('btn-success');
        } else if (c && c == 'katniss') {
            jQuery('.btn-success').addClass('btn-primary').removeClass('btn-success');
        }
        
    });
</script>

</body>
</html>
