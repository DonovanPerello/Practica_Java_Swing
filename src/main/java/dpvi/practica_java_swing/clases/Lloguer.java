/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dpvi.practica_java_swing.clases;

/**
 *
 * @author donih
 */
import java.time.LocalDate;
import java.util.Date;

public class Lloguer {
    private String numRegistre; 
    private User usuari;
    private Juego joc;
    private Plataforma plataforma;
    private LocalDate dataInici;
    private LocalDate dataTornada;
    private boolean retornat; 

    public Lloguer(String numRegistre, User usuari, Juego joc, Plataforma plataforma, LocalDate dataInici, LocalDate dataTornada, boolean retornat) {
        this.numRegistre = numRegistre;
        this.usuari = usuari;
        this.joc = joc;
        this.plataforma = plataforma;
        this.dataInici = dataInici;
        this.dataTornada = dataTornada;
        this.retornat = retornat;
    }

    

    public String getNumRegistre() {
        return numRegistre;
    }

    public User getUsuari() {
        return usuari;
    }

    public Juego getJoc() {
        return joc;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public LocalDate getDataInici() {
        return dataInici;
    }

    public LocalDate getDataTornada() {
        return dataTornada;
    }

    public boolean isRetornat() {
        return retornat;
    }
    
    public void setRetornat(boolean retornat){
        this.retornat = retornat;
    }
}