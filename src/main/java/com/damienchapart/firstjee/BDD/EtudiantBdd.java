package com.damienchapart.firstjee.BDD;

import com.damienchapart.firstjee.model.Eleve;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EtudiantBdd {
    private Connection connexion;

    public List<Eleve> recupererEtudiants(){
        List<Eleve> Eleves = new ArrayList<Eleve>();
        Statement statement = null;
        ResultSet resultat = null;

        loadDatabase();

        try {
            statement = connexion.createStatement();

            resultat = statement.executeQuery("SELECT nom, prenom FROM eleve");

            while (resultat.next()) {
                String nom = resultat.getString("nom");
                String prenom = resultat.getString("prenom");

                Eleve Etudiant = new Eleve();
                Etudiant.setNom(nom);
                Etudiant.setPrenom(prenom);

                Eleves.add(Etudiant);
            }
        } catch (SQLException e) {
        } finally {
            try {
                if (resultat != null)
                    resultat.close();
                if (statement != null)
                    statement.close();
                if (connexion != null)
                    connexion.close();
            } catch (SQLException ignore) {
            }

        }
        return Eleves;
    }

    private void loadDatabase() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {

        }
        try {
            connexion = DriverManager.getConnection("jdbc:postgresql://localhost:5433/courJEE","damchap","");
            System.out.println("Connexion réussie !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void ajouterEtudiant(Eleve eleve){
        Statement statement = null;
        ResultSet resultat = null;

        loadDatabase();

        try {
            statement = connexion.createStatement();
            // Exécution de la requête d'insertion d'un étudiant avec paramètres
            statement.executeUpdate("INSERT INTO eleve(nom, prenom) VALUES('" + eleve.getNom() + "', '" + eleve.getPrenom() + "');");

        } catch (SQLException e) {
        } finally {
            try {
                if (resultat != null)
                    resultat.close();
                if (statement != null)
                    statement.close();
                if (connexion != null)
                    connexion.close();
            } catch (SQLException ignore) {
            }

        }
    }
}