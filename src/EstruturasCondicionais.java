public class EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 17;

        // Estrutura condicional if-else if-else
        if (idade < 12) {
            System.out.println("Você é uma criança.");
        } else if (idade < 18) {
            System.out.println("Você é adolescente.");
        } else {
            System.out.println("Você é maior de idade.");
        }

        // Operador ternário
        String status = idade >= 18 ? "Acesso liberado" : "Acesso negado";
        System.out.println("Status: " + status);

        // Estrutura condicional switch-case
        int diaDaSemana = 3;
        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
        }
    }
}
