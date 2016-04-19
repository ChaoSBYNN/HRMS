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
  
    <div class="signinpanel">
        
        <div class="row">
            
            <div class="col-md-7">
                
                <div class="signin-info">
                    <div class="logopanel">
                        <h1><span>[</span> HRMS <span>]</span></h1>
                    </div><!-- logopanel -->
                
                    <div class="mb20"></div>
                
                    <h5><strong>欢迎使用本系统!</strong></h5>
                    <ul>
                        <li><i class="fa fa-arrow-circle-o-right mr5"></i> SpringMvc</li>
                        <li><i class="fa fa-arrow-circle-o-right mr5"></i> HTML5/CSS3 Valid</li>
                        <li><i class="fa fa-arrow-circle-o-right mr5"></i> MyBatics</li>
                        <li><i class="fa fa-arrow-circle-o-right mr5"></i> MySQL</li>
                        <li><i class="fa fa-arrow-circle-o-right mr5"></i> 更多技术...</li>
                    </ul>
                    <div class="mb20"></div>
                    <strong>没有账号? <a href="<%=basePath %>CIndex/signup">注册</a></strong>
                </div><!-- signin0-info -->
            
            </div><!-- col-sm-7 -->
            
            <div class="col-md-5">
                
                <form method="post" action="<%=basePath %>CUser/signin">
                    <h4 class="nomargin">登录</h4>
                    <p class="mt5 mb20">输入您的访问账号.</p>
                
                    <input type="text" class="form-control uname" id="username" name="username" placeholder="Username" />
                    <input type="password" class="form-control pword" id="password" name="password" placeholder="Password" />
                    <a href=""><small>忘记密码?</small></a>
                    <button class="btn btn-success btn-block">登录</button>
                    
                </form>
            </div><!-- col-sm-5 -->
            
        </div><!-- row -->
        
        <div class="signup-footer">
            <div class="pull-left">
                &copy; 2016. All Rights Reserved. ChaoS HeiLongJiang Universite 201214044 张宪晨.
            </div>
            <div class="pull-right">
                Created By: <a href="#" target="_blank">201214044</a>
            </div>
        </div>
        
    </div><!-- signin -->
  
</section>


<script src="../emp/js/jquery-1.11.1.min.js"></script>
<script src="../emp/js/jquery-migrate-1.2.1.min.js"></script>
<script src="../emp/js/bootstrap.min.js"></script>
<script src="../emp/js/modernizr.min.js"></script>
<script src="../emp/js/jquery.sparkline.min.js"></script>
<script src="../emp/js/jquery.cookies.js"></script>

<script src="../emp/js/toggles.min.js"></script>
<script src="../emp/js/retina.min.js"></script>

<script src="../emp/js/custom.js"></script>
<script>
    jQuery(document).ready(function(){
        
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
