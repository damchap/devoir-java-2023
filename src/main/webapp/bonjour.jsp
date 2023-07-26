
<%-- jspl import --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String nom = request.getParameter("nom");
    String prenom = request.getParameter("prenom");
    String age = request.getParameter("age");
    String sexe = request.getParameter("sexe");
    String adresse = request.getParameter("adresse");
    String ville = request.getParameter("ville");
    String codePostal = request.getParameter("codePostal");
    String pays = request.getParameter("pays");
    String email = request.getParameter("email");
    String telephone = request.getParameter("telephone");
    String mobile = request.getParameter("mobile");
    String fax = request.getParameter("fax");
    String siteWeb = request.getParameter("siteWeb");
    String societe = request.getParameter("societe");
    String poste = request.getParameter("poste");
    String commentaire = request.getParameter("commentaire");
    String[] loisirs = request.getParameterValues("loisirs");
    String[] langues = request.getParameterValues("langues");
    String[] competences = request.getParameterValues("competences");
    String[] experiences = request.getParameterValues("experiences");
    String[] formations = request.getParameterValues("formations");
    String[] centresInteret = request.getParameterValues("centresInteret");
    String[] references = request.getParameterValues("references");
    String[] autres = request.getParameterValues("autres");
    String[] reseauxSociaux = request.getParameterValues("reseauxSociaux");
    String[] autresInfos = request.getParameterValues("autresInfos");
    String[] autresInfos2 = request.getParameterValues("autresInfos2");
%>
</body>
</html>
