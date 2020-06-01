/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import ups.edu.ec.idao.IElectrodomesticoDAO;
import ups.edu.ec.modelo.Electrodomestico;
import ups.edu.ec.modelo.Lavadora;
import ups.edu.ec.modelo.Television;

/**
 *
 * @author Paul Idrovo
 */
public class ElectrodomesticoDAO implements IElectrodomesticoDAO {

    private SortedSet<Electrodomestico> lista;

    public ElectrodomesticoDAO() {
        lista = new TreeSet<>();
    }

    
    @Override
    public void crearTelevision(Television television) {
        lista.add(television);
    }

    @Override
    public void crearLavadora(Lavadora lavadora) {
        lista.add(lavadora);
    }

    @Override
    public List<Lavadora> listarLavadora() {
        List<Lavadora> lstLavadora = new ArrayList<>();
        for (Electrodomestico electrodomestico : lista) {
            if (electrodomestico instanceof Lavadora) {
                lstLavadora.add((Lavadora) electrodomestico);
            }
        }
        return lstLavadora;
    }

    @Override
    public List<Television> listarTelevision() {
        List<Television> lstTelevision = new ArrayList<>();
        for (Electrodomestico electrodomestico : lista) {
            if (electrodomestico instanceof Television) {
                lstTelevision.add((Television) electrodomestico);
            }
        }

        return lstTelevision;
    }

}
