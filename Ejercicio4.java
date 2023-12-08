/**
 * Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay 
 * (cuantas ‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. 
 * No se debe diferenciar entre mayúsculas y minúsculas. Por ejemplo dada la frase 
 * “Mi mama me mima” dirá que hay:
 * Nº de A's: 3
 * Nº de E's: 1
 * Nº de I's: 2
 * Nº de O's: 0
 * Nº de U's: 0
 * 
 * @author Daniel Leiva
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Introduce una frase: ");
        String frase = System.console().readLine();

        frase = frase.toLowerCase();

        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;

        for (int i = 0; i <frase.length(); i++) {

            char caracter = frase.charAt(i);

            switch (caracter) {

                case 'a':
                contadorA++;                    
                break;

                case 'e':
                contadorE++;                    
                break;

                case 'i':
                contadorI++;                    
                break;

                case 'o':
                contadorO++;                    
                break;

                case 'u':
                contadorU++;                    
                break;
            
                default:
            }
        }

        System.out.println("La cantidad de A's es: " + contadorA);
        System.out.println("La cantidad de E's es: " + contadorE);
        System.out.println("La cantidad de I's es: " + contadorI);
        System.out.println("La cantidad de O's es: " + contadorO);
        System.out.println("La cantidad de U's es: " + contadorU);
    }
}
