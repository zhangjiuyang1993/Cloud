<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
<head>
	<base href="<%=basePath%>">
    <title>后台管理系统</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="css/dpl-min.css" rel="stylesheet" type="text/css" />
    <link href="css/bui-min.css" rel="stylesheet" type="text/css" />
    <link href="css/main-min.css" rel="stylesheet" type="text/css" />
	<link rel="Stylesheet" href="css/header.css" type="text/css" />
    <link rel="Stylesheet" href="css/skin/skin_0.css" type="text/css" id="cssfile" />
	<!--引用了一个Cookie插件，您可以下载Cookie插件，也可以用我的源代码插件，下面有下载的-->
	<script type="text/javascript" src="js/jquery-1.8.1.min.js"></script>
	<script language="javascript" src="js/jquery.cookie.js" type="text/javascript"></script>
	<!--这是Scripts文件夹中的核心代码ChangeSkin.js-->
	<script language="javascript" src="js/ChangeSkin.js" type="text/javascript"></script>
	<script language="javascript" src="js/ss.js" type="text/javascript"></script>
	

	<script type="text/javascript" src="js/bui-min.js"></script>
	<script type="text/javascript" src="js/common/main-min.js"></script>
	<script type="text/javascript" src="js/config-min.js"></script>
	<script>
		BUI.use('common/main',function(){
			var config = [{id:'1',homePage : '2',menu:[{text:'个人中心',
											items:[{id:'2',text:'查看个人信息',href:'<%=basePath%>user/personal?userid=${userid}'},
											{id:'3',text:'修改个人信息',href:'<%=basePath%>user/editPage?userid=${userid}'},
											{id:'4',text:'修改密码',href:'<%=basePath%>user/passwordPage?userid=${userid}'}]}]},
										{id:'5',homePage : '6',menu:[{text:'docker管理',
											items:[{id:'6',text:'docker管理',href:'<%=basePath%>docker/list?userid=${userid}'}]}]},
										{id:'7',homePage : '8',menu:[{text:'文件管理',
											items:[{id:'8',text:'文件管理',href:'<%=basePath%>file/list?userid=${userid}'}]}]},
										{id:'9',homePage : '10',menu:[{text:'进程管理',
											items:[{id:'10',text:'进程管理',href:'<%=basePath%>process/list?userid=${userid}'}]}]},
											];
			new PageUtil.MainPage({
				modulesConfig : config
			});
		});
	</script>
</head>
<body>
	
<div class="header">

    <div class="dl-title">
        管理平台
    </div>
    <div class="dl-log"><a href="#"><font color="white" style="text-decoration:underline;">English</font></a>&nbsp;&nbsp;&nbsp;&nbsp;欢迎您，<span class="dl-log-user">${sessionScope.user.username}</span><c:if test="${sessionScope.user.username!=null}"><a href="<%=basePath%>logout" title="退出系统" class="dl-log-quit">[退出]</a></c:if>
    </div>
	<!--<div style="width:800px;height:1px;margin:44px 0px 0px 0px;padding:0px;background-color:#D5D5D5;"></div>-->
</div>
<div class="content">
    <div class="dl-main-nav">
        <div class="dl-inform"><div class="dl-inform-title"><s class="dl-inform-icon dl-up"></s></div></div>
        <ul id="J_Nav"  class="nav-list ks-clear">
			<li class="nav-item dl-selected"><div class="nav-item-inner nav-order">个人中心</div></li>
			<li class="nav-item dl-selected"><div class="nav-item-inner nav-order">docker管理</div></li>
			<li class="nav-item dl-selected"><div class="nav-item-inner nav-order">文件管理</div></li>
			<li class="nav-item dl-selected"><div class="nav-item-inner nav-order">进程管理</div></li>
			<ul id="skin">
				<li id="skin_0" title="蓝色" class="selected">蓝色</li>
				<li id="skin_1" title="紫色">紫色</li>
				<li id="skin_2" title="红色">红色</li>
				<li id="skin_3" title="天蓝色">天蓝色</li>
				<li id="skin_4" title="橙色">橙色</li>
				<li id="skin_5" title="淡绿色">淡绿色</li>
			</ul>

        </ul>
    </div>
    <ul id="J_NavContent" class="dl-tab-conten">

    </ul>
</div>

</body>
</html>