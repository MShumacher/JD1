<%@page import="by.itacademy.jd1.web.dao.impl.CarDaoImpl"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="by.itacademy.jd1.web.model.Car"%>
<%@ page import="java.util.List"%>

<jsp:include page="menu.jsp" />
<h1>Cars page</h1>

<%
	List<Car> carsList = CarDaoImpl.INSTANCE.getAll();
	pageContext.setAttribute("carsList", carsList);
%>

<table border="1px solid black">
	<c:forEach items="${carsList}" var="car">
		<tr>
			<td><c:out value="${car.id}" /></td>
			<td><c:out value="${car.modelId}" /></td>
			<td><c:out value="${car.fuelType}" /></td>
			<td><c:out value="${car.year}" /></td>
		</tr>
	</c:forEach>
</table>