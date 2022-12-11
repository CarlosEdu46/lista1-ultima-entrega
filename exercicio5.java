import java.util.Scanner; 

 
 

public class exercicio5 { 

 public static void main(String[] args) { 

 
 

double valoremMetros; 

double resultadoemCm; 

 
 

Scanner teclado = new Scanner(System.in); 

valoremMetros = teclado.nextDouble(); 

teclado.close(); 

 
 

resultadoemCm = (valoremMetros * 100); 

 
 

System.out.print(" O valor em Cm é: "); 

System.out.print(resultadoemCm); 
   

} 

} 

 