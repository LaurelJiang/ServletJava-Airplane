<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
   <%@ taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
起飞机场:
<select>
 <option>请选择</option>
 <c:forEach items="${takeport}" var="take">
   <option value="${take.id }">${take.portName }</option>
 </c:forEach>
</select>

降落机场:
<select>
 <option>请选择</option>
 <c:forEach items="${landport}" var="take">
   <option value="${take.id }">${take.portName }</option>
 </c:forEach>
</select>
<button>查询</button>
<table border="1">
  <tr>
    <td>飞机编号</td>
    <td>起飞机场</td>
    <td>起飞城市</td>
    <td>降落机场</td>
    <td>降落城市</td>
    <td>航行时间</td>
    <td>票价(元)</td>
  </tr>
  <c:forEach  items="${list }" var="plane">
    <tr>
      <td>${plane.airNo}</td>
      <td>${plane.takePort.portName}</td>
      <td>${plane.takePort.cityName}</td>
      <td>${plane.landPort.landName}</td>
      <td>${plane.landPort.cityName}</td>
      <td>
       <c:if test="${plane.time>=60}">
         ${Math.floor(plane.time/60)}小时${plane.time%60}分钟
       </c:if>
       <c:if test="${plane.time<60}">
          ${plane.time%60}分钟
       </c:if>
      </td>
    </tr>
  </c:forEach>
</table>
</body>
</html>