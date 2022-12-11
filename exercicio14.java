import java.util.Scanner; 

 
 

public class exercicio14 { 

  

    public static void main(String[] args) { 

        double multa, peso, excesso; 

        Scanner teclado = new Scanner(System.in); 

        System.out.print(" Digite o peso: "); 

        peso = teclado.nextDouble(); 

        teclado.close(); 

 
 

        if (peso > 50) { 

            excesso = peso - 50; 

            multa = excesso * 4; 

            System.out.println(" Multa: " + multa); 

        } 

 
 

        else { 

            multa = 0; 

            excesso = 0; 

            System.out.println(" Sem multa "); 

        } 

 
 

    } 

 
 

} 