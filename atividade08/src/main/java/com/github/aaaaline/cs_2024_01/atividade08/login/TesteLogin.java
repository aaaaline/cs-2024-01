package com.github.aaaaline.cs_2024_01.atividade08.login;

import java.util.Scanner;

public class TesteLogin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Login login = new Login("usuario", "123456");

        System.out.print("Usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        testar_login(login, usuario, senha);
    }

    public static void testar_login(Login login, String usuario, String senha) {
        try {
            boolean resultado_login = login.fazer_login(usuario, senha);
            System.out.println(resultado_login ? "Sucesso ao fazer login!" : "Falha ao fazer login!");

        } catch (LoginInvalidoException e) {
            System.out.println("Erro ao fazer login!\n" + e.getMessage());
        }
    }
}