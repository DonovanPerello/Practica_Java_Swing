/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dpvi.practica_java_swing.clases;

import java.util.HashMap;
import java.util.Map;

public class Juego {
    private String nom;
    private String genere;
    private Map<Plataforma, Integer> stock;

    public Juego(String nom, String genere) {
        this.nom = nom;
        this.genere = genere;
        this.stock = new HashMap<>();
    }

    public void setStock(Plataforma plataforma, int cantidad) {
        stock.put(plataforma, cantidad);
    }

    public int getStock(Plataforma plataforma) {
        return stock.getOrDefault(plataforma, 0);
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return nom;
    }
    
}