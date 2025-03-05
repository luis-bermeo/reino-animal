package es.iesjoseplanes.ed1dawdist.tarea4;

/**Clase que crea un gato, que es un tipo de Animal*/
public class Gato extends Mamifero {
    private int pelos;
    
    public int getPelos() {
        return pelos;
    }
    
    public void setPelos(int pelos){
        this.pelos = pelos;
    }
    
    
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    void dormir() {
        System.out.println("El gato se pasa todo el día durmiendo");
    }

    void maullar() {
        System.out.println("Es lo que hacen los gatos");
    }

    @Override
    void relacionar(Animal p) {
        System.out.println("Con el gato: " + p.getNombre());
    }

}
