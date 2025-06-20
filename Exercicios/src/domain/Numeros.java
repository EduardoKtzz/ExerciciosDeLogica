package domain;

public class Numeros {

    //Atributos
    private int numero;

    //Construtor
    public Numeros(){}


    public Numeros(int numero) {
        this.numero = numero;
    }

    //Getter e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //Metodo
    public String verificador(int numero) {

        if (numero % 2 == 0) {
            return "Número par";
        } else {
            return "Número Impar";
        }

    }
}
