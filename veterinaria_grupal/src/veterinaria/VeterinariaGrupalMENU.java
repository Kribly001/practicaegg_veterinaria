 
package Veterinaria;

import VeterinariaService.Animal;
import VeterinariaService.Gato;
import VeterinariaService.Leon;
import VeterinariaService.Perro;


public class VeterinariaGrupalMENU {

  
    public static void main(String[] args) {
        Animal Perro = new Perro("Rocky", "Huesos", (byte) 3, "Pitbull");
        Perro.alimentarse();
        System.out.println("Otras curiosidades de mi");
        Perro.tambienhago();
        System.out.println("------------------------");
        Animal Gato = new Gato("Blanquita", "Croquetas", (byte) 4, "Mestizo");
        Gato.alimentarse();
        System.out.println("Otras curiosidades de mi");
        Gato.tambienhago();
        System.out.println("-------------------------");
        Animal Leon = new Leon("Grandote", "Seres vivos", (byte) 7, "Negro");
        Leon.alimentarse();
        System.out.println("Otras curiosidades de mi");
        Leon.tambienhago();
        System.out.println("-------------------------");

    }

}

    

