/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clima;

import java.util.List;

/**
 *
 * @author mariano
 */
public class Widget implements Observador{

    private int lluvia, viento, temperatura;
    private Peticion peticion;
    
    public void configurarDatos(){
        
    }
    
    @Override
    public void actualizar(List<Integer> datos) {
        lluvia = datos.get(0);
        viento = datos.get(1);
        temperatura = datos.get(2);
    }
    
}
