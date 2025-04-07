package src.vehiculos;

public class VehiculoPrinter {
    public VehiculoPrinter() {
    }

    public void mostrarInformacion(Vehiculo vehiculo){
        System.out.println("- Patente: " + vehiculo.getPatente() + "\n" +
                "- Marca: " + vehiculo.getMarca() + "\n" +
                "- Año: " + vehiculo.getAnio() + "\n" +
                "- Capacidad de carga: " + vehiculo.getCapacidadCargaKg() + " kg.");
    }
}
