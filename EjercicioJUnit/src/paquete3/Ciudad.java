/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Ciudad {
    private int poblacion;
    private String nombre;
    
    public Ciudad(){
    }
    
    public void establecerPoblacion(int p){
        poblacion = p;
    }
    public void establecerNombres(String n){
        nombre = n;
    }
    
    public int obtenerPoblacion(){
        return poblacion;
    }
    public String obtenerNombres(){
        return nombre;
    }

    @Override
    public String toString() {
        String c = String.format("Ciudad de Ecuador\n "
                + "Nombre: %s\n\n\t"
                + "Población: %d\n"
                ,obtenerNombres()
                ,obtenerPoblacion()
        );
        return c;
    } 
}
