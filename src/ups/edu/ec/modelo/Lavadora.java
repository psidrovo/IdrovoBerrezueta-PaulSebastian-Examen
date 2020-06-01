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
        double precioFinal = 0;

        int consumoEn = 0;
        switch (super.getConsumoEnergetico()) {
            case 'A':
                consumoEn = 100;
                break;
            case 'B':
                consumoEn = 80;
                break;
            case 'C':
                consumoEn = 60;
                break;
            case 'D':
                consumoEn = 50;
                break;
            case 'E':
                consumoEn = 30;
                break;
            case 'F':
                consumoEn = 10;
                break;
            default:
                System.err.print("EL CODIGO DE CONSUMO ENERGETICO NO PERTENECE A LA TABLA VALOR = 0");
                break;
        }

        int precioPeso = 0;

        if (super.getPeso() >= 0 && super.getPeso() <= 19) {
            precioPeso = 10;
        } else if (super.getPeso() >= 20 && super.getPeso() <= 49) {
            precioPeso = 50;
        } else if (super.getPeso() >= 50 && super.getPeso() <= 79) {
            precioPeso = 80;
        } else if (super.getPeso() >= 80) {
            precioPeso = 100;
        }

        precioFinal = consumoEn + precioPeso;

        if (this.carga > 30) {
            precioFinal += 50;
        }

        return precioFinal;
    }

    @Override
    public String toString() {
        return "Lavadora:  " + super.toString() + "\n\tcarga=" + carga;

    }

}
