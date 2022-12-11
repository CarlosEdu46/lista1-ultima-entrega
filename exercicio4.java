import java.util.Scanner; 

 
 

public class exercicio4 { 

    public static void main(String[] args) { 

     

    double nota1; 

    double nota2; 

    double nota3; 

    double nota4; 

    double media; 

   

     

    Scanner teclado = new Scanner(System.in); 

    nota1 = teclado.nextDouble(); 

    nota2 = teclado.nextDouble(); 

    nota3 = teclado.nextDouble(); 

    nota4 = teclado.nextDouble(); 

    teclado.close(); 

     

    media = ((nota1 + nota2 + nota3 + nota4)) / 4; 

 
 

     

    System.out.print(" A media das notas bimestrais é: "); 

    System.out.print(media); 

         

    } 

} 

 