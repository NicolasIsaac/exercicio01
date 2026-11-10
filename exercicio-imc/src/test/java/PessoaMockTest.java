import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PessoaMockTest {

    @Test
    void deveEstarAbaixoDoPeso() {

        CalculadoraIMC calculadora = mock(CalculadoraIMC.class);

        when(calculadora.calcularIMC(82.4, 2.0)).thenReturn(18.0);

        Pessoa pessoa = new Pessoa("M", 82.4, 2.0, calculadora);

        assertEquals("Abaixo do peso", pessoa.VerificarPeso());

    }
}