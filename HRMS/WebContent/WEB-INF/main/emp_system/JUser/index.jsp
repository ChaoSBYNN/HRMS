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

<body>

<!-- Preloader -->
<div id="preloader">
    <div id="status"><i class="fa fa-spinner fa-spin"></i></div>
</div>

<section>

  <div class="leftpanel">

    <div class="logopanel">
        <h1><span>[</span> HRMS <span>]</span></h1>
    </div><!-- logopanel -->

    <div class="leftpanelinner">

      <h5 class="sidebartitle">导航菜单</h5>
      <ul class="nav nav-pills nav-stacked nav-bracket">
        <li class="active"><a href="<%=basePath %>CUser/signin"><i class="fa fa-home"></i> <span>首页</span></a></li>
        <li><a href="<%=basePath%>CEmp/selectEmp?empId=1"><i class="fa fa-map-marker"></i> <span>个人信息</span></a></li>
        <li><a href="#"><span class="pull-right badge badge-success">42</span><i class="fa fa-envelope-o"></i> <span>消息</span></a></li>
        <li class="nav-parent"><a href=""><i class="fa fa-edit"></i> <span>信息管理</span></a>
          <ul class="children">
            <li><a href="general-forms.html"><i class="fa fa-caret-right"></i> 信息列表</a></li>
            <li><a href="form-layouts.html"><i class="fa fa-caret-right"></i> 发布信息</a></li>
            <li><a href="form-validation.html"><i class="fa fa-caret-right"></i> 垃圾箱</a></li>
          </ul>
        </li>
        <li class="nav-parent"><a href=""><i class="fa fa-suitcase"></i> <span>雇员管理</span></a>
          <ul class="children">
            <li><a href="<%=basePath %>CEmp/selectEmp""><i class="fa fa-caret-right"></i> 雇员列表</a></li>
            <li><a href="icons.html"><span class="pull-right badge badge-danger">7</span><i class="fa fa-caret-right"></i> 求职信息</a></li>
          </ul>
        </li>
        
        <li class="nav-parent"><a href=""><i class="fa fa-th-list"></i> <span>部门管理</span></a>
          <ul class="children">
            <li><a href="<%=basePath %>CDept/selectDept"><i class="fa fa-caret-right"></i> 部门列表</a></li>
            <li><a href="<%=basePath %>CDept/intoDept"><i class="fa fa-caret-right"></i> 添加部门</a></li>
          </ul>
        </li>
        <li class="nav-parent"><a href=""><i class="fa fa-sliders"></i> <span>职位管理</span></a>
            <ul class="children">
              <li><a href="<%=basePath %>CStation/selectStation"><i class="fa fa-caret-right"></i> 职位列表</a></li>
              <li><a href="<%=basePath %>CStation/intoStation"><i class="fa fa-caret-right"></i> 添加职位</a></li>
              <li><a href="icons.html"><i class="fa fa-caret-right"></i> 职位招聘</a></li>
            </ul>
        </li>
        
        <li class="nav-parent"><a href=""><i class="fa fa-bug"></i> <span>问题库</span></a>
            <ul class="children">
                <li><a href="bug-tracker.html"><i class="fa fa-caret-right"></i> 问题列表</a></li>
                <li><a href="bug-issues.html"><i class="fa fa-caret-right"></i> 寻求帮助</a></li>
            </ul>
        </li>
        <li class="nav-parent"><a href=""><i class="fa fa-file-text"></i> <span>日志</span></a>
          <ul class="children">
            <li><a href="calendar.html"><i class="fa fa-caret-right"></i> 日志列表</a></li>
            <li><a href="media-manager.html"><i class="fa fa-caret-right"></i> 添加日志</a></li>
          </ul>
        </li>
        <li class="nav-parent"><a href="layouts.html"><i class="fa fa-laptop"></i> <span>任务</span></a>
            <ul class="children">
                <li><a href="<%=basePath %>CMission/selectMission""><i class="fa fa-caret-right"></i> 任务列表</a></li>
                <li><a href="<%=basePath %>CMission/intoMission""><i class="fa fa-caret-right"></i> 添加任务</a></li>
            </ul>
        </li>
      </ul>

      <div class="infosummary">
        <h5 class="sidebartitle">信息统计</h5>
        <ul>
            <li>
                <div class="datainfo">
                    <span class="text-muted">日常任务</span>
                    <h4>7件</h4>
                </div>
                <div id="sidebar-chart" class="chart"></div>
            </li>
            <li>
                <div class="datainfo">
                    <span class="text-muted">级别</span>
                    <h4>HR</h4>
                </div>
                <div id="sidebar-chart2" class="chart"></div>
            </li>
            <li>
                <div class="datainfo">
                    <span class="text-muted">硬盘使用</span>
                    <h4>82.2%</h4>
                </div>
                <div id="sidebar-chart3" class="chart"></div>
            </li>
            <li>
                <div class="datainfo">
                    <span class="text-muted">CPU使用</span>
                    <h4>140.05 - 32</h4>
                </div>
                <div id="sidebar-chart4" class="chart"></div>
            </li>
            <li>
                <div class="datainfo">
                    <span class="text-muted">内存使用</span>
                    <h4>32.2%</h4>
                </div>
                <div id="sidebar-chart5" class="chart"></div>
            </li>
        </ul>
      </div><!-- infosummary -->

    </div><!-- leftpanelinner -->
  </div><!-- leftpanel -->

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
                <%=((User)request.getSession().getAttribute("user")).getUsername() %>
                <span class="caret"></span>
              </button>
              <ul class="dropdown-menu dropdown-menu-usermenu pull-right">
                <li><a href="<%=basePath%>CEmp/selectEmp?empId=1"><i class="glyphicon glyphicon-user"></i> 个人信息</a></li>
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

    <div class="contentpanel">

      <div class="row">

        <div class="col-sm-6 col-md-3">
          <div class="panel panel-success panel-stat">
            <div class="panel-heading">

              <div class="stat">
                <div class="row">
                  <div class="col-xs-4">
                    <img src="../emp/images/is-user.png" alt="" />
                  </div>
                  <div class="col-xs-8">
                    <small class="stat-label">求职信息</small>
                    <h1>900人</h1>
                  </div>
                </div><!-- row -->

                <div class="mb15"></div>

                <div class="row">
                  <div class="col-xs-6">
                    <small class="stat-label">Pages / Visit</small>
                    <h4>7.80</h4>
                  </div>

                  <div class="col-xs-6">
                    <small class="stat-label">% New Visits</small>
                    <h4>76.43%</h4>
                  </div>
                </div><!-- row -->
              </div><!-- stat -->

            </div><!-- panel-heading -->
          </div><!-- panel -->
        </div><!-- col-sm-6 -->

        <div class="col-sm-6 col-md-3">
          <div class="panel panel-danger panel-stat">
            <div class="panel-heading">

              <div class="stat">
                <div class="row">
                  <div class="col-xs-4">
                    <img src="../emp/images/is-document.png" alt="" />
                  </div>
                  <div class="col-xs-8">
                    <small class="stat-label">职位申请</small>
                    <h1>54.40件</h1>
                  </div>
                </div><!-- row -->

                <div class="mb15"></div>

                <small class="stat-label">Avg. Visit Duration</small>
                <h4>01:80:22</h4>

              </div><!-- stat -->

            </div><!-- panel-heading -->
          </div><!-- panel -->
        </div><!-- col-sm-6 -->

        <div class="col-sm-6 col-md-3">
          <div class="panel panel-primary panel-stat">
            <div class="panel-heading">

              <div class="stat">
                <div class="row">
                  <div class="col-xs-4">
                    <img src="../emp/images/is-document.png" alt="" />
                  </div>
                  <div class="col-xs-8">
                    <small class="stat-label">员工管理</small>
                    <h1>300k+</h1>
                  </div>
                </div><!-- row -->

                <div class="mb15"></div>

                <small class="stat-label">% Bounce Rate</small>
                <h4>34.23%</h4>

              </div><!-- stat -->

            </div><!-- panel-heading -->
          </div><!-- panel -->
        </div><!-- col-sm-6 -->

        <div class="col-sm-6 col-md-3">
          <div class="panel panel-dark panel-stat">
            <div class="panel-heading">

              <div class="stat">
                <div class="row">
                  <div class="col-xs-4">
                    <img src="../emp/images/is-money.png" alt="" />
                  </div>
                  <div class="col-xs-8">
                    <small class="stat-label">人事管理</small>
                    <h1>$655</h1>
                  </div>
                </div><!-- row -->

                <div class="mb15"></div>

                <div class="row">
                  <div class="col-xs-6">
                    <small class="stat-label">Last Week</small>
                    <h4>$32,322</h4>
                  </div>

                  <div class="col-xs-6">
                    <small class="stat-label">Last Month</small>
                    <h4>$503,000</h4>
                  </div>
                </div><!-- row -->

              </div><!-- stat -->

            </div><!-- panel-heading -->
          </div><!-- panel -->
        </div><!-- col-sm-6 -->
      </div><!-- row -->

	<div class="row">

        <div class="panel panel-default">
        <div class="panel-heading">
          <div class="panel-btns">
            <a href="" class="panel-close">&times;</a>
            <a href="" class="minimize">&minus;</a>
          </div><!-- panel-btns -->
          <h3 class="panel-title">求职列表</h3>
        </div>
        <div class="panel-body">
          <div class="table-responsive">
          <table class="table table-striped" id="table2">
              <thead>
                 <tr>
                    <th>职位</th>
                    <th>姓名</th>
                    <th>简历</th>
                 </tr>
              </thead>
              <tbody>
                 <tr class="odd gradeX">
                    <td class="center"> 4</td>
                    <td class="center">X</td>
                 </tr>
                 <tr class="even gradeC">
                    <td>Trident</td>
                    <td>Internet
                        Explorer 5.0</td>
                    <td>Internet
                        Explorer 5.0</td>
                 </tr>
                 <tr class="odd gradeA">
                    <td>Trident</td>
                    <td>Internet
                        Explorer 5.5</td>
					<td>Internet
                        Explorer 5.0</td>
                 </tr>
              </tbody>
           </table>
          </div><!-- table-responsive -->
          
        </div><!-- panel-body -->
      </div>

      </div><!-- row -->

      <div class="row">
<!--         <div class="col-sm-8 col-md-9"> -->
          <div class="panel panel-default">
            <div class="panel-body">
              <div class="row">
                <div class="col-sm-4">
                  <h5 class="subtitle mb5">需求比例柱状图</h5>
                  <p class="mb15">柱形显示.</p>

                  <span class="sublabel">技术 (40.05 - 32 cpus)</span>
                  <div class="progress progress-sm">
                    <div style="width: 40%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="40" role="progressbar" class="progress-bar progress-bar-primary"></div>
                  </div><!-- progress -->

                  <span class="sublabel">产品 (32.2%)</span>
                  <div class="progress progress-sm">
                    <div style="width: 32%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="40" role="progressbar" class="progress-bar progress-bar-success"></div>
                  </div><!-- progress -->

                  <span class="sublabel">设计 (82.2%)</span>
                  <div class="progress progress-sm">
                    <div style="width: 82%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="40" role="progressbar" class="progress-bar progress-bar-danger"></div>
                  </div><!-- progress -->

                  <span class="sublabel">运营 (63/100)</span>
                  <div class="progress progress-sm">
                    <div style="width: 63%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="40" role="progressbar" class="progress-bar progress-bar-warning"></div>
                  </div><!-- progress -->

                  <span class="sublabel">职能 (2/10)</span>
                  <div class="progress progress-sm">
                    <div style="width: 20%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="40" role="progressbar" class="progress-bar progress-bar-success"></div>
                  </div><!-- progress -->

                  <span class="sublabel">金融 (13/50)</span>
                  <div class="progress progress-sm">
                    <div style="width: 26%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="40" role="progressbar" class="progress-bar progress-bar-success"></div>
                  </div><!-- progress -->


                </div><!-- col-sm-4 -->
                
                <div class="panel panel-default panel-alt widget-messaging">
		          <div class="panel-heading">
		              <div class="panel-btns">
		                <a href="" class="panel-edit"><i class="fa fa-edit"></i></a>
		              </div><!-- panel-btns -->
		              <h3 class="panel-title">消息</h3>
		            </div>
		            <div class="panel-body">
		              <ul>
		                <li>
		                  <small class="pull-right">Dec 10</small>
		                  <h4 class="sender">Jennier Lawrence</h4>
		                  <small>Lorem ipsum dolor sit amet...</small>
		                </li>
		                <li>
		                  <small class="pull-right">Dec 9</small>
		                  <h4 class="sender">Marsha Mellow</h4>
		                  <small>Lorem ipsum dolor sit amet...</small>
		                </li>
		                <li>
		                  <small class="pull-right">Dec 9</small>
		                  <h4 class="sender">Holly Golightly</h4>
		                  <small>Lorem ipsum dolor sit amet...</small>
		                </li>
		                <li>
		                  <small class="pull-right">Dec 10</small>
		                  <h4 class="sender">Jennier Lawrence</h4>
		                  <small>Lorem ipsum dolor sit amet...</small>
		                </li>
		                <li>
		                  <small class="pull-right">Dec 9</small>
		                  <h4 class="sender">Marsha Mellow</h4>
		                  <small>Lorem ipsum dolor sit amet...</small>
		                </li>
		              </ul>
		            </div><!-- panel-body -->
		          </div><!-- panel -->
                <div class="panel panel-dark panel-alt widget-quick-status-post">
		          <div class="panel-heading">
		              <div class="panel-btns">
		                <a href="" class="panel-close">&times;</a>
		                <a href="" class="minimize">&minus;</a>
		              </div><!-- panel-btns -->
		              <h3 class="panel-title">Quick Status Post</h3>
		            </div>
		            <div class="panel-body">
		              <ul class="nav nav-tabs nav-justified">
		                <li class="active"><a href="#post-status" data-toggle="tab"><i class="fa fa-pencil"></i> <strong>Status</strong></a></li>
		                <li><a href="#post-photo" data-toggle="tab"><i class="fa fa-picture-o"></i> <strong>Photo</strong></a></li>
		                <li><a href="#post-checkin" data-toggle="tab"><i class="fa fa-map-marker"></i> <strong>Check-In</strong></a></li>
		              </ul>
		              <div class="tab-content">
		                <div id="post-status" class="tab-pane active">
		                  <input type="text" class="form-control" placeholder="What's your status?" />
		                </div>
		                <div id="post-photo" class="tab-pane">
		                  <input type="text" class="form-control" placeholder="Choose photo" />
		                </div>
		                <div id="post-checkin" class="tab-pane">
		                  <input type="text" class="form-control" placeholder="Search location" />
		                </div>
		                <button class="btn btn-primary btn-block mt10">Submit Post</button>
		              </div><!-- tab-content -->
		
		            </div><!-- panel-body -->
		          </div><!-- panel -->
                
                <div class="col-xs-6">
	              <div class="panel panel-warning panel-alt widget-today">
	                <div class="panel-heading text-center">
	                  <i class="fa fa-calendar-o"></i>
	                </div>
	                <div class="panel-body text-center">
	                  <h3 class="today"></h3>
	                </div><!-- panel-body -->
	              </div><!-- panel -->
	            </div>
	
	            <div class="col-xs-6">
	              <div class="panel panel-danger panel-alt widget-time">
	                <div class="panel-heading text-center">
	                  <i class="glyphicon glyphicon-time"></i>
	                </div>
	                <div class="panel-body text-center">
	                  <h3 class="today"></h3>
	                </div><!-- panel-body -->
	              </div><!-- panel -->
	            </div>
	          </div>
                
              </div><!-- row -->
            </div><!-- panel-body -->
          </div><!-- panel -->
<!--         </div>col-sm-9 -->

        <div class="col-sm-6 col-md-4">
          
        </div><!-- col-sm-6 -->


    </div><!-- contentpanel -->

  </div><!-- mainpanel -->

  <div class="rightpanel">
    <!-- Nav tabs -->
    <ul class="nav nav-tabs nav-justified">
        <li class="active"><a href="#rp-alluser" data-toggle="tab"><i class="fa fa-users"></i></a></li>
        <li><a href="#rp-favorites" data-toggle="tab"><i class="fa fa-heart"></i></a></li>
        <li><a href="#rp-history" data-toggle="tab"><i class="fa fa-clock-o"></i></a></li>
        <li><a href="#rp-settings" data-toggle="tab"><i class="fa fa-gear"></i></a></li>
    </ul>

    <!-- Tab panes -->
    <div class="tab-content">

            <h5 class="sidebartitle mb20">设置</h5>
            <div class="form-group">
                <label class="col-xs-8 control-label">1</label>
                <div class="col-xs-4 control-label">
                    <div class="toggle toggle-success"></div>
                </div>
            </div>

            <div class="form-group">
                <label class="col-xs-8 control-label">2</label>
                <div class="col-xs-4 control-label">
                    <div class="toggle toggle-success"></div>
                </div>
            </div>

            <div class="form-group">
                <label class="col-xs-8 control-label">3</label>
                <div class="col-xs-4 control-label">
                    <div class="toggle-chat1 toggle-success"></div>
                </div>
            </div>

            <div class="form-group">
                <label class="col-xs-8 control-label">4</label>
                <div class="col-xs-4 control-label">
                    <div class="toggle toggle-success"></div>
                </div>
            </div>

			<div class="form-group">
                <label class="col-xs-8 control-label">3</label>
                <div class="col-xs-4 control-label">
                    <div class="toggle-chat1 toggle-success"></div>
                </div>
            </div>

            <div class="form-group">
                <label class="col-xs-8 control-label">4</label>
                <div class="col-xs-4 control-label">
                    <div class="toggle toggle-success"></div>
                </div>
            </div>
        </div><!-- tab-pane -->

  </div><!-- rightpanel -->


</section>


<script src="../emp/js/jquery-1.11.1.min.js"></script>
<script src="../emp/js/jquery-migrate-1.2.1.min.js"></script>
<script src="../emp/js/jquery-ui-1.10.3.min.js"></script>
<script src="../emp/js/bootstrap.min.js"></script>
<script src="../emp/js/modernizr.min.js"></script>
<script src="../emp/js/jquery.sparkline.min.js"></script>
<script src="../emp/js/toggles.min.js"></script>
<script src="../emp/js/retina.min.js"></script>
<script src="../emp/js/jquery.cookies.js"></script>

<script src="../emp/js/flot/jquery.flot.min.js"></script>
<script src="../emp/js/flot/jquery.flot.resize.min.js"></script>
<script src="../emp/js/flot/jquery.flot.spline.min.js"></script>
<script src="../emp/js/morris.min.js"></script>
<script src="../emp/js/raphael-2.1.0.min.js"></script>

<script src="../emp/js/custom.js"></script>
<script src="../emp/js/dashboard.js"></script>
<div style="text-align:center;">
<p>By:<a href="#" target="_blank">ChaoS</a></p>
</div>
</body>
</html>
