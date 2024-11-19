import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        ArrayList<String> tasksToDo = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("=-=-Bem-vindo ao checklist-=-=");
        while(true){
            System.out.print("\n[0] - Visualizar checklist atual\n[1] - Adicionar tarefa\n[2] - Remover tarefa\n[3] - Encerrar programa\nInsira a opção desejada: ");
            String option = input.nextLine();

            switch(option){
                case "0":
                    showTasks(tasksToDo);
                    break;
                case "1":
                    System.out.print("Insira o nome da tarefa a realizar: ");
                    String taskName = input.nextLine();
                    addTask(tasksToDo, taskName);
                    break;
                case "2":
                    showTasks(tasksToDo);
                    System.out.print("Digite o número da tarefa que você deseja remover: ");
                    int taskToRemove = input.nextInt();
                    input.nextLine();
                    removeTask(tasksToDo, taskToRemove);
                    break;
                case "3":
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }
            if(option.equals("3")){
                break;
            }

        }
    }

    public static void showTasks(ArrayList<String> tasks){
        System.out.println("\nChecklist atual:");
        int count = 1;
        for(String task: tasks){
            System.out.printf("%d - %s\n",count, task);
            count++;
        }
    }

    public static void removeTask(ArrayList<String> tasks, int positionTask){
        if(!tasks.isEmpty() && positionTask <= tasks.size()){
            tasks.remove(positionTask - 1);
            System.out.println("Tarefa removida com sucesso!");
        }else{
            System.out.println("Nenhuma tarefa foi removida do checklist!");
        }
    }

    public static void addTask(ArrayList<String> tasks, String taskName){
        if(!taskName.isBlank()){
            tasks.add(taskName);
            System.out.println("Tarefa inserida com sucesso!");
        }else{
            System.out.println("Nenhuma tarefa foi adicionada ao checklist!");
        }
    }
}