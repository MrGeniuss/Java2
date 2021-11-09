public class App {
    public static void main(String[] args) {
        
        Endereco endereco1 = new Endereco("Mario Mario", 92, "Mama mya", "Macaroni pizza", "Mushroom Kingdoom");
        Endereco endereco2 = new Endereco("Ar", 07, "Aguá", "Fogo", "Terra", "123");

        endereco1.setRua ("Mario Mario");
        endereco1.setNumero (92);
        endereco1.setBairro ("Mama mya");
        endereco1.setCidade ("Macaroni Pizza");
        endereco1.setEstado ("Mushroom Kingdoom");
        endereco1.setCep ("9998887-776");

        Medico medico = new Medico("32420-RS", "José Almeida", endereco1);
        Medico medico2 = new Medico("78650-RS", "Romero Brito", endereco2);
        
        //medico.crm = "32420-RS";
        //medico.nomeCompleto = "José Almeida";
        medico.setEndereco (endereco1);
        medico.setTelefoneParaComtato("111222333");

        Paciente paciente = new Paciente("Benjamin Arrola", endereco2);

        //paciente.nomeCompleto = "Benjamin Arrola";
        //paciente.rg = "6665554443";
        //paciente.cpf = "777222444";
        paciente.setTelefoneParaComtato("727272727");
        paciente.setEndereco(endereco2);

        Internacao internacao = new Internacao(medico2, paciente, "Tem uma jujuba no rin esquerdo");

        internacao.setMedicoResponsavel(medico);
        internacao.setPaciente(paciente);
        //internacao.dataDeInternacao = "14/07/2000";
        //internacao.dataDeAlta = "17/12/2000";
        internacao.setObservacoes("Paciente está vivo");
    
    }
}
