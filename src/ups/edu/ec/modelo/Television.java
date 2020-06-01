/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.modelo;

/**
 *
 * @author Paul Idrovo
 */
public class Television extends Electrodomestico {

    private int resolucion;
    private boolean puertoHDMI;

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }

    @Override
    public double obtenerPrecioFinal() {
        double precioFinal = super.obtenerPrecioFinal();
        
        if (this.resolucion > 40) {
            precioFinal = precioFinal * 1.30;
        }
        if (this.puertoHDMI) {
            precioFinal += 50;
        }

        return precioFinal;
    }

    @Override
    public String toString() {
        return "Television:" + super.toString() + "\n\tresolucion=" + resolucion + "\n\tpuertoHDMI=" + puertoHDMI +"\n\tPrecio Final: "+obtenerPrecioFinal();
    }

}
