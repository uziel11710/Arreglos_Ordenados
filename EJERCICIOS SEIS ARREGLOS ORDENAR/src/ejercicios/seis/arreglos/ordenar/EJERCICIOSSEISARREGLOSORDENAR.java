
package ejercicios.seis.arreglos.ordenar;

/**
 *
 * @author Uziel
 */
public class EJERCICIOSSEISARREGLOSORDENAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int U[] = new int[21];
        
        
         System.out.print("ARREGLO INICIAL CON NUMEROS ALEATORIOS:  \n\n");
        System.out.print("[");
        for(int i=1; i<21; i++)
        {
            U[i]= (int) (Math.random()*99+1);
            
        
        System.out.print(U[i]+", ");
        }
        System.out.print("]");
        
        EJERCICIOSSEISARREGLOSORDENAR ENVIAR = new EJERCICIOSSEISARREGLOSORDENAR();
        ENVIAR.separaParesImpares(U);

    }
    
    
    
        public static int separaParesImpares (int [] Arreglo)
        {
            
            System.out.print("\n\nARREGLO ORDENADO:\n\n");
            System.out.print("[");
            int Arreglo2[]=new int[21];
            
            
            
            for(int i=1; i<Arreglo.length; i++)
        {
             if(Arreglo[i]%2==0)
            {  
                System.out.print(Arreglo[i]+", ");    
            }
        }
            
            
            
             
             for(int j=1; j<Arreglo.length; j++)
        {
            Arreglo2[j]=Arreglo[j];    
             if(Arreglo2[j]%2!=0)
            {
                System.out.print(Arreglo2[j]+", "); 
            }
        }
             
             
             
              System.out.print("]\n\n");

        return 0;
            
        }
    
}

