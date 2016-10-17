/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrinho;

/**
 *
 * @author El's
 */
public class Iten {
    private Produto produto;
    private int quantidade;

    public Iten(Produto produto, int quantidade) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public Double ValorIten(){
        return quantidade * produto.getPreco();
    }
    
    public String getNome(){
        return produto.getNome();
    }
}
