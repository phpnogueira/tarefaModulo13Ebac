package tarefaModulo13;

public class Main {
    public static void main(String[] args){
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setCpf("100-200-300-55");
        pessoaFisica.setNome("Pedro");
        pessoaFisica.setSobrenome("Silva Gomes");
        pessoaFisica.setEndereco("Rua Dois de Agosto, 445");


        System.out.println("Nome:" + pessoaFisica.getNome() + "\nSobrenome: " + pessoaFisica.getSobrenome() +"\nEndereço:" + pessoaFisica.getEndereco()+ "\nCPF:" + pessoaFisica.getCpf() + "\n");

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Yuri");
        pessoaJuridica.setSobrenome("Chora Muito");
        pessoaJuridica.setEndereco("Rua Vinte e Cinco de Março, 1250");
        pessoaJuridica.setCnpj("900-800-700-65");


        System.out.println("Nome:" + pessoaJuridica.getNome() + "\nSobrenome: " + pessoaJuridica.getSobrenome() +"\nEndereço:" + pessoaJuridica.getEndereco()+ "\nCNPJ:" + pessoaJuridica.getCnpj());
    }
}