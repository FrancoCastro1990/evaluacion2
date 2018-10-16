package presentacion;


import negocio.DibujarVentanas;
import negocio.LecturaArchivos;


public class Main {
    public static void main(String[] args) {
        LecturaArchivos.leerArchivo();
        DibujarVentanas.MostrarOpcionesBusqueda();

    }
}
