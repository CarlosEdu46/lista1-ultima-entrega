import java.util.Scanner; 

 
 

public class exercicio10 { 

public static void main (String args []) { 

 
 

     

    double temperaturaC; 

    double temperaturaF; 

 
 

    System.out.println(" Programa de Temperatura. Seja bem vindo! informe a temperatura: "); 

     

    Scanner teclado = new Scanner(System.in); 

    temperaturaC = teclado.nextDouble(); 

    teclado.close(); 

     

    temperaturaF = ( 9 * temperaturaC + 160 ) / 5; 

     

    System.out.print(" A temperatura em graus Fahrenheit é "); 

    System.out.print(temperaturaF); 

} 

} 