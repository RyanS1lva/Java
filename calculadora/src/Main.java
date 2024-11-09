import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        String function = "";
        Scanner input = new Scanner(System.in);
        String operator = "";
        double first_number;
        double second_number;
        double result;
        String exit;

        System.out.println("Bem-vindo a calculadora java! - Desenvolvida por: Ryan");
        while (true){
            while(!(function.equals("1")) && !(function.equals("2")) && !(function.equals("3")) && !(function.equals("4"))){
                System.out.print("[1] Soma\n[2] Subtração\n[3] Multiplicação\n[4] Divisão\nDigite a função desejada: ");
                function = input.nextLine();

                switch (function){
                    case("1"):
                        operator = "+";
                        break;
                    case("2"):
                        operator = "-";
                        break;
                    case("3"):
                        operator = "*";
                        break;
                    case("4"):
                        operator = "/";
                        break;
                    default:
                        System.out.println("\nInsira uma operação válida!");
                }
            }

                System.out.print("Digite o primero número: ");
                first_number = input.nextDouble();
                input.nextLine();

                System.out.print("Digite o segundo número: ");
                second_number = input.nextDouble();
                input.nextLine();

                result = switch (operator) {
                    case "+" -> first_number + second_number;
                    case "-" -> first_number - second_number;
                    case "*" -> first_number * second_number;
                    case "/" -> first_number / second_number;
                    default -> {
                        System.out.println("Operação inválida!");
                        yield 0.0;
                    }
                };

                System.out.printf("%.2f %s %.2f = %.2f", first_number, operator, second_number, result);
                System.out.print("\n\nPara sim digite - S\nPara não digite outra tecla qualquer!\nDeseja continuar? ");
                exit = input.nextLine().toUpperCase();

                if(exit.equals("S")){
                    function = "";
                    continue;
                }

                break;
        }
    }
}