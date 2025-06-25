
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- prefix에 c를 사용해서 루프로 출력할  수 있음 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/index.html">메인</a>
<table>
  <thead>
  <th>id</th>
  <th>username</th>
  <th>age</th>
  </thead>
  <tbody>
<%--  members 컬렉션을 item에 담아서 출력--%>
  <c:forEach var="item" items="${members}">
    <tr>
      <td>${item.id}</td>
      <td>${item.username}</td>
      <td>${item.age}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>
