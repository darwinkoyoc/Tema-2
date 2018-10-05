package OracionesPalindromos;

public class palindromo {
    
       boolean es_Palindromo(String palabra){
           
        if(palabra.charAt(0) == palabra.charAt(palabra.length() - 1)){//operacion que empieze en 0 osea la primera palabra si es igual a la ultima letra de la palibra continuar comprobando
            System.out.println("La palabra "+palabra+" SI es palindromo");//mensaje
            return true;//si la palabra son iguales entonces finalizasa y si es un palindromo
        }else{
            System.out.println("La palabra "+palabra+" No es palindromo");//mensaje
            return false;//si la palabra no son iguales entonces finalizasa y no es un palindromo
       }
    }   
 
               
}
   

