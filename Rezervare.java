/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ip_lab4;

/**
 *
 * @author PC
 */
package org.example;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Rezervare {
    private String numeClient;
    private double sumaPlata;
    
    // Exact ca in clasa ta, blocam modificarea directa a statusului din afara
    @Setter(AccessLevel.NONE)
    private boolean statusConfirmare;

    // Metoda importanta
    public void proceseazaPlata() {
        if (!statusConfirmare) {
            System.out.println("Se proceseaza plata de " + sumaPlata + " RON pentru clientul " + numeClient + "...");
            this.statusConfirmare = true;
            System.out.println("Plata acceptata. Rezervarea este CONFIRMATA!");
        } else {
            System.out.println("Eroare: Rezervarea este deja platita.");
        }
    }

    // Testarea (metoda main)
    public static void main(String[] args) {
        // Parametrul 3 este false (statusConfirmare)
        Rezervare rev = new Rezervare("Alexandru Ionescu", 1250.0, false);
        
        rev.proceseazaPlata();
    }
}