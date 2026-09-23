public class Pessoa{

    private String sexo;
    private double peso;
    private double altura;

    public Pessoa(){}

    public Pessoa(String sexo, double peso, double altura){
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

    String CalcularIMC() {
        double IMC = peso / (altura * altura); 
     
        if (sexo.equals("M")) { //1   
            if (IMC < 20.7) { //2   
                return "Abaixo do peso"; //3   
            } else {   
                if (IMC < 26.4) { //4   
                    return "No peso normal"; //5   
                } else {   
                    if (IMC < 27.8) { //6   
                        return "Marginalmente acima do peso"; //7   
                    } else {   
                        if (IMC < 31.1) { //8   
                            return "Acima do peso"; //9   
                        } else {   
                            return "Obeso"; //10   
                        }   
                    }   
                }   
            }   
        } else {   
            if (IMC < 19.1) { //11   
                return "Abaixo do peso"; //12   
            } else {   
                if (IMC < 25.8) { //13   
                    return "No peso normal"; //14   
                } else {   
                    if (IMC < 27.3) { //15   
                        return "Marginalmente acima do peso"; //16   
                    } else {   
                        if (IMC < 32.3) { //17   
                            return "Acima do peso"; //18   
                        } else {   
                            return "Obeso"; //19   
                        }   
                    }   
                }   
            }
        }
    }
        
    public static void main(String args[]) {
        Pessoa pessoa1 = new Pessoa("M", 1.70, 64);
        System.out.println("Sexo : " + pessoa1.getSexo());
        System.out.println("Peso : " + pessoa1.getPeso());
        System.out.println("Altura : " + pessoa1.getAltura());
        System.out.println("IMC = " + pessoa1.CalcularIMC());
    }
}
