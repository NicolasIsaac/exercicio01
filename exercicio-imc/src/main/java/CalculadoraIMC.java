public class CalculadoraIMC implements ICalculadoraIMC {

    @Override
    public double calcularIMC(Pessoa pessoa) {
        return pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
    }
}
