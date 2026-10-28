package chainofresponsability;

public abstract class Aprovador {

    protected Aprovador superior;

    public Aprovador(Aprovador superior) {
        this.superior = superior;
    }

    public String aprovar(Despesa despesa) {

        if (podeAprovar(despesa)) {
            return getCargo();
        }

        if (superior != null) {
            return superior.aprovar(despesa);
        }

        return "Sem aprovador";
    }

    public abstract boolean podeAprovar(Despesa despesa);

    public abstract String getCargo();
}