package com.github.aaaaline.cs_2024_01.atividade08.contaBancaria;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException (String mensagem) {
        super(mensagem);
    }
}