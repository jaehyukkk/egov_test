<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <script src="https://code.jquery.com/jquery-latest.min.js"></script>
	<div>보드 리스트</div>

	<c:forEach items="${data }" var="BoardVO" varStatus="i" >
		<ul>
			<li>${BoardVO.title}</li>
		</ul>
	</c:forEach>
	
	<form action="/create.do" method="post" encType="multiplart/form-data">
		<input type="text" name="title" placeholder="제목을 작성해주세요."/> </br>
		<textarea rows="" cols="" name="description" placeholder="내용을 작성해주세요."></textarea></br>
		<input type="text" name="writer" placeholder = "작성자명을 작성해주세요."/></br>
		<input type="submit" />
	</form>
</body>

<script>
	$(document).ready(function(){
		$.ajax({
			url:"/boardList.do",
			method:"get",
			dataType:"json",
			contentType:"application/json",
		}).done(function(response){
			console.log(response);
			console.log(response.data);
		}).fail(function(error){
			console.log(error);
		})
	});
	
</script>

</html>