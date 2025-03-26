package Ex_Caixa_Supermercado;

public class Item {
    private double codigoProduto;
    private String nomeProduto;
    private int quantidadeProduto;
    private double valorProduto;

    public Item(double codigoProduto, String nomeProduto, int quantidadeProduto, double valorProduto){
        this.codigoProduto = codigoProduto;
        this.nomeProduto = nomeProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.valorProduto = valorProduto;
    }

    public double getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(double codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

}
