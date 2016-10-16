/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrinho;
import java.util.ArrayList;
/**
 *
 * @author El's
 */
public class Carrinho {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Iten> itens = new ArrayList<Iten>();
        Double total;
        Produto prod;
        Iten iten;
        for(int i=0; i<4;i++){
             prod = new Produto("coca", "coca cola", 3.00);
             iten = new Iten(prod, i);
             itens.add(iten);
        }
        for(Iten a: itens)       
        System.out.println("Nome: "+a.getNome()+"\n"+"Total: "+a.ValorIten()+"\n");
        
    }
}
