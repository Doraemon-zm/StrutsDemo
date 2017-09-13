<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/13
  Time: 9:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/myAction_list.action" method="post">
    <table>
        <tr>
            <td>姓名:</td>
            <td>
                <input type="text" name="name">
            </td>
        </tr>
        <tr>
            <td>电话:</td>
            <td>
                <input type="text" name="phone">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="点击提交">
            </td>
        </tr>
    </table>
</form>

</body>
</html>
