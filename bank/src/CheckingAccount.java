public class CheckingAccount extends  Account{
    double creditLimit = 200;
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    void withdraw(double amount){
        if(amount > 0 && amount <= this.balance){
            this.balance -= amount;
            System.out.println("Saque de R$ " + amount + " realizado com sucesso!");
        }else if(amount > 0 && amount <= this.balance + creditLimit){
            creditLimit -= (amount - this.balance);
            this.balance = 0;
            System.out.println("Saque de R$ " + amount + " realizado com o limite de crédito!");
        }else{
            System.out.println("Valor para saque inválido!");
        }
    }

    void getBalance() {
        System.out.println("Saldo total: R$ " + this.balance);
        System.out.println("Limite de crédito disponível: R$ " + this.creditLimit);
    }


}
