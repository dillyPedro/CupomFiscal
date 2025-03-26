package Ex_Caixa_Supermercado;

public class Loja {
    private double codigoLoja;
    private String nomeLoja;
    private String cnpjLoja;
    private String enderecoLoja;

    public Loja(double codigoLoja, String nomeLoja, String cnpjLoja, String enderecoLoja) {
        this.codigoLoja = codigoLoja;
        this.nomeLoja = nomeLoja;
        this.cnpjLoja = cnpjLoja;
        this.enderecoLoja = enderecoLoja;
    }

    public double getCodigoLoja() {
        return codigoLoja;
    }

    public void setCodigoLoja(double codigoLoja) {
        this.codigoLoja = codigoLoja;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getCnpjLoja() {
        return cnpjLoja;
    }

    public void setCnpjLoja(String cnpjLoja) {
        this.cnpjLoja = cnpjLoja;
    }

    public String getEnderecoLoja() {
        return enderecoLoja;
    }

    public void setEnderecoLoja(String enderecoLoja) {
        this.enderecoLoja = enderecoLoja;
    }
}
