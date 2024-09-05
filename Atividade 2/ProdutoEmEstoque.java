import java.util.Scanner;

public class ProdutoEmEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();

        System.out.println("Digite o preco do produto:");
        double preco = scanner.nextDouble();

        System.out.println("Digite a quantidade do produto no estoque:");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);

        System.out.println("\nDados do produto:");
        System.out.println(produto);

        System.out.println("\nRealize uma entrada no estoque:");
        System.out.println("Digite a quantidade a ser adicionada:");
        int entrada = scanner.nextInt();
        produto.entrada(entrada);

        System.out.println("\nDados do produto apos entrada:");
        System.out.println(produto);

        System.out.println("\nRealize uma saida no estoque:");
        System.out.println("Digite a quantidade a ser removida:");
        int saida = scanner.nextInt();
        if (produto.saida(saida)) {
            System.out.println("\nDados do produto apos saida:");
            System.out.println(produto);
        } else {
            System.out.println("Quantidade insuficiente no estoque!");
        }
    }
}

class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void entrada(int quantidade) {
        this.quantidade += quantidade;
    }

    public boolean saida(int quantidade) {
        if (quantidade > this.quantidade) {
            return false;
        }
        this.quantidade -= quantidade;
        return true;
    }

    public String toString() {
        return "Nome: " + nome +
                "\nPreco: R$" + String.format("%.2f", preco) +
                "\nQuantidade no estoque: " + quantidade +
                "\nValor total no estoque: R$" + String.format("%.2f", preco * quantidade);
    }
}