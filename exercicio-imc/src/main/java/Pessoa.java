public class Pessoa {

    private String sexo;
    private double peso;
    private double altura;


    public Pessoa(String sexo, double peso, double altura) {
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
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

    public String verificarPeso(CalculadoraIMC calculadora) {

        double imc = calculadora.calcularIMC(this);

        if (sexo.equals("M")) {
            if (imc < 20.7) {
                return "Abaixo do peso";
            } else {
                if (imc < 26.4) {
                    return "No peso normal";
                } else {
                    if (imc < 27.8) {
                        return "Marginalmente acima do peso";
                    } else {
                        if (imc < 31.1) {
                            return "Acima do peso";
                        } else {
                            return "Obeso";
                        }
                    }
                }
            }
        } else {
            if (imc < 19.1) {
                return "Abaixo do peso";
            } else {
                if (imc < 25.8) {
                    return "No peso normal";
                } else {
                    if (imc < 27.3) {
                        return "Marginalmente acima do peso";
                    } else {
                        if (imc < 32.3) {
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
