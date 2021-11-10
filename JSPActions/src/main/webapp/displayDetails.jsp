<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
</head>
<body>
<jsp:useBean id="product" class="com.ganga.training.jsp.Product">
<jsp:setProperty property="*" name="product"/>
</jsp:useBean>

Product Details<br/>

Id:<jsp:getProperty property="id" name="product" />
Name:<jsp:getProperty property="name" name="product" />
Desc:<jsp:getProperty property="description" name="product" />
Price<jsp:getProperty property="price" name="product" />
</body>
</html>