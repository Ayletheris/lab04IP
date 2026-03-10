/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ip_lab4;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author PC
 */
public class Utilizator {
    // Atributele de baza
    private String nume;
    private String email;
    private String parolaSetata;
    private boolean esteLogat;
    
    // ATRIBUTUL NOU: Lista de recenzii scrise de acest utilizator
    private List<Recenzie> recenziileMele; 

    // Constructor
    public Utilizator(String nume, String email, String parolaSetata) {
        this.nume = nume;
        this.email = email;
        this.parolaSetata = parolaSetata;
        this.esteLogat = false;
        this.recenziileMele = new ArrayList<>(); // Initializam lista ca fiind goala
    }

    // Metoda de login
    public void login(String emailIntrodus, String parolaIntrodusa) {
        if (this.email.equals(emailIntrodus) && this.parolaSetata.equals(parolaIntrodusa)) {
            this.esteLogat = true;
            System.out.println("Autentificare reusita! Bun venit, " + this.nume + ".");
        } else {
            System.out.println("Eroare! Email sau parola incorecta.");
        }
    }

    // METODA NOUA: Adaugam o recenzie in portofoliul utilizatorului
    public void scrieRecenzie(Recenzie recenzieNoua) {
        if (esteLogat) {
            recenziileMele.add(recenzieNoua);
            System.out.println(this.nume + " a adaugat o recenzie noua in sistem.");
        } else {
            System.out.println("Eroare: Trebuie sa fii logat pentru a scrie o recenzie!");
        }
    }

    // Testarea (metoda main)
    public static void main(String[] args) {
        Utilizator user = new Utilizator("Maria Popescu", "maria@email.com", "parola123");
        
        // Simulam o recenzie creata (presupunand ca ai deja clasa Recenzie in proiect)
        Recenzie recenziaMariei = new Recenzie("Maria Popescu", 5, "Un loc minunat!");
        
        // Incearca sa scrie o recenzie fara sa fie logata (va da eroare)
        user.scrieRecenzie(recenziaMariei);
        
        // Se logheaza cu succes
        user.login("maria@email.com", "parola123");
        
        // Acum poate scrie recenzia
        user.scrieRecenzie(recenziaMariei);
    }
}
