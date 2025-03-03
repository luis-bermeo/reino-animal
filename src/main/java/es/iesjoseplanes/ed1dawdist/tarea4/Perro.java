package es.iesjoseplanes.ed1dawdist.tarea4;

/*Clase que crea un perro, que a su vez es un tipo de Animal*/
public class Perro extends Mamifero {
    
    //Constructor
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    void dormir() {
        System.out.println("El perro debe dormir en funcion del ejericio que realiza");
    }

    void ladrar() {
        System.out.println("Es una labor social de guarda");
    }

    void gruñir() {
        System.out.println("Es un sonido ronco y sostenido");
    }

    @Override
    void relacionar(Animal p) {
        System.out.println("Con el perro: " + p.getNombre());
    }

}
