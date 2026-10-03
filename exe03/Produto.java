public class Produto {

    // Atributos Privados
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // Método Construtor - Inicializa estoque com 0
    public Produto(String nome, double preco) {
        this.setNome(nome);
        this.setPreco(preco);
        this.quantidadeEmEstoque = 0;
    }

    // Getters e Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Erro: O nome do produto não pode ser vazio.");
        }
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: O preço não pode ser negativo.");
        }
    }

    // Getter para a quantidade
    public int getQuantidadeEmEstoque() {
        return this.quantidadeEmEstoque;
    }

    // 1. Adicionar Estoque
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEmEstoque += quantidade;
            System.out.println("Sucesso: " + quantidade + " unidades adicionadas ao estoque.");
        } else {
            System.out.println("Erro: A quantidade deve ser maior que zero.");
        }
    }

    // 2. Vender
    public void vender(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Erro: A quantidade deve ser maior que zero.");
            return;
        }

        if (quantidade <= this.quantidadeEmEstoque) {
            this.quantidadeEmEstoque -= quantidade;
            System.out.println("Venda realizada com sucesso: " + quantidade + " unidades vendidas.");
        } else {
            System.out.println("Estoque insuficiente para a venda.");
        }
    }

    // 3. Exibir Nota Fiscal
    public void exibirResumo() {
        System.out.println("----------------------------------------");
        System.out.println("PRODUTO: " + this.nome);
        System.out.println("PREÇO: R$ " + String.format("%.2f", this.preco));
        System.out.println("ESTOQUE ATUAL: " + this.quantidadeEmEstoque + " unidade(s)");
        System.out.println("----------------------------------------");
    }
}