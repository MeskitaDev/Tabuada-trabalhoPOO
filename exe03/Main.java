public class Main {
    public static void main(String[] args) {
        System.out.println("=== CRIAÇÃO DO PRODUTO ===");
        Produto pcGamer = new Produto("PC gamer", 5500.00);
        pcGamer.exibirResumo();

        
        System.out.println("\n=== TESTANDO CASOS POSITIVOS ===");
        // Adicionando estoque válido
        pcGamer.adicionarEstoque(10); // Estoque vira 10
        
        // Venda válida
        pcGamer.vender(3);            // Estoque vira 7
        pcGamer.exibirResumo();

        System.out.println("\n=== TESTANDO CASOS NEGATIVOS ===");
        // Tentando adicionar estoque negativo
        pcGamer.adicionarEstoque(-5); // Deve dar erro
        pcGamer.adicionarEstoque(0);  // Deve dar erro

        // Tentando vender quantidade negativa
        pcGamer.vender(-2);           // Deve dar erro
        pcGamer.vender(0);            // Deve dar erro

        // Vender mais do que o disponível
        pcGamer.vender(15);           // Deve exibir: "Estoque insuficiente para a venda."

        // Alterar preço/nome para valores inválidos
        pcGamer.setPreco(-100.0);     // Deve dar erro
        pcGamer.setNome(" ");          // Deve dar erro

        System.out.println("\n=== TESTANDO LIMITES ===");
        // Vender todo o estoque
        pcGamer.vender(7);            // Estoque vira 0
        pcGamer.exibirResumo();

        // Venda com estoque zerado
        pcGamer.vender(1);            // Deve exibir: "Estoque insuficiente para a venda."

        // Preço gratuito
        pcGamer.setPreco(0.0);        // Deve aceitar
        pcGamer.exibirResumo();
    }
}