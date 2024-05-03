package List.Search;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> catalogo;

    public CatalogoLivros() {
        this.catalogo = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        catalogo.add(livro);
    }

    public void pesquisarPorAutor(String autor) {
        List<Livro> encontrados = new ArrayList<>();
        for (Livro livro : catalogo) {
            if (livro.getAutor().equals(autor)) {
                encontrados.add(livro);
            }
        }
        System.out.println("Livros encontrados: " + encontrados);
    }

    public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> encontrados = new ArrayList<>();
        for (Livro livro : catalogo) {
            if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                encontrados.add(livro);
            }
        }
        System.out.println("Livros encontrados: " + encontrados);
    }

    public void pesquisarPorTitulo(String titulo) {
        for (Livro livro : catalogo) {
            if (livro.getTitulo().equals(titulo)) {
                System.out.println("Livro encontrado: " + livro);
                break;
            }
        }

    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Dom Casmurro", "Machado de Assis", 1899);
        catalogoLivros.adicionarLivro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881);
        catalogoLivros.adicionarLivro("O Alienista", "Machado de Assis", 1882);
        catalogoLivros.adicionarLivro("O Cortiço", "Aluísio Azevedo", 1890);
        catalogoLivros.adicionarLivro("O Guarani", "José de Alencar", 1857);
        catalogoLivros.pesquisarPorAutor("Machado de Assis");
        catalogoLivros.pesquisarPorIntervaloAnos(1880, 1890);
        catalogoLivros.pesquisarPorTitulo("O Guarani");
    }
}
