package src.vehiculos;

import javax.management.InvalidAttributeValueException;

public class Camion extends Vehiculo{
    private boolean tieneAcoplado;

    public Camion() {
    }

    public Camion(String patente, String marca, int anio, double capacidadCargaKg, boolean tieneAcoplado) throws InvalidAttributeValueException {
        super(patente, marca, anio, capacidadCargaKg);
        this.tieneAcoplado = tieneAcoplado;
    }

    public boolean getTieneAcoplado() {
        return tieneAcoplado;
    }

    public void setTieneAcoplado(boolean tieneAcoplado) {
        this.tieneAcoplado = tieneAcoplado;
    }

    @Override
    public String getInformacion() {
        String informacionAcoplado;
        if (this.tieneAcoplado) {
            informacionAcoplado = "\n- Tiene acoplado";
        } else {
            informacionAcoplado = "\n- No tiene acoplado";
        }
        return super.getInformacion() + informacionAcoplado;
    }
}
