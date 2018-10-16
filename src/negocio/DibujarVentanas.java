package negocio;

import datos.Registro;
import javax.swing.*;

public class DibujarVentanas {

    static Object Busqueda = null;
    static int tipodebusqueda = 0;
    static boolean iterar = true;


    public static void MostrarVentanaPromedios(int i) {

        JOptionPane.showMessageDialog(
                null,
                "Las notas de " +
                        Registro.Personas.get(i).getNombre() + " " + Registro.Personas.get(i).getApellido() + " son " + "\n"+
                        "Rut:"+Registro.Personas.get(i).getRut()+ "\n" +
                        Registro.Personas.get(i).getNota1() + "\n" +
                        Registro.Personas.get(i).getNota2() + "\n" +
                        Registro.Personas.get(i).getNota3() + "\n" +
                        Registro.Personas.get(i).getAprovado() + "\n" +
                        "con un promedio de " + Registro.Personas.get(i).Getpromedio(),
                "Calculador de Promedio",

                JOptionPane.PLAIN_MESSAGE,
                null);

    }

    public static void MostrarOpcionesBusqueda() {

        Busqueda = JOptionPane.showInputDialog(
                null,
                "Bienvenido al buscador de notas\nSeleccione como desea buscar al alumno: ",
                "Buscar en un archivo. Franco Castro V.",
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Apellido", "Rut", "Salir"},
                "Apellido");

        if (Busqueda == "Apellido") MostrarOpcionApellido();
        if (Busqueda == "Rut") MostrarOpcionRut();
        if (Busqueda == "Salir") System.exit(0);
    }

    public static void MostrarOpcionApellido() {

            tipodebusqueda = 1;
            String entrada = "";

            do {
                entrada = JOptionPane.showInputDialog(
                        null,
                        "Ingrese el Apellido a buscar\nRespete mayúsculas y minúsculas",
                        null);

            try {
                if (Cadena.esString(entrada) && !entrada.isEmpty()) {
                    BuscarRegistro.Buscar(entrada, tipodebusqueda);
                    iterar = false;

                }

                if (!Cadena.esString(entrada) && entrada != null) {
                    MostrarNovalido(tipodebusqueda);
                    entrada = "";
                    iterar = true;
                }

                if (entrada == null) {
                    System.exit(0);
                }
            }catch (Exception e){
                System.exit(0);
            }

            } while (iterar);


    }

    public static void MostrarOpcionRut() {

            tipodebusqueda = 2;
            String entrada = "";

            do {
                entrada = JOptionPane.showInputDialog(
                        null,
                        "Ingrese el Rut a buscar sin digito verificador",
                        null);

                if (Numeros.verificaNumero(entrada) && !entrada.isEmpty()) {
                    BuscarRegistro.Buscar(entrada, tipodebusqueda);
                    iterar = false;

                }

                if (!Numeros.verificaNumero(entrada) && entrada != null) {
                    MostrarNovalido(tipodebusqueda);
                    entrada = "";
                    iterar = true;
                }

                if (entrada == null) {
                    System.exit(0);
                }

            } while (iterar);


    }

    public static void MostrarNoencotrado(int opcion) {

        String mensaje = "";

        if (opcion == 1) mensaje = "No se encontro el apellido solitado";
        if (opcion == 2) mensaje = "No se encontro el rut solitado";

        JOptionPane.showMessageDialog(
                null,
                mensaje,
                "Calculador de Promedio",
                JOptionPane.PLAIN_MESSAGE,
                null);

    }

    public static void MostrarNovalido(int opcion) {

        String mensaje = "";

        if (opcion == 1) mensaje = "El apellido ingresado no es valido";
        if (opcion == 2) mensaje = "El rut ingresado no es valido";

        JOptionPane.showMessageDialog(
                null,
                mensaje,
                "Calculador de Promedio",
                JOptionPane.PLAIN_MESSAGE,
                null);

    }

    public static void MostrarDosApellidos(int indice1, int indice2) {

        int eleccion = JOptionPane.showOptionDialog(
                null,
                "Se han encontrado 2 apellidos \"" + Registro.Personas.get(indice1).getApellido() + "\", elige uno:",
                "Selector de opciones",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{Registro.Personas.get(indice1).getNombre(), Registro.Personas.get(indice2).getNombre()},
                null);

        switch (eleccion) {
            case 0:
                MostrarVentanaPromedios(indice1);
                break;
            case 1:
                MostrarVentanaPromedios(indice2);
                break;
        }
    }

    public static void MostrarTresApellidos(int index, int index1, int index2) {

        int eleccion2 = JOptionPane.showOptionDialog(
                null,
                "Se han encontrado 3 apellidos \"" + Registro.Personas.get(index).getApellido() + "\", elige uno:",
                "Selector de opciones",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{Registro.Personas.get(index).getNombre(), Registro.Personas.get(index1).getNombre(), Registro.Personas.get(index2).getNombre()},
                null);

        switch (eleccion2) {
            case 0:
                MostrarVentanaPromedios(index);
                break;
            case 1:
                MostrarVentanaPromedios(index1);
                break;
            case 2:
                MostrarVentanaPromedios(index2);
                break;
        }

    }
}
