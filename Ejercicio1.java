/**
 * Crea un programa que pida una cadena de texto por teclado y luego muestre
 * cada palabra de la cadena en una línea distinta.
 * 
 * @author Daniel Leiva
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Ingesa un texto");
        String cadenaDeTexto = System.console().readLine();

        String[] palabras = cadenaDeTexto.split("\s+"); // (\s+) Este es un delimitador de espacios del método String.

        System.out.println("Texto separado por palabras en líneas distintas:");
        
        for (String palabra : palabras) { // Utilizo un bucle for para separar cada palabra.
            System.out.println(palabra);
        }

    }
}