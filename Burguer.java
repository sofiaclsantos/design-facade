public class Burguer implements Produto {

    private int gramas;
    private String descricao;
    private double preco;

    public Burguer(int gramas, String descricao, double preco) {
        this.gramas = gramas;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getGramas() {
        return gramas;
    }

    public void setGramas(int gramas) {
        this.gramas = gramas;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }

}