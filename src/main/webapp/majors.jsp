<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <base href="<%= request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() %>/" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>专业</title>
    <s:include value="template/_head.jsp"></s:include>
</head>

<body>
<div class="container">
<s:include value="template/_banner.jsp"></s:include> 
    <div id="inner" class="content">
	<div class="rightalign topmargin_10 bottommargin_10">
	<a href="addmajor.jsp" class="button" rel="facebox" title="添加专业" size="s">添加专业</a>
	</div>
	
	<table  class="datatable">
	    <tr><td>专业代码</td>
	    <td>专业名称</td>
	    <td>操作</td></tr>
		<s:iterator id="major" value="majors">
		<tr id="tr<s:property value="#major.id"/>">
		    <td><s:property value="#major.zydm"/></td>
		    <td><s:property value="#major.zymc"/></td>
		    <td>
		<a href="modmajor.jsp?id=<s:property value="#major.id"/>&zydm=<s:property value="#major.zydm"/>&zymc=<s:property value="#major.zymc"/>" class="blueletter" rel="facebox" title="修改" size="s">修改</a>
		<a href="javascript:void(0)" class="blueletter" onclick="deleteMajor(<s:property value="#major.id"/>)">删除</a>
		</td></tr>
		</s:iterator>
	</table>
    </div>
    <s:include value="template/_footer.jsp"></s:include> 
</div>

<s:include value="template/_commonjs.jsp"></s:include>
<script>
function deleteMajor(id){
	if(confirm("确定删除该专业？")){
		$.post("delmajor",{id:id},function(data){
			$("#tr"+id).remove();
		});
	}
}
</script>
</body>
</html>

