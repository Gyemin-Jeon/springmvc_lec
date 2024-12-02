<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Path variable</title>
</head>
<body>

  <a href="<%=request.getContextPath()%>/webdir6/1">요청1</a>
    <br/>
  <a href="<%=request.getContextPath()%>/webdir6/sort/ASC/page/1">요청1</a>
    <br/>

</body>
</html>