package org.pab2020.factorial;

/**
 * This class implements a method to compute the org.pab2020.factorial of an integer number
 *
 * @author Juan Antonio Herrera Conde
 */

public class Factorial {

    public long compute(long value) {
        long result;
        if (value < 0 || value >= 26) { //El 26 es el número que produce el stackoverflow.
            throw new RuntimeException("El número es negativo o el resultado es demasiado grande"); //Lanzaremos un error si esto ocurre
        } else if ((value == 0) || (value == 1)) {
            result = 1;
        } else {
            //Usamos for para ahorrar memoria
            result = 1;
            for (int i = 1; i <= value; i++) {
                result = i * result;
            }
        }
        return result;

    }

}



