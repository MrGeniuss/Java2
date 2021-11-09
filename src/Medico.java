public class Medico {

    private String crm;
    private String nomeCompleto;
    private Endereco endereco;
    private String telefoneParaContato;

    public Medico(String crm, String nomeCompleto, Endereco endereco){
        this.crm = crm;
        this.nomeCompleto = nomeCompleto;
        this.endereco = endereco;
    }

    //Getters 
    public String getCrm(){
        return this.crm;
    }
    public String getNomeCompleto(){
        return this.nomeCompleto;
    }
    public Endereco getEndereco(){
        return this.endereco;
    }
    public String getTelefoneParaComtato(){
        return this.telefoneParaContato;
    }
    //Setters
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public void setTelefoneParaComtato(String telefoneParaContato){
        this.telefoneParaContato = telefoneParaContato;
    }
    
}
