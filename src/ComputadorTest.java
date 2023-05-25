import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputadorTest {

    @Test
    void deveArmazenarEstados() {
        Computador computador = new Computador();
        computador.setEstado(ComputadorEstadoLigado.getInstance());
        computador.setEstado(ComputadorEstadoRecuperacao.getInstance());
        assertEquals(2, computador.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Computador computador = new Computador();
        computador.setEstado(ComputadorEstadoLigado.getInstance());
        computador.setEstado(ComputadorEstadoEspera.getInstance());
        computador.restauraEstado(0);
        assertEquals(ComputadorEstadoLigado.getInstance(), computador.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Computador computador = new Computador();
        computador.setEstado(ComputadorEstadoLigado.getInstance());
        computador.setEstado(ComputadorEstadoDesligado.getInstance());
        computador.setEstado(ComputadorEstadoLigado.getInstance());
        computador.setEstado(ComputadorEstadoEspera.getInstance());
        computador.restauraEstado(2);
        assertEquals(ComputadorEstadoLigado.getInstance(), computador.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Computador computador = new Computador();
            computador.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}