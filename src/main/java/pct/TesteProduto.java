/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author edson_home
 */
public class TesteProduto {
        public static void main(String[] args){
            
            Produto p = new Produto();
            
            p.codigo = 1;
            p.descricao = "Arroz";
            p.setor = 'M';
            p.preco = 20.00;
            p.desconto = 1.00;
            p.disponivel = true;
            p.precofinal = p.preco - p.desconto;
            
            if (p.disponivel){p.liberado = "SIM";}
            else{p.liberado = "NAO";}                    
            
            System.out.println("Código: "+p.codigo);
            System.out.println("Descrição: "+p.descricao);
            System.out.println("Setor: "+p.setor);
            System.out.println("Preço normal R$ "+p.preco);
            System.out.println("O preço com R$ " +p.desconto+ " de desconto é R$ "+p.precofinal);
            System.out.println("Disponivel: "+p.liberado);
    }
   
}
