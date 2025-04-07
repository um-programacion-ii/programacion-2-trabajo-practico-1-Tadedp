package src;

import src.vehiculos.Vehiculo;

import javax.management.InvalidAttributeValueException;

public class Main {
    public static void main(String[] args) {
        try {
            Vehiculo vehiculo1 = new Vehiculo("AB 123 CD","Ford", 2020, 1000);
            System.out.println("Mostrando información de vehículo1...");
            vehiculo1.mostrarInformacion();

            Vehiculo vehiculo2 = new Vehiculo("EF 456 GH","Fiat", 2015, 500);
            System.out.println("Mostrando información de vehículo2...");
            vehiculo2.mostrarInformacion();

            Vehiculo vehiculo3 = new Vehiculo("IJ 789 KL","Volkswagen", 2022, 1500);
            System.out.println("Mostrando información de vehículo3...");
            vehiculo3.mostrarInformacion();

        } catch (InvalidAttributeValueException e) {
            System.out.println(e.toString());
        }
    }
}
