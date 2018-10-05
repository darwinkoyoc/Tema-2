
package operacion;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Operacion C=new Operacion();
        Scanner dato = new Scanner(System.in);
        int n,m,cambio;
     
        System.out.print("Ingresa la cantidad de complas $");
        n=dato.nextInt();
        System.out.print("Ingresa la cantidad de pago $");
        m=dato.nextInt();
        cambio=m-n;
        System.out.print("El cambio es: "+cambio);
        System.out.println();
        C.dinero(cambio);
       
        
        
        
        
        
                
    }
}
