<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>form bean</title>
</head>

<body>

<s:form action="formBeanSubmit">
<s:textfield label="用户名" name="user.account"/>
<s:textfield label="密码" name="user.password"/>
<s:submit label="提交" name="提交"/>
</s:form>

</body>
</html>
