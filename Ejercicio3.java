/**
 * Crea un programa que pida por teclado tres cadenas de texto: 
 * nombre y dos apellidos. Luego mostrará un código de usuario 
 * (en mayúsculas) formado por la concatenación de las tres primeras 
 * letras de cada uno de ellos. Por ejemplo si se introduce “Lionel”, 
 * “Tarazón” y “Alcocer” mostrará “LIOTARALC”.
 * 
 * @author Daniel Leiva
 */
public class Ejercicio3 {
    public static void main(String[] args) {

        System.out.println("Ingresa el nombre: ");
        String nombre = System.console().readLine();

        System.out.println("Ingresa el primer apellido: ");
        String primerApellido = System.console().readLine();

        System.out.println("Ingresa el segundo apellido: ");
        String segundoApellido = System.console().readLine();

        String letrasNombre = nombre.length() >= 3 ? nombre.substring(0,3) : nombre;
        String letrasPrimerApellido = primerApellido.length() >= 3 ? primerApellido.substring(0,3) : primerApellido;
        String letrasSegundoApellido = segundoApellido.length() >= 3 ? segundoApellido.substring(0,3) : segundoApellido;

        String codigoUsuario = (letrasNombre + letrasPrimerApellido + letrasSegundoApellido).toUpperCase();

        System.out.println("Su código de usuario es: " + codigoUsuario);
    }
}
