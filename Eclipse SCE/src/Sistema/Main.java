package Sistema;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Produto> listaProdutos = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
        int opcao;
        System.out.println("Bem-vindo ao Elipse SCE\n");
        do {
            System.out.println("Selecione uma opcao:");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Atualizar estoque");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                	listarProdutos();
                    break;
                case 3:
                	atualizarEstoque();
                    break;
                case 4:
                    System.out.println("Encerrando sessão");
                    break;
                default:
                    System.out.println("Erro! Opção inválida");
            }
        } while (opcao != 4);
    }
	static void adicionarProduto() {
        System.out.print("ID: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Quantidade: ");
        int quantidade = input.nextInt();
        System.out.print("Preço: R$ ");
        double preco = input.nextDouble();

        Produto p = new Produto(nome, id, quantidade, preco);
        listaProdutos.add(p);
        System.out.println("Produto adicionado com sucesso!");
    }
	static void listarProdutos(){
        if(listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto no estoque");
        }else{
            for (Produto p : listaProdutos) {
                p.exibirInfo();
            }
        }
    }
	static void atualizarEstoque(){
        System.out.print("Digite o ID do produto: ");
        int idBusca = input.nextInt();

        for(Produto p : listaProdutos){
            if (p.getId()==idBusca){
                System.out.print("Novo estoque: ");
                int novaQtd = input.nextInt();
                p.setEstoque(novaQtd);
                System.out.println("Estoque atualizado com sucesso");
                break;
            }else{
            	System.out.println("Produto não encontrado.");
            }
        }
    }
}
