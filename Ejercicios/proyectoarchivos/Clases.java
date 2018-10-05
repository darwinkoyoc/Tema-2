
package proyectoarchivos;

//Paquetes
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class Clases {
    String direccion = "nombres.txt"; //Direccion del Archivo
    
    public ArrayList leer_fichero(){
        ArrayList arreglo= new ArrayList(); //Pasa elementos x elementos a un vector.
        
        try {
            FileReader ficha = new FileReader(direccion); //captura del archivo
            BufferedReader dato = new BufferedReader(ficha); //Lectura del archivo.
           
            String linea = "";
                    
            while(linea != null){ //Cuando es -1 ya no hay texto que mostrar.
                linea = dato.readLine(); //Lee cada palabra almacenada en un archivo.
                
                /*
                Un lectura con buffer siempre termina con null. por eso se pone este if,
                para que no imprima en pantalla ese null del buffer.
                */
                if(linea!=null){ 
                    arreglo.add(linea); //Captura los valores de linea al vector lineas.
               } 
            } 
        } catch (IOException ex) { //Excepcion si encuentra un problema.
            System.out.println("Archivo No Encontrado");
        }
        return arreglo; //retorna el areglo nuevo.
    }
    
    //CONVIERTE EL ARRAY LIST EN UN STRING DE NOMBRES PARA TRABAJAR.
    public String []Arraysnombres(ArrayList list, int b){
        String a[] = new String[b];
        for(int i = 0; i < list.size(); i++){
            a[i] = (String)list.get(i); //Pasa cada elemento del ArrayList al areglo de String
        }
        return a; //Retorna el Nuevo areglo de String con los valores.
    }
    
    //MUESTRA LOS DATOS EN PANTALLA.
    public void MostrarDatos(String []nombres){
        for(int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }
    }
    
    
    //METODO DE ORDENAMIENTO EN RECURSIVIDAD
    public void Ordenar(String []nombres, int tamaño){
            if(tamaño < nombres.length){
                OrdenarDatosAsignacion(nombres, 0, tamaño);
                Ordenar(nombres,tamaño+1);
          }
    }
    
    public void OrdenarDatosAsignacion(String []nombres, int j, int tamaño){
        if(j < nombres.length && tamaño != j){
             if(nombres[tamaño].compareToIgnoreCase(nombres[j]) < 0){
                   String aux = nombres[tamaño];
                   nombres[tamaño] = nombres[j];
                   nombres[j] = aux;
            }
          OrdenarDatosAsignacion(nombres, j+1, tamaño);
        }
    }

    public void MostrarDatosOrdenados(String []nombres, int tamaño){
        Ordenar(nombres, tamaño);
        if(tamaño < nombres.length){
            System.out.println(nombres[tamaño]);
            MostrarDatosOrdenados(nombres, tamaño+1);
        }
    } //FIN DE METODO DE ORDENAMIENTO.
    
    //BUSCAR NOMBRE DE FORMA RECURSIVA
    public Boolean BuscarNombre(String []nombres, String buscar, int i){
       if(i == nombres.length-1){
           return false;
       }else if(nombres[i].equals(buscar)){
           return true;
       }
       return BuscarNombre(nombres, buscar, ++i);
    }
    
    
    
    
    
 
}
