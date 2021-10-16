package VeterinariaService;

//Maxi Centeno
public class Perro extends Animal {

    public Perro(String nombre, String alimento, byte edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public Perro() {
        super();
    }

    @Override
    public void alimentarse() {
        System.out.println("El perro se alimenta de: " + this.alimento);
    }

    @Override
    public void tambienhago() {
        System.out.println("Mi nombre es:\t" + this.nombre);
        System.out.println("Mi edad:\t" + this.edad);
        System.out.println("Mi raza es:\t" + this.raza);
    }

}
