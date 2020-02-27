package br.com.caelum.contas.modelo;

import br.com.caelum.contas.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributavel{
    public String getTipo(){
        return "Conta Corrente";
    }

    @Override
    public void saca(double valorDigitado) {
        if (valorDigitado < 0){
            throw new IllegalArgumentException("Você tentou sacar um valor negativo");
        }
        if (this.saldo < valorDigitado){
            throw new SaldoInsuficienteException(valorDigitado);
        }
        this.saldo-= (valorDigitado + 0.10);

    }

    @Override
    public double getValorImposto() {
        return this.getSaldo() * 0.01;
    }
}
