package br.com.caelum.contas;

public class SaldoInsuficienteException extends RuntimeException {

    public SaldoInsuficienteException(String message){
        super(message);
    }


    public SaldoInsuficienteException(double valor) {
        super("Saldo insulficiente para sacar o valor de: "+valor);
    }
}
