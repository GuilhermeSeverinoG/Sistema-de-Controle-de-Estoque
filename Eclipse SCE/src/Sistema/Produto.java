package Sistema;

public class Produto {
	private String nome;
    private String id;
    private int quantidade;
    private double preco;

    public Produto(String nome, String id, int quantidade, double preco) {
        this.nome = nome;
        this.id = id;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public String getId() {
        return id;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public double getPreco() {
        return preco;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void exibirInfo() {
    	System.out.println("ID: " + id);
        System.out.println("Produto: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: R$" + preco);
        System.out.println("------------------------");
    }
}
