/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.vista;

import java.util.List;
import java.util.Scanner;
import ups.edu.ec.modelo.Lavadora;
import ups.edu.ec.modelo.Television;

/**
 *
 * @author Paul Idrovo
 */
public class VistaElectrodomestico {

    private Scanner sc = new Scanner(System.in);

    public Lavadora ingresarLavadora() {
        Lavadora newLavadora = new Lavadora();
        System.out.println("***INGRESAR LAVADORA***");
        System.out.println("Ingrese el codigo");
        newLavadora.setCodigo(sc.nextInt());
        System.out.println("Ingrese la descripcion");
        newLavadora.setDescripcion(validarString());
        System.out.println("Ingrese el precio base");
        newLavadora.setPrecioBase(sc.nextDouble());
        System.out.println("Ingrese el color");
        newLavadora.setColor(validarString());
        System.out.println("Ingrese el consumo energetico");
        String consumoEn = validarString().toUpperCase();
        char consEnergetico = consumoEn.charAt(0);
        newLavadora.setConsumoEnergetico(consEnergetico);
        System.out.println("Ingrese el peso");
        newLavadora.setColor(validarString());
        System.out.println("Ingrese la carga");
        newLavadora.setCarga(sc.nextInt());
        System.out.println("***DATOS INGRESADOS***");
        return newLavadora;
    }

    public Television ingresarTelevision() {
        Television newTelevision = new Television();
        System.out.println("***INGRESAR TELEVISOR***");
        System.out.println("Ingrese el codigo");
        newTelevision.setCodigo(sc.nextInt());
        System.out.println("Ingrese la descripcion");
        newTelevision.setDescripcion(validarString());
        System.out.println("Ingrese el precio base");
        double precioBa = Double.parseDouble(validarString());
        newTelevision.setPrecioBase(precioBa);
        System.out.println("Ingrese el color");
        newTelevision.setColor(sc.nextLine());
        System.out.println("Ingrese el consumo energetico");
        String consumoEn = validarString().toUpperCase();
        char consEnergetico = consumoEn.charAt(0);
        newTelevision.setConsumoEnergetico(consEnergetico);
        System.out.println("Ingrese el peso");
        newTelevision.setColor(validarString());
        System.out.println("Ingrese la resolucion");
        newTelevision.setResolucion(sc.nextInt());
        System.out.println("Tiene HDMI Y=SI Cualquier letra NO");
        boolean hdmi = false;
        if (validarString().toUpperCase().equals("Y")) {
            hdmi = true;
        }
        newTelevision.setPuertoHDMI(hdmi);
        System.out.println("***DATOS INGRESADOS***");
        return newTelevision;
    }

    public void mostrarLavadoras(List<Lavadora> listaLavadora) {
        for (Lavadora lavadora : listaLavadora) {
            System.out.println(lavadora);
        }

    }

    public void mostrarTelevisiones(List<Television> listaTelevision) {
        for (Television television : listaTelevision) {
            System.out.println(television);
        }
    }

    public String validarString() {
        String txt;
        while (true) {
            txt = sc.nextLine();
            if (!txt.equals("")) {
                break;
            } else {
                System.out.println("Vuelva a Ingresar");
            }
        }
        return txt;
    }
}
