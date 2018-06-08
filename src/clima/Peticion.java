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
public class Peticion implements Clima{
    private List<Observador> observadores;
    private int lluvia, viento, temperatura;
    private Peticion unicaPeticion;

    private Peticion() {
    
    }
    
    public Peticion iniciarPeticion(){
        if(unicaPeticion!=null){
            return unicaPeticion;
        }
        else{
            unicaPeticion = new Peticion();
            return unicaPeticion;
        }
    }
    
    protected void consultarServidor(){
        
    }
    
    public List<Integer> obtenerDatos(){
        List<Integer> datos = null;
        datos.add(this.lluvia);
        datos.add(this.viento);
        datos.add(this.temperatura);
        return datos;
    }

    @Override
    public void añadir(Observador nuevoOb) {
        observadores.add(nuevoOb);
    }

    @Override
    public void eliminar(Observador ob) {
        observadores.remove(ob);
    }

    @Override
    public void notificar() {
        List<Integer> datos = null;
        datos.add(this.lluvia);
        datos.add(this.viento);
        datos.add(this.temperatura);
        for(Observador obs:observadores){
            obs.actualizar(datos);
        }
    }
}
