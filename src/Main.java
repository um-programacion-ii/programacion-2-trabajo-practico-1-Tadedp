package src;

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

            Vehiculo camion = new Camion("IJ 789 KL","Volkswagen", 2022, 1500, true);
            System.out.println("Mostrando información de camión...");
            vehiculoPrinter.mostrarInformacion(camion);

        } catch (InvalidAttributeValueException e) {
            System.out.println(e.toString());
        }
    }
}
