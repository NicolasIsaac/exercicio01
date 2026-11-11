
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.given;

class PessoaMockTest {

    private Pessoa criarPessoaComIMC(String sexo, double imc) {

        CalculadoraIMC calculadora = mock(CalculadoraIMC.class);

        given(calculadora.calcularIMC(82.4, 2.0)).willReturn(imc);

        return new Pessoa(sexo, 82.4, 2.0, calculadora);
    }

    @Test
    void deveEstarAbaixoDoPesoM() {
        Pessoa pessoa = criarPessoaComIMC("M", 18.0);
        assertEquals("Abaixo do peso", pessoa.VerificarPeso());
    }

    @Test
    void deveEstarAbaixoDoPesoF() {
        Pessoa pessoa = criarPessoaComIMC("F", 18.0);
        assertEquals("Abaixo do peso", pessoa.VerificarPeso());
    }

    @Test
    void deveEstarNoPesoNormalM() {
        Pessoa pessoa = criarPessoaComIMC("M", 23.0);
        assertEquals("No peso normal", pessoa.VerificarPeso());
    }

    @Test
    void deveEstarNoPesoNormalF() {
        Pessoa pessoa = criarPessoaComIMC("F", 22.0);
        assertEquals("No peso normal", pessoa.VerificarPeso());
    }

    @Test
    void deveEstarMarginalmenteAcimaDoPesoM() {
        Pessoa pessoa = criarPessoaComIMC("M", 27.0);
        assertEquals("Marginalmente acima do peso", pessoa.VerificarPeso());
    }

    @Test
    void deveEstarMarginalmenteAcimaDoPesoF() {
        Pessoa pessoa = criarPessoaComIMC("F", 26.5);
        assertEquals("Marginalmente acima do peso", pessoa.VerificarPeso());
    }

    @Test
    void deveEstarAcimaDoPesoM() {
        Pessoa pessoa = criarPessoaComIMC("M", 29.0);
        assertEquals("Acima do peso", pessoa.VerificarPeso());
    }

    @Test
    void deveEstarAcimaDoPesoF() {
        Pessoa pessoa = criarPessoaComIMC("F", 30.0);
        assertEquals("Acima do peso", pessoa.VerificarPeso());
    }

    @Test
    void deveEstarObesoM() {
        Pessoa pessoa = criarPessoaComIMC("M", 32.0);
        assertEquals("Obeso", pessoa.VerificarPeso());
    }

    @Test
    void deveEstarObesoF() {
        Pessoa pessoa = criarPessoaComIMC("F", 33.0);
        assertEquals("Obeso", pessoa.VerificarPeso());
    }
}
