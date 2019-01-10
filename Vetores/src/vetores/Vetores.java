
package vetores;

import java.util.Arrays;

public class Vetores {

    public static void main(String[] args) {
        
        int n[] = new int[4];
        n[0] = 2;
        
        int n2[] = {1,50,3,4};
        
        Arrays.sort(n2); //Ordenação
        
        // foreatch
        for(int valor: n2){
            System.out.println(valor);
        }
    }
    
}
