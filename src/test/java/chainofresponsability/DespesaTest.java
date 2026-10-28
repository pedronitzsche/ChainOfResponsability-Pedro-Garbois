package chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DespesaTest {

    Aprovador supervisor;

    @BeforeEach
    void setUp() {

        Aprovador diretor =
                new Diretor(null);

        Aprovador gerente =
                new Gerente(diretor);

        supervisor =
                new Supervisor(gerente);
    }

    @Test
    void deveSerAprovadaPeloSupervisor() {
        Despesa despesa = new Despesa(500.0);

        assertEquals(
                "Supervisor",
                supervisor.aprovar(despesa)
        );
    }

    @Test
    void deveSerAprovadaPeloGerente() {
        Despesa despesa = new Despesa(3000.0);

        assertEquals(
                "Gerente",
                supervisor.aprovar(despesa)
        );
    }

    @Test
    void deveSerAprovadaPeloDiretor() {
        Despesa despesa = new Despesa(12000.0);

        assertEquals(
                "Diretor",
                supervisor.aprovar(despesa)
        );
    }

    @Test
    void deveRetornarSemAprovador() {
        Despesa despesa = new Despesa(30000.0);

        assertEquals(
                "Sem aprovador",
                supervisor.aprovar(despesa)
        );
    }
}