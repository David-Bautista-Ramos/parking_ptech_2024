package org.ptech081.parking;
import org.ptech081.parking.entities.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

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

        Cliente cliente2=new Cliente("Martin", "Suarez", 890044L);

        //invocar el metodo add car
        cliente1.addCar(carrito1);
        cliente1.addCar("ABC 908",TipoVehiculo.BUS);
        
        cliente2.addCar(carrito2);
        cliente2.addCar("ODD 078", TipoVehiculo.MOTO);

        //Crear dos cupos
        Cupo cupo1=new Cupo('A');
        Cupo cupo2=new Cupo('B');

         //Crear 2 registros E/S
        LocalDate fechaInicio = LocalDate.now();
        LocalTime horaInicio = LocalTime.now();
        LocalDate fechaFin = LocalDate.of(2024, Month.MARCH, 24);
        LocalTime horaFin = LocalTime.of(15, 30, 0);
        

        List<Registro> misRegistros = new ArrayList<Registro>();
        //Crear Registro
        Registro registro1 = new Registro(fechaInicio, horaInicio, fechaFin, horaFin, 5000L,cupo1,cliente1.misCarros.get(0),cliente1);
        
        Registro registro2 = new Registro(fechaInicio, horaInicio, fechaFin, horaFin, 7000L, cupo2,cliente2.misCarros.get(1),cliente2);

        
        //añadir el registro a la lista
        misRegistros.add(registro1);
        misRegistros.add(registro2);
        System.out.println("Registros de E/S parking");
        for(Registro r : misRegistros){
            System.out.println("Cliente "+ r.cliente.nombres + " " +
                                        r.cliente.apellidos + "|" +
                                        r.carro.placa + " " +
                                        r.carro.tipoVehiculo + "|" + 
                                        r.valor + "|" +
                                        r.fechaInicio + " " +
                                        r.horaInicio+ "|" +
                                        r.fechaFin + " " +
                                        r.horaFin +
                                         "|");
        }
        }
      
    }
