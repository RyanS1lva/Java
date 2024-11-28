import java.util.Scanner;
class User{
    private String name;
    private int age;
    private String address;

    void setUser(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getUser(){
        return "Nome: " + name + ", idade: " + age + " ano(s), endereço: " + address + ".";
    }
}

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        User ryan = new User();

        System.out.println("Bem-vindo ao cadastro de usuário!");
        System.out.print("Informe o seu nome: ");
        String userName = input.nextLine();

        System.out.print("Informe a sua idade: ");
        int userAge;
        while (true) {
            try {
                userAge = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Por favor, insira um número válido para a idade: ");
            }
        }

        System.out.print("Informe o seu endereço: ");
        String userAddress = input.nextLine();

        input.close();

        ryan.setUser(userName, userAge, userAddress);
        String userReturn = ryan.getUser();
        System.out.println(userReturn);
    }
}