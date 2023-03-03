<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Fruity Loops app</title>
</head>
<body>
<h1>Contador</h1>
<p class="lead">Has visitado el localhost <c:out value="${cuentaActual}" /> veces</p>
<a href="/">¿Visitar de nuevo?</a>
<br />
<a class="btn btn-danger" href="reiniciar" role="button">Reiniciar</a>
</body>
</html>