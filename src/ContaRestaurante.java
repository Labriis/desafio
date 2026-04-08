public class ContaRestaurante {
    private Cliente cliente;
    private Pedido p1, p2, p3;

    public ContaRestaurante(Cliente cliente, Pedido p1, Pedido p2, Pedido p3) {
        this.cliente = cliente;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double calcularSubtotal() {
        return p1.calcularTotalItem() + p2.calcularTotalItem() + p3.calcularTotalItem();
    }

    public double calcularTaxaServico() {
        double subtotal = calcularSubtotal();
        if (subtotal > 100) {
            return subtotal * 0.10; // 10%
        } else {
            return subtotal * 0.05; // 5%
        }
    }

    public double calcularDesconto() {
        String primeiroNome = cliente.getPrimeiroNome().toUpperCase();
        if (primeiroNome.startsWith("A")) {
            return 15.00;
        }
        return 0.0;
    }

    public double calcularValorFinal() {
        return calcularSubtotal() + calcularTaxaServico() - calcularDesconto();
    }

    public void exibirRelatorio() {
        System.out.println("======== CONTA DO RESTAURANTE ========");
        System.out.println("Cliente: " + cliente.nomeMaiusculo());
        System.out.println("Primeiro nome: " + cliente.getPrimeiroNome());
        System.out.println("Mesa: " + cliente.getMesa());
        System.out.println("\nPedidos:");

        Pedido[] pedidos = {p1, p2, p3};
        for (int i = 0; i < pedidos.length; i++) {
            System.out.printf("%d - %s | Qtd: %d | Total: R$ %.2f%n",
                    (i + 1), pedidos[i].getDescricao(), pedidos[i].getQuantidade(), pedidos[i].calcularTotalItem());
        }

        System.out.printf("\nSubtotal: R$ %.2f%n", calcularSubtotal());
        System.out.printf("Taxa de serviço: R$ %.2f%n", calcularTaxaServico());
        System.out.printf("Desconto: R$ %.2f%n", calcularDesconto());
        System.out.printf("Valor final: R$ %.2f%n", calcularValorFinal());
    }
}
