import static org.easymock.EasyMock.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaMockTest {

    Pessoa pessoa;

    @BeforeEach
    void setUp() {
        Pessoa pessoa = new Pessoa();
    }

    @Test
    void  deveEstarAbaixoDoPesoM() {

        pessoa.setSexo("M");
        double imc = 20.6;
        ICalculadoraIMC calculadoraMock = createMock(ICalculadoraIMC.class);
        expect(calculadoraMock.calcularIMC(this).andReturn(imc));
        replay(calculadoraMock);
        assertEquals("Abaixo do peso", pessoa.verificarPeso(calculadoraMock));

    }

    /*

    @Test
    void deveEstarAbaixoDoPesoM() {
        pessoa.setPeso(82.4);
        pessoa.setAltura(2);
        pessoa.setSexo("M");
        assertEquals("Abaixo do peso", pessoa.VerificarPeso());
    }

    @Test
    void deveEstarAbaixoDoPesoF() {
        pessoa.setPeso(76);
        pessoa.setAltura(2);
        pessoa.setSexo("F");
        assertEquals("Abaixo do peso", pessoa.VerificarPeso());
    }

    @Test
    void deveEstarNoPesoNormalM() {
        pessoa.setPeso(105.2);
        pessoa.setAltura(2);
        pessoa.setSexo("M");
        assertEquals("No peso normal", pessoa.VerificarPeso());
    }

    @Test
    void deveEstarNoPesoNormalF() {
        pessoa.setPeso(102.8);
        pessoa.setAltura(2);
        pessoa.setSexo("F");
        assertEquals("No peso normal", pessoa.VerificarPeso());
    }

    @Test
    void deveEstarMarginalmenteAcimaDoPesoM() {
        pessoa.setPeso(110.8);
        pessoa.setAltura(2);
        pessoa.setSexo("M");
        assertEquals("Marginalmente acima do peso", pessoa.VerificarPeso());
    }

    @Test
    void deveEstarMarginalmenteAcimaDoPesoF() {
        pessoa.setPeso(108.8);
        pessoa.setAltura(2);
        pessoa.setSexo("F");
        assertEquals("Marginalmente acima do peso", pessoa.VerificarPeso());
    }

    @Test
    void deveEstarAcimaDoPesoM() {
        pessoa.setPeso(124);
        pessoa.setAltura(2);
        pessoa.setSexo("M");
        assertEquals("Acima do peso", pessoa.VerificarPeso());
    }

    @Test
    void deveEstarAcimaDoPesoF() {
        pessoa.setPeso(128.8);
        pessoa.setAltura(2);
        pessoa.setSexo("F");
        assertEquals("Acima do peso", pessoa.VerificarPeso());
    }

    @Test
    void deveEstarObesoM() {
        pessoa.setPeso(124.4);
        pessoa.setAltura(2);
        pessoa.setSexo("M");
        assertEquals("Obeso", pessoa.VerificarPeso());
    }

    @Test
    void deveEstarObesoF() {
        pessoa.setPeso(129.2);
        pessoa.setAltura(2);
        pessoa.setSexo("F");
        assertEquals("Obeso", pessoa.VerificarPeso());
    }

     */
}
