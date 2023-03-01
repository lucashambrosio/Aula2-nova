public class banco {
    public static void main(String[] args) {
        contaBancaria cli1;
        cli1 = new contaBancaria("Isabela","1234","123456");
        cli1.depositar(1000.00);
        System.out.println("Saldo: " + cli1.mostraSaldo());
    }
}
