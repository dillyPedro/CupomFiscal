package Ex_Caixa_Supermercado;

import java.util.ArrayList;

public class Compra {
    private Cliente cliente; // Se refere aos atributos da classe Cliente;
    private Loja loja; // Se refere aos atributos da classe Loja;
    private ArrayList<Item> itens = new ArrayList<Item>(); // Criando uma lista para podermos adicionar os itens comprados;

    public Compra(Cliente cliente, Loja loja) { // Construtor da classe Compra;
        this.cliente = cliente;
        this.loja = loja;
        this.itens = new ArrayList<Item>();
    }

    public void adicionarItem(Item item) { // Metodo para adicionar os itens comprados na lista "itens";
        this.itens.add(item);
    }

    public void gerarCupomFiscal(){ // Metodo para gerar o cupom fiscal com todos os dados necessários;
        System.out.println("---------------------------");
        System.out.println("        CUPOM FISCAL       ");
        System.out.println("---------------------------");
        System.out.println("Nome da Loja: " + loja.getNomeLoja());
        System.out.println("CNPJ da Loja: " + loja.getCnpjLoja());
        System.out.println("Endereco da Loja: " + loja.getEnderecoLoja());
        System.out.println("Nome do Cliente: " + cliente.getNomeCliente());
        System.out.println("CPF da Cliente: " + cliente.getCpfCliente());
        System.out.println("Itens comprados: ");
        double total = 0;
        double quantidadetotal = 0;
        for(int contador = 0; contador < itens.size(); contador++){
            System.out.println("Nome do Produto: " + itens.get(contador).getNomeProduto() + ", Quantidade: " + itens.get(contador).getQuantidadeProduto() + ", Valor: " + itens.get(contador).getValorProduto());
            total += itens.get(contador).getQuantidadeProduto() * itens.get(contador).getValorProduto();
            quantidadetotal += itens.get(contador).getQuantidadeProduto();
        }
        System.out.println("Total da compra: " + total);
        System.out.println("Quantidade de produtos: " + quantidadetotal);
    }
}

