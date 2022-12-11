import java.util.Scanner; 

 
 

public class exercicio12 { 

 
 

    // Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que 

    // calcule seu peso ideal, 

    // usando a seguinte fórmula: (72.7*altura) - 58 

 
 

    public static void main (String[] args) { 

        double altura; 

        double pesoideal; 

         

        Scanner teclado = new Scanner(System.in); 

        System.out.print(" Digite a altura: "); 

        altura = teclado.nextDouble(); 

        teclado.close(); 

         

        pesoideal = (72.7 * altura) - 58; 

         

        System.out.println(" O seu peso ideal é " + pesoideal); 

    } 

} 