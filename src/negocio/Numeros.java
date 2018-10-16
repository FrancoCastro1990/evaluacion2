package negocio;

import datos.Datos;

public class Numeros extends Datos {


    public static boolean verificaNumero(String strNumero) {
        try {
            //transformamos nuestra cadena a numeros
            Integer.parseInt(strNumero);
        } catch (Exception e) {
            //si no puede, retorna un false.
            return false;
        }
        return true;
    }

    public static char verificarNumRut(String rutsindigito) {

        String cadenainvertida = "";
        int sumatotal = 0;
        int mult = 2;
        int verificador;
        //invertimos la cadena
        for (int i = rutsindigito.length() - 1; i >= 0; i--) {
            cadenainvertida += rutsindigito.charAt(i);

        }
        //cada digito de la cadena lo multiplicamos por 2,3,4,5,6,7 y lo sumamos.
        for (int it = 0; it <= cadenainvertida.length() - 1; it++) {
            if (mult == 8) mult = 2;
            sumatotal += mult * (Character.getNumericValue(cadenainvertida.charAt(it)));
            mult++;
        }

        verificador = sumatotal % 11;
        verificador = 11 - verificador;

        if (verificador >= 1 && verificador <= 9) {
            //transformamos nuestro numero a char
            return Character.forDigit(verificador, 10);
        } else if (verificador == 10) {
            return 'K';
        } else if (verificador == 11) {
            return '0';
        }
        return 0;
    }

}
