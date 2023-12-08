/**
 * Crea un programa que pida dos cadenas de texto por teclado y luego 
 * indique si son iguales, además de si son iguales sin diferenciar entre 
 * mayúsculas y minúsculas.
 * 
 * @author Daniel Leiva
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Ingresa una cadena de texto: ");
        String cadena1 = System.console().readLine();
        System.out.println("Ingresa otra cadena de texto: ");
        String cadena2 = System.console().readLine();

        if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas son iguales (Diferenciando Mayúsculas y Minúscalas)");
        }
        else {
            System.out.println("Las cadenas no son iguales (Diferenciando Mayúsculas y Minúscalas)");
        }
        if (cadena1.equalsIgnoreCase(cadena2)) {
            System.out.println("Las cadenas son iguales (Sin diferenciar Mayúsculas y Minúscalas)");
        } else {
            System.out.println("Las cadenas no son iguales (Sin diferenciar Mayúsculas y Minúscalas)");
        }
    }    
}
