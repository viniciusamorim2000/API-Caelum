package br.com.caelum.contas.modelo;
import org.omg.CORBA.Any;

import java.util.Scanner;
public abstract class Conta implements Comparable<Conta>{
    protected String titular;
    protected int numero;
    protected double saldo ;
    protected String agencia;
    Scanner s = new Scanner(System.in);


    public Conta() {

    }
    public int compareTo(Conta outraConta){
        return this.titular.compareTo(outraConta.titular);
    }

    public boolean equals(Object object){
        if (object== null){
            return false;
        }
        Conta outraConta = (Conta) object;
        return this.numero == outraConta.numero && this.agencia.equals(outraConta.agencia);
    }
    
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Conta(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void deposita(double valorDigitado) {
        if (valorDigitado < 0){
            throw new IllegalArgumentException("Você tentou depositar"+ " um valor negativo");
        } else{
            this.saldo += valorDigitado;
        }
    }

    public void saca(double valorDigitado) {
        if (this.saldo < valorDigitado) {
            throw new IllegalArgumentException("Saldo insuficiente," + "tente um valor menor");
        } else {
            this.saldo -= valorDigitado;
            System.out.println("Saque ou transferência efetuado com sucesso");
        }
    }

    public void transfere(double valor, Conta conta){
        this.saca(valor);
        conta.deposita(valor);
    }


    public abstract String getTipo();

    public String recuperaDadosParaImpressao() {
        String dados = "Titular: " + this.titular;
        dados += "\nNúmero: " + this.numero;
        dados += "\nAgência: " + this.agencia;
        dados += "\nSaldo: R$" + this.saldo;
        return dados;
    }

    @Override
    public String toString(){
        return this.titular.toUpperCase();
    }


}