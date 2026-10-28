package chainofresponsability;

public class Diretor extends Aprovador {

    public Diretor(Aprovador superior) {
        super(superior);
    }

    @Override
    public boolean podeAprovar(Despesa despesa) {
        return despesa.getValor() <= 20000.0;
    }

    @Override
    public String getCargo() {
        return "Diretor";
    }
}