
package Classes;
import Classes.Pessoa;

public class PessoaFisica extends Pessoa{
   public int Rg;
   public int cpf;

    public PessoaFisica(int Rg, int cpf, String nome, String endereço, String bairro, int cep, String cidade, String Estado) {
        super(nome, endereço, bairro, cep, cidade, Estado);
        this.Rg = Rg;
        this.cpf = cpf;
    }

    public int getRg() {
        return Rg;
    }

    public void setRg(int Rg) {
        this.Rg = Rg;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    
  
  }
