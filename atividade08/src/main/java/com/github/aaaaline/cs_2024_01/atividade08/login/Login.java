package com.github.aaaaline.cs_2024_01.atividade08.login;

public class Login {
    String usuario;
    String senha;

    public Login (String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public boolean fazer_login (String usuario, String senha) throws LoginInvalidoException {
        if (this.usuario.equals(usuario) && this.senha.equals(senha)) {
            return true;
        }
        else if (this.usuario.equals(usuario) && !this.senha.equals(senha)){
                throw new LoginInvalidoException("A senha digitada está incorreta.");
        }
        else if (!this.usuario.equals(usuario) && this.senha.equals(senha)) {
            throw new LoginInvalidoException("O usuário informado não existe.");
        }
        else {
            throw new LoginInvalidoException("O usuário e a senha informados estão incorretos.");
        }
    }
}