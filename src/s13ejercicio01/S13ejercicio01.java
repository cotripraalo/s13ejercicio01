/*
(Asignando grados) Escribe un programa que lea los puntajes de los estudiantes, teniendo el mejor puntaje,
y asignar los grados basados en el siguiente esquema:
Grado es A si punto si >= mejor -10; 
Grado es B si punto si >= mejor -20; 
Grado es C si punto si >= mejor -30;
Grado es D si punto si >= mejor -40;
Grado es F otra manera.
El programa hace que el usuario integrese el total de numeros de estudiantes, 
el usuario tiene que ingresar todos los puntajes,y concluir para mostrar los grados.
Veamos el siguiente ejemplo:
 */
package s13ejercicio01;

import java.util.Scanner;

public class S13ejercicio01 {
        public static void main(String[] args) {
        // Crear Scanner
            Scanner input =new Scanner(System.in);
            
            //Usar el total de numeros de estudiantes
            System.out.println("Ingresa el numero de estudiantes: ");
            int [] puntajes = new int[input.nextInt()];
            char [] grados = new char [puntajes.length];
            
            //Usar para ingresar todos los puntajes
            System.out.println("Ingresa " + puntajes.length + " puntajes: ");
            for(int i =0 ; i< puntajes.length; i++){
                puntajes[i]=input.nextInt();
            }
            
            //Get(tener) grados
            getGrados(puntajes,grados);
            
            //Mostrar los resultados
            for(int i=0; i < puntajes.length; i++){
                System.out.println("Estudiante " + i + " puntaje es " + puntajes[i] + " y grado es " + grados[i]);
            }
        }
        
        //Retornar la maxima nota
            public static int max(int[] array){
                int max=array[0];
                for(int i=1; i<array.length; i++){
                    if(array[i]>max)
                        max=array[i];
                }
                return max;
    }
            //Metodos getGrado asignado en essquemas de los grados
            public static void getGrados(int[]puntajes , char[]grados){
                int best = max(puntajes);
                for(int i=0; i<puntajes.length; i++){
                    if(puntajes[i]>= best -10)
                        grados[i]='A';
                    else if (puntajes[i]>= best - 20)
                        grados[i]='B';
                     else if (puntajes[i]>= best - 30)
                        grados[i]='C';
                     else if (puntajes[i]>= best - 40)
                        grados[i]='D';
                    else
                         grados[i]='F';
                    
                        
                }
            }
}
    

