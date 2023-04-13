import br.com.benezinho.model.Categoria;
import br.com.benezinho.model.Produto;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //apenas estou declarando que vou precisar dessas variaveis, não vou usar por enquanto
        Categoria categoria;
        Produto produto;
        double total = 0;
       // boolean encerrar = false;
        int encerrar = 0;

        do{
            var nomeCategoria = JOptionPane.showInputDialog("Categoria");
            categoria = new Categoria(nomeCategoria);


            var nomeProduto = JOptionPane.showInputDialog("Qual o nome do produto?");
            var preco = Double.parseDouble(JOptionPane.showInputDialog("Preço:"));
            produto = new Produto(nomeProduto,preco,categoria);

            total += produto.getPreco();



            var pergunta = """
                    
                    Deseja cadastrar mais algum produto?
                    
                    [ 1 ] SIM
                    
                    [ 0 ] NÃO - MOSTRAR O VALOR TOTAL
                    """;

            encerrar = Integer.parseInt(JOptionPane.showInputDialog(pergunta));

        }while(encerrar > 0);

        JOptionPane.showMessageDialog(null, "TOTAL" + total);
    }
}