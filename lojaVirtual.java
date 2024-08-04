package projeto.alura.aula.aula5;

import java.util.ArrayList;
import java.util.Scanner;

public class lojaVirtual {
    public static  void main(String[] args) {
        int opcao = 0;
        double limiteCartao;
        double totalCompra = 0;
        double precoProduto = 0;
        String nomeProdutos;
        int quantidade;
        ArrayList<String> ListaDeProdutos = new ArrayList<>();
        ArrayList<Double> ListaDepreco = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o limite do cartão");
        limiteCartao = scanner.nextDouble();
        do {
            System.out.println("Digite a descrição da compra:");
            ListaDeProdutos.add(scanner.next());
            System.out.println("Digite o valor da compra:");
            precoProduto = scanner.nextDouble();
            System.out.println("Digite a quantidade");
            quantidade = scanner.nextInt();
            precoProduto = precoProduto * quantidade;
            ListaDepreco.add(precoProduto);
            if (precoProduto + totalCompra > limiteCartao){
                System.out.println("Saldo insuficiente!");
            }
            else {
                totalCompra = precoProduto + totalCompra;
                System.out.println("Compra realizada!");
            }

            System.out.println("Digite 0 para sair ou 1 para continuar.");
            opcao = scanner.nextInt();
        } while (opcao == 1);
        System.out.println("********************");
        System.out.println("COMPRAS REALIZADAS:");
        for (int i = 0; i < ListaDeProdutos.size(); i++) {
            String produto = ListaDeProdutos.get(i);
            double preco = ListaDepreco.get(i);
            System.out.println(quantidade + "x " + produto + " - R$" + preco);

        }
        System.out.println("TOTAL: "+ totalCompra);


    }
}
