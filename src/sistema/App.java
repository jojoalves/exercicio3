package sistema;

import java.util.Scanner;

import nucleo.Cliente;
import nucleo.Conta;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();

        System.out.println("Digite o sobrenome do cliente:");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite o endereço do cliente:");
        String endereco = scanner.nextLine();

        System.out.println("Digite o CPF do cliente:");
        String cpf = scanner.nextLine();

        Cliente cliente = new Cliente(nome, sobrenome, endereco, cpf);

        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();

        Conta conta = new Conta(numero, cliente);

        System.out.println("Cliente e conta criados com sucesso!");
        System.out.println(conta);

        int operacao = 0;
        while (operacao != 3) {
            System.out.println("Escolha uma operação: 1 - Depósito, 2 - Saque, 3 - Sair");
            operacao = scanner.nextInt();

            if (operacao == 1) {
                System.out.println("Digite o valor do depósito:");
                double valor = scanner.nextDouble();
                conta.depositar(valor);
                System.out.println("Depósito realizado com sucesso!");
            } else if (operacao == 2) {
                System.out.println("Digite o valor do saque:");
                double valor = scanner.nextDouble();
                if (conta.getSaldo() >= valor) {
                    conta.sacar(valor);
                    System.out.println("Saque realizado com sucesso!");
                } else {
                    System.out.println("Saldo insuficiente!");
                }
            } else if (operacao == 3) {
            	scanner.close();
                System.out.println("Finalizando execução.");
            } else {
                System.out.println("Operação inválida!");
            }
        }
	}
}
