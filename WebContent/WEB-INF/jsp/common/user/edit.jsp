<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title></title>
	<base href="<%=basePath%>">
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="css/style.css" />
    <script type="text/cavascript" src="css/cquery.cs"></script>
    <script type="text/cavascript" src="css/cquery.sorted.cs"></script>
    <script type="text/cavascript" src="css/bootstrap.cs"></script>
    <script type="text/cavascript" src="css/ckform.cs"></script>
    <script type="text/cavascript" src="css/common.cs"></script> 
	<script>
  	 	 $(function () {       
				$('#backid').click(function(){
					window.location.href="<%=basePath%>user/personal";
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
<form action="user/edit?userid=${userid }" method="post" class="definewidth m20">
<table class="table table-bordered table-hover ">
    <tr>
        <td width="10%" class="tableleft">姓名</td>
        <td><input type="text" name="username" value="${user.username }"/></td>
    </tr>
    <tr>
        <td class="tableleft">性别</td>
        <td ><input type="text" name="sex" value="${user.sex }"/></td>
    </tr>  
    <tr>
        <td class="tableleft">单位</td>
       <td ><input type="text" name="dept" value="${user.dept }"/></td>
    </tr>
    <tr>
        <td class="tableleft"></td>
        <td>
            <button type="submit" class="btn btn-primary" type="button">保存</button> &nbsp;&nbsp;<button type="button" class="btn btn-success" name="backid" id="backid">返回列表</button>
        </td>
    </tr>
</table>
</form>
</body>
</html>
