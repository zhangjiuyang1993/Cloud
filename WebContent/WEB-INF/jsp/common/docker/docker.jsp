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
    <script type="text/javascript" src="<%=basePath%>js/jquery.validate.js"></script>
	<script>
    $(function () {
        

		$('#addnew').click(function(){

				window.location.href="<%=basePath%>docker/requestPage?userid=${userid}";
		 });
		
		$("#findForm").validate({
			rules:{
				dockerid:{
					required:true,
					number:true
				}
			},
			messages:{
				dockerid:{
					required:"请输入dockerid！",
					number:"请输入正确数字！"
					
				}
			}
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
<form class="form-inline definewidth m20" id="findForm" name="findForm" action="docker/dockerListById?userid=${userid }" method="post">
    docker编号：
    <input type="text" name="dockerid" id="dockerid" value="${dockerid }" class="abc input-default" placeholder="" >&nbsp;&nbsp; 
    <button type="submit" class="btn btn-primary">查询</button>&nbsp;&nbsp; <button type="button" class="btn btn-success" id="addnew">申请docker</button>
</form>
<table class="table table-bordered table-hover definewidth m10">
    <thead>
    <tr>
    	<th>序号</th>
    	<th>docker编号</th>
		<th>状态</th>
		<th>操作</th>
    </tr>
    </thead>
		<c:forEach items="${dockerList}" var="docker" varStatus="status">
   		<c:if test="${docker!=null}">
    	<tr>
    		<td>${status.count}</td>
    		<td>${docker.dockerid}</td>
    		<td>一共有几个进程已开启</td>
    		<td><a href="<%=basePath%>process/processByDocker?userid=${userid}&dockerid=${docker.dockerid}">进入</a></td>
    	</tr>
    	</c:if>
    	</c:forEach>
			
			</table>

</body>
</html>
