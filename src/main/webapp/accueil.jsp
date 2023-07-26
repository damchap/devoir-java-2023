<%@ page import="com.damienchapart.firstjee.model.Eleve" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: damchap
  Date: 31/01/2023
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    ArrayList<Eleve> eleves = (ArrayList<Eleve>) request.getAttribute("etudiants");
%>
<html>
<head>
    <title>acceuil</title>
</head>
<body>
<div>
    <form method="post" action="accueil">
        <p>
            <label for="nom">Nom</label>
            <input type="text" name="nom" id="nom" />
        </p>
        <p>
            <label for="prenom">Prénom</label>
            <input type="text" name="prenom" id="prenom" />
        </p>
        <input type="submit" value="Envoyer" />
    </form>
    <!-- Affichage du nom et du prénom si le formulaire est envoyé -->
    <p>
        <%
            for (Eleve eleve : eleves) {
        %>
        <div>
            <span><%=eleve.getId()%></span>
            <span><%=eleve.getNom()%></span>
            <span><%=eleve.getPrenom()%></span>
            <span><%=eleve.getAge()%></span>
            <span><%=eleve.getSexe()%></span>
        </div>
        <%
            }
        %>
    </p>
</div>
</body>
</html>
