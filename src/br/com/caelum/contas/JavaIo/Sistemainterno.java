package br.com.caelum.contas.JavaIo;

import java.util.Scanner;

public class Sistemainterno {

    Scanner s = new Scanner(System.in);
    public void login(FuncionarioAutenticavel fa){
        int senha = s.nextInt();
        fa.autentica(senha);
        if (fa.autentica(senha) == true){
            System.out.println("Sistema interno liberado");
        }
        else{
            System.out.println("Sistema negado");
        }
    }


}
