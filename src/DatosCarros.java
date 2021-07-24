import java.util.ArrayList;
import java.util.List;
 
public class DatosCarros {
 
    private List<Carro> carros = new ArrayList<Carro>();
 
    public DatosCarros() {
 
    }
 
    public void registrarCarros(Carro carro){
        carros.add(carro);
    }
 
    public List<Carro> consultarCarros(){
        return carros;
    }
}
