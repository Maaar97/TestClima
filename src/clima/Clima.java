/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clima;

/**
 *
 * @author mariano
 */
public interface Clima {
    public void añadir(Observador nuevoOb);
    public void eliminar(Observador ob);
    public void notificar();
}
