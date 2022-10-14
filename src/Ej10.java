
import java.text.DecimalFormat;
import java.util.Arrays;
 


/*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.*/

public class Ej10 {

    public static void main(String[] args) {
        
        DecimalFormat formato = new DecimalFormat("#.00");
        
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        
        
        for (int i = 0; i < 50; i++) {
            arregloA[i]= Math.random()*100;
            System.out.print("|"+formato.format(arregloA[i])+"|");
        }
        
        Arrays.sort(arregloA);
        
        for (int i = 0; i < 20; i++) {
            if (i<10) {
                arregloB[i]= arregloA[i];
            } else arregloB[i]= 0.5;
        }   
        
        System.out.println("");
        
        for (int i = 0; i < 50; i++) {
            System.out.print("|"+formato.format(arregloA[i])+"|");
        }
        System.out.println("");
        
       for (int i = 0; i < 20; i++) {
            System.out.print("|"+formato.format(arregloB[i])+"|");
        }
        System.out.println("");
    }
}
