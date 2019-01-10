
package comparandostrings;

public class ComparandoStrings {

    public static void main(String[] args) {
        
        String nome1 = "Johnny";
        String nome2 = "Johnny";
        String nome3 = new String("Johnny");
        
        String resultado;
        
        resultado = (nome1.equals(nome3)) ? "Igual" : "Diferentes";
        System.out.println("Resultado da comparação: "+resultado);
        
    }
    
}
