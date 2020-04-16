package app;

import java.util.ArrayList;
import java.util.List;

public class Pooflix {

    String buscarPorTitulo;
    String titulo;
    String buscarPelicula;
    String actor;

    public List<Pelicula> pelicula = new ArrayList<>();
    public List<Serie> serie = new ArrayList<>();

    public Contenido buscarPorTilulo (Contenido titulo){
        return null;
    }

    public Serie buscarSerie (String titulo){

        for (Serie s : this.serie){
            if(s.Titulo.equals(titulo))
            return s;

        }
        return null;
    }
    public void inicializarCatalogo(){
        
        Serie breakingB = new Serie();
        breakingB.Titulo = "Breaking Bad";
        
        Genero genero = new Genero();
        genero.nombre = "Drama";
        breakingB.genero.add(genero);
        
        Temporada t5 = new Temporada();
        t5.numero = 5;

        Episodio ep = new Episodio();

        ep.numero = 7;
        ep.nombre = "Say my name";
        ep.duracion = 43;

        t5.episodio.add(ep);

        Episodio epOtro = new Episodio();

        epOtro.numero = 5;
        epOtro.nombre = "Ozymandias";
        epOtro.duracion = 41;

        t5.episodio.add(epOtro);
        breakingB.temporadas.add(t5);
        this.serie.add(breakingB);
    }

}
