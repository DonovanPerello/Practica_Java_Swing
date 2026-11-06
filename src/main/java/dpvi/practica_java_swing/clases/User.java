/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dpvi.practica_java_swing.clases;
import java.util.Date;

/**
 *
 * @author donih
 */
public class User {
    
    private String nom;
    private String llinatge1;
    private String llinatge2;
    private String dni;
    private int telefon;
    private Date dataRegistre;

    public User(String nom, String llinatge1, String llinatge2, String dni, int telefon, Date dataRegistre) {
        this.nom = nom;
        this.llinatge1 = llinatge1;
        this.llinatge2 = llinatge2;
        this.dni = dni;
        this.telefon = telefon;
        this.dataRegistre = dataRegistre;
    }

    public String getNom() {
        return nom;
    }

    public String getLlinatge1() {
        return llinatge1;
    }

    public String getLlinatge2() {
        return llinatge2;
    }

    public String getDni() {
        return dni;
    }

    public int getTelefon() {
        return telefon;
    }

    public Date getDataRegistre() {
        return dataRegistre;
    }

    @Override
    public String toString() {
        return this.nom + " " + this.llinatge1;
    }
    
    
    
}
