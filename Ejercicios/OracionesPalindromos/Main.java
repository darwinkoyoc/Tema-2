package OracionesPalindromos;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        palindromo P =new palindromo();//hablamos a la clase palindormo
        
        String palabra; //variable
        System.out.print("Ingrese la oracion: ");//msj
        palabra = entrada.nextLine();//almacenamos dato
        P.es_Palindromo(palabra);//llamamos a la calse palindromo
        
        
        
        
        
        
        
        
        
    }
}
