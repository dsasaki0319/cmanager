<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="MS932"%>

<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<html:html>
	<head>
		<title><bean:message key="message.title.logon" /></title>
		<html:base />
	</head>

	<body>
	<center>

	<!-- エラー時のメッセージ表示 -->
	<html:errors />

	<table>
		<html:form action="/logon.do">

		<tr>
		<td colspan="2">
		<bean:message key="message.prompt.please" />
		</td>
		</tr>

		<tr>
		<td><bean:message key="message.prompt.userId" /></td>
		<td><html:text property="userId" /></td>
		</tr>

		<tr>
		<td><bean:message key="message.prompt.password" /></td>
		<td><html:password property="password" /></td>
		</tr>

		<tr>
		<td colspan="2" align="center" >
		<html:submit>
		<bean:message key="message.prompt.logon" />
		</html:submit>
		</td>
		</tr>

		</html:form>
	</table>
	</center>
	</body>
</html:html>