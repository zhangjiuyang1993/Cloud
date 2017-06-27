<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
    <title></title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="<%=basePath %>css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath %>css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath %>css/style.css" />
    <script type="text/javascript" src="<%=basePath%>js/jquery.js"></script>
    <script type="text/javascript" src="<%=basePath %>js/jquery.sorted.js"></script>
    <script type="text/javascript" src="<%=basePath %>js/bootstrap.js"></script>
    <script type="text/javascript" src="<%=basePath %>js/ckform.js"></script>
    <script type="text/javascript" src="<%=basePath %>js/common.js"></script>
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
<form class="form-inline definewidth m20" action="<%=basePath%>fileManage/findByName" method="post">
	文件名：
    <input type="text" name="fname" id="dno" value="${fname }" class="abc input-default" placeholder="" >&nbsp;&nbsp; 
    <button type="submit" class="btn btn-primary nav-item-inner nav-order">查询</button>&nbsp;&nbsp;
</form>

<table class="table table-bordered table-hover definewidth m10">
    <thead>
    <tr>
    	<th>序号</th>
    	<th>文件编号</th>
    	<th>文件名</th>
		<th>上传时间</th>
		<th>文件大小</th>
		<th>所属用户名</th>
		<th>操作</th>
    </tr>
    </thead>
    <c:forEach items="${fileList }" var="file" varStatus="status">
    	<tr>
    		<td>${status.count }</td>
    		<td>${file.fid }</td>
    		<td>${file.fname }</td>
    		<td>${file.time }</td>
    		<td>${file.size }</td>
    		<td>${file.username }</td>
    		<td><a href="<%=basePath%>fileManage/deleteById?fid=${file.fid }">删除</a></td>
    	</tr>
    </c:forEach>
</table>

</body>
</html>
