import java.util.Scanner; 

import java.lang.Math; 

 
 

public class exercicio17 { 

 
 

    public static void main(String[] args) { 

        int litrosLata = 18; 

        int preçoLata = 80; 

        double litrosGalão = 3.6; 

        double preçoGalão = 25; 

        double qtdLatas; 

        double qtdGaloes; 

        double custoLatas; 

        double custoGaloes; 

        double litrosNecessários; 

        double areaMetros; 

        System.out.print(" Informe a área em metros quadrados: "); 

        Scanner sc = new Scanner(System.in); 

        areaMetros = sc.nextDouble(); 

        sc.close(); 

        litrosNecessários = (areaMetros) / 6; 

         

        qtdLatas = Math.ceil(litrosNecessários / litrosLata); 

        custoLatas = qtdLatas * preçoLata; 

        System.out.println(" Você vai precisar comprar " + qtdLatas + " Latas, que irão custar R$:" + custoLatas); 

         

        qtdGaloes = Math.ceil(litrosNecessários / litrosGalão); 

        custoGaloes = qtdGaloes * preçoGalão; 

        System.out.println(" Você vai precisar comprar " + qtdGaloes + " Galões, que irão custar R$:" + custoGaloes); 

         

        double litrosFolga = litrosNecessários * 1.1; 

        double qtdLatasterceirocaso = Math.ceil(litrosFolga / litrosLata); 

        double litros_faltando = litrosFolga - (qtdLatasterceirocaso * litrosLata); 

        double qtdGaloesterceirocaso = Math.ceil(litros_faltando / litrosGalão); 

        double custoMistura = Math.ceil(qtdLatasterceirocaso * preçoLata) + (qtdGaloesterceirocaso * preçoGalão); 

        System.out.println(" Você vai precisar comprar " + qtdLatasterceirocaso + " Latas e," + qtdGaloesterceirocaso 

                + " Galões, que juntos custarão R$ " + custoMistura); 

 
 

    } 

 
 

} 