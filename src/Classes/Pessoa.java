package Classes;


public class Pessoa {
   
    
    public String nome;
    public String endereço;
    public String bairro;
    public int cep;
    public String cidade;
    public String Estado;

    public Pessoa (String nome, String endereço, String bairro, int cep, String cidade, String Estado) {
        this.nome = nome;
        this.endereço = endereço;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.Estado = Estado;
        
       
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

 
    
    
    
    
    
    
}
