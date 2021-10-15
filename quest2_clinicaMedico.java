Public class quest2_clinicaMedico {

    public static void main(String[] args) {
        Quest2_endereco endereco = new Quest2_endereco("13", "123456", "Pedro Mario", "Rua Paulo Fontes", "California", "Canudos", "BA");
        Quest2_medico medico = new Quest2_medico(2529, "Maria Fernandes", "Feminino", "Dermatologista", endereco);
        System.out.println(" ");
        System.out.println("---------->Medico:");
        System.out.println("Codigo: " + medico.codigo);
        System.out.println("Nome: " + medico.nome);
        System.out.println("Sexo: " + medico.sexo);
        System.out.println("Especialidade: " + medico.especialidade);
        System.out.println("---------->Endereco:");
        endereco.Endereco();
        endereco.numero = "2245";
        endereco.cep = "48520000";
        endereco.rua = "Jose de Abreu";
        endereco.complemento = "N/a";
        endereco.bairro = "Maria Aparecida";
        endereco.cidade = "Curitiba";
        endereco.uf = "PR";
        medico.codigo = 2529;
        medico.nome = "Mario Junior";
        medico.sexo = "Masculino";
        medico.especialidade = "Pediatra";
        System.out.println(" ");
        System.out.println("---------->Medico:");
        System.out.println("Codigo: " + medico.codigo);
        System.out.println("Nome: " + medico.nome);
        System.out.println("Sexo: " + medico.sexo);
        System.out.println("Especialidade: " + medico.especialidade);
        System.out.println("---------->Endereco:");
        endereco.Endereco();
    }
}
