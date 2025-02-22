package mates;

public class Matematicas{
    /**
     * Genera una aproximacion del número PI usando el metodo Monte-Carlo
     *
     * @param pasosIniciales el numero de puntos total que tenemos que generar. Define el numero de
     *  llamadas recursivas que se realizaran.
     *
     * @param pasosRestantes el numero de puntos que nos quedan por generar.
     *
     * @param puntosDentro el numero de puntos que generamos que caen dentro del area del
     * circulo. Se necesita como parametro, para que le parametro recursivo lleve la cuenta.
     *
     * @return La aproximacion del numero PI obtenida
     */

     public static double generarNumeroPiRecursivo(long pasosIniciales, long pasosRestantes, long puntosDentro) {
        if (pasosRestantes == 0) {
            return 4.0 * puntosDentro / pasosIniciales;
        }

        double x = Math.random();
        double y = Math.random();

        if (x * x + y * y <= 1) {
            puntosDentro++;
        }

        return generarNumeroPiRecursivo(pasosIniciales, pasosRestantes - 1 , puntosDentro);
    }
}
