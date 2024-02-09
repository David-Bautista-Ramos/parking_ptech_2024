package org.ptech081.parking;
import org.ptech081.parking.entities.*;


public class Main {
    public static void main(String[] args) {
        
        // crear carro con los contructores:
        Carro carrito1 = new Carro("KDO 234",
                                         TipoVehiculo.MOTO);
        Carro carrito2 = new Carro();
        carrito2.placa="AST 789";
        carrito2.tipoVehiculo= TipoVehiculo.CAMIONETA;
        //crear cliente
        Cliente cliente1=new Cliente("Sofia", 
                                     "Diaz", 
                                  12375644L);

        //invocar el metodo add car
        cliente1.addCar(carrito1);
        cliente1.addCar("ABC 908",TipoVehiculo.BUS);
        //recorrer los carros del cliente
        for(Carro c :cliente1.misCarros){
                System.err.println(c.placa+ " " + c.tipoVehiculo);
                System.out.println("----------------");
        }

    }
}