import java.util.Scanner; 

 
 

public class exercicio9 { 

public static void main (String args []) { 

 
 

  

    double temperaturaF; 

    double temperaturaC; 

 
 

    System.out.println(" Programa de Temperatura. Seja bem vindo! informe a temperatura: "); 

     

    Scanner teclado = new Scanner(System.in); 

    temperaturaF = teclado.nextDouble(); 

    teclado.close(); 

     

    temperaturaC = 5 * ((temperaturaF-32)/9); 

     

    System.out.print(" A temperatura em graus Celsius é: "); 

    System.out.print(temperaturaC); 

 
 

} 

} 

 
 