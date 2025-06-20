package domain;

public class Tabuada {

    //Atributos
    private Integer numero;
    private Integer limite;

    //Construtores
    public Tabuada() {

    }

    public Tabuada(Integer numero, Integer limite) {
        this.numero = numero;
        this.limite = limite;
    }

    //Getters e Setters
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getLimite() {
        return limite;
    }

    public void setLimite(Integer limite) {
        this.limite = limite;
    }

    //Metodos
    public void TabuadaCompleta() {

        for (int i = 0; i <= limite; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
