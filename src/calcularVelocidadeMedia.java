import java.util.Scanner;

public class calcularVelocidadeMedia {
    // Função para calcular a velocidade média de conexão de internet
    public static double velocidadeMedia(String[] velocidades) {
        int total = 0;

        // Somando todas as velocidades registradas
        for (String velocidade : velocidades) {
            total += Integer.parseInt(velocidade.trim());
        }

        // Calculando a média
        return (double) total / velocidades.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Calculando a velocidade média de conexão
        double velocidadeMedia = velocidadeMedia(velocidades);

        // Exibindo a velocidade média de conexão
        System.out.println((int)velocidadeMedia + " Mbps");

        scanner.close();
    }
}
