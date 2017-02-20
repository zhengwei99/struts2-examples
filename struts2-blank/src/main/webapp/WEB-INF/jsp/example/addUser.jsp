<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Welcome</title>
    <link href="<s:url value="/css/examplecss"/>" rel="stylesheet"
          type="text/css"/>
</head>

<body>
<s:form action="saveUser">
    <s:textfield name="account" label="account"/>
    <s:textfield name="password" label="passwod"/>
    <s:submit label="submit"></s:submit>
</s:form>

</body>
</html>
