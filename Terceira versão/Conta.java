class Conta {

    private double saldo; // private(evita que ele seja alterado na raiz)
    private int agencia; // get e set(puxar os privados de forma mais segura e eficaz)
    private int numero;
    private Cliente titular; 
    private static int total; //static = da classe / n precisa de referencia tipo global / sem this no static

    public Conta(int agencia, int numero) { // construtor
        Conta.total++;
        System.out.println("total de contas: " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("estou criando uma conta: " + this.numero);
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if (saca(valor) == true) {
            saca(valor);
            destino.deposita(valor);
            return true;
        } return false;
    }

    public double getSaldo() {
        return this.saldo;

    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("valor inválido");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("valor inválido");
            return;
        } this.agencia = agencia;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

}  