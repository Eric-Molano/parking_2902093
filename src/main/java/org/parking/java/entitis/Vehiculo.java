package org.parking.java.entitis;

public class Vehiculo {
       //atributos
       //1. modificador de acceso
       //2. tipo del dato de atributo
       //3. Nombre del atributo
       public String placa;
       public TipoVehiculo tipoVehiculo;
    
       //contructor
       //sin parametros
       public Vehiculo() {
    
    }

    public Vehiculo(String placa, TipoVehiculo tipoVehiculo) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
    }
       
}
