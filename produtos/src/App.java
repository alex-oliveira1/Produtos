import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner ler=new Scanner(System.in);

    System.out.println("Digite nome produto");
    String nome=ler.nextLine();
    System.out.println("Preço do produto");
    Double preco=ler.nextDouble();
    System.out.println("Quantidade do produto");
    int quantidade=ler.nextInt();
    Produto p=new Produto(nome,preco,quantidade);
    p.
    System.out.println(p.toString());
    p.removeProduto(3);
    System.out.println(p.toString());
    ler.close();
    }
}
