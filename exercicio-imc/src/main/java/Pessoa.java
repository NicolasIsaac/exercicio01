public class Pessoa {

    private String sexo;
    private double peso;
    private double altura;

    private CalculadoraIMC calculadoraIMC;

    public Pessoa(CalculadoraIMC calculadoraIMC) {
        this.calculadoraIMC = calculadoraIMC;
    }

    public Pessoa(String sexo, double peso, double altura, CalculadoraIMC calculadoraIMC) {
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.calculadoraIMC = calculadoraIMC;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public String VerificarPeso() {

        double IMC = calculadoraIMC.calcularIMC(peso, altura);

        if (sexo.equals("M")) {
            if (IMC < 20.7) {
                return "Abaixo do peso";
            } else {
                if (IMC < 26.4) {
                    return "No peso normal";
                } else {
                    if (IMC < 27.8) {
                        return "Marginalmente acima do peso";
                    } else {
                        if (IMC < 31.1) {
                            return "Acima do peso";
                        } else {
                            return "Obeso";
                        }
                    }
                }
            }
        } else {
            if (IMC < 19.1) {
                return "Abaixo do peso";
            } else {
                if (IMC < 25.8) {
                    return "No peso normal";
                } else {
                    if (IMC < 27.3) {
                        return "Marginalmente acima do peso";
                    } else {
                        if (IMC < 32.3) {
                            return "Acima do peso";
                        } else {
                            return "Obeso";
                        }
                    }
                }
            }
        }
    }
}
