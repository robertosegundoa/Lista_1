public class quest1_clinicaPaciente {
    public static void main(String[] args){
        Quest1_Paciente paciente_1 = new Quest1_Paciente("Roberto Santos", 13, "21/09/2004", "Masculino", "Nenhuma", "Nenhum", "B+");
        System.out.println("Codigo: "+paciente_1.codigo);
        System.out.println("Nome: "+ paciente_1.nome);
        System.out.println("Data de Nascimento: "+ paciente_1.dataNascimento);
        System.out.println("Sexo: "+ paciente_1.sexo);
        System.out.println("Plano de saude: "+ paciente_1.planoSaude);
        System.out.println("Alergia: "+ paciente_1.alergia);
        System.out.println("Tipo Sanguíneo: "+ paciente_1.tipoSanguineo);
        paciente_1.nome = "João Fernando";
        paciente_1.dataNascimento = "24/09/1982";
        paciente_1.sexo = "Masculino";
        paciente_1.alergia = "Asma";
        paciente_1.planoSaude = "Avancado";
        paciente_1.tipoSanguineo = "A-";
        paciente_1.codigo = 25;
        System.out.println(" ");
        System.out.println("Codigo: "+paciente_1.codigo);
        System.out.println("Nome: "+ paciente_1.nome);
        System.out.println("Data de Nascimento: "+ paciente_1.dataNascimento);
        System.out.println("Sexo: "+ paciente_1.sexo);
        System.out.println("Plano de saude: "+ paciente_1.planoSaude);
        System.out.println("Alergia: "+ paciente_1.alergia);
        System.out.println("Tipo Sanguíneo: "+ paciente_1.tipoSanguineo);
    }
}