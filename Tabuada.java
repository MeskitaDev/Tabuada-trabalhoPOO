import java.util.Scanner;

public class Tabuada{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner para ler o teclado

        // infinito até o usuário digitar 0
        while (true) {
            System.out.print("Digite um número inteiro positivo (ou 0 para sair):");
            int numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("Programa finalizado. Até mais!");
                break;
            }

            // números negativos
            if (numero < 0) {
                System.out.println("Número inválido. Por favor, digite um número maior que zero.\n");
                continue; // volta para o início do laço
            }

            // tabuada
            System.out.println("\n--- Tabuada do " + numero + " ---");
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                
                // módulo (%) para verificar se é par ou ímpar
                String tipo;
                if (resultado % 2 == 0) {
                    tipo = "Par";
                } else {
                    tipo = "Ímpar";
                }

                // resultado
                System.out.println(numero + " x " + i + " = " + resultado + " (" + tipo + ")");
            }

            System.out.println(); // Linha em branco para organizar a repetição
        }
        scanner.close();
    }
}