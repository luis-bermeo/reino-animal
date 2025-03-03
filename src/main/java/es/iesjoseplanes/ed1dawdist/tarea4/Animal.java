package es.iesjoseplanes.ed1dawdist.tarea4;

/*Clase que crea un animal genérico. Tiene un nombre y métodos para obtenerlo y modificarlo*/
public class Animal {

    private String nombre;
    
    /*Obtiene el nombre del animal
    * @return Nombre del animal
    */
    public String getNombre() {
        return nombre;
    }
    
    /*Establece el nombre del animal
    * @parametro nombre Nombre del animal
    */
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    //Constructor de la clase animal
    public Animal (String nombre) {
        this.nombre = nombre;
    }
    
    void comer() {
        System.out.println("Necesita comer diarimente para sobrevivir");
    }

    void dormir() {
        System.out.println("Dormir es indispensable para descansar");
    }

    void reproducir() {
        System.out.println("Originar nuevos seres vivos");
    }

    /*Método que muestra la relacion entre loso animales creados*/
    void relacionar(Animal a) {
        System.out.println("Con el animal: " + a.nombre);
    }
    
    /*Imprime por pantalla la cadena de caracteres del objeto Animal
    @return Cadena con el nombre del animal*/
    String ToString() {
        return this.nombre;
    }
    
    
}
