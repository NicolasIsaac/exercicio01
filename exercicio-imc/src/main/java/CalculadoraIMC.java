public class CalculadoraIMC {

    public double calcularIMC(Pessoa pessoa) {
        return pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
    }

}
