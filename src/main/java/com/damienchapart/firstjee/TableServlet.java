package com.damienchapart.firstjee;

import com.damienchapart.firstjee.model.Eleve;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "TableServlet", value = "/TableServlet")
public class TableServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // jsp table
        // envoyer un tableau d'eleves
        // creer plusieurs eleves
        Eleve eleve1 = new Eleve(1, "Chapart", "Damien", 30, "M");
        Eleve eleve2 = new Eleve(2, "Chapart", "Damien", 30, "M");
        Eleve eleve3 = new Eleve(3, "Chapart", "Damien", 30, "M");
        Eleve eleve4 = new Eleve(4, "Chapart", "Damien", 30, "M");
        Eleve eleve5 = new Eleve(5, "Chapart", "Damien", 30, "M");
        Eleve eleve6 = new Eleve(6, "Chapart", "Damien", 30, "M");

        ArrayList<Eleve> eleves = new ArrayList<>();
        eleves.add(eleve1);
        eleves.add(eleve2);
        eleves.add(eleve3);
        eleves.add(eleve4);
        eleves.add(eleve5);
        eleves.add(eleve6);
        // return eleves in jsp
        request.setAttribute("eleves", eleves);
        this.getServletContext().getRequestDispatcher("/table.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
