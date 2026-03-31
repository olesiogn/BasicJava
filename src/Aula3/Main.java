package Aula3;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto Aula3.Carro
        Carro meuCarro = new Carro();
        meuCarro.setCor("Vermelho");
        meuCarro.setModelo("Sedan");
        meuCarro.setAno(2022);

        System.out.println("Informações do carro:");
        System.out.println("Cor: " + meuCarro.getCor());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Ano: " + meuCarro.getAno());

        // Criando outro carro usando o construtor com parâmetros
        Carro outroCarro = new Carro("Preto", "SUV", 2024);
        System.out.println("\nOutro carro:");
        System.out.println("Cor: " + outroCarro.getCor());
        System.out.println("Modelo: " + outroCarro.getModelo());
        System.out.println("Ano: " + outroCarro.getAno());

        // Exemplo de herança: Aula3.CarroEsportivo
        CarroEsportivo esportivo = new CarroEsportivo("Amarelo", "Coupé", 2023, 350);
        System.out.println("\nAula3.Carro esportivo:");
        System.out.println("Cor: " + esportivo.getCor());
        System.out.println("Modelo: " + esportivo.getModelo());
        System.out.println("Ano: " + esportivo.getAno());
        System.out.println("Potência: " + esportivo.getPotencia() + " cv");
    }
}
