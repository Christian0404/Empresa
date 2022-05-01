
package Classes;


public class SetorPrincipal {
    
   private String nomeSetor;
   private int QtdFuncionarios;

    public SetorPrincipal(String nomeSetor, int QtdFuncionarios) {
        this.nomeSetor = nomeSetor;
        this.QtdFuncionarios = QtdFuncionarios;
    }

    public String getNomeSetor() {
        return nomeSetor;
    }

    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }

    public int getQtdFuncionarios() {
        return QtdFuncionarios;
    }

    public void setQtdFuncionarios(int QtdFuncionarios) {
        this.QtdFuncionarios = QtdFuncionarios;
    }

    
   
}
