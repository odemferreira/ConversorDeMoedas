import java.util.Scanner;

public class CurrencyConverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorDeMoedas converter = new ConversorDeMoedas(" https://v6.exchangerate-api.com/v6/88e687322050bdded80a01a0/latest/");

        boolean sair = false;
        while (!sair) {
            System.out.println("Escolha uma opção:");
            System.out.println("1) Dólar => Peso argentino");
            System.out.println("2) Peso argentino => Dólar");
            System.out.println("3) Dólar => Real brasileiro");
            System.out.println("4) Real brasileiro => Dólar");
            System.out.println("5) Dólar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dólar");
            System.out.println("7) Sair");

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    converterMoeda(converter, "USD", "ARS");
                    break;
                case 2:
                    converterMoeda(converter, "ARS", "USD");
                    break;
                case 3:
                    converterMoeda(converter, "USD", "BRL");
                    break;
                case 4:
                    converterMoeda(converter, "BRL", "USD");
                    break;
                case 5:
                    converterMoeda(converter, "USD", "COP");
                    break;
                case 6:
                    converterMoeda(converter, "COP", "USD");
                    break;
                case 7:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        System.out.println("Fim programa");
    }

    private static void converterMoeda(ConversorDeMoedas converter, String de, String para) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor em " + de + ": ");
        double quantia = scanner.nextDouble();
        double taxa = converter.obterTaxaCambio(de, para);
        double valorConvertido = quantia * taxa;
        System.out.println(quantia + " " + de + " equivale a " + valorConvertido + " " + para);
    }
}
