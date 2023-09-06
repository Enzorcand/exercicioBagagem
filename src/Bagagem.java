public abstract class Bagagem {
    protected double peso;
    protected String descricao;
    protected int prioridade;
    static double taxaBagagem;

    public Bagagem(double peso, String descricao){
        this.peso = peso;
        this.descricao = descricao;
    }

    public int getPrioridade(){
        return prioridade;
    }

    public double getPeso(){
        return peso;
    }

    public double getTaxaBagagem(){
        return taxaBagagem;
    }

    public String getDescricao(){
        return getDescricao();
    }
}
