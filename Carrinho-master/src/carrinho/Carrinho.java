/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrinho;
import java.text.DecimalFormat;
import java.util.ArrayList;
/**
 *
 * @author El's
 */
public class Carrinho {

    /**
     * @param produtos
     */
    public static void NovosProdutos(ArrayList<Produto> produtos) {
        Produto prod;
        
        prod = new Produto("agua", "garra de agua", 2.0);
        produtos.add(prod);
        prod = new Produto("coca", "coca cola", 4.0);
        produtos.add(prod);
        prod = new Produto("cafe", "xicara de cafe", 2.5);
        produtos.add(prod);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Iten> itens = new ArrayList<>();
        Iten iten;
        ArrayList<Produto> produtos = new ArrayList<> ();
        
        NovosProdutos(produtos);
        
        for(int i=0; i<3;i++){
             iten = new Iten(produtos.get(i), i+1);
             itens.add(iten);
        }
        
        DecimalFormat df = new DecimalFormat("#0.00");
        
        for(Iten a: itens)
        System.out.println("Nome: "+a.getNome()+"\n"+"Total: R$"+df.format(a.ValorIten())+"\n");
        
        
    }
}
