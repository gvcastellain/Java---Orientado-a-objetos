public class TestaValores {
    
    public static void main(String[] args) {
        
        Conta conta = new Conta(1234, 5555);
        
        System.out.println(conta.getAgencia());

        Conta conta2 = new Conta(1123, 42242);
        System.out.println(Conta.getTotal());
    }
}
