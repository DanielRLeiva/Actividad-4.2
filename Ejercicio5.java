/**
 * Realiza un programa que lea una frase por teclado e indique si la frase 
 * es un palíndromo o no (ignorando espacios y sin diferenciar entre 
 * mayúsculas y minúsculas). Supondremos que el usuario solo introducirá 
 * letras y espacios (ni comas, ni puntos, ni acentos, etc.). Un palíndromo 
 * es un texto que se lee igual de izquierda a derecha que de derecha a izquierda. 
 * Por ejemplo: 
 * Amigo no gima 
 * Dabale arroz a la zorra el abad 
 * Amo la pacífica paloma 
 * A man a plan a canal Panama
 * 
 * @author Daniel Leiva
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Introduzaca una frase: ");
        String frase = System.console().readLine();

        String fraseSinEspacios = frase.replaceAll(" ", "").toLowerCase();

        boolean esPalindromo = true;

        int longitudFrase = fraseSinEspacios.length();

        for ( int i = 0; i < longitudFrase / 2; i++ ) {
            if (fraseSinEspacios.charAt(i) != fraseSinEspacios.charAt(longitudFrase -1 - i)) {
                esPalindromo = false;
                break;
            }
        }
        if (esPalindromo) {            
            System.out.println("La frase es un Palíndromo.");                        
        } else {
            System.out.println("La frase no es un Palíndromo.");
        }
    }    
}
