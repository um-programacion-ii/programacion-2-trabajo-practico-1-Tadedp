package src;

import src.vehiculos.Auto;
import src.vehiculos.Camion;
import src.vehiculos.Vehiculo;
import src.vehiculos.VehiculoPrinter;

import javax.management.InvalidAttributeValueException;

public class Main {
    public static void main(String[] args) {
        VehiculoPrinter vehiculoPrinter = new VehiculoPrinter();

        try {
            Vehiculo vehiculo1 = new Vehiculo("AB 123 CD","Ford", 2020, 1000);
            System.out.println("Mostrando información de vehículo1...");
            vehiculoPrinter.mostrarInformacion(vehiculo1);

            Vehiculo vehiculo2 = new Vehiculo("EF 456 GH","Fiat", 2015, 500);
            System.out.println("Mostrando información de vehículo2...");
            vehiculoPrinter.mostrarInformacion(vehiculo2);

            Vehiculo camion1 = new Camion("IJ 789 KL","Volkswagen", 2022, 3000, true);
            System.out.println("Mostrando información de camion1...");
            vehiculoPrinter.mostrarInformacion(camion1);

            Vehiculo camion2 = new Camion("MN 123 OP","Chevrolet", 2019, 2500, false);
            System.out.println("Mostrando información de camion2...");
            vehiculoPrinter.mostrarInformacion(camion2);

            Vehiculo auto1 = new Auto("QR 456 ST","Renault", 2012, 500, 2);
            System.out.println("Mostrando información de auto1...");
            vehiculoPrinter.mostrarInformacion(auto1);

            Vehiculo auto2 = new Auto("UV 789 WX","Seat", 2020, 800, 4);
            System.out.println("Mostrando información de auto2...");
            vehiculoPrinter.mostrarInformacion(auto2);

        } catch (InvalidAttributeValueException e) {
            System.out.println(e.toString());
        }   
    }
}
