public class Account {
    double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        if(amount > 0){
            this.balance += amount;
            System.out.println("Depósito de R$ " + amount + " realizado com sucesso!");
        }else{
            System.out.println("Valor para depósito inválido!");
        }
    }

    void withdraw(double amount) {
        if(amount > 0 && amount <= this.balance){
            this.balance -= amount;
            System.out.println("Saque de R$ " + amount + " realizado com sucesso!");
        }else{
            System.out.println("Valor para saque inválido!");
        }
    }

    void getBalance() {
        System.out.println("Saldo total: R$ " + this.balance);
    }
}
