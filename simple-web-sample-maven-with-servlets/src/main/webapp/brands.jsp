<%@page import="by.itacademy.jd1.web.dao.impl.BrandDaoImpl"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="by.itacademy.jd1.web.model.Brand"%>
<%@ page import="java.util.List"%>

<jsp:include page="menu.jsp" />
<h1>Brands page</h1>

<%
	List<Brand> brandsList = BrandDaoImpl.INSTANCE.getAll();
	pageContext.setAttribute("brandsList", brandsList);
%>

<table border="1px solid black">
	<c:forEach items="${brandsList}" var="brand">
		<tr>
			<td><c:out value="${brand.id}" /></td>
			<td><c:out value="${brand.name}" /></td>
		</tr>
	</c:forEach>
</table>