public class Paciente {

    private String nomeCompleto;
    private String rg;
    private String cpf;
    private String telefoneParaContato;
    private Endereco endereco;

    public Paciente(String nome, String rg, String cpf){
        this.nomeCompleto = nome;
        this.rg = rg;
        this.cpf = cpf;
    }
    public Paciente(String nome, String rg){
        this.nomeCompleto = nome;
        this.rg = rg;
    }
    public Paciente(String nome, Endereco endereco){
        this.nomeCompleto = nome;
        this.endereco = endereco;
    }
    public Paciente(String nome){
        this.nomeCompleto = nome;
    }

    //Getters 
    public String getNomeCompleto(){
        return this.nomeCompleto;
    }
    public String getRg(){
        return this.rg;
    }
    public String getCpf(){
        return this.cpf;
    }
    public String getTelefoneParaContato(){
        return this.telefoneParaContato;
    }
    public Endereco getEndereco(){
        return this.endereco;
    }
    //Setters
    public void setTelefoneParaComtato(String telefoneParaContato){
        this.telefoneParaContato = telefoneParaContato;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
}
