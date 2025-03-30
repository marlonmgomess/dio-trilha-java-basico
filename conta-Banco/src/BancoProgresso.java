import java.util.Scanner;

public class BancoProgresso {
    public static void main(String[] args) {
        int numeroConta;
        double saldo = 0; // Inicializando saldo
        String nomeCliente;
        String agencia;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Bem vindo ao Banco Progresso!\nPreparado para criar sua conta? \n");
        System.out.println("Vamos começar! \n");

        System.out.println("Digite o número da conta: \n");
        numeroConta = input.nextInt();

        System.out.println("Digite o número da agência: \n");
        agencia = input.next();

        System.out.println("Digite o nome do cliente: \n");
        nomeCliente = input.next();

        boolean inputValido = false;

        // Tratamento de exceção para o saldo
        while (!inputValido) {
            try {
                System.out.println("Qual o saldo da conta? \n");
                saldo = input.nextDouble();
                inputValido = true; // Se o valor for válido, sai do loop
            } catch (Exception e) {
                System.out.println("Erro! Digite um valor numérico válido para o saldo.");
                input.nextLine(); // Limpa o buffer
            }
        }

        System.out.println("Dados cadastrados com sucesso!\n");

        System.out.println("Olá " + nomeCliente + "\nParabéns por ser mais um associado ao Banco Progresso!\n\n" + "Segue seus Dados:\n");
        System.out.println("Cliente: " + nomeCliente + "\nConta: " + numeroConta + " Agencia: " + agencia + "\nSaldo: R$" + saldo);
        
        input.close(); // Fechando o scanner
    }
}
