package chainofresponsability;

public class Supervisor extends Aprovador {

    public Supervisor(Aprovador superior) {
        super(superior);
    }

    @Override
    public boolean podeAprovar(Despesa despesa) {
        return despesa.getValor() <= 1000.0;
    }

    @Override
    public String getCargo() {
        return "Supervisor";
    }
}