/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import ups.edu.ec.idao.IElectrodomesticoDAO;
import ups.edu.ec.modelo.Electrodomestico;
import ups.edu.ec.modelo.Lavadora;
import ups.edu.ec.modelo.Television;
import ups.edu.ec.vista.VistaElectrodomestico;

/**
 *
 * @author Paul Idrovo
 */
public class ControladorElectrodomestico {

    private VistaElectrodomestico vista;
    private Electrodomestico modelo;
    private IElectrodomesticoDAO dao;

    public ControladorElectrodomestico(VistaElectrodomestico vista, Electrodomestico modelo, IElectrodomesticoDAO dao) {

        this.vista = vista;
        this.modelo = modelo;
        this.dao = dao;

    }

    public void registrarTelevision() {
        modelo = (Electrodomestico) vista.ingresarTelevision();
        dao.crearTelevision((Television) modelo);
    }

    public void registrarLavadora() {
        modelo = (Electrodomestico) vista.ingresarLavadora();
        dao.crearLavadora((Lavadora) modelo);
    }

    public void verLavadora() {
        vista.mostrarLavadoras(dao.listarLavadora());
    }

    public void verTelevisiones() {
        vista.mostrarTelevisiones(dao.listarTelevision());
    }

}
