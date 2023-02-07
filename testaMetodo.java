public class testaMetodo {
    public static void main(String[] args) {
        Conta contaGab = new Conta();

        contaGab.saldo = 100;
        contaGab.deposita(50);
        System.out.println(contaGab.saldo);

        contaGab.saca(100);
        System.out.println(contaGab.saldo);

        boolean conseguiuRetirar = contaGab.saca(10);
        System.out.println(contaGab.saldo);
        System.out.println(conseguiuRetirar);


        Conta contaPaulo = new Conta();
        contaPaulo.deposita(1000);

        boolean sucessoTransferencia = 
            contaPaulo.transfere(300, contaGab);

        if (sucessoTransferencia) {
            System.out.println("transferencia realizada");
        } else {
            System.out.println("falta saldo");
        }

        System.out.println(contaPaulo.saldo);
        System.out.println(contaGab.saldo);


    }
}
