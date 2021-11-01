package chapter6;

public class Account2 {
    private String ano;
    private String owner;
    private int balance;

    public Account2(String ano, String owner, int balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }
    public String getAno() {
        return ano;
    }

    public void SetAno(String ano) {
        this.ano = ano;
    }

    public String getOwner() {
        return owner;
    }

    public void SetOwner(String owner){
        this.owner = owner;
    }

    public String getBalance() {
        return balance;
   }

   public void SetBalance(int balance){
        this.balance = balance;
    }
}
