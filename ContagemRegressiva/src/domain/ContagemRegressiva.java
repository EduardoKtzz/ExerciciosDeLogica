package domain;

public class ContagemRegressiva {

    //Atributos
    private int numero;

    //Construtores
    public ContagemRegressiva() {

    }

    public ContagemRegressiva(int numero) {
        this.numero = numero;
    }

    //Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //Metodos

    //Função para fazer a contagem regressiva
    public void contagemRegressiva(int numero) {

        for(int i = numero; i >= 0; i--) {
            System.out.println(i);

            try {
                Thread.sleep(1000); // pausa de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace(); // trata exceção caso a thread seja interrompida
            }
        }
    }
}
