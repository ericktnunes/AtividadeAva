package AtividadeAva;

public class Produto {
    private String nome;
    private int codigo;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirInfo (String nome){
        System.out.println("Nome do produto: " + nome);
    }

    public void exibirInfo (String nome, int codigo){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Codigo do produto: " + codigo);
    }

    public void exibirInfo (String nome, int codigo, double preco){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Codigo do produto: " + codigo);
        System.out.println("Preço do produto: " + preco);
    }


}
