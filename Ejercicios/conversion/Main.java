
package conversion;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        decimalAbinario C = new decimalAbinario();
        
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduzca el numero >0: ");
            n = sc.nextInt();
        } while (n < 0);
        System.out.println();
        System.out.print("El numero Binario es: ");
        C.DecBin(n);
        System.out.println();
    }

    
}
