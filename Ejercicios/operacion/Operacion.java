
package operacion;

public class Operacion {
    
    public void dinero(int cambio){
        int dinero[] = new int [7];
        if(cambio > 0){
        }if(cambio - 200 >= 0){
            cambio=cambio-200;
            dinero[0]++;
        }if(cambio - 100 >= 0){
           cambio=cambio-100;
            dinero[1]++;  
        }if(cambio - 50 >= 0){
           cambio=cambio-50;
            dinero[2]++;   
        }if(cambio - 20 >= 0){
           cambio=cambio-20;
            dinero[3]++;   
        }if(cambio - 10 >= 0){
           cambio=cambio-10;
            dinero[4]++;  
        }if(cambio - 5 >= 0){
           cambio=cambio-5;
            dinero[5]++;   
        }if(cambio - 2 >= 0){
           cambio=cambio-2;
            dinero[6]++;   
        }if(cambio - 1 >= 0){
           cambio=cambio-1;
            dinero[7]++;   
        }
        for (int i=0; i<7; i++){
            if (i==0){
                System.out.println(dinero[i]+" billetes de 200");
            }if (i==1){
                System.out.println(dinero[i]+" billetes de 100");
            }if (i==2){
                System.out.println(dinero[i]+" billetes de 50");
            }if (i==3){
                System.out.println(dinero[i]+" billetes de 20");
            }if (i==4){
                System.out.println(dinero[i]+" monedas de 10");
            }if (i==5){
                System.out.println(dinero[i]+" monedas de 5");
            }if (i==6){
                System.out.println(dinero[i]+" monedas de 2");
            }if (i==7){
                System.out.println(dinero[i]+" monedas de 1");
            }
        
    }
    }
    
}
