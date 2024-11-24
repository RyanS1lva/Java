import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        String option;
        Scanner input = new Scanner(System.in);
        double firstNumber;
        double secondNumber;
        System.out.println("=-=-Bem vindo a calculadora!-=-=");
        while(true) {
            System.out.print("\n[0] - Somar\n[1] - Subtrair\n[2] - Multiplicar\n[3] - Dividir\n[4] - Encerrar programa\nDigite a opção desejada: ");
            option = input.nextLine();
            if(option.equals("4")){
                System.out.println("Encerrando o programa...");
                break;
            }

            System.out.print("Digite o primeiro número: ");
            firstNumber = input.nextDouble();
            input.nextLine();

            System.out.print("Digite o segundo número: ");
            secondNumber = input.nextDouble();
            input.nextLine();

            switch(option){
                case "0":
                    sum(firstNumber, secondNumber);
                    break;
                case "1":
                    subtract(firstNumber, secondNumber);
                    break;
                case "2":
                    multiply(firstNumber, secondNumber);
                    break;
                case "3":
                    division(firstNumber, secondNumber);
                    break;
                default:
                    System.out.println("Insira uma função válida!");
                    break;
            }
        }
    }

    public static void sum(double firstNumber, double secondNumber) {
        double result = firstNumber + secondNumber;
        System.out.printf("%.2f + %.2f = %.2f", firstNumber, secondNumber, result);
    }

    public static void subtract(double firstNumber, double secondNumber) {
        double result = firstNumber -secondNumber;
        System.out.printf("%.2f - %.2f = %.2f", firstNumber, secondNumber, result);
    }

    public  static void multiply(double firstNumber, double secondNumber) {
        double result = firstNumber * secondNumber;
        System.out.printf("%.2f x %.2f = %.2f", firstNumber, secondNumber, result);
    }

    public static void division(double firstNumber, double secondNumber) {
        double result = firstNumber / secondNumber;
        System.out.printf("%.2f / %.2f = %.2f", firstNumber, secondNumber, result);
    }
}