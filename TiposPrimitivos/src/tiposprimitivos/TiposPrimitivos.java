package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author johnny
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = ler.nextLine();
        System.out.print("Digite sua nota: ");
        float nota = ler.nextFloat();
        
        /*
        nextInt()
        nextFloat()
        nextDouble()
        next...
        
        serve para todos os tipos de dados
        
        */
        
        //Convertendo inteiro para string
        int idade = 20;
        String i = Integer.toString(idade);
        
        //Convertendo string para inteiro
        String valor = "30";
        int valor2 = Integer.parseInt(valor); //Serve para os demais tipos. OBS: usar sempre a classe involocro respectivo ao tipo. Ex; int -> Integer, floa -> Float, etc...
        //parse -> converta
        
        System.out.println("Sua nota é "+nota);
        System.out.printf("%s, sua nota é %.2f\n",nome, nota);
        System.out.format("%s, sua nota é %.2f\n",nome, 2.5);
        
        System.out.println("Idade = "+i);
        System.out.println("Valor = "+valor2);
        
    }
    
}
