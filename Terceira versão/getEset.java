public class getEset {
    
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 1521);
        Cliente andre = new Cliente();

        conta.setNumero(1337);
        System.out.println(conta.getNumero());


        conta.setTitular(andre);
        andre.setNome("andre lenin");
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("padeiro");

        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("padeiro");

        System.out.println(titularDaConta);
        System.out.println(andre); // o mesmo
        System.out.println(conta.getTitular());

        
    }
}
