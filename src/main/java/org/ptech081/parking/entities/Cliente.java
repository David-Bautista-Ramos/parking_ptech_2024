package org.ptech081.parking.entities;
import java.util.List;
import java.util.ArrayList;

public class Cliente {
 public String nombres;
 public String apellidos;
 public long identificacion;
 public List<Carro> misCarros;
 
public Cliente() {
}

public Cliente(String nombres, String apellidos, long identificacion) {
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.identificacion = identificacion;
    this.misCarros= new ArrayList<Carro>();
}
//primero sobrecarga de addCar
public void addCar (Carro car){
    this.misCarros.add(car);
}
 //segunda sobrecarga
 public void addCar(String placa,
                    TipoVehiculo tv){
        Carro car = new Carro(placa, tv);
        this.misCarros.add(car);


 }
}
