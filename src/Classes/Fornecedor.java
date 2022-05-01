
package Classes;



public class Fornecedor  {
    
    private String nome;
    private int Telefone;
    private int ddd;
    private int cnpj;

    public Fornecedor(String nome, int Telefone, int ddd, int cnpj) {
        this.nome = nome;
        this.Telefone = Telefone;
        this.ddd = ddd;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

 
    

    
    
}
