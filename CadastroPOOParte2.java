package cadastropoo;

import java.util.Scanner;
import model.PessoaFisica;
import model.PessoaFisicaRepo;
import model.PessoaJuridica;
import model.PessoaJuridicaRepo;

public class CadastroPOOParte2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            PessoaFisicaRepo repoFisica = new PessoaFisicaRepo();
            PessoaJuridicaRepo repoJuridica = new PessoaJuridicaRepo();
            int opcao;
            
            do {
                System.out.println("==================================");
                System.out.println("1 - Incluir Pessoa");
                System.out.println("2 - Alterar Pessoa");
                System.out.println("3 - Excluir Pessoa");
                System.out.println("4 - Buscar pelo Id");
                System.out.println("5 - Exibir Todos");
                System.out.println("6 - Persistir Dados");
                System.out.println("7 - Recuperar Dados");
                System.out.println("0 - Finalizar Programa");
                System.out.println("==================================");
                System.out.print("Opcao: ");
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha
                
                switch (opcao) {
                    case 1:
                        incluirPessoa(scanner, repoFisica, repoJuridica);
                        break;
                    default:
                        System.out.println("Opcao invalida.");
                        break;
                }
                // Adicione os outros casos aqui
            } while (opcao != 0);
        }
    }
    // Adicione outros métodos conforme necessário

    private static void incluirPessoa(Scanner scanner, PessoaFisicaRepo repoFisica, PessoaJuridicaRepo repoJuridica) {
        System.out.println("Escolha o tipo (F - Pessoa Fisica / J - Pessoa Juridica):");
        String tipo = scanner.next().toUpperCase();
        
        if (tipo.equals("F")) {
            incluirPessoaFisica(scanner, repoFisica);
        } else if (tipo.equals("J")) {
            incluirPessoaJuridica(scanner, repoJuridica);
        } else {
            System.out.println("Opcao invalida.");
        }
    }

    private static void incluirPessoaFisica(Scanner scanner, PessoaFisicaRepo repoFisica) {
        System.out.println("Digite o Id da pessoa:");
        int id = scanner.nextInt();
        System.out.println("Digite o nome da pessoa:");
        String nome = scanner.next();
        System.out.println("Digite o CPF da pessoa:");
        String cpf = scanner.next();
        System.out.println("Digite a idade da pessoa:");
        int idade = scanner.nextInt();
        
        PessoaFisica pessoaFisica = new PessoaFisica(id, nome, cpf, idade);
        repoFisica.inserir(pessoaFisica);
        System.out.println("Pessoa fisica adicionada com sucesso!");
    }

    private static void incluirPessoaJuridica(Scanner scanner, PessoaJuridicaRepo repoJuridica) {
        System.out.println("Digite o Id da pessoa:");
        int id = scanner.nextInt();
        System.out.println("Digite o nome da empresa:");
        String nome = scanner.next();
        System.out.println("Digite o CNPJ da empresa:");
        String cnpj = scanner.next();
        
        PessoaJuridica pessoaJuridica = new PessoaJuridica(id, nome, cnpj);
        repoJuridica.inserir(pessoaJuridica);
        System.out.println("Pessoa juridica adicionada com sucesso!");
    }
}

