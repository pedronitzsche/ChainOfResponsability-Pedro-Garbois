package chainofresponsability;

public class Gerente extends Aprovador {

    public Gerente(Aprovador superior) {
        super(superior);
    }

    @Override
    public boolean podeAprovar(Despesa despesa) {
        return despesa.getValor() <= 5000.0;
    }

    @Override
    public String getCargo() {
        return "Gerente";
    }
}