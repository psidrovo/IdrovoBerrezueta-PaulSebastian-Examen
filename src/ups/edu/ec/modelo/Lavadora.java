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
public class Lavadora extends Electrodomestico {

    private int carga;

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public double obtenerPrecioFinal() {
        double precioFinal = super.obtenerPrecioFinal();

        if (this.carga > 30) {
            precioFinal += 50;
        }

        return precioFinal;
    }

    @Override
    public String toString() {
        return "Lavadora:  " + super.toString() + "\n\tcarga=" + carga +"\n\tPrecio Final: "+obtenerPrecioFinal();

    }

}
