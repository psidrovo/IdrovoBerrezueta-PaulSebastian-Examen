/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.test;

import java.util.Scanner;
import ups.edu.ec.controlador.ControladorElectrodomestico;
import ups.edu.ec.dao.ElectrodomesticoDAO;
import ups.edu.ec.idao.IElectrodomesticoDAO;
import ups.edu.ec.modelo.Electrodomestico;
import ups.edu.ec.vista.VistaElectrodomestico;

/**
 *
 * @author Paul Idrovo
 */
public class test {

    static VistaElectrodomestico vista = new VistaElectrodomestico();
    static Electrodomestico modelo;
    static IElectrodomesticoDAO dao = new ElectrodomesticoDAO();

    static ControladorElectrodomestico controladorElec = new ControladorElectrodomestico(vista, modelo, dao);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("MENU");
            System.out.println("1. Ingresar Television");
            System.out.println("2. Ingresar Lavadora");
            System.out.println("3. Mostrar Lavadora");
            System.out.println("4. Mostrar Televisiones");

            int num = sc.nextInt();

            switch (num) {
                case 1:
                    controladorElec.registrarTelevision();
                    break;
                case 2:
                    controladorElec.registrarLavadora();
                    break;
                case 3:
                    controladorElec.verLavadora();
                    break;
                case 4:
                    controladorElec.verTelevisiones();
                    break;
                default:
                    System.err.print("OPCION NO VALIDAD");
            }
        }

    }

}
