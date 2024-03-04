package org.parking.java;



import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.parking.java.entities.Cliente;
import org.parking.java.entities.Cupo;
import org.parking.java.entities.Empleado;
import org.parking.java.entities.Pago;
import org.parking.java.entities.TipoVehiculo;
import org.parking.java.entities.Vehiculo; 

public class Main {
    public static void main(String[] args) {
        //Sistema de gestion E/S
        // de vehiculos en un parking
        //1. dos carritos
        //Objetos (instancias)
        //1. Tipo de clase 
        //2. nombre del obejeto
        //3. asignacion y new 
        //4. constructor del obejto
        Vehiculo carrito1 = new Vehiculo ("ASD 789", TipoVehiculo.PARTICULAR);
        carrito1.setPlaca("ASD 789"); 
        carrito1.setTipoVehiculo( TipoVehiculo .PARTICULAR); 

        Vehiculo carrito2 = new Vehiculo ("ASF 321", TipoVehiculo.MOTO); 
        carrito2.setPlaca("ASF 321"); 
        carrito2.setTipoVehiculo(TipoVehiculo .MOTO);
        Vehiculo motico = new Vehiculo();
        motico.setPlaca("XHJ 567");
    //crear(instanciar) un cliente
    Cliente cliente1 = new Cliente();
    cliente1.nombre = "Eric"; 
    cliente1.apellidos =" Molano Galindo";
    cliente1.numeroIdentificacion = 1031540737L;

    Cliente cliente2 = new Cliente();
    cliente2.nombre = "Cristian";
    cliente2.apellidos ="Castiblanco";
    cliente2.numeroIdentificacion = 1013112797L;
    

    
    //Invocar el metodo addVehicle
    cliente1.addVehicle(carrito1);
    cliente2.addVehicle(carrito2);
    cliente1.addVehicle("ESE 456", TipoVehiculo.CAMION);
    cliente2.addVehicle("WEE 756", TipoVehiculo.CAMIONETA);


    //instanciar cupos:
    Cupo cupito1= new Cupo('A');
    Cupo cupito2 = new Cupo('B');

    LocalDateTime fechaHoraInicio = LocalDateTime.of(2024, Month.FEBRUARY, 1, 15, 30, 0);
    LocalDateTime fechaHoraFin = LocalDateTime.of(2024, Month.FEBRUARY,10,6,15,5); 

    Empleado empleado = new Empleado( "Juan" , "Pérez" , "400.0");
    Pago pago1 = new Pago(fechaHoraInicio, 
                            fechaHoraFin, 
                            5000.0, 
                            cliente1.misVehiculos.get(0), 
                            cupito1,
                            empleado);
    Pago pago2 = new Pago(fechaHoraInicio, 
                            fechaHoraFin, 
                            10000.0, 
                            cliente1.misVehiculos.get(1), 
                            cupito2,
                            empleado);


    //añadir pagos a una lista de pagos 
 List<Pago> misPagos = new ArrayList<Pago>();
    misPagos.add(pago1);
    misPagos.add(pago2);

// Crear un nuevo empleado


    

    //recorrer los pagos para mostrar informacion
    for( Pago p: misPagos )
    
    
    {
//evidenciar:
//mostrar:
//  -placa del vehiculo
//  -valor pago
//  -fecha y hora de inicio
//  -fecha y hora de fin 
//  -cupo (nombre)
System.out.println("|Placa:" + p.getVehiculo().getPlaca()  + "|" +
            "|valor:" + p.getValor() + "|" +
            "|fecha y hora entrada:" + p.getFechaHoraInicio().toString() + "|" +
            "|fecha y hora fin:" + p.getFechaHoraFin().toString() + "|" +
            "|cupo:" + p.getCupo().getNombre() + "|" +
            "|empleado" + p.getEmpleado().getCodigo() + "|" );
    }
 
    }

} 