<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login_ok.jsp" method="post">
		<div class="form-group">
			<label for="email">Email address:</label> 
			<input type="email"
				class="form-control" placeholder="Enter email" id="email"
				name="email">
		</div>
		<div class="form-group">
			<label for="pwd">Password:</label> 
			<input type="password"
				class="form-control" placeholder="Enter password" id="pwd"
				name="pwd">
		</div>
		<div class="form-group">
			<label for="sel1">취미 :</label> 
			<select class="form-control" id="sel1"
				name="hobby">
				<option value="코딩">코딩</option>
				<option value="공부" selected="selected">공부</option>
				<option value="프로젝트">프로젝트</option>
				<option value="술마시기">술마시기</option>
			</select>
		</div>
		<div class="form-group">
			<p>좋아하는 동물은</p>
			<div class="form-check">
				<label class="form-check-label"> 
				<input type="checkbox"
					class="form-check-input" value="고양이" name="like">고양이
				</label>
			</div>
			<div class="form-check">
				<label class="form-check-label"> 
				<input type="checkbox"
					class="form-check-input" value="강아지" name="like">강아지
				</label>
			</div>
			<div class="form-check">
				<label class="form-check-label"> 
				<input type="checkbox"
					class="form-check-input" value="사자" name="like">사자
				</label>
			</div>
		</div>
		<div class="form-group form-check">
			<label class="form-check-label"> <input
				class="form-check-input" type="checkbox"> Remember me
			</label>
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
</body>
</html>