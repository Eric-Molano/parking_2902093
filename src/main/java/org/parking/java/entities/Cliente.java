package org.parking.java.entities;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
    public String nombre;
    public String apellidos;
    public Long numeroIdentificacion;
    public List<Vehiculo> misVehiculos = new ArrayList<Vehiculo>();


public Cliente() {
    }


public Cliente(String nombre, 
               String apellidos, 
               Long numeroIdentificacion) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.numeroIdentificacion = numeroIdentificacion;
}




public Cliente(String nombre, 
               String apellidos, 
               Long numeroIdentificacion, 
               List<Vehiculo> misVehiculos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroIdentificacion = numeroIdentificacion;
        this.misVehiculos = misVehiculos;
    }
public void addVehicle (Vehiculo vehiculo) {
    //anadir el carrito a la lista
    //this: para acceder a atributos 
    //y metodos al interior del objeto
    //NOTA: usenla al interior de metodos 
    this.misVehiculos.add(vehiculo);
}
//Otra sobrecarga del metodo 
//addVehicle
public void addVehicle(String placa,
                    TipoVehiculo tv) {
            Vehiculo v = new Vehiculo();
            v.placa = placa ;
            v.tipoVehiculo = tv ;
    this.misVehiculos.add(v);

                    }

}