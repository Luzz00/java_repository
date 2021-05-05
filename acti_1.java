/*

 */
package actividades_U7;

/**

 */
public class acti_1 {
    
    public static void main (String[] args){
        
        java.util.Scanner sc=  new java.util.Scanner(System.in);
        int[] vector = new int[10];
        
        //Leer vector -> bucle for
        System.out.println("Introduce valores 'int' para el vector:");
        for(int i=0; i<vector.length; i++){
            vector[i]= sc.nextInt();
            
        }
        //Imprimir vector -> bucle for-each
        System.out.print("Vector creado: ");
        for(int x: vector){
            System.out.print(x +","); // me imprime los valores del vector directamente?. no hay que poner vector[x]
        }
        //Equivalente al for-ecah de arriba
        /*System.out.print("Vector creado: ");
        for(int i=0; i< vector.length; i++){
            System.out.print(vector[i]);
        } */
        
        //TMB: Imprimir vector -> Arrays.toString(_array)
            //vector.toString(); //no imprime sus valores, sale otra cosa -> [I@6e2c634b
       // System.out.println(java.util.Arrays.toString(vector));
    }
    
}
