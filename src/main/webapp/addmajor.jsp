<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<body>
<form method="post" action="addmajor">
<table>
    <tr>
        <td width="100px">专业名称：</td>
        <td><input name="zymc" class="squareinput bottommargin_10" value=""/>
        <span id="error1" class="redletter"></span></td>  
    </tr><tr>
        <td>专业代码：</td>
        <td><input name="zydm" class="squareinput bottommargin_10" value=""/>
        <span id="error2" class="redletter"></span></td>  
    </tr><tr>
        <td></td>
        <td><br /><button class="button">确定</button>
         <!-- <button class="graybutton" onclick="return false;">取消</button> -->
         <a href="majors" class="graybutton" >取消</a></td>  
    </tr>
</table>
</form>
</body>
</html>