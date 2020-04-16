package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Contenido
 */


public class Contenido {

    public String Titulo;
    public Director director;
    public Premio premio;
    public Genero genero;
    public int duracion;
    public String reseña;
    public double TiempoVisto;
    
    public List<Genero> generos = new ArrayList<>();
    public List<Actor> actores = new ArrayList<>();
    public List<Director> directores = new ArrayList<>();
    public List<Premio> premios = new ArrayList<>();

    public boolean  visto(){
        return false;
    }

    public void reproducir (){
        System.out.println("reproduciendo"+this.Titulo);
    }
    public void pausar()  {
        System.out.println("pausando");

    }
}