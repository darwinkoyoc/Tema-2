
package conversion;

public class decimalAbinario {
    
    public static void DecBin(int n) {
        if (n < 2) {
            System.out.print(n);
            
        } else {
            DecBin(n / 2);
            System.out.print(n % 2);
            
        }
    }
    
}

