/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.idao;

import java.util.List;
import ups.edu.ec.modelo.Lavadora;
import ups.edu.ec.modelo.Television;

/**
 *
 * @author Paul Idrovo
 */
public interface IElectrodomesticoDAO {

    public void crearTelevision(Television television);

    public void crearLavadora(Lavadora lavadora);

    public List<Lavadora> listarLavadora();

    public List<Television> listarTelevision();
}
