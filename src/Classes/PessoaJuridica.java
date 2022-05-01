package Classes;
import Classes.Pessoa;

public class PessoaJuridica extends Pessoa {
   public int Cnpj;
   public String tipo;

    public PessoaJuridica(int Cnpj, String tipo, String nome, String endereço, String bairro, int cep, String cidade, String Estado) {
        super(nome, endereço, bairro, cep, cidade, Estado);
        this.Cnpj = Cnpj;
        this.tipo = tipo;
    }

    public int getCnpj() {
        return Cnpj;
    }

    public void setCnpj(int Cnpj) {
        this.Cnpj = Cnpj;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   

    
   
   
   
    
    
    
}
