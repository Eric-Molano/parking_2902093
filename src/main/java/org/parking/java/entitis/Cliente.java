package org.parking.java.entitis;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
    public String nombre;
    public String apellido;
    public long numeroIdentificasion;
    public List<Vehiculo>misVehiculos = new ArrayList<Vehiculo>(); 
    
    // Definir metodo de clase
    //addCar
    public void addcar(Vehiculo vehiculo){
        //añadir al carrito a la lista
        //this:para acceder
        //
        this.misVehiculos.add(vehiculo);   
    }
// otra sobrecarga del metodo
// addCar
public void addCar(String placa,
                   TipoVehiculo tv){
        Vehiculo v = new  Vehiculo();
        v.placa = placa;
        v.tipoVehiculo = tv;
        this.misVehiculos.add(v);           
                   }
public Cliente() {
}
public Cliente(String nombre, String apellido, long numeroIdentificasion) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.numeroIdentificasion = numeroIdentificasion;
}
                
                
                
                }
