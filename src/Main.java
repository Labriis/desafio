public class Main {
    public static void main(String[] args) {
        // 1. Criar Cliente
        Cliente c1 = new Cliente("Ana Beatriz", 5);

        // 2. Criar 3 Pedidos
        Pedido ped1 = new Pedido("Pizza Grande", 45.00, 1);
        Pedido ped2 = new Pedido("Refrigerante", 8.00, 2);
        Pedido ped3 = new Pedido("Sobremesa", 18.00, 1);

        // 3. Criar a Conta
        ContaRestaurante conta = new ContaRestaurante(c1, ped1, ped2, ped3);

        // 4. Exibir resultado
        conta.exibirRelatorio();
    }
}