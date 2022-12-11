import java.util.Scanner; 

 
 

public class exercicio3 { 

    public static void main(String args[]) { 

     

     

    double numero1; 

    double numero2; 

    double resultado;  

 
 

    Scanner teclado = new Scanner(System.in); 

    numero1 = teclado.nextDouble(); 

    numero2 = teclado.nextDouble(); 

    teclado.close(); 

 
 

     resultado = numero1 + numero2; 

    System.out.print(" O resultado é: "); 

    System.out.print(resultado); 

    } 


} 

 