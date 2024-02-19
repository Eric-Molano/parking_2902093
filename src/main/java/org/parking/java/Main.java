package org.parking.java;

import org.parking.java.entitis.TipoVehiculo;
import org.parking.java.entitis.Vehiculo;
import org.parking.java.entitis.Cliente;
public class Main {
    public static void main(String[] args) {
        //Sistema de gestion de E/s
        // de vehiculos en un parking
        //1. dos carritos
        //Objetos(instancia)
        //1 tipo de clase
        //2 nombre del objeto
        //3 asignacion de new
        //4. constructor
                 
        Vehiculo carrito1 = new Vehiculo("ASD 789",TipoVehiculo.PARTICULAR);
        

        Vehiculo carrito2 = new Vehiculo("JGF 785",TipoVehiculo.MOTO);

        
        
        
        // crear un cliente
        Cliente cliente1 = new Cliente("Cristian", "Casriblanco", 1016008031L);
        
        //invocar el metodo addCar
        cliente1.addcar(carrito1);
        cliente1.addcar(carrito2);
        cliente1.addCar("WWW ERT", TipoVehiculo.MOTO);
        //recorrer la lista de vehiculo
        for(Vehiculo veh :cliente1.misVehiculos){
         System.out.println(veh.placa);
         System.out.println(veh.tipoVehiculo);
         System.out.println("------------");
        }
     
    }

}