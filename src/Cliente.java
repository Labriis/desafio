public class Cliente {
    private String nomeCompleto;
    private int mesa;

    public Cliente(String nomeCompleto, int mesa) {
        this.nomeCompleto = nomeCompleto;
        this.mesa = mesa;
    }

    public String getPrimeiroNome() {
        return nomeCompleto.split(" ")[0];
    }

    public String nomeMaiusculo() {
        return nomeCompleto.toUpperCase();
    }

    // Getters para exibição no relatório
    public int getMesa() { return mesa; }
}