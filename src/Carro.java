//-------------------------------------------
// Ingenieria de Software 1
// Autores: Juan Bernardo Henao Orozco
//          Diego Alejandro Parra Medina
//
// Examen Final.
//
//
//Clase Carro
//-------------------------------------------


public class Carro {
    

    //Atributo Placa, sirve para hacer mención a la placa del vehiculo
    private String placa;

    
    //Atributo Galones, sirve para hacer mención a los galones del vehiculo
    private double galones;

    
    //Atributo Modelo, sirve para hacer mención al modelo  del vehiculo
    private int modelo;
    

    //Constructor vacio
    public Carro() {
 
    }
 
    /**
     * Constructor por parametros
     * @param placa
     * @param galones
     * @param modelo
     */
    public Carro(String placa, double galones, int modelo) {
        this.placa = placa;
        this.galones = galones;
        this.modelo = modelo;
    }
    

    /**
     * Metodo encargado de devolver la placa
     * @return placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Metodo encargado de moficiar la placa
     * @param placa
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Metodo encargado de devolver los galones
     * @return galones
     */
    public double getGalones() {
        return galones;
    }

    /**
     * Metodo encargado de moficiar los galones
     * @param galones
     */
    public void setGalones(double galones) {
        this.galones = galones;
    }

    /**
     * Metodo encargado de devolver el modelo
     * @return modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * Metodo encargado de moficiar el modelo
     * @param modelo
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
 
}
