package List.Basic;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        carrinho.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensRemover = new ArrayList<>();
        for (Item item : carrinho) {
            if (item.getNome().equals(nome)) {
                itensRemover.add(item);
            }
        }
        carrinho.removeAll(itensRemover);
    }

    public Double calcularValorTotal() {
        Double valorTotal = 0.0;
        for (Item item : carrinho) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItem() {
        System.out.println("Carrinho de Compras:" + carrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Arroz", 10.0, 2);
        carrinhoDeCompras.adicionarItem("Feijão", 8.0, 1);
        carrinhoDeCompras.adicionarItem("Macarrão", 5.0, 3);
        carrinhoDeCompras.exibirItem();
        System.out.println("Valor total: " + carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.removerItem("Arroz");
        carrinhoDeCompras.exibirItem();
        System.out.println("Valor total: " + carrinhoDeCompras.calcularValorTotal());
    }
}
