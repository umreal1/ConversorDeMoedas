import java.io.IOException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        Conversor converter = new Conversor();
        int opcao;
        int sair = 0;

        while (sair == 0){
            System.out.println("Escolha a opção que quer converter!");
            System.out.println("===================================");
            System.out.println("(1) Dolár para Real! ");
            System.out.println("(2) Real para Dolár! ");
            System.out.println("(3) Euro para Iene! ");
            System.out.println("(4) Iene para Euro! ");
            System.out.println("(5) Euro para Dolár! ");
            System.out.println("(6) Dolár para Euro! ");
            System.out.println("(7) Sair");

            System.out.println("===================================");
            opcao = leitor.nextInt();

        if (opcao == 1) {
            converter.setMoeda("USD");
            converter.setMoedaDestino("BRL");
        } if (opcao == 2) {
            converter.setMoeda("BRL");
            converter.setMoedaDestino("USD");
        } if (opcao == 3) {
            converter.setMoeda("EUR");
            converter.setMoedaDestino("JPY");
        } if (opcao == 4) {
            converter.setMoeda("BRL");
            converter.setMoedaDestino("JPY");
        } if (opcao == 5) {
            converter.setMoeda("EUR");
            converter.setMoedaDestino("USD");
        } if (opcao == 6) {
            converter.setMoeda("USD");
            converter.setMoedaDestino("EUR");
        } else if (opcao == 7) {
                System.out.println("o programa será encerrado!");
            sair = 2;
            break;
        }

        System.out.println("Qual o valor a ser convertido?");
        converter.converte(leitor.nextDouble());
        System.out.println("===================================");
        System.out.println("A taxa de cambio é " + converter.getTaxaCambio());
        System.out.println("O valor final é de " + converter.getValorFinal());
        System.out.println("===================================");

        }
    }
}