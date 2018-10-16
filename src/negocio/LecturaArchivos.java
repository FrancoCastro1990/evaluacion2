package negocio;

import datos.Archivo;
import datos.Datos;
import datos.Registro;

import java.io.BufferedReader;
import java.io.FileReader;

public class LecturaArchivos {


    public static void leerArchivo() {
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(Archivo.STR_DIRECCION));
            String bflectura;
            while ((bflectura = buffer.readLine()) != null) {
                String[] datos = bflectura.split(",");
                String rut = datos[0];
                String nombreCompleto = datos[1];
                String nota1 = datos[2];
                String nota2 = datos[3];
                String nota3 = datos[4].substring(0, datos[4].length() - 1);
                String[] datos2 = nombreCompleto.split(" ");

                String nombre = datos2[0];
                String apellido = datos2[1];
                if (datos2.length == 3) apellido = datos2[1] + " " + datos2[2];

                Datos aux = new Datos(nombre, apellido, rut, Double.parseDouble(nota1), Double.parseDouble(nota2), Double.parseDouble(nota3));
                Registro.add(aux);
            }
        } catch (Exception e) {
            System.out.println("No se pudo leer el archivo");
        }

    }
}
