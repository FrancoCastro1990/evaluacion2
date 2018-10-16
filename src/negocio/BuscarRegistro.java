package negocio;

import datos.Registro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BuscarRegistro {

    public static void Buscar(String str, int opcion) {

        int indices[] = new int[5];
        int iterador = 0;
        String tipodeBusqueda = "";

        for (int indice = 0; indice < Registro.Personas.size(); indice++) {

            if (opcion == 1) tipodeBusqueda = Registro.Personas.get(indice).getApellido();
            if (opcion == 2) tipodeBusqueda = Registro.Personas.get(indice).getRut();

            Pattern pat = Pattern.compile(str);
            Matcher mat = pat.matcher(tipodeBusqueda);

            if (mat.find()) {
                //System.out.println("Se encontro " + Registro.Personas.get(indice).getApellido());
                indices[iterador] = indice;
                iterador++;

            }
        }

        switch (iterador) {
            case 0:
                DibujarVentanas.MostrarNoencotrado(opcion);
                break;
            case 1:
                DibujarVentanas.MostrarVentanaPromedios(indices[0]);
                break;
            case 2:
                DibujarVentanas.MostrarDosApellidos(indices[0], indices[1]);
                break;
            case 3:
                DibujarVentanas.MostrarTresApellidos(indices[0], indices[1], indices[2]);
                break;
        }
    }
}