package domain;

public class Calculadora {

    //Atributos
    private Double valor1;
    private Double valor2;

    //Construtores
    public Calculadora(){

    }

    public Calculadora(Double valor1, Double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    //Metodos
    public Double Somar() {
        return valor1 + valor2;
    }

    public Double Subtrair() {
        return valor1 - valor2;
    }

    public Double Dividir() {
        return valor1 / valor2;
    }

    public Double Multiplicar() {
        return valor1 * valor2;
    }
}
