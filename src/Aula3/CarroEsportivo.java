package Aula3;

public class CarroEsportivo extends Carro {
    private int potencia;

    public CarroEsportivo() {
        super();
    }

    public CarroEsportivo(String cor, String modelo, int ano, int potencia) {
        super(cor, modelo, ano);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}

