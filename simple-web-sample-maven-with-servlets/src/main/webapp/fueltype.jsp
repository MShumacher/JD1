<%@page import="by.itacademy.jd1.web.dao.impl.FuelTypeDaoImpl"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="by.itacademy.jd1.web.model.FuelType"%>
<%@ page import="java.util.List"%>

<jsp:include page="index.html" />
<h1>FuelTypes page</h1>

<%
	List<FuelType> fuelTypesList = FuelTypeDaoImpl.INSTANCE.getAll();
	pageContext.setAttribute("fuelTypesList", fuelTypesList);
%>

<table border="1px solid black">
	<c:forEach items="${fuelTypesList}" var="fueltype">
		<tr>
			<td><c:out value="${fueltype.id}" /></td>
			<td><c:out value="${fueltype.name}" /></td>
		</tr>
	</c:forEach>
</table>