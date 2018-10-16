package negocio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import datos.Datos;

public class Cadena extends Datos {

    public static boolean esString(String nombre) {

        Pattern pat = Pattern.compile("[A-Za-z ]*");
        Matcher mat = pat.matcher(nombre);

        if (mat.matches()) {
            try {
                Integer.parseInt(nombre);
            } catch (Exception e) {
                //si no puede, retorna un false.
                return true;
            }
            return false;
        }
        return false;
    }

}
