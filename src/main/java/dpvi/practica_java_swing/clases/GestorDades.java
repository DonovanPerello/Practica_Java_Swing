/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dpvi.practica_java_swing.clases;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author donih
 */
public class GestorDades {
    private List<User> usuaris;
    private List<Juego> jocs;
    private List<Lloguer> lloguers;

    public GestorDades() {
        this.usuaris = new ArrayList<>();
        this.jocs = new ArrayList<>();
        this.lloguers = new ArrayList<>();
        carregarDadesInicials();
    }

    private void carregarDadesInicials() {
        User u1 = new User("Laura", "García", "Pérez", "12345678A", 600111222, new Date());
        User u2 = new User("Marc", "López", "Gómez", "87654321B", 600333444, new Date());
        usuaris.add(u1);
        usuaris.add(u2);

        Juego j1 = new Juego("FIFA 25", "Esports");
        j1.setStock(Plataforma.PS5, 3);
        j1.setStock(Plataforma.SWITCH2, 2);
        jocs.add(j1);

        Juego j2 = new Juego("Cyberpunk 2077", "Acció");
        j2.setStock(Plataforma.XBOX, 4);
        j2.setStock(Plataforma.PC, 1);
        jocs.add(j2);

        LocalDate avui = LocalDate.now();
        LocalDate daci4Dies = avui.plusDays(4);

        LocalDate fa10Dies = avui.minusDays(10);
        LocalDate dataTornadaVençuda = fa10Dies.plusDays(4);

        Lloguer lloguer1 = new Lloguer("1", u1, j1, Plataforma.PS5, avui, daci4Dies, false);
        Lloguer lloguer2 = new Lloguer("2", u2, j2, Plataforma.PC, fa10Dies, dataTornadaVençuda, false);
        lloguers.add(lloguer1);
        lloguers.add(lloguer2);
    }

    public List<User> getUsuaris() { return usuaris; }
    public List<Juego> getJocs() { return jocs; }
    public List<Lloguer> getLloguers() { return lloguers; }
}