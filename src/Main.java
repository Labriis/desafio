public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Ana Beatriz", 5);

        Pedido ped1 = new Pedido("Pizza Grande", 45.00, 1);
        Pedido ped2 = new Pedido("Refrigerante", 8.00, 2);
        Pedido ped3 = new Pedido("Sobremesa", 18.00, 1);

        ContaRestaurante conta = new ContaRestaurante(c1, ped1, ped2, ped3);

        conta.exibirRelatorio();
    }
}