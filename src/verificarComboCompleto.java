import java.util.Scanner;

public class verificarComboCompleto {
    public static String verificarCombo(String[] servicosContratados) {
        // Variáveis booleanas para verificar a contratação de cada serviço
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        // Itera sobre os serviços contratados
        for (String servico : servicosContratados) {
            // Verifica se o serviço é móvel, banda larga ou TV
            if (servico.trim().equalsIgnoreCase("Movel")) {
                movelContratado = true;
            } else if (servico.trim().equalsIgnoreCase("Banda Larga")) {
                bandaLargaContratada = true;
            } else if (servico.trim().equalsIgnoreCase("TV")) {
                tvContratada = true;
            }
        }

        // Verifica se todos os serviços foram contratados
        if (movelContratado && bandaLargaContratada && tvContratada) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de serviços contratados
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] servicosContratados = input.split(",");

        // Verificando se o cliente contratou um combo completo
        String resultado = verificarCombo(servicosContratados);

        // Exibindo o resultado
        System.out.println(resultado);

        // Fechando o scanner
        scanner.close();
    }
}
