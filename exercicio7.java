import java.util.Scanner; 

 
 

public class exercicio7 { 

    public static void main(String[] args) throws Exception { 

         

        Scanner teclado = new Scanner(System.in); 

        System.out.print(" Informe com a medida do lado do quadrado: "); 

        int lado = teclado.nextInt(); 

        teclado.close(); 

 
 

         

        int area = lado * lado; 

 
 

         

        int dobro = area * 2; 

 
 

        System.out.println(" O dobro da área do quadrado de lado " + lado + " é igual a " + dobro); 

    } 

} 

 