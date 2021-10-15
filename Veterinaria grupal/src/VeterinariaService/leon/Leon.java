/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeterinariaService.leon;

/**
 *
 * @author efortes
 */
public class Leon {
    private String raza;
    private Integer edad;
    private String pelaje;

    public Leon() {
    }

    public Leon(String raza, Integer edad, String pelaje) {
        this.raza = raza;
        this.edad = edad;
        this.pelaje = pelaje;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    @Override
    public String toString() {
        return "Leon{" + "raza=" + raza + ", edad=" + edad + ", pelaje=" + pelaje + '}';
    }
    
    
}

