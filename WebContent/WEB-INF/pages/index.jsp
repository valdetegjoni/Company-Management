<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Management Screen</title>
</head>
<body>
    <div align="center">
        <h1>Employee List</h1>
        <h3>
            <a href="newEmployee">New Employee</a>
        </h3>
        
    
        
        <table>
        
        
    <c:if test="${not empty listEmployee}">
    <c:forEach items="${listEmployee}" var="listEmployee">

       		<tr>
       		<td>  ${tTable}</td>
       		</tr>
         
                <tr>
 					<td>${listEmployee.name}</td>
                    <td>${listEmployee.surname}</td>                   
                    <td>${listEmployee.email}</td>
                     <td>${listEmployee.address}</td>
         			 <td>${listEmployee.tel}</td>
	                <td><a href="editEmployee?id=${listEmployee.id}">Edit</a>
                             <a href="deleteEmployee?id=${listEmployee.id}">Delete</a></td>
 
                </tr>
            
</c:forEach>
</c:if>    
     </table>   
     
    </div>
</body>
</html>