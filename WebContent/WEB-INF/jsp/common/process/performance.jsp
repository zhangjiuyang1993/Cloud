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
    <title></title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="css/style.css" />
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/jquery.sorted.js"></script>
    <script type="text/javascript" src="js/bootstrap.js"></script>
    <script type="text/javascript" src="js/ckform.js"></script>
    <script type="text/javascript" src="js/common.js"></script> 

    <style type="text/css">
        body {
            padding-bottom: 40px;
        }
        .sidebar-nav {
            padding: 9px 0;
        }

        @media (max-width: 980px) {
            /* Enable use of floated navbar text */
            .navbar-text.pull-right {
                float: none;
                padding-left: 5px;
                padding-right: 5px;
            }
        }


    </style>
</head>
<body>
<form action="index.html" method="post" class="definewidth m20">
<input type="hidden" name="id" value="" />
<b>docker编号：0001<b><br>
<table class="table table-bordered table-hover ">
	<thead>
		<th colspan="2">
			CPU
		</th>
	</thead>
    <tr>
        <td width="10%" class="tableleft">利用率</td>
        <td><input type="text" name="grouptitle" value="20%"/></td>
    </tr>
    <tr>
        <td class="tableleft">进程</td>
        <td ><input type="text" name="moduletitle" value="2"/></td>
    </tr>  
    <tr>
        <td class="tableleft">线程</td>
       <td ><input type="text" name="moduletitle" value="20"/></td>
	   <tr>
        <td class="tableleft">运行时间</td>
       <td ><input type="text" name="moduletitle" value="2:21:50:30"/></td>
    </tr>
    </tr>
</table>
<table class="table table-bordered table-hover ">
	<thead>
		<th colspan="2">
			内存
		</th>
	</thead>
    <tr>
        <td width="10%" class="tableleft">利用率</td>
        <td><input type="text" name="grouptitle" value="20%"/></td>
    </tr>
    <tr>
        <td class="tableleft">进程</td>
        <td ><input type="text" name="moduletitle" value="2"/></td>
    </tr>  
    <tr>
        <td class="tableleft">线程</td>
       <td ><input type="text" name="moduletitle" value="20"/></td>
	   <tr>
        <td class="tableleft">运行时间</td>
       <td ><input type="text" name="moduletitle" value="2:21:50:30"/></td>
    </tr>
    </tr>
</table>
<table class="table table-bordered table-hover ">
	<thead>
		<th colspan="2">
			磁盘
		</th>
	</thead>
    <tr>
        <td width="10%" class="tableleft">利用率</td>
        <td><input type="text" name="grouptitle" value="20%"/></td>
    </tr>
    <tr>
        <td class="tableleft">进程</td>
        <td ><input type="text" name="moduletitle" value="2"/></td>
    </tr>  
    <tr>
        <td class="tableleft">线程</td>
       <td ><input type="text" name="moduletitle" value="20"/></td>
	   <tr>
        <td class="tableleft">运行时间</td>
       <td ><input type="text" name="moduletitle" value="2:21:50:30"/></td>
    </tr>
    </tr>
</table>
<table class="table table-bordered table-hover ">
	<thead>
		<th colspan="2">
			网络
		</th>
	</thead>
    <tr>
        <td width="10%" class="tableleft">上传速度</td>
        <td><input type="text" name="grouptitle" value="20%"/></td>
    </tr>
    <tr>
        <td class="tableleft">下载速度</td>
        <td ><input type="text" name="moduletitle" value="2"/></td>
    </tr>  
    <tr>
        <td class="tableleft">ip</td>
       <td ><input type="text" name="moduletitle" value="20"/></td>
	   <tr>
        <td class="tableleft"></td>
       <td ><input type="text" name="moduletitle" value="2:21:50:30"/></td>
    </tr>
    </tr>
</table>
<table class="table table-bordered table-hover ">
	<thead>
		<th colspan="2">
			文件存储区
		</th>
	</thead>
    <tr>
        <td width="10%" class="tableleft">利用率</td>
        <td><input type="text" name="grouptitle" value="20%"/></td>
    </tr>
    <tr>
        <td class="tableleft">进程</td>
        <td ><input type="text" name="moduletitle" value="2"/></td>
    </tr>  
    <tr>
        <td class="tableleft">线程</td>
       <td ><input type="text" name="moduletitle" value="20"/></td>
	   <tr>
        <td class="tableleft">运行时间</td>
       <td ><input type="text" name="moduletitle" value="2:21:50:30"/></td>
    </tr>
</table>
<table class="table table-bordered table-hover ">
	<tr>
        <button type="button" class="btn btn-success" name="backid" id="backid">返回列表</button>
    </tr>
<table>
</form>
</body>
</html>
<script>
    $(function () {       
		$('#backid').click(function(){
				window.location.href="<%=basePath%>process/list?userid=${userid}";
		 });

    });
</script>