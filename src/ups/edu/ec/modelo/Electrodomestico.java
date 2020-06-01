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
public abstract class Electrodomestico implements Comparable<Electrodomestico> {

    private int codigo;
    private String descripcion;
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private int peso;

    public Electrodomestico(int codigo) {
        this.codigo = codigo;
    }

    public Electrodomestico() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public abstract double obtenerPrecioFinal();

    @Override
    public String toString() {
        return "\n\tcodigo=" + codigo + "\n\tdescripcion=" + descripcion + "\n\tprecioBase=" + precioBase + "\n\tcolor=" + color + "\n\tconsumoEnergetico=" + consumoEnergetico + "\n\tpeso=" + peso
                + "\n\tPrecio final: " + obtenerPrecioFinal();
    }

    @Override
    public int compareTo(Electrodomestico o) {
        return (int) (this.precioBase - o.precioBase);
    }

}
