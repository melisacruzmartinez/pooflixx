package app;

import java.util.ArrayList;
import java.util.List;

/**
 ** Temporada 
 */

public class Temporada {
    public int numero;
    public List<Episodio> episodio= new ArrayList<>();
    
    public Episodio getEpisodio(int nro)
    {
        //Recorre cada episodio
        //si el nro de episodio del ciclo es igual a "nro"
        // Devuelve ese episodio
        for (Episodio epi : this.episodio){
            if(epi.numero == nro)
            {
                return epi;
            }
        }
        return null;
    
    }
}

