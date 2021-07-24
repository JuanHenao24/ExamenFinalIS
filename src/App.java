public class App {
    public static void main(String[] args) throws Exception {
        
        DatosCarros dc = new DatosCarros();
        
        Carro carro1 = new Carro("TUV124", 12, 2021);
        Carro carro2 = new Carro("NEL779", 32, 2008);

        dc.registrarCarros(carro1);
        dc.registrarCarros(carro2);

        for (Carro carro : dc.consultarCarros()) {
            System.out.println("Carro: " + carro.getPlaca());
        }

    }
}
