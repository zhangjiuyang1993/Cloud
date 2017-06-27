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
    <script type="text/javascript">
    $(function () {
		$("#backid").click(function(){

				window.location.href="<%=basePath%>dockerManage/list";
		});
    });
    </script>
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
<form class="form-inline definewidth m20" action="<%=basePath%>processManage/findByNameAndDockerId?docker=${dockerid }" method="post">
	进程名：
    <input type="text" name="pname" id="pname" value="${processname}" class="abc input-default" placeholder="" value="">&nbsp;&nbsp; 
    <button type="submit" class="btn btn-primary nav-item-inner nav-order">查询</button>&nbsp;&nbsp;
	<button type="button" class="btn btn-success" name="backid" id="backid" ">返回docker列表</button>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;dockerID：
    <input type="text" name="dockerid" id="dockerid" value="${dockerid }" class="abc input-default" placeholder="" readonly="readonly">&nbsp;&nbsp; 
	用户ID：
    <input type="text" name="userid" id="userid" value="${userid }" class="abc input-default" placeholder="" readonly="readonly">&nbsp;&nbsp; 

</form>

<table class="table table-bordered table-hover definewidth m10">
    <thead>
    <tr>
    	<th>序号</th>
    	<th>进程编号</th>
    	<th>进程名</th>
		<th>进程状态</th>
		<th>操作</th>
		<th>查看详细信息</th>
    </tr>
    </thead>
    <c:forEach items="${processList }" var="process" varStatus="status">
    	<tr>
    		<td>${status.count }</td>
    		<td>${process.pid }</td>
    		<td>${process.pname }</td>
    		<td>${process.state }</td>
    		<td><a href="">终止进程</a></td>
    		<td><a href="">查看详细信息</a></td>
    	</tr>
    </c:forEach>
</table>

</body>
</html>
