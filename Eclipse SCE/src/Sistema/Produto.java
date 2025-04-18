package Sistema;

public class Produto {
	private String nome;
    private int id;
    private int estoque;
    private double preco;

    public Produto(String nome, int id, int estoque, double preco) {
        this.nome = nome;
        this.id = id;
        this.estoque = estoque;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public int getId() {
        return id;
    }
    public int getEstoque() {
        return estoque;
    }
    public double getPreco() {
        return preco;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    public void exibirInfo() {
    	System.out.println("ID: " + id);
        System.out.println("Produto: " + nome);
        System.out.println("Estoque: " + estoque);
        System.out.println("Preço: R$" + preco);
        System.out.println("------------------------");
    }
}
