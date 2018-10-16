package datos;

import java.util.ArrayList;

public class Registro extends Datos {
    public static ArrayList<Datos> Personas = new ArrayList<Datos>();


    public static void add(Datos aux) {
        Personas.add(aux);
    }
}
