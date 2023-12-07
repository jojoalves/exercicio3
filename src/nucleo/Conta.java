package nucleo;

public class Conta {
	private int numero;
    private Cliente cliente;
    private double saldo;
    private double limite;

    public Conta(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido!");
        } else {
            this.saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido!");
        } else if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void transferir(Conta destino, double valor) {
        if (valor <= 0) {
            System.out.println("Valor de transferência inválido!");
        } else if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
