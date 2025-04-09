package src.vehiculos;

import javax.management.InvalidAttributeValueException;

public class Auto extends Vehiculo{
    private int cantidadPasajeros;

    public Auto() {
    }

    public Auto(String patente, String marca, int anio, double capacidadCargaKg, int cantidadPasajeros) throws InvalidAttributeValueException {
        super(patente, marca, anio, capacidadCargaKg);
        if (cantidadPasajeros < 0) {
            throw new InvalidAttributeValueException("ERROR: Cantidad de pasajeros inválida.");
        }
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) throws InvalidAttributeValueException {
        if (cantidadPasajeros < 0) {
            throw new InvalidAttributeValueException("ERROR: Cantidad de pasajeros inválida.");
        }
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public String getInformacion() {
        String informacionPasajeros = "\n- Cantidad de pasajeros: " + this.cantidadPasajeros + " personas";
        return super.getInformacion() + informacionPasajeros;
    }
}
