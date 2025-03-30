
import java.util.Scanner;

public class ContaTerminal {
    /**
     * 1. Crie o projeto `ContaBanco` que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
     * 2. Dentro do projeto, crie a classe `ContaTerminal.java` para realizar toda a codificação do nosso programa.
     * @param args
     * @throws Exception
     *  Numero    | Inteiro  | 1021 
     *  | Agencia   | Texto    | 067-8
     * | Nome Cliente | Texto    | MARIO ANDRADE
     * | Saldo | Decimal |237.48
     */   
     
    public static void main(String[] args) throws Exception {
        int numeroConta;
        double saldo;
        String nomeCliente;
        String agencia;
        Scanner input = new Scanner(System.in);

        System.out.println("Bem vindo ao Banco Progresso!\n Preparado para criar sua conta? \n");
        System.out.println("Vamos começar! \n");

        System.out.println("Digite o número da conta: \n");
        numeroConta = input.nextInt();

        System.out.println("Digite o número da agência: \n");
        agencia = input.next();

        System.out.println("Digite o nome do cliente: \n");
        nomeCliente = input.next();

        System.out.println("Qual o saldo da conta? \n");
        saldo = input.nextDouble();

        System.out.println("Dados cadastrados com sucesso!\n");

        System.out.println("Olá " + nomeCliente + "\nParabéns por ser mais um associado ao Banco Progresso!\n\n"+ "Segue seus Dados:\n");
        System.out.println("Cliente: " + nomeCliente + "\nConta: "+ numeroConta + " Agencia: " + agencia + "\nSaldo: R$" + saldo);
       
    }

   
}
