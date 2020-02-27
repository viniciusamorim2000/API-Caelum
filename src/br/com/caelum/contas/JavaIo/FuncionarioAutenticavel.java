package br.com.caelum.contas.JavaIo;

public abstract class FuncionarioAutenticavel  extends Funcionario{


        int senha;

        public boolean autentica(int senha){
            if (senha == this.senha) {
                System.out.println("Acesso permitido");
                return true;
            }
            else {
                System.out.println("Acesso negado");
                return true;
            }
        }
    }



