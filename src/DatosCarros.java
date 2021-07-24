//-------------------------------------------
// Ingenieria de Software 1
// Autores: Juan Bernardo Henao Orozco
//          Diego Alejandro Parra Medina
//
// Examen Final.
//
//
//Clase DatosCarro
//-------------------------------------------

//-------------------
//    Importaciones
//-------------------

import java.util.ArrayList;
import java.util.List;
 
public class DatosCarros {
 

    /**
     * Lista de carros
     */
    private List<Carro> carros = new ArrayList<Carro>();
 

    /**
     * Constructor vacio
     */
    public DatosCarros() {
 
    }
 
    /**
     * metodo encargado de registrar un carro, es decir, añadir un carro a la lista de carros
     * @param carro
     */
    public void registrarCarros(Carro carro){
        carros.add(carro);
    }
 
    /**
     * Metodo encargado de devolver la lista de carros
     * @return
     */
    public List<Carro> consultarCarros(){
        return carros;
    }
}
