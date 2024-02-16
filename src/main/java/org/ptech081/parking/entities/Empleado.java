package org.ptech081.parking.entities;

public class Empleado {
    public int codigoEmpleado;
    public String nombreEmpleado;
    public String apellidoEmpleado;
   

    //constructor
    public Empleado() {
    }


    public Empleado(int codigoEmpleado, String nombreEmpleado, String apellidoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
    }

    
}
