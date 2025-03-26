package Ex_Caixa_Supermercado;

public class Cliente {
    private double codigoCliente;
    private String nomeCliente;
    private String dataCliente;
    private String cpfCliente;

    public Cliente(double codigoCliente, String nomeCliente, String dataCliente, String cpfCliente) {
        this.codigoCliente = codigoCliente;
        this.nomeCliente = nomeCliente;
        this.dataCliente = dataCliente;
        this.cpfCliente = cpfCliente;
    }

    public double getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(double codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getDataCliente() {
        return dataCliente;
    }

    public void setDataCliente(String dataCliente) {
        this.dataCliente = dataCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
}
