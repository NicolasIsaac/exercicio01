import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Pessoa pessoa;
    ICalculadoraIMC calculadora;

    @BeforeEach
    void setUp() {
        pessoa = new Pessoa();
        calculadora = new CalculadoraIMC();
    }

    @Test
    void deveEstarAbaixoDoPesoM() {
        pessoa.setPeso(82.4);
        pessoa.setAltura(2);
        pessoa.setSexo("M");
        assertEquals("Abaixo do peso", pessoa.verificarPeso(calculadora));
    }

    @Test
    void deveEstarAbaixoDoPesoF() {
        pessoa.setPeso(76);
        pessoa.setAltura(2);
        pessoa.setSexo("F");
        assertEquals("Abaixo do peso", pessoa.verificarPeso(calculadora));
    }

    @Test
    void deveEstarNoPesoNormalM() {
        pessoa.setPeso(105.2);
        pessoa.setAltura(2);
        pessoa.setSexo("M");
        assertEquals("No peso normal", pessoa.verificarPeso(calculadora));
    }

    @Test
    void deveEstarNoPesoNormalF() {
        pessoa.setPeso(102.8);
        pessoa.setAltura(2);
        pessoa.setSexo("F");
        assertEquals("No peso normal", pessoa.verificarPeso(calculadora));
    }

    @Test
    void deveEstarMarginalmenteAcimaDoPesoM() {
        pessoa.setPeso(110.8);
        pessoa.setAltura(2);
        pessoa.setSexo("M");
        assertEquals("Marginalmente acima do peso", pessoa.verificarPeso(calculadora));
    }

    @Test
    void deveEstarMarginalmenteAcimaDoPesoF() {
        pessoa.setPeso(108.8);
        pessoa.setAltura(2);
        pessoa.setSexo("F");
        assertEquals("Marginalmente acima do peso", pessoa.verificarPeso(calculadora));
    }

    @Test
    void deveEstarAcimaDoPesoM() {
        pessoa.setPeso(124);
        pessoa.setAltura(2);
        pessoa.setSexo("M");
        assertEquals("Acima do peso", pessoa.verificarPeso(calculadora));
    }

    @Test
    void deveEstarAcimaDoPesoF() {
        pessoa.setPeso(128.8);
        pessoa.setAltura(2);
        pessoa.setSexo("F");
        assertEquals("Acima do peso", pessoa.verificarPeso(calculadora));
    }

    @Test
    void deveEstarObesoM() {
        pessoa.setPeso(124.4);
        pessoa.setAltura(2);
        pessoa.setSexo("M");
        assertEquals("Obeso", pessoa.verificarPeso(calculadora));
    }

    @Test
    void deveEstarObesoF() {
        pessoa.setPeso(129.2);
        pessoa.setAltura(2);
        pessoa.setSexo("F");
        assertEquals("Obeso", pessoa.verificarPeso(calculadora));
    }
}