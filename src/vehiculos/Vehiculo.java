package src.vehiculos;

import javax.management.InvalidAttributeValueException;

public class Vehiculo {
    private String patente;
    private String marca;
    private int anio;
    private double capacidadCargaKg;

    public Vehiculo() {
    }

    public Vehiculo(String patente, String marca, int anio, double capacidadCargaKg) throws InvalidAttributeValueException {
        if (patente == null || patente.isEmpty()) {
            throw new InvalidAttributeValueException("ERROR: Patente inválida.");
        }

        if (marca == null || marca.isEmpty()) {
            throw new InvalidAttributeValueException("ERROR: Marca inválida.");
        }

        if (anio < 1950 || anio > 2025) {
            throw new InvalidAttributeValueException("ERROR: Año inválido.");
        }

        if (capacidadCargaKg < 0) {
            throw new InvalidAttributeValueException("ERROR: Capacidad de carga inválida.");
        }

        this.patente = patente;
        this.marca = marca;
        this.anio = anio;
        this.capacidadCargaKg = capacidadCargaKg;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) throws InvalidAttributeValueException {
        if (patente == null || patente.isEmpty()) {
            throw new InvalidAttributeValueException("ERROR: Patente inválida.");
        }
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) throws InvalidAttributeValueException {
        if (marca == null || marca.isEmpty()) {
            throw new InvalidAttributeValueException("ERROR: Marca inválida.");
        }
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) throws InvalidAttributeValueException {
        if (anio < 1950 || anio > 2025) {
            throw new InvalidAttributeValueException("ERROR: Año inválido.");
        }
        this.anio = anio;
    }

    public double getCapacidadCargaKg() {
        return capacidadCargaKg;
    }

    public void setCapacidadCargaKg(double capacidadCargaKg) throws InvalidAttributeValueException {
        if (capacidadCargaKg < 0) {
            throw new InvalidAttributeValueException("ERROR: Capacidad de carga inválida.");
        }
        this.capacidadCargaKg = capacidadCargaKg;
    }

    public void mostrarInformacion(){
        System.out.println("- Patente: " + this.patente + "\n" +
                "- Marca: " + this.marca + "\n" +
                "- Año: " + this.anio + "\n" +
                "- Capacidad de carga: " + this.capacidadCargaKg + " kg.");
    }
}
