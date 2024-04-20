package cadastropoo;

import java.io.IOException;
import model.PessoaFisica;
import model.PessoaFisicaRepo;
import model.PessoaJuridica;
import model.PessoaJuridicaRepo;

public class CadastroPOOParte1 {
    
    public static void main(String[] args) {
    // Criar um repositório de pessoas físicas (repo1)
    PessoaFisicaRepo repo1 = new PessoaFisicaRepo();
    
    // Adicionar duas pessoas físicas usando o construtor completo
    repo1.inserir(new PessoaFisica(1, "Pedro", "55555555555", 30));
    repo1.inserir(new PessoaFisica(2, "Maria", "66666666666", 25));

    // Mensagem de confirmação
    System.out.println("Dados de Pessoa Fisica Armazenados.");
    
    // Invocar o método de persistência em repo1, fornecendo um nome de arquivo fixo ("pessoaFisica.dat")
    try {
        repo1.persistir("pessoaFisica.dat");
    } catch (IOException e) {
        System.err.println("Erro ao persistir dados de pessoas físicas: " + e.getMessage());
    }

    // Instanciar outro repositório de pessoas físicas (repo2)
    PessoaFisicaRepo repo2 = new PessoaFisicaRepo();
    
    // Invocar o método de recuperação em repo2, fornecendo o mesmo nome de arquivo utilizado anteriormente
    try {
        repo2.recuperar("pessoaFisica.dat");
    } catch (IOException | ClassNotFoundException e) {
        System.err.println("Erro ao recuperar dados de pessoas físicas: " + e.getMessage());
    }

    // Mensagem de confirmação
    System.out.println("Dados de Pessoa Fisica Recuperados.");

    // Exibir os dados de todas as pessoas físicas recuperadas
    for (PessoaFisica pessoaFisica : repo2.obterTodos()) {
        pessoaFisica.exibir();
    }

    // Criar um repositório de pessoas jurídicas (repo3)
    PessoaJuridicaRepo repo3 = new PessoaJuridicaRepo();
    
    // Adicionar duas pessoas jurídicas usando o construtor completo
    repo3.inserir(new PessoaJuridica(3, "FIT Fit", "77777777777777"));
    repo3.inserir(new PessoaJuridica(4, "FIT Project", "88888888888888"));

    // Mensagem de confirmação
    System.out.println("Dados de Pessoa Juridica Armazenados.");
    
    // Invocar o método de persistência em repo3, fornecendo um nome de arquivo fixo ("pessoaJuridica.dat")
    try {
        repo3.persistir("pessoaJuridica.dat");
    } catch (IOException e) {
        System.err.println("Erro ao persistir dados de pessoas jurídicas: " + e.getMessage());
    }

    // Instanciar outro repositório de pessoas jurídicas (repo4)
    PessoaJuridicaRepo repo4 = new PessoaJuridicaRepo();
    
    // Invocar o método de recuperação em repo4, fornecendo o mesmo nome de arquivo utilizado anteriormente
    try {
        repo4.recuperar("pessoaJuridica.dat");
    } catch (IOException | ClassNotFoundException e) {
        System.err.println("Erro ao recuperar dados de pessoas jurídicas: " + e.getMessage());
    }

    // Mensagem de confirmação
    System.out.println("Dados de Pessoa Juridica Recuperados.");

    // Exibir os dados de todas as pessoas jurídicas recuperadas
    for (PessoaJuridica pessoaJuridica : repo4.obterTodos()) {
        pessoaJuridica.exibir();
    }
    }

}
