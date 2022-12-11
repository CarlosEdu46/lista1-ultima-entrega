import java.util.Scanner; 

import java.lang.Math; 

 
 

public class exercicio16 { 

     

    public static void main(String[] args) { 

        double areaSerPintada; 

        double numeroLatas; 

        double precoTotal; 

         

        Scanner teclado = new Scanner(System.in); 

        System.out.print(" Digite a area a ser pintada: "); 

        areaSerPintada = teclado.nextDouble(); 

        teclado.close(); 

         

        numeroLatas = Math.ceil(areaSerPintada / 54); 

         

        precoTotal = 80 * numeroLatas; 

         

        System.out.println("O total de latas é " + numeroLatas); 

        System.out.println("O valor total é " + precoTotal); 

    } 

} 