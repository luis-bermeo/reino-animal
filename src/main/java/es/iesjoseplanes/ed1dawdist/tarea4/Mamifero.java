package es.iesjoseplanes.ed1dawdist.tarea4;

/*Clase que crea un mamifero, tipo de animal*/
public class Mamifero extends Animal {
    
    //Constructor
    public Mamifero(String nombre) {
        super(nombre);
    }

    @Override
    void reproducir() {
        System.out.println("La reproduccion es vivipara");
    }

    @Override
    void relacionar(Animal m) {
        System.out.println("Con el mamifero: " + m.getNombre());
    }
}
