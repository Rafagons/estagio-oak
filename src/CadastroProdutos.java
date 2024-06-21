import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CadastroProdutos {
    private List<Produto> produtos;
    private Scanner scanner;

    public CadastroProdutos() {
        produtos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void cadastrarProduto() {
        System.out.println("--- Cadastro de Produto ---");
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Descrição do produto: ");
        String descricao = scanner.nextLine();

        System.out.print("Valor do produto: ");
        double valor = scanner.nextDouble();

        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Disponível para venda (sim/não): ");
        String disponivelStr = scanner.nextLine();
        boolean disponivelParaVenda = disponivelStr.equalsIgnoreCase("sim");

        Produto novoProduto = new Produto(nome, descricao, valor, disponivelParaVenda);
        produtos.add(novoProduto);

        System.out.println("Produto cadastrado com sucesso!");

        // Após cadastrar, exibir a listagem atualizada automaticamente
        listarProdutos();
    }

    public void listarProdutos() {
        System.out.println("--- Listagem de Produtos ---");
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            // Ordenar os produtos pelo valor (menor para o maior)
            Collections.sort(produtos, Comparator.comparingDouble(Produto::getValor));

            // Exibir os produtos ordenados
            System.out.printf("%-20s %-10s\n", "Nome", "Valor");
            for (Produto produto : produtos) {
                System.out.printf("%-20s %-10.2f\n", produto.getNome(), produto.getValor());
            }
        }

        // Opção para cadastrar um novo produto
        System.out.println("\nDigite 'cadastrar' para inserir um novo produto ou qualquer outra tecla para sair.");
        String opcao = scanner.nextLine();
        if (opcao.equalsIgnoreCase("cadastrar")) {
            cadastrarProduto();
        } else {
            System.out.println("Saindo do cadastro de produtos.");
        }
    }

    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();

        // Exibir a listagem vazia inicialmente
        cadastro.listarProdutos();
    }
}
