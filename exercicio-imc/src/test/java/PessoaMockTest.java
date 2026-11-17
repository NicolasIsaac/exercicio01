import static org.easymock.EasyMock.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaMockTest {

    Pessoa pessoa;
    ICalculadoraIMC calculadoraMock;

    @BeforeEach
    void setUp() {
        pessoa = new Pessoa();
        calculadoraMock = createMock(ICalculadoraIMC.class);
    }

    @Test
    void deveEstarAbaixoDoPesoM() {
        double imc = 20.6;
        pessoa.setSexo("M");
        expect(calculadoraMock.calcularIMC(pessoa)).andReturn(imc);
        replay(calculadoraMock);
        assertEquals("Abaixo do peso", pessoa.verificarPeso(calculadoraMock));
    }

    @Test
    void deveEstarAbaixoDoPesoF() {
        double imc = 19;
        pessoa.setSexo("F");
        expect(calculadoraMock.calcularIMC(pessoa)).andReturn(imc);
        replay(calculadoraMock);
        assertEquals("Abaixo do peso", pessoa.verificarPeso(calculadoraMock));
    }

    @Test
    void deveEstarNoPesoNormalM() {
        double imc = 26.3;
        pessoa.setSexo("M");
        expect(calculadoraMock.calcularIMC(pessoa)).andReturn(imc);
        replay(calculadoraMock);
        assertEquals("No peso normal", pessoa.verificarPeso(calculadoraMock));
    }

    @Test
    void deveEstarNoPesoNormalF() {
        double imc = 25.7;
        pessoa.setSexo("F");
        expect(calculadoraMock.calcularIMC(pessoa)).andReturn(imc);
        replay(calculadoraMock);
        assertEquals("No peso normal", pessoa.verificarPeso(calculadoraMock));
    }

    @Test
    void deveEstarMarginalmenteAcimaDoPesoM() {
        double imc = 27.7;
        pessoa.setSexo("M");
        expect(calculadoraMock.calcularIMC(pessoa)).andReturn(imc);
        replay(calculadoraMock);
        assertEquals("Marginalmente acima do peso", pessoa.verificarPeso(calculadoraMock));
    }

    @Test
    void deveEstarMarginalmenteAcimaDoPesoF() {
        double imc = 27.2;
        pessoa.setSexo("F");
        expect(calculadoraMock.calcularIMC(pessoa)).andReturn(imc);
        replay(calculadoraMock);
        assertEquals("Marginalmente acima do peso", pessoa.verificarPeso(calculadoraMock));
    }

    @Test
    void deveEstarAcimaDoPesoM() {
        double imc = 31.0;
        pessoa.setSexo("M");
        expect(calculadoraMock.calcularIMC(pessoa)).andReturn(imc);
        replay(calculadoraMock);
        assertEquals("Acima do peso", pessoa.verificarPeso(calculadoraMock));
    }

    @Test
    void deveEstarAcimaDoPesoF() {
        double imc = 32.2;
        pessoa.setSexo("F");
        expect(calculadoraMock.calcularIMC(pessoa)).andReturn(imc);
        replay(calculadoraMock);
        assertEquals("Acima do peso", pessoa.verificarPeso(calculadoraMock));
    }

    @Test
    void deveEstarObesoM() {
        double imc = 31.1;
        pessoa.setSexo("M");
        expect(calculadoraMock.calcularIMC(pessoa)).andReturn(imc);
        replay(calculadoraMock);
        assertEquals("Obeso", pessoa.verificarPeso(calculadoraMock));
    }

    @Test
    void deveEstarObesoF() {
        double imc = 32.3;
        pessoa.setSexo("F");
        expect(calculadoraMock.calcularIMC(pessoa)).andReturn(imc);
        replay(calculadoraMock);
        assertEquals("Obeso", pessoa.verificarPeso(calculadoraMock));
    }
}