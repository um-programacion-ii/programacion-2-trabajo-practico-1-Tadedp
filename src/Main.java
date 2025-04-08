package src;

import src.vehiculos.Auto;
import src.vehiculos.Camion;
import src.vehiculos.Vehiculo;
import src.vehiculos.VehiculoPrinter;

import javax.management.InvalidAttributeValueException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        VehiculoPrinter vehiculoPrinter = new VehiculoPrinter();
        ArrayList<Vehiculo> arrayVehiculo = new ArrayList<>();

        try {
            arrayVehiculo.add(new Vehiculo("AB 123 CD","Ford", 2020, 1000));
            arrayVehiculo.add(new Vehiculo("EF 456 GH","Fiat", 2015, 500));
            arrayVehiculo.add(new Camion("IJ 789 KL","Volkswagen", 2022, 3000, true));
            arrayVehiculo.add(new Camion("MN 123 OP","Chevrolet", 2019, 2500, false));
            arrayVehiculo.add(new Auto("QR 456 ST","Renault", 2012, 500, 2));
            arrayVehiculo.add(new Auto("UV 789 WX","Seat", 2020, 800, 4));

            for (Vehiculo vehiculo : arrayVehiculo) {
                switch (vehiculo) {
                    case Camion camion -> {
                        System.out.println("Mostrando información de camion...");
                    } case Auto auto -> {
                        System.out.println("Mostrando información de auto...");
                    } default -> {
                        System.out.println("Mostrando información de vehiculo...");
                    }
                }
                vehiculoPrinter.mostrarInformacion(vehiculo);
            }

        } catch (InvalidAttributeValueException e) {
            System.out.println(e.toString());
        }
    }
}
