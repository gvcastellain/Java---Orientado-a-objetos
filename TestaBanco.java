public class TestaBanco {
    public static void main(String[] args) {
        
        Cliente paulo = new Cliente();

        paulo.nome = "paulo";
        paulo.cpf = "111.111.111-11";
        paulo.profissao = "advogado";

        Conta contaPaulo = new Conta();
        contaPaulo.deposita(100);

        contaPaulo.titular = paulo;
        System.out.println(contaPaulo.titular.nome);
        System.out.println(contaPaulo.titular);

        Conta contaMel = new Conta();
        contaMel.titular = new Cliente();

        contaMel.deposita(1000);
        contaMel.titular.nome = "melissa";

        System.out.println(contaMel.pegaSaldo());
        System.out.println(contaMel.titular.nome);



    }
}
