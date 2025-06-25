<%-- 혼재되어 있던, html과 비즈니스 로직이 구분되었음 --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
성공
<ul>
<%--  <%= request.getAttribute("member")%> 이 방식으로 객체를 꺼내는 건 너무 복잡하다.--%>
<%--  JSP에서 지원하는 ${} 방식으로 request의 데이터를 편리하게 조회할 수 있다.--%>
  <li>id=${member.id}</li>
  <li>username=${member.username}</li>
  <li>age=${member.age}</li>
</ul>
<a href="/index.html">메인</a>
</body>
</html>
