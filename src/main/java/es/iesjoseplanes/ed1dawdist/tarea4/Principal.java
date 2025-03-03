package es.iesjoseplanes.ed1dawdist.tarea4;

/*Clase principal que contiene el método main, usada para crear y relacionar animales*/

public class Principal {

    /*Metodo principal en el que se ponen a prueba las demás clases y creamos diversos animales*/
    public static void main(String[] args) {

/*
Esquema de clases de reino-animal        
                  Animal
                    |
                    |
                Mamifero
                /       \
               /         \        
          Perro          Gato
*/


        Animal animal = new Animal("Pedro");

        Mamifero mamifero = new Mamifero("Juan");

        Perro toby = new Perro("Luis");

        Gato isidoro = new Gato("Whiskas");
        isidoro.setPelos(4);

        animal = isidoro;

        Gato g;
        g = (Gato) animal;
        System.out.println("pelos de gato: " + g.getPelos());

        Animal array[] = new Animal[4];

        array[0] = animal;
        array[1] = mamifero;
        array[2] = toby;
        array[3] = isidoro;

        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Perro) {
                System.out.println("El objeto " + i + " es un perro");

                Perro p = (Perro) array[i];
                p.ladrar();
            }

            if (array[i] instanceof Gato) {
                System.out.println("El objeto " + i + " es un gato");

                Gato anigato = (Gato) array[i];
                anigato.maullar();
            }
        }

    }
}
