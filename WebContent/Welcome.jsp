<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="MS932" %>

<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<html>
	<head>
	<title><bean:message key="message.title.membertop" /></title>
	</head>

	<body>
	<center>
	<h2>
		<bean:message key="message.str.hello" />
		<bean:message key="message.str.btitle" />
		<bean:write name="user_key" property="username" />
		<bean:message key="message.str.atitle" />
	</h2><br>

	<html:link page="/index.jsp">
		<bean:message key="message.prompt.logoff" />
	</html:link>
	</center>
	</body>
</html>