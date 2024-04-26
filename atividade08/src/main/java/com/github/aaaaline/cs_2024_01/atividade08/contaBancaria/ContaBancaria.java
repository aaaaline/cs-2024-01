package com.github.aaaaline.cs_2024_01.atividade08.contaBancaria;

import com.github.aaaaline.cs_2024_01.atividade08.login.LoginInvalidoException;

public class ContaBancaria {
    double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double depositar(double valor) {
        this.saldo = saldo + valor;

        return saldo;
    }

    public double sacar(double valor) throws SaldoInsuficienteException {
        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("O valor do saldo é insuficiente.");
        } else {
            this.saldo = saldo - valor;

            return saldo;
        }
    }
}