package Map;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livros;

    public LivrariaOnline() {
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        this.livros.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        List<String> livrosRemover = new ArrayList<>();
        if (!livros.isEmpty()) {
            for (Map.Entry<String, Livro> entry : livros.entrySet()) {
                if (entry.getValue().getTitulo().equals(titulo)) {
                    livrosRemover.add(entry.getKey());
                }
            }
        }
        for (String link : livrosRemover) {
            livros.remove(link);
        }
    }

    public void exibirLivrosOrdenadosPorPreco() {
        List<Livro> livrosOrdenados = new ArrayList<>(livros.values());
        livrosOrdenados.sort(new ComparatorPorPreco());
        for (Livro livro : livrosOrdenados) {
            System.out.println(livro);
        }
    }
}
