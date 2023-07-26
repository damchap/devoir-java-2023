<%@ page import="com.damienchapart.firstjee.model.Eleve" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: damchap
  Date: 31/01/2023
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- recuperer la arrayListe des eleves --%>
<%
    ArrayList<Eleve> eleves = (ArrayList<Eleve>) request.getAttribute("eleves");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- afficher les eleves dans un tableau --%>
<table border="1">
    <tr>
        <th>id</th>
        <th>nom</th>
        <th>prenom</th>
        <th>age</th>
        <th>sexe</th>
    </tr>
    <%
        for (Eleve eleve : eleves) {
    %>
    <tr>
        <td><%=eleve.getId()%></td>
        <td><%=eleve.getNom()%></td>
        <td><%=eleve.getPrenom()%></td>
        <td><%=eleve.getAge()%></td>
        <td><%=eleve.getSexe()%></td>
    </tr>
    <%
        }
    %>
</body>
</html>
