<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>


	<table class="table table-striped">
	<!-- 表の見出し -->
		<thead>
		<!--  -->
			<tr>
				<!--  -->
				<th>商品名</th>
				<th>金額</th>
			</tr>
		</thead>
		
	<!-- tbody で水平部分をグループ化する -->
		
		<tbody>
		<!-- forEach始まり -->
		<c:forEach var="bean" items="${response}">
			<tr>
				<td>${bean.itemName}</td>
				<td>${bean.itemPrice}</td>
			</tr>
		</c:forEach>
		<!-- forEach終わり -->
		</tbody>
		
	</table>
	
	<button type="button" class="btn btn-primary w-100 mt-2" onclick="location.href='http://localhost:8080/HelloWeb/index.jsp'">
		トップに戻る
	</button>
	
</body>
</html>