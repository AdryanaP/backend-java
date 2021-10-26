import impi.ServiceDesconto;
import modal.Cartao;
import modal.Produto;

public class Main {

    public static void main(String[] args) {
        Cartao cartao = new Cartao("155496556444", "Star Bank");
        Produto produto = new Produto("leite", "latas");

        ServiceDesconto service = new ServiceDesconto();

        System.out.println(service.calcularDesconto(cartao, produto, 13));
    }
}
