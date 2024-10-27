package enkapsulasi;

public class Main {
    public static void main(String[] args) {
        BankAccount ThomsonSitumorang= new BankAccount(100);
        ThomsonSitumorang.withdraw(10);
        System.out.println(ThomsonSitumorang.getSaldo());
    }
}
