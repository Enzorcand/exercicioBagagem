import java.util.ArrayList;

public class ListaDeBagagens {
    private double custo;
    private ArrayList<Bagagem> bagagens;

    public ListaDeBagagens(){
        bagagens = new ArrayList<>();
        custo = 0;
    }
    public void addBagagem(Bagagem b){
        bagagens.add(b);
    }

    public void custoTotal(){

        for (Bagagem bagagem :
             bagagens) {
            long excedente = 0;
            double peso = bagagem.getPeso();
            custo += bagagem.getTaxaBagagem()*bagagem.getPrioridade();
            if(bagagem instanceof BagagemNormal){
                if(peso < 20){
                    excedente = Math.round(Math.ceil(peso - 20));
                    custo += excedente*bagagem.getTaxaBagagem();
                }
            }
        }

    }
}
