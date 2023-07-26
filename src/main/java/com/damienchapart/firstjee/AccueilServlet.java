package com.damienchapart.firstjee;

import com.damienchapart.firstjee.BDD.EtudiantBdd;
import com.damienchapart.firstjee.model.Eleve;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "AccueilServlet", value = "/accueil")
public class AccueilServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EtudiantBdd tableEtudiant = new EtudiantBdd();
        List<Eleve> listeEtudiants = tableEtudiant.recupererEtudiants();
        request.setAttribute("etudiants", listeEtudiants);

        this.getServletContext().getRequestDispatcher("/accueil.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        Eleve e = new Eleve();
        e.setNom(request.getParameter("nom"));
        e.setPrenom(request.getParameter("prenom"));
        System.out.println("nom : " + e.getNom());
        System.out.println("prenom : " + e.getPrenom());
        EtudiantBdd tableEtudiant = new EtudiantBdd();
        tableEtudiant.ajouterEtudiant(e);
// print the list of students
        List<Eleve> listeEtudiants = tableEtudiant.recupererEtudiants();
        request.setAttribute("etudiants", listeEtudiants);
        this.getServletContext().getRequestDispatcher("/accueil.jsp").forward(request, response);
        doGet(request, response);
    }
}
