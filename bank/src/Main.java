import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double initialBalance = -1;
        double amount;
        int typeAccount;
        Account myAccount;

        System.out.println("=-=-Menu bancário-=-=");
        do {
            System.out.print("Insira o saldo inicial: ");
            if (input.hasNextDouble()) {
                initialBalance = input.nextDouble();
                if (initialBalance < 0) {
                    System.out.println("O saldo inicial não pode ser negativo. Tente novamente!");
                }
            } else {
                System.out.println("Erro: Por favor, insira um número válido para o saldo inicial!");
                input.nextLine();
            }
        } while (initialBalance < 0);

        while(true){
            System.out.println("0 - Conta simples");
            System.out.println("1 - Conta corrente (Com limite adicional)");
            System.out.print("Insira a opção desejada: ");
            typeAccount = input.nextInt();
            input.nextLine();

            if (typeAccount == 0) {
                System.out.println("Conta simples selecionada!");
                myAccount = new Account(initialBalance);
                break;
            } else if (typeAccount == 1) {
                System.out.println("Conta corrente selecionada!");
                System.out.println("Limite adicional de: R$ 200!");
                myAccount = new CheckingAccount(initialBalance);
                break;
            } else {
                System.out.println("Digite uma opção válida para tipo de conta!");
            }
        }




        while(true){
            System.out.println("\n1 - Visualizar saldo atual");
            System.out.println("2 - Depositar valor");
            System.out.println("3 - Sacar valor");
            System.out.println("4 - Sair do programa");
            System.out.print("Digite a opção desejada: ");

            try {
                int option = input.nextInt();

                if (option == 4) {
                    input.close();
                    break;
                }

                switch (option) {
                    case 1:
                        myAccount.getBalance();
                        break;
                    case 2:
                        System.out.print("Insira o valor do depósito: ");
                        amount = input.nextDouble();
                        myAccount.deposit(amount);
                        break;
                    case 3:
                        System.out.print("Insira o valor do saque: ");
                        amount = input.nextDouble();
                        myAccount.withdraw(amount);
                        break;
                    default:
                        System.out.println("Insira uma opção válida!");
                        break;
                }
            } catch(java.util.InputMismatchException e) {
                System.out.println("Erro: valor inserido inválido!");
                input.nextLine();
            }
        }

    }
}