<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:out value="${10+9}"/>
<c:set var="testScore" value="${80}" scope="session"/>
<c:out value="${testScore}"/>
<c:if test="${testScore>=80}">
    <p>Your score is good </p>
    <c:out value="${testScore}"/>
 </c:if> 
 
 <c:choose>
 <c:when test="${testScore>=80}">
     A Grade
 
 </c:when> 
 <c:when test="${testScore>=60 && testScore<=80}">
     B Grade
 
 </c:when> 
 <c:otherwise>
 C GRade
 </c:otherwise>
 </c:choose>
 
 <c:forEach var="i" begin="1" end="3">
 <c:out value="${i}">
 </c:out>
 </c:forEach>
 <%
 List<String> studentsName= new ArrayList<>();
 studentsName.add("John");
 studentsName.add("Bob");
 studentsName.add("Ganga");
 request.setAttribute("studentsName", studentsName);
 %>
 <c:forEach var="studentsName" items="${studentsName}">
 <c:out value="${studentsName}"/>
 </c:forEach>
<c:remove var="testScore"/>
After removal <c:out value="${testScore}"/>
</body>
</html>