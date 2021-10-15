/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato;

import java.util.logging.Logger;

/**
 *
 * @author marco
 */
public class Gato {
    
    private String nombre;
    private int edad;

    public Gato() {
    }

    public Gato(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    private static final Logger LOG = Logger.getLogger(Gato.class.getName());

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public static Logger getLOG() {
        return LOG;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
