package com.github.aaaaline.cs_2024_01.atividade08.login;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException (String mensagem) {
        super(mensagem);
    }
}