public class Bebida implements Produto {

    private int ml;
    private String descricao;
    private double preco;

    public Bebida(int ml, String descricao, double preco) {
        this.ml = ml;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getMl() {
        return ml;
    }

    public void setML(int ml) {
        this.ml = ml;
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