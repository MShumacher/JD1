<%@page import="by.itacademy.jd1.web.dao.impl.ModelDaoImpl"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="by.itacademy.jd1.web.model.Model"%>
<%@ page import="java.util.List"%>

<jsp:include page="index.html" />
<h1>Models page</h1>

<%
	List<Model> modelsList = ModelDaoImpl.INSTANCE.getAll();
	pageContext.setAttribute("modelsList", modelsList);
%>

<table border="1px solid black">
	<c:forEach items="${modelsList}" var="model">
		<tr>
			<td><c:out value="${model.id}" /></td>
			<td><c:out value="${model.name}" /></td>
			<td><c:out value="${model.brandId}" /></td>
		</tr>
	</c:forEach>
</table>