import java.util.Scanner; 

 
 

public class exercicio6 { 

    public static void main(String[] args) throws Exception { 

 
 

         

        Scanner teclado = new Scanner(System.in); 

        System.out.print(" Informe com o raio do círculo: "); 

        double raio = teclado.nextDouble(); 

        teclado.close(); 

 
 

         

        double area = Math.PI * Math.pow(raio, 2); 

 
 

         

        System.out.println(" A área do círculo de raio " + raio + " é igual a " + area); 

 
 

    } 

} 

 