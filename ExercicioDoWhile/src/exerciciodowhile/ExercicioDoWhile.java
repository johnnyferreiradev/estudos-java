
package exerciciodowhile;
    
import javax.swing.JOptionPane;

public class ExercicioDoWhile {

    public static void main(String[] args) {
        
        int n, soma=0, qtd=0, totalPares=0, totalImpares=0, totalMaior100=0;
        float media;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um numero: <br><em>0 - Sair</em></html>"));  
            soma += n;
            qtd++;
            if(n % 2 == 0){
                totalPares++;
            }else{
                totalImpares++;
            }
            
            if(n > 100){
                totalMaior100++;
            }
            
            media = (float) (soma / qtd);
        }while(n != 0);
        
        
        JOptionPane.showMessageDialog(null, 
                "<html>Resultados<br>"+
                "soma = "+soma+
                "<br>total de valors = "+qtd+
                "<br>total de pares = "+totalPares+
                "<br>total de impares = "+totalImpares+
                "<br>total acima de 100 = "+totalMaior100+
                "<br>Media dos valores = "+media+"</html>");
        
    }
    
}
