import java.util.Scanner; 

 
 

public class exercicio8 { 

    public static void main(String[] args) throws Exception { 

 
 
 

        Scanner teclado = new Scanner(System.in); 

        System.out.print(" Informe com o seu valor/hora: "); 

        double valor_hora = teclado.nextDouble(); 

        System.out.println(""); 

        System.out.print(" Informe com a quantidade de horas trabalhadas no mês "); 

        double horas_mes = teclado.nextDouble(); 

        teclado.close(); 

 
 

         

        double salario_mes = valor_hora * horas_mes; 

        System.out.println(" O valor do seu salário esse mês é: " + salario_mes); 

 
 

    } 

} 

 