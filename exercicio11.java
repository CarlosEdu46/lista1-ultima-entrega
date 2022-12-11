import java.util.Scanner; 

 
 

public class exercicio11 { 

    public static void main(String[] args) { 

         

        int inteiro1, inteiro2; 

        double numReal; 

        double calcProb1Result1, calcProb1Result2, resultadoFinalProb1, transformar, transformar2, resultadoFinalProb2, 

                resultadoFinalProb3; 

         

        Scanner teclado = new Scanner(System.in); 

         

        inteiro1 = teclado.nextInt(); 

        inteiro2 = teclado.nextInt(); 

        numReal = teclado.nextDouble(); 

        teclado.close(); 

         

        transformar = inteiro1; 

        transformar2 = inteiro2; 

         

        calcProb1Result1 = transformar * 2; 

        calcProb1Result2 = transformar2 / 2; 

        resultadoFinalProb1 = calcProb1Result1 * calcProb1Result2; 

         

        resultadoFinalProb2 = transformar * 3 + numReal; 

         

        resultadoFinalProb3 = Math.pow(numReal, 3); 

         

        System.out.println(" O resultado do problema 1 é: " + resultadoFinalProb1); 

        System.out.println(" O resultado do problema 2 é: " + resultadoFinalProb2); 

        System.out.println(" O resultado do problema 3 é: " + resultadoFinalProb3); 

    } 

} 