public class CriarConta { 
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();

        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);


        Conta segundConta = new Conta();
        segundConta.saldo = 50;
        System.out.println("primeira conta tem: " + primeiraConta.saldo);
        System.out.println("segunda conta tem: " + segundConta.saldo);

    }

}
