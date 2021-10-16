
package VeterinariaService;



public class Leon extends Animal {

    public Leon(String nombre, String alimento, byte edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public Leon() {
        super();
    }

    @Override
    public void alimentarse() {
        System.out.println("El leon se alimenta de: " + this.alimento);
    }
    @Override
    public void tambienhago(){
        System.out.println("Mi nombre es:\t" + this.nombre);
        System.out.println("Mi edad:\t" + this.edad);
        System.out.println("Mi raza es:\t" + this.raza);
    }

}